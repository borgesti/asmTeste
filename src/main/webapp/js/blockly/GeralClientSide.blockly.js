window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.GeralClientSide = window.blockly.js.blockly.GeralClientSide || {};

/**
 * Geral
 */
window.blockly.js.blockly.GeralClientSide.obterDataAtualSemHoraArgs = [];
window.blockly.js.blockly.GeralClientSide.obterDataAtualSemHora = async function() {

  return await this.blockly.js.blockly.GeralClientSide.obterDataAtualSemHora();
}

/**
 * Geral
 */
window.blockly.js.blockly.GeralClientSide.obterDataEHoraAtualArgs = [];
window.blockly.js.blockly.GeralClientSide.obterDataEHoraAtual = async function() {

  return this.cronapi.dateTime.getNow();
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.GeralClientSide.pararPropagacaoArgs = ['event'];
window.blockly.js.blockly.GeralClientSide.pararPropagacao = async function(event) {

  await this.blockly.js.blockly.GeralClientSide.pararPropagacao(event);
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.GeralClientSide.BuscarCEPArgs = ['cep'];
window.blockly.js.blockly.GeralClientSide.BuscarCEP = async function(cep) {

  this.cronapi.util.getCEP(cep, async function(sender_retornocep) {
      retornocep = sender_retornocep;
    console.log(retornocep);
  }.bind(this));
}
