package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.Iterator;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ArquivoAcompanhamento {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Arquivo
public static Var uploadArquivoParaPasta(@ParamMetaData(description = "dados") Var dados, @ParamMetaData(description = "ideDenuncia") Var ideDenuncia) throws Exception {
 return new Callable<Var>() {

   private Var arquivo = Var.VAR_NULL;
   private Var arquivos = Var.VAR_NULL;

   public Var call() throws Exception {

    cronapi.util.Operations.upload(
    Var.valueOf("Clique aqui para selecionar um ou mais arquivos"),
    Var.valueOf("image/jpeg,\nimage/png,\napplication/pdf,\napplication/msword,\napplication/vnd.openxmlformats-officedocument.wordprocessingml.document,\napplication/vnd.ms-excel,\napplication/vnd.openxmlformats-officedocument.spreadsheetml.sheet\n"),
    Var.valueOf("5MB"),
    Var.valueOf("true"), (sender_arquivos) -> {
        arquivos = Var.valueOf(sender_arquivos);

        for (Iterator it_arquivo = arquivos.iterator(); it_arquivo.hasNext();) {
            arquivo = Var.valueOf(it_arquivo.next());

            System.out.println(
            Var.valueOf(
            cronapi.io.Operations.fileAppReclycleDir().toString() +
            cronapi.io.Operations.fileSeparator().toString() +
            Var.valueOf("UPLOAD").toString() +
            cronapi.text.Operations.getLettersFromStartToLast((
            cronapi.util.Operations.getCurrentUserName()),
            Var.valueOf(3)).toString()).getObjectAsString());
        } // end for
    });
    return
Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 */
// Descreva esta função...
public static void definirIdeAcompanhamento(@ParamMetaData(description = "ideAcompanhamento") Var ideAcompanhamento) throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.screen.Operations.addTokenClaim(
    Var.valueOf("AsmIdeAcompanhamento"), ideAcompanhamento);

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("ASMAnexoGridProvidencia"),
    Var.valueOf("true"));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("ASMAnexoGridResposta"),
    Var.valueOf("true"));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 */
// Descreva esta função...
public static void downloadArquivo(@ParamMetaData(description = "arquivo") Var arquivo, @ParamMetaData(description = "nome") Var nome) throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.io.Operations.fileCreateWithByteArray(
    Var.valueOf(
    cronapi.io.Operations.fileAppReclycleDir().toString() +
    cronapi.io.Operations.fileSeparator().toString() +
    nome.toString()), arquivo);

    cronapi.io.Operations.fileDownload(
    Var.valueOf(
    cronapi.io.Operations.fileAppReclycleDir().toString() +
    cronapi.io.Operations.fileSeparator().toString() +
    nome.toString()), nome);
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Função chamada internamente por excluirAnexoAcompanhamento
public static Var excluirAnexo(@ParamMetaData(description = "ideArquivo") Var ideArquivo) throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {

    cronapi.database.Operations.beginTransaction(Var.VAR_NULL);

    try {

        cronapi.database.Operations.execute(Var.valueOf("asm.entity.ASM_Anexo"), Var.valueOf("delete from ASM_Anexo where ide_arquivo = :ide_arquivo"),Var.valueOf("ide_arquivo",ideArquivo));

        cronapi.database.Operations.commitTransaction(Var.VAR_NULL);
     } catch (Exception item_exception) {
          item = Var.valueOf(item_exception);

        cronapi.database.Operations.rollbackTransaction(Var.VAR_NULL);
     }
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
public static Var excluirAnexoAcompanhamento(@ParamMetaData(description = "ideArquivo") Var ideArquivo) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    blockly.ArquivoAcompanhamento.excluirAnexo(ideArquivo);

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("ASMAnexoGridProvidencia"),
    Var.valueOf("true"));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("ASMAnexoGridResposta"),
    Var.valueOf("true"));
    return
Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
public static Var exibicaoGradeAnexoDocumento(@ParamMetaData(description = "ideAcompanhamento") Var ideAcompanhamento) throws Exception {
 return new Callable<Var>() {

   private Var retorno = Var.VAR_NULL;

   public Var call() throws Exception {

    retorno =
    Var.VAR_FALSE;
    return retorno;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var obterIdeAcompanhamento() throws Exception {
 return new Callable<Var>() {

   private Var x = Var.VAR_NULL;
   private Var ideArquivo = Var.VAR_NULL;
   private Var posicaoSeparador = Var.VAR_NULL;
   private Var path = Var.VAR_NULL;
   private Var extensao = Var.VAR_NULL;
   private Var nome = Var.VAR_NULL;
   private Var ideAcompanhamento = Var.VAR_NULL;
   private Var codTipoAcompanhamento = Var.VAR_NULL;
   private Var qtdArqAcompanhamento = Var.VAR_NULL;

   public Var call() throws Exception {
    return
cronapi.screen.Operations.getTokenClaim(
Var.valueOf("AsmIdeAcompanhamento"));
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
public static Var obterQtdAnexosAcompanhamento(@ParamMetaData(description = "ideAcompanhamento") Var ideAcompanhamento) throws Exception {
 return new Callable<Var>() {

   private Var qtdArqAcompanhamento = Var.VAR_NULL;

   public Var call() throws Exception {

    // Exibe a quantidade de anexos de um acompanhamento na grade da sua tela principal.
    // Recebo o ide_acompanhamento na qry passando o valor data.ide_acompanhamento, aí obtenho um campo da consulta Abrir Consulta.
    qtdArqAcompanhamento =
    cronapi.database.Operations.getField(
    cronapi.database.Operations.query(Var.valueOf("asm.entity.ASM_Anexo"),Var.valueOf("select COUNT(anexo.fk_asm_acompanhamento) from ASM_Anexo anexo where anexo.fk_asm_acompanhamento = :fk_asm_acompanhamento"),Var.valueOf("fk_asm_acompanhamento",ideAcompanhamento)),
    Var.valueOf("this[0]"));
    return qtdArqAcompanhamento;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 */
// Descreva esta função...
public static void salvarArquivo(@ParamMetaData(description = "path") Var path, @ParamMetaData(description = "ideAcompanhamento") Var ideAcompanhamento, @ParamMetaData(description = "codTipoAcompanhamento") Var codTipoAcompanhamento) throws Exception {
  new Callable<Var>() {

   private Var posicaoSeparador = Var.VAR_NULL;
   private Var extensao = Var.VAR_NULL;
   private Var nome = Var.VAR_NULL;

   public Var call() throws Exception {

    posicaoSeparador =
    cronapi.math.Operations.sum(
    Var.valueOf(path.getObjectAsString().lastIndexOf(
    cronapi.io.Operations.fileSeparator().getObjectAsString()) + 1),
    Var.valueOf(1));

    extensao =
    cronapi.io.Operations.getFileExtension(path);

    nome =
    cronapi.text.Operations.getLettersFromStartToLast(path,posicaoSeparador);

    cronapi.database.Operations.insert(Var.valueOf("asm.entity.ASM_Anexo"),Var.valueOf("extensao",extensao),Var.valueOf("fk_asm_acompanhamento",ideAcompanhamento),Var.valueOf("data_criacao",
    cronapi.dateTime.Operations.getNow()),Var.valueOf("cod_tipo_acompanhamento",codTipoAcompanhamento),Var.valueOf("arquivo",
    cronapi.io.Operations.fileReadAllToBytes(
    cronapi.io.Operations.fileOpenToRead(path))),Var.valueOf("ide_arquivo",
    cronapi.util.Operations.generateUUID()),Var.valueOf("login_criacao",
    cronapi.util.Operations.getCurrentUserName()),Var.valueOf("nome",nome));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("ASMAnexoGridProvidencia"),
    Var.valueOf("true"));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("ASMAnexoGridResposta"),
    Var.valueOf("true"));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 */
// Descreva esta função...
public static void testar(@ParamMetaData(description = "x") Var x) throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {

    System.out.println(x.getObjectAsString());
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// codTipoAcompanhamento:
// 1 Providencia
// 2 Resposta
public static Var uploadArquivo(@ParamMetaData(description = "dados") Var dados, @ParamMetaData(description = "ideAcompanhamento") Var ideAcompanhamento, @ParamMetaData(description = "codTipoAcompanhamento") Var codTipoAcompanhamento) throws Exception {
 return new Callable<Var>() {

   private Var arquivo = Var.VAR_NULL;
   private Var arquivos = Var.VAR_NULL;

   public Var call() throws Exception {

    cronapi.util.Operations.upload(
    Var.valueOf("Clique aqui para selecionar um ou mais arquivos"),
    Var.valueOf("image/jpeg,\nimage/png,\napplication/pdf,\napplication/msword,\napplication/vnd.openxmlformats-officedocument.wordprocessingml.document,\napplication/vnd.ms-excel,\napplication/vnd.openxmlformats-officedocument.spreadsheetml.sheet\n"),
    Var.valueOf("5MB"),
    Var.valueOf("true"), (sender_arquivos) -> {
        arquivos = Var.valueOf(sender_arquivos);

        for (Iterator it_arquivo = arquivos.iterator(); it_arquivo.hasNext();) {
            arquivo = Var.valueOf(it_arquivo.next());

            salvarArquivo(arquivo, ideAcompanhamento, codTipoAcompanhamento);
        } // end for
    });

    cronapi.util.Operations.sleep(
    Var.valueOf(3));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("ASMAnexoGridProvidencia"),
    Var.valueOf("true"));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("ASMAnexoGridResposta"),
    Var.valueOf("true"));
    return
Var.VAR_NULL;
   }
 }.call();
}

}

