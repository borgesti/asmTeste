(function() {
  'use strict';

  this.cronapi = this.cronapi || {};

   /**
   * @categoryName Imagem
   */
  this.cronapi.imagem = this.cronapi.imagem || {};
  
  /**
   * @type function
   * @name Alterar source
   * @description Altera o atributo src de uma imagem
   * @multilayer false
   * @param {ObjectType.STRING} id id
   * @param {ObjectType.STRING} src src
   */
  this.cronapi.imagem.alterarSRC = function(id, src) {
    let img = document.querySelector(`#${id}`);
    img.src = src;
  };
  /**
   * @type function
   * @name Alterar alt
   * @description Altera o atributo alt de uma imagem
   * @multilayer false
   * @param {ObjectType.STRING} id id
   * @param {ObjectType.STRING} alt alt
   */
  this.cronapi.imagem.alterarALT = function(id, alt) {
    let img = document.querySelector(`#${id}`);
    img.alt = alt;
  };
  

}).bind(window)();