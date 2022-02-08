(function() {
  'use strict';

  this.cronapi = this.cronapi || {};

   /**
   * @categoryName ComboBox
   */
  this.cronapi.combobox = this.cronapi.combobox || {};
  
     /**
   * @type function
   * @name Obter texto da lista dinâmica
   * @description Retorna o texto selecionado na lista dinâmica
   * @param {ObjectType.STRING} id id
   * @returns {ObjectType.STRING}
   * @multilayer false
   */
  this.cronapi.combobox.obterTextoListaDinamica = function(id){

    return document.querySelector(`#${id}`).previousElementSibling.innerText

  };
  

}).bind(window)();