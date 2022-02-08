FROM alpine:3.12.0 as maven_builder
# Alterações solicitadas pelo Sr. Antonio Novaes
WORKDIR /app
ADD . /app
RUN apk add --no-cache --update-cache maven openjdk11 npm git
ENV TIER DEV
ENV CONTEXT_USE true
# Sobre o valor TIER, veja https://docs.cronapp.io - Parâmetros para gerar .war
RUN git config --global url."https://".insteadOf git://
COPY pom.xml /app/pom.xml
RUN mvn dependency:resolve
RUN cd src/main/webapp/ && npm install  &&  cd ../mobileapp && npm install && cd www && npm install
RUN mvn package -X -Dcronapp.profile=${TIER} -Dcronapp.useContext=${CONTEXT_USE}


FROM tomcat:9.0.17-jre11
RUN rm -rf /usr/local/tomcat/webapps/*
COPY --from=maven_builder /app/target/*.war /usr/local/tomcat/webapps/ROOT.war