(function() {
  'use strict';

  this.cronapi = this.cronapi || {};

   /**
   * @categoryName Grade
   */
  this.cronapi.grade = this.cronapi.grade || {};
  
  /**
   * @type function
   * @name Filtrar DS
   * @description Filtra um datasource, vinculado a uma grade, que foi preenchido por um bloco de programação
   * @multilayer false
   * @param {ObjectType.STRING} grade grade
   * @param {ObjectType.STRING} filtro filtro
   */
  this.cronapi.grade.filtrarDS = function(grade, filtro) {
  
  if (!grade) {
    throw "informe a grade"
  }

  let limparFiltros = false
  if (!filtro){
    limparFiltros = true
    filtro = '';
  }

  let trs = document.querySelectorAll(`#${grade} tbody tr`);

  let corresp = [];
  trs.forEach(tr =>{
    let arr = Array.from(tr.children);
    let diferente = true
    arr.forEach(td => {
      if (td.style.display != 'none' ){
        diferente = td.innerText.toLocaleUpperCase().search(filtro.toLocaleUpperCase()) == -1 ? true : false;
        if (diferente && !limparFiltros) {
          td.parentNode.style.display = 'none';
        } else {
          td.parentNode.style.display = '';
          corresp.push(td.parentNode)
        }
      }

    })
      
  })
  corresp.forEach(c =>{
    c.style.display = '';
  })

}

/**
   * @type function
   * @name Zebrar
   * @description Zebrar grade e aplicar classes (opcional)
   * @multilayer false
   * @param {ObjectType.STRING} grade grade
   * @param {ObjectType.STRING} classes classes
   */
  this.cronapi.grade.zebrar = function(grade, classes=null) {
  
  if (!grade) {
    throw "informe a grade"
  }
    
  let tabela = document.querySelector(`#${grade} table`)

  if (classes) {
    classes += ','
    let arr = classes.split(',')
    arr.pop();
    arr.forEach(c => {
        tabela.classList.add(c)    
        
    })
    
  } 

  tabela.classList.add('table-striped')

}

/**
   * @type function
   * @name Remover selecionar todos
   * @description Remove o checkbox que seleciona todos os registros da grade
   * @multilayer false
   * @param {ObjectType.STRING} grade grade
   */
  this.cronapi.grade.removerSelecionarTodos = function(grade) {
  
  if (!grade) {
    throw "informe a grade"
  }
    
  document.querySelector(`#${grade} table label[class="k-checkbox-label k-no-text"]`).remove();

}



// Aqui é criado um novo observador de mutação do DOM
var observarTR = new MutationObserver(callback);
// Função atribuída ao novo observador, sera chamada sempre que houver uma mutação
function callback(mutations, observer) {
    mutations.forEach(function (mutationRecord) {
      if (mutationRecord.type == "attributes" && mutationRecord.attributeName == "class") {
        observer.disconnect();
        mutationRecord.target.classList = "k-alt";
      }
    });
  }
// Observa em um elemento específico a mutação de atributos
function comecarObservar(node){
  observarTR.observe(node, { attributes: true });
}

/**
   * @type function
   * @name Remover checkbox
   * @description Remove o checkbox de uma linha baseado em um critério de comparação de string
   * @multilayer false
   * @param {ObjectType.STRING} grade grade
   * @param {ObjectType.STRING} procurar procurar
   * @param {ObjectType.BOOLEAN} manter manter
   */
  this.cronapi.grade.RemoverCheckbox = function(grade, procurar, manter) {
  /* 
   * procurar => texto a ser procurado
   * manter => Informa a função se deve manter ou não o checkbox da linha que achar correspondência
   */

  let trs = document.querySelectorAll(`#${grade} tbody tr`);
    trs.forEach((tr) => {
      let arr = Array.from(tr.children);
      arr.forEach((td) => {
        if (td.style.display != "none") {
         
          let igual = td.innerText.toUpperCase().search(procurar.toUpperCase()) != -1 ? true : false;
          let keep = td.parentNode.getAttribute("data-keep");

          /** 
           * Se achar correspondência, marca a linha para ter seu check box removido ou não de acordo com o valor da variável "manter"           
           * Se não encontrou correspondência, a marcação é o valor oposto ao conteúdo da variável "manter"
           * Isso significa que... Se quero manter o valor que estou procurando (manter = true), as linhas não possuírem correspondência devem ter seu checkbox removido
           **/
          if (igual) {
            td.parentNode.setAttribute("data-keep", manter);
          } else if (keep == null || keep == undefined) {
            td.parentNode.setAttribute("data-keep", !manter);
          } 

        }
      });
    });

    trs.forEach((tr) => {
      let devoManter = tr.getAttribute("data-keep");
      if (devoManter == "false") {
        tr.querySelector("input").nextElementSibling.remove();
        tr.querySelector("input").remove();

        tr.addEventListener('click', function(e){

        let achei = false;
        let alvo = e.srcElement;
        while (!achei) {
          let tName = alvo.tagName;
          achei = tName.toUpperCase() == "TR";
          if (!achei) {
            alvo = alvo.parentNode;
          } 
        }

        comecarObservar(tr);

        })

      }

    });

  }

/**
   * @type function
   * @name Remover botão
   * @description Remove o botão de uma linha baseado em um critério de comparação de string
   * @multilayer false
   * @param {ObjectType.STRING} grade grade
   * @param {ObjectType.STRING} procurar procurar
   * @param {ObjectType.BOOLEAN} manter manter
   */
  this.cronapi.grade.RemoverBotao = function(grade, procurar, manter) {
  /* 
   * procurar => texto a ser procurado
   * manter => Informa a função se deve manter ou não o checkbox da linha que achar correspondência
   */

  let trs = document.querySelectorAll(`#${grade} tbody tr`);
    trs.forEach((tr) => {
      let arr = Array.from(tr.children);
      arr.forEach((td) => {
        if (td.style.display != "none") {
         
          let igual = td.innerText.toUpperCase().search(procurar.toUpperCase()) != -1 ? true : false;
          let hold = td.parentNode.getAttribute("data-hold");

          if (igual) {
            td.parentNode.setAttribute("data-hold", manter);
          } else if (hold == null || hold == undefined) {
            td.parentNode.setAttribute("data-hold", !manter);
          } 

        }
      });
    });

    trs.forEach((tr) => {
      let devoManter = tr.getAttribute("data-hold");
      if (devoManter == "false") {
        tr.querySelector(".k-command-cell").firstChild.remove();

      }

    });

  }

/**
   * @type function
   * @name Clique não marca
   * @description Impede que um checkbox seja marcado ao clicar em um botão dentro da grade
   * @multilayer false
   * @param {ObjectType.STRING} grade grade
   * @param {ObjectType.STRING} seletorCSS seletorCSS
   */
  this.cronapi.grade.cliqueNaoMarca = function (grade, seletorCSS) {
    function desmarcar(input, pai) {
      input.checked = false;
      input.setAttribute("aria-label", "Select row");
      input.setAttribute("aria-checked", "false");
      pai.classList = "";
    }

    function f(e) {
      let achei = false;
      let alvo = e.srcElement;
      while (!achei) {
        let tName = alvo.tagName;
        achei = tName.toUpperCase() == "TR";
        if (!achei) {
          alvo = alvo.parentNode;
        }
      }
      let ck = alvo.querySelector("input");
      if (ck.getAttribute("aria-checked") == "false") {
        setTimeout(desmarcar, 10, ck, alvo);
      }
    }

    let arrs = Array.from(
      document.querySelectorAll(`#${grade} table ${seletorCSS}`)
    );

    arrs.forEach((arr) => {
      arr.addEventListener("click", f);
    });
}

}).bind(window)();