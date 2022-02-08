#!/usr/bin/env groovy

pipeline {
    agent any
    environment {
        URL_GIT_REPO_MANIFESTS = 'kubernetes-asm'
        TAG_IMAGEM = "${GIT_COMMIT.take(7)}"
    }
    parameters {
        choice(choices: ['false', 'true'], description: 'Selecione se quer usar conexões de banco e parâmetros dentro do conteiner.', name: 'CRONAPP_USE_CONTEXT')
        choice(choices: ['DEV', 'PROD'], description: 'Selecione o perfil do banco de dados (TIER).', name: 'CRONAPP_TIER')
        string(defaultValue: 'https://dockerhub.camara.leg.br/', description: 'URL do Registry (padrão é o docker hub).', name: 'CRONAPP_DOCKER_REGISTRY', trim: false)
        string(defaultValue: 'dockerhub.camara.leg.br/sedas/asm', description: 'Informe o nome de sua imagem (se for registry privado, informe o caminho completo).', name: 'CRONAPP_DOCKER_IMAGE_NAME', trim: false)
        string(defaultValue: 'c34117dc-5fa1-46f8-8ebb-f1cf0b2254c4', description: 'Informe a credencial (secret) usada para acesso ao registry.', name: 'CRONAPP_DOCKERHUB_ACCESS', trim: false)
        string(defaultValue: 'gogs@git.camara.gov.br:SEDAS/asm.git', description: 'Informe o endereço HTTPS do repositório Git.', name: 'CRONAPP_GIT_URL', trim: false)
        string(defaultValue: 'ssh_git', description: 'Informe a credencial (secret) usada para acesso ao reposotório Git.', name: 'CRONAPP_GIT_USERPASS', trim: false)
    }
    stages {
        stage('Git Clone') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '${CRONAPP_TAG_VERSION}']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '${CRONAPP_GIT_USERPASS}', url: '${CRONAPP_GIT_URL}']]])
            }
        }
        stage('Maven and Docker Build') {
            steps {
                sh '''
                    echo ${CRONAPP_TIER} && echo ${CRONAPP_USE_CONTEXT}
                    docker build -t ${CRONAPP_DOCKER_IMAGE_NAME}:${TAG_IMAGEM}-${CRONAPP_TAG_VERSION}-${CRONAPP_TIER} --build-arg TIER=${CRONAPP_TIER} --build-arg CONTEXT_USE=${CRONAPP_USE_CONTEXT} .
                '''
            }
        }
        stage('Docker Push') {
            steps {
                withDockerRegistry(credentialsId: "${CRONAPP_DOCKERHUB_ACCESS}", url: "${CRONAPP_DOCKER_REGISTRY}") {
                    sh '''
                        docker push ${CRONAPP_DOCKER_IMAGE_NAME}:${TAG_IMAGEM}-${CRONAPP_TAG_VERSION}-${CRONAPP_TIER}
                    '''
                }
            }
        }
        stage('Deploy cluster-teste') {
            when {
                expression {
                    return CRONAPP_TIER.equals('DEV')
                }
            }
            steps {
                echo "Deploy ambiente de Teste"
                patchKubernetes reponame: "${env.URL_GIT_REPO_MANIFESTS}", branch: "master", path: "overlays/tes", kind: "Kustomize", image: "${CRONAPP_DOCKER_IMAGE_NAME}", tag: "${TAG_IMAGEM}-${CRONAPP_TAG_VERSION}-${CRONAPP_TIER}"
            }
        }
        stage('Deploy cluster-produção') {
            when {
                expression {
                    return CRONAPP_TIER.equals('PROD')
                }
            }
            steps {
                echo "Deploy ambiente de Produção"
                patchKubernetes reponame: "${env.URL_GIT_REPO_MANIFESTS}", branch: "master", path: "overlays/prod", kind: "Kustomize", image: "${CRONAPP_DOCKER_IMAGE_NAME}", tag: "${TAG_IMAGEM}-${CRONAPP_TAG_VERSION}-${CRONAPP_TIER}"
            }
        }
    }
}