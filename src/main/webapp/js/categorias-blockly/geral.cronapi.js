(function() {
  'use strict';

  this.cronapi = this.cronapi || {};

   /**
   * @categoryName Geral
   */
  this.cronapi.geral = this.cronapi.geral || {};
  
  /**
   * @type function
   * @name Alerta customizado
   * @description Cria um alerta customizado
   * @multilayer false
   * @param {ObjectType.STRING} titulo titulo
   * @param {ObjectType.STRING} mensagem mensagem
   */
  this.cronapi.geral.alertaCustomizado = function(titulo, mensagem) {
    let divBkg = document.createElement('div');
    let divContainer = document.createElement('div');
    let divHeader = document.createElement('div');
    let divIcon = document.createElement('div');
    let divBody = document.createElement('div');
    let divFooter = document.createElement('div');
    let h1 = document.createElement('h1');
    let span = document.createElement('span');
    let p = document.createElement('p');
    let button = document.createElement('button');

    span.textContent = '!';
    span.classList.add('alert-box-custom-icon');
    divIcon.classList.add('col-md-12');
    divIcon.appendChild(span);
    
    divHeader.appendChild(divIcon);

    h1.textContent = titulo;
    h1.classList.add('col-md-12');
    divHeader.classList.add('row');
    divHeader.appendChild(h1);

    p.classList.add('fs-18rem', 'col-md-12');
    p.innerHTML = mensagem;
    divBody.classList.add('row');
    divBody.style = "text-align: justify; padding: 20px;";
    divBody.appendChild(p);

    button.classList.add('btn', 'btn-success-pro');
    button.style="width: 20%;";
    button.textContent = "OK";
    button.addEventListener('click',(event)=>{
      let container = event.target.parentNode.parentElement
      let bkg = event.target.parentNode.parentElement.previousSibling
      bkg.remove();
      container.remove();
    });
    divFooter.classList.add('row');
    divFooter.appendChild(button);

    divContainer.classList.add('alert-box-custom', 'container', 'fadeIn');
    divContainer.appendChild(divHeader);
    divContainer.appendChild(divBody);
    divContainer.appendChild(divFooter);

    divBkg.classList.add('alert-box-custom-bkg');
    document.querySelector('#starter').appendChild(divBkg);

    document.querySelector('#starter').appendChild(divContainer);
    
    throw "interrompendo ações!"
   
  };

  /**
   * @type function
   * @name Criar modal loader
   * @description Cria um modal para ser exibido ao carregar uma informação na tela
   * @param {ObjectType.STRING} caminhoImagem caminhoImagem
   * @param {ObjectType.STRING} imagemExibicao imagemExibicao
   * @multilayer false
   */
  this.cronapi.geral.criarModalLoader = function(caminhoImagem, imagemExibicao){

    let verificacaoLoader = document.querySelector('#modal-loader');
    if (verificacaoLoader) {

      verificacaoLoader.querySelector('img').src = caminhoImagem + imagemExibicao;

    } else {

      let starter = document.querySelector('#starter');

      let divModal = document.createElement('div');
      divModal.classList = "modal fade";
      divModal.id = "modal-loader"

      let divModalDialog = document.createElement('div');
      divModalDialog.classList = "modal-dialog modal-lg";
      divModal.appendChild(divModalDialog);

      let divBody = document.createElement('div');
      divBody.classList = "modal-body";
      divModalDialog.appendChild(divBody);

      let divRow = document.createElement('div');
      divRow.classList = "list-group list-group-sm row";
      divBody.appendChild(divRow);

      let imagem = document.createElement('img')
      imagem.id = "customLoader"
      imagem.src = caminhoImagem + imagemExibicao;
      imagem.classList = "center-block component-holder"
      divRow.appendChild(imagem);

      starter.appendChild(divModal);

    }

    cronapi.screen.showModal('modal-loader');

  };
   /**
   * @type function
   * @name Conferir tecla pressionada
   * @description Verifica se a tecla pressionada é a mesma da que foi passada via parâmetro
   * @param {ObjectType.STRING} tecla tecla
   * @returns {ObjectType.BOOLEAN}
   * @multilayer false
   */
  this.cronapi.geral.verificaTeclaPressionada = function(tecla){
    /**
     * atributos importantes do event: code, key, keyCode, type.
      EXEMPLO:
        code: "NumpadEnter"
        key: "Enter"
        keyCode: 13
        type: "keypress"
     */

    if (event && tecla === event.key) {
      return true;
    } else {
      return false;
    }

  };
   /**
   * @type function
   * @name Formatar data
   * @description Formata data informada
   * @multilayer false
   * @param {ObjectType.DATE} data data 
   * @returns {ObjectType.DATE}
   */
  this.cronapi.geral.formatarData = function(data) { 
    /** data: data que será formatada - dd/mm/yyyy */

    // por causa do fuso, sempre fica com 1 dia menos. Ele cria com 0h (Parse) e na hora de converter (new Date) retira 3 horas (GMT -3), colocando a data com 1 dias a menos
    let d = new Date(Date.parse(data));

    return d;
  };

   /**
   * @type function
   * @name Obter aba ativa
   * @description Retorna o id da aba ativa
   * @param {ObjectType.STRING} id id
   * @returns {ObjectType.STRING}
   * @multilayer false
   */
  this.cronapi.geral.obterAbaAtiva = function(id){

    return document.querySelector(`#${id} .tab-pane.active`).id

  };
   /**
   * @type function
   * @name Obter valor do componente Texto Rico
   * @description Retorna o valor do componente quando o bloco não está vinculado a um formulário
   * @param {ObjectType.STRING} id id
   * @returns {ObjectType.STRING}
   * @multilayer false
   */
  this.cronapi.geral.obterValorTextoRico = function(id){

    let iframe = document.querySelector(`#${id} iframe`).contentWindow.document
    return iframe.querySelector(`body`).innerHTML

  };
   /**
   * @type function
   * @name Obter valor do componente
   * @description Retorna o valor do componente quando o bloco não está vinculado a um formulário
   * @param {ObjectType.STRING} id id
   * @returns {ObjectType.STRING}
   * @multilayer false
   */
  this.cronapi.geral.obterValorComponente = function(id){

    return document.querySelector(`#${id}`).value;     

  };
   /**
   * @type function
   * @name Definir valor do componente
   * @description Define o valor do componente quando o bloco não está vinculado a um formulário
   * @param {ObjectType.STRING} id id
   * @param {ObjectType.STRING} valor valor
   * @multilayer false
   */
  this.cronapi.geral.definirValorComponente = function(id, valor){

    document.querySelector(`#${id}`).value = valor

  };
   /**
   * @type function
   * @name Definir valor do componente Texto Rico
   * @description Define o valor de um componente quando o bloco não está vinculado a um formulário
   * @param {ObjectType.STRING} id id
   * @param {ObjectType.STRING} value value
   * @multilayer false
   */
  this.cronapi.geral.definirValorTextoRico = function(id, value){

    let iframe = document.querySelector(`#${id} iframe`).contentWindow.document
    iframe.querySelector(`body`).innerHTML = value

  };
   /**
   * @type function
   * @name Prevent default
   * @description Previne comportamento default de um elemento HTML
   * @param {ObjectType.STRING} event event
   * @multilayer false
   */
  this.cronapi.geral.previneDefault = function(event){

    event.preventDefault();

  };
   /**
   * @type function
   * @name Focar componente texto rico
   * @description Foca o componente texto rico
   * @param {ObjectType.STRING} id
   * @multilayer false
   */
  this.cronapi.geral.focarTextoRico = function(id){

    let iframe = document.querySelector(`#${id} iframe`).contentWindow.document;    
    let target = iframe.querySelector(`body`).focus();

  };
   /**
   * @type function
   * @name Observar mutação
   * @description Observa se um componente sofreu alteração em um atributo específico e recarrega página caso tenha sido alterado
   * @param {ObjectType.STRING} id id
   * @param {ObjectType.STRING} atributo atributo
   * @multilayer false
   */
  this.cronapi.geral.observarMutacao = function (id, atributo) {
    let observer = new MutationObserver(function (mutations) {
      mutations.forEach(function (mutation) {
        if (mutation.type == "attributes" && mutation.attributeName == atributo) {
          location.reload();
          throw `Alerta de segurança: Atributo ${atributo} foi alterado. Ações interrompidas... recarregando página.`;
        }
      });
    });

    let el = document.querySelector(`#${id}`);
    observer.observe(el, { attributes: true });
  };
   /**
   * @type function
   * @name Parar de observar mutação
   * @description Para de observar se um componente sofreu alteração em um atributo
   * @param {ObjectType.STRING} id id
   * @multilayer false
   */
  this.cronapi.geral.pararObservarMutacao = function (id) {
    let observer = new MutationObserver(function () {});

    let el = document.querySelector(`#${id}`);
    observer.observe(el, { attributes: true });
  };

   /**
   * @type function
   * @name Obter valor do atributo
   * @description Retorna o valor do atributo de um elemento HTML
   * @param {ObjectType.STRING} id id
   * @param {ObjectType.STRING} atributo atributo
   * @returns {ObjectType.STRING}
   * @multilayer false
   */
  this.cronapi.geral.obterValorAtributo = function(id, atributo){

    return document.querySelector(`#${id}`).getAttribute(atributo)

  };

   /**
   * @type function
   * @name Remover atributo
   * @description Remove do atributo de um elemento HTML
   * @param {ObjectType.STRING} id id
   * @param {ObjectType.STRING} atributo atributo
   * @multilayer false
   */
  this.cronapi.geral.RemoverAtributo = function(id, atributo){

    document.querySelector(`#${id}`).removeAttribute(atributo)

  };
   /**
   * @type function
   * @name Verificar duplicidade de id
   * @description Lança uma exceção caso encontre uma duplicidade para o id informado
   * @param {ObjectType.STRING} id id
   * @multilayer false
   */
  this.cronapi.geral.duplicidadeId = function(id){

    let ids = document.querySelectorAll(`#${id}`)
    if (ids.length > 1){
      throw "Tentativa ilegal (Duplicidade de ID): Erro ao indicar servidor(es). "
    }

  };

   /**
   * @type function
   * @name Obter valor do componente pelo id
   * @description Retorna o valor do componente
   * @param {ObjectType.STRING} id id
   * @returns {ObjectType.STRING}
   * @multilayer false
   */
  this.cronapi.geral.obterValorComponenteId = function(id){

    return document.querySelector(`#${id}`).value

  };
   /**
   * @type function
   * @name Obter conteúdo do componente pelo id
   * @description Retorna o conteúdo do componente
   * @param {ObjectType.STRING} id id
   * @returns {ObjectType.STRING}
   * @multilayer false
   */
  this.cronapi.geral.obterConteudoComponenteId = function(id){

    return document.querySelector(`#${id}`).innerText

  };
 
   /**
   * @type function
   * @name StopPropagation
   * @description Para a propagação de eventos
   * @param {ObjectType.STRING} e e
   * @multilayer false
   */
  this.cronapi.geral.pararPropagacao = function(e){

    e.stopPropagation();
    e.stopImmediatePropagation();

  };
   /**
   * @type function
   * @name Remover componente da tela
   * @description Remove o componente da tela
   * @param {ObjectType.STRING} id id 
   * @multilayer false
   */
  this.cronapi.geral.removerElemento = function(id){

    document.querySelector(`#${id}`).remove();

  };
   /**
   * @type function
   * @name Inserir separador de menu
   * @description Insere um separador de menu na posição desejada
   * @param {ObjectType.STRING} arrayMenus arrayMenus
   * @param {ObjectType.STRING} arrayPosicoes arrayPosicoes
   * @multilayer false
   */
  this.cronapi.geral.separadorMenu = function (arrayMenus, arrayPosicoes) {

    let menu = document.querySelector("#main-nav-bar ul .nav.navbar-nav.ng-scope");
    let menuChildArr = Array.from(menu.children);

    arrayMenus.forEach((item, pos) => {
      menuChildArr.forEach((li) => {
        let contador = 0;
        let nome = li.querySelector("a span").innerText;
        /*console.log('**********************************')
        console.log(`Item iterado: ${item}`);
        console.log(`Nome comparado: ${nome}`);*/
        if (nome.toUpperCase() == item.toUpperCase()) {
          //console.log(`é igual: ${nome.toUpperCase() == item.toUpperCase()}`)
          if (li.style.display != "none") {
            //console.log(`diferente de none: ${li.style.display != "none"}`)
            let ul = li.querySelector("ul");
            //console.log(`ul obtida: ${ul}`)
            Array.from(ul.children).forEach((li) => {
              /*console.log(`Iterando nos filhos da ul. Filho(li): ${li}`)
              console.log(`Contador em: ${contador}`);*/
              if (contador == (arrayPosicoes[pos] - 1)) {
                //console.log('Achei a posição')
                let divP = document.createElement("div");
                divP.classList.add("divider-pro");

                ul.insertBefore(divP, li);
              }
              contador += 1;
            });
          }
        }
      });
    });
  };

  /**
   * @type function
   * @name Escrever no console do navegador
   * @description Executa um console.log com a mensagem desejada
   * @multilayer false
   * @param {ObjectType.STRING} valor valor 
   * @param {ObjectType.STRING} quemChama quemChama 
   */
 this.cronapi.geral.consoleLog = function(valor, quemChama, valorCSS, quemChamaCSS) {
    /** valor: valor que será escrito no console do navegador */
    /** quemChama: Título do log. Nome de quem está chamando a função. Pode ser o nome da função chamadora ou um título qualquer */
   
    if (quemChamaCSS === undefined ){
      quemChamaCSS = 'font-weight: 700; color: black; font-size: 15px;'
    }
    if (valorCSS === undefined ){
      valorCSS = 'color: black; font-size:12px;';
    }

    console.log('---------------------------------------');
    console.log(`%c*** ${quemChama} ***`, quemChamaCSS);
    console.log(`%c${valor}`, valorCSS);
  };

/**
   * @type function
   * @name Verifica Item da Tabela
   * @description Verifica se algum Item da Tabela não foi Selecionado
   * @multilayer false
   * @returns {ObjectType.BOOLEAN}  
   Autor: Bruno Borges
   Data: 15-09-2021
*/
  this.cronapi.geral.verificaItemTabela  = function() {

  let lRetorno = true;     
  let ePai     = document.getElementsByTagName("td");
  let contador = (ePai.length -1);
  for (let i = 1; i < contador; i++) {
    
    let eFilho = document.getElementById("ck" + "" + [i]+"");
   
    if ( (eFilho !== null)  && (eFilho.tagName == "INPUT") && (eFilho.type == "checkbox") && (!eFilho.checked) )  {
        lRetorno = false;
        break;
    }

  }  

  return lRetorno;
}

/**
   * @type function
   * @name Verifica Item da Lista
   * @description Verifica se algum Item da Lista não foi Selecionado - é utilizado quando todos os itens da lista são obrigatórios.
   * @multilayer false
   * @returns {ObjectType.BOOLEAN}  
   Autor: Bruno Borges
   Data: 16-09-2021
*/
this.cronapi.geral.verificaItemLista  = function() {

let lRetorno = true;
document.querySelectorAll('#conteudo-tabela ul li').forEach( li => {
    let ck = li.firstElementChild;    
    if ( (ck !== null)  && (ck.tagName == "INPUT") && (ck.type == "checkbox") && (!ck.checked) )  {
        lRetorno = false;
    }
    
})
return lRetorno;

  
}

}).bind(window)();