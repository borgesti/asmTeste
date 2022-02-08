window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Acompanhamento = window.blockly.js.blockly.Acompanhamento || {};

/**
 * acao = inserir ou deletar.
 * Se estiver inserindo, muda para 1 se a denúncia estiver com zero;
 * Se estiver excluindo, muda para 0 se a denúncia não possuir nenhum acompanhamento.
 */
window.blockly.js.blockly.Acompanhamento.alterarStatusDenunciaArgs = ['acao'];
window.blockly.js.blockly.Acompanhamento.alterarStatusDenuncia = async function(acao) {
 var ideDenuncia, qtdAcompanhamentosDenuncia, codSituacaoDenunciaAtual;
  ideDenuncia = this.cronapi.screen.getValueOfField("ASM_Acompanhamento.active.fk_asm_denuncia");
  if (acao == 'inserir') {
    codSituacaoDenunciaAtual = await this.cronapi.util.callServerBlockly('blockly.BlocoAcompanhamento:retornarCodigoSituacaoDenuncia', ideDenuncia);
    if (codSituacaoDenunciaAtual == '0') {
      await this.cronapi.util.callServerBlocklyNoReturn('blockly.BlocoAcompanhamento:alterarCodigoSituacaoDenuncia', ideDenuncia, 1);
    }
  } else if (acao == 'deletar') {
    qtdAcompanhamentosDenuncia = await this.cronapi.util.callServerBlockly('blockly.BlocoDenuncia:contarQuantidadeAcompanhamentos', ideDenuncia);
    if (qtdAcompanhamentosDenuncia == '0') {
      await this.cronapi.util.callServerBlocklyNoReturn('blockly.BlocoAcompanhamento:alterarCodigoSituacaoDenuncia', ideDenuncia, 0);
    }
  }
}
