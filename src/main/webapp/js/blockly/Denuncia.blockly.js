window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Denuncia = window.blockly.js.blockly.Denuncia || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Denuncia.validarCPFArgs = ['cpf', 'campo'];
window.blockly.js.blockly.Denuncia.validarCPF = async function(cpf, campo) {
 var valida;
  if (!this.cronapi.logic.isNullOrEmpty(cpf)) {
    valida = await this.cronapi.util.callServerBlockly('blockly.BlocoDenuncia:validarCPF', cpf);
    if (!valida) {
      this.cronapi.screen.notify('error',['O CPF \"',[cpf.slice(0, 3),'.',cpf.slice(3, 6),'.',cpf.slice(6, 9),'-',cpf.slice(9, 11)].join(''),'\" informado não é válido!'].join(''));
      if (campo == 'vitima_cpf') {
        this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.vitima_cpf", '');
        this.cronapi.screen.focusComponent("ASM_Denuncia.active.vitima_cpf");
      } else {
        this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.denunciante_cpf", '');
        this.cronapi.screen.focusComponent("ASM_Denuncia.active.denunciante_cpf");
      }
    }
  }
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Denuncia.exibicaoDadosVitimaArgs = [];
window.blockly.js.blockly.Denuncia.exibicaoDadosVitima = async function() {
 var cpf, campo, valida;
  if (this.cronapi.screen.getValueOfField("ASM_Denuncia.active.ind_denunciante_vitima") == 'true') {
    this.cronapi.screen.showComponent('div-identificacao-vitima');
    this.cronapi.screen.showComponent('div-endereco-vitima');
  } else {
    this.cronapi.screen.hideComponent('div-identificacao-vitima');
    this.cronapi.screen.hideComponent('div-endereco-vitima');
    this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.vitima_bairro", '');
    this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.vitima_cep", '');
    this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.vitima_cidade", '');
    this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.denunciante_endereco", '');
    this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.vitima_escolaridade", '');
    this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.vitima_nome", '');
    this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.vitima_sexo", '');
    this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.vitima_telefone", '');
    this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.vitima_uf", '');
    this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.vitima_cpf", '');
    this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.vitima_email", '');
  }
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Denuncia.ativarAbaInicialArgs = [];
window.blockly.js.blockly.Denuncia.ativarAbaInicial = async function() {
 var cpf, campo, valida;
  this.cronapi.screen.setActiveTab("tab-caso");
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Denuncia.gerenciarCamposDeEncerramentoArgs = [];
window.blockly.js.blockly.Denuncia.gerenciarCamposDeEncerramento = async function() {
 var cpf, campo, valida;
  if (this.cronapi.screen.isInsertingMode("ASM_Denuncia")) {
    this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.cod_situacao_denuncia", '0');
  }
  if (this.cronapi.screen.isEditingMode("ASM_Denuncia")) {
    // Status 2 = Encerrado. Não faz alteração nesse caso.
    if (this.cronapi.screen.getValueOfField("ASM_Denuncia.active.cod_situacao_denuncia") == '2') {
      this.cronapi.screen.showComponent("crn-textinput-encerramento-denuncia-404110");
      this.cronapi.screen.showComponent("crn-textarea-motivo-encerramento-36971");
    } else {
      ideDenuncia = this.cronapi.screen.getValueOfField("ASM_Denuncia.active.ide_denuncia");
      qtdAcompanhamentos = await this.cronapi.util.callServerBlockly('blockly.BlocoDenuncia:contarQuantidadeAcompanhamentos', ideDenuncia);
      if (qtdAcompanhamentos > 0) {
        this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.cod_situacao_denuncia", '1');
      } else if (qtdAcompanhamentos == 0) {
        this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.cod_situacao_denuncia", '0');
      }
      this.cronapi.screen.hideComponent("crn-textinput-encerramento-denuncia-404110");
      this.cronapi.screen.hideComponent("crn-textarea-motivo-encerramento-36971");
    }
  }
  await this.blockly.js.blockly.Denuncia.ativarAbaInicial();
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Denuncia.exibicaoDescreverEnvolvimentoArgs = ['codigoEnvolvimento'];
window.blockly.js.blockly.Denuncia.exibicaoDescreverEnvolvimento = async function(codigoEnvolvimento) {
 var cpf, campo;
  if (codigoEnvolvimento == '0') {
    this.cronapi.screen.showComponent("crn-textinput-modal-descricao-envolvimento");
  } else {
    this.cronapi.screen.changeValueOfField("ASMEnvolvido.active.descricao_relacionamento", '');
    this.cronapi.screen.hideComponent("crn-textinput-modal-descricao-envolvimento");
  }
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Denuncia.exibicaoDescreverOrigemArgs = ['codigoOrigem'];
window.blockly.js.blockly.Denuncia.exibicaoDescreverOrigem = async function(codigoOrigem) {
 var cpf, campo;
  if (codigoOrigem == '0') {
    this.cronapi.screen.showComponent("crn-textarea-descricao-origem-denuncia-149044");
  } else {
    this.cronapi.screen.changeValueOfField("ASM_Denuncia.active.des_origem_denuncia", '');
    this.cronapi.screen.hideComponent("crn-textarea-descricao-origem-denuncia-149044");
  }
}

/**
 * Denuncia
 */
window.blockly.js.blockly.Denuncia.procedimentosAoIniciarArgs = [];
window.blockly.js.blockly.Denuncia.procedimentosAoIniciar = async function() {
 var cpf, campo, valida;
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Denuncia.uploadArgs = [];
window.blockly.js.blockly.Denuncia.upload = async function() {
 var cpf, campo, valida;
  this.cronapi.screen.refreshDatasource("ASM_Denuncia", 'true');
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Denuncia.preencherNomeExtensaoArquivoNaModalArgs = ['informacao'];
window.blockly.js.blockly.Denuncia.preencherNomeExtensaoArquivoNaModal = async function(informacao) {
 var cpf, campo;
  console.log(informacao);
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Denuncia.esconderModalAnexoGridArgs = [];
window.blockly.js.blockly.Denuncia.esconderModalAnexoGrid = async function() {
 var cpf, campo, valida;
  this.cronapi.screen.hideModal("modalASM_AnexoGrid");
  return null;
}
