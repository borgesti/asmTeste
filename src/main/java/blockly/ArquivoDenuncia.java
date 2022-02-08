package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.Iterator;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ArquivoDenuncia {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Arquivo
public static Var atualizarGradeAnexoDenuncia() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.util.Operations.sleep(
    Var.valueOf(3));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("ASMAnexo"),
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
// Arquivo
public static Var uploadArquivo(@ParamMetaData(description = "ideDenuncia") Var ideDenuncia) throws Exception {
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

        System.out.println(arquivo.getObjectAsString());

        for (Iterator it_arquivo = arquivos.iterator(); it_arquivo.hasNext();) {
            arquivo = Var.valueOf(it_arquivo.next());

            salvarArquivo(arquivo, ideDenuncia);
        } // end for

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
        Var.valueOf("ASMAnexo"),
        Var.valueOf("true"));
    });
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
// Arquivo
public static Var uploadArquivoBkp(@ParamMetaData(description = "dados") Var dados, @ParamMetaData(description = "ideDenuncia") Var ideDenuncia) throws Exception {
 return new Callable<Var>() {

   private Var arquivo = Var.VAR_NULL;
   private Var arquivos = Var.VAR_NULL;
   private Var maximoDeArquivos = Var.VAR_NULL;
   private Var quantidadeArquivosBanco = Var.VAR_NULL;

   public Var call() throws Exception {

    maximoDeArquivos =
    Var.valueOf(3);

    quantidadeArquivosBanco =
    blockly.ArquivoDenuncia.obterQtdAnexosDenuncia(ideDenuncia);

    if (
    Var.valueOf(quantidadeArquivosBanco.compareTo(maximoDeArquivos) < 0).getObjectAsBoolean()) {

        cronapi.util.Operations.upload(
        Var.valueOf("Clique aqui para selecionar um ou mais arquivos"),
        Var.valueOf("image/jpeg,\nimage/png,\napplication/pdf,\napplication/msword,\napplication/vnd.openxmlformats-officedocument.wordprocessingml.document,\napplication/vnd.ms-excel,\napplication/vnd.openxmlformats-officedocument.spreadsheetml.sheet\n"),
        Var.valueOf("2MB"),
        Var.valueOf("true"), (sender_arquivos) -> {
            arquivos = Var.valueOf(sender_arquivos);

            if (
            Var.valueOf(
            cronapi.list.Operations.size(arquivos).compareTo((
            cronapi.math.Operations.subtract(maximoDeArquivos,quantidadeArquivosBanco))) <= 0).getObjectAsBoolean()) {

                for (Iterator it_arquivo = arquivos.iterator(); it_arquivo.hasNext();) {
                    arquivo = Var.valueOf(it_arquivo.next());

                    salvarArquivo(arquivo, ideDenuncia);
                } // end for
            } else {

                cronapi.util.Operations.throwException(
                Var.valueOf(
                Var.valueOf("Número máximo de arquivos ultrapassado! Máximo de ").toString() +
                maximoDeArquivos.toString() +
                Var.valueOf(" arquivos por denúncia").toString()));
            }
        });

        cronapi.util.Operations.sleep(
        Var.valueOf(5));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
        Var.valueOf("ASMAnexo"),
        Var.valueOf("true"));
    } else {

        cronapi.util.Operations.throwException(
        Var.valueOf("Número máximo de arquivos atingido"));
    }
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
// Arquivo
public static Var uploadArquivoDenuncia(@ParamMetaData(description = "dados") Var dados, @ParamMetaData(description = "ideDenuncia") Var ideDenuncia) throws Exception {
 return new Callable<Var>() {

   private Var ideArquivo = Var.VAR_NULL;
   private Var posicaoSeparador = Var.VAR_NULL;
   private Var path = Var.VAR_NULL;
   private Var item = Var.VAR_NULL;
   private Var qtdArqDenuncia = Var.VAR_NULL;
   private Var qtdDenunciaSalvaBD = Var.VAR_NULL;
   private Var retorno = Var.VAR_NULL;
   private Var Exception = Var.VAR_NULL;
   private Var nome = Var.VAR_NULL;
   private Var arquivo = Var.VAR_NULL;
   private Var jsonFile = Var.VAR_NULL;
   private Var x = Var.VAR_NULL;

   public Var call() throws Exception {
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
// Arquivo
public static Var uploadArquivoParaJSON(@ParamMetaData(description = "ideDenuncia") Var ideDenuncia) throws Exception {
 return new Callable<Var>() {

   private Var arquivo = Var.VAR_NULL;
   private Var arquivos = Var.VAR_NULL;
   private Var anexoJSON = Var.VAR_NULL;
   private Var mapaJSON = Var.VAR_NULL;
   private Var lista = Var.VAR_NULL;
   private Var jsonUm = Var.VAR_NULL;

   public Var call() throws Exception {

    anexoJSON =
    cronapi.json.Operations.createObjectJson();

    mapaJSON =
    cronapi.map.Operations.createObjectMap();

    lista =
    cronapi.list.Operations.newList();

    cronapi.util.Operations.upload(
    Var.valueOf("Clique aqui para selecionar um ou mais arquivos"),
    Var.valueOf("image/jpeg,\nimage/png,\napplication/pdf,\napplication/msword,\napplication/vnd.openxmlformats-officedocument.wordprocessingml.document,\napplication/vnd.ms-excel,\napplication/vnd.openxmlformats-officedocument.spreadsheetml.sheet\n"),
    Var.valueOf("5MB"),
    Var.valueOf("true"), (sender_arquivos) -> {
        arquivos = Var.valueOf(sender_arquivos);

        System.out.println(
        Var.valueOf("inicio").getObjectAsString());

        for (Iterator it_arquivo = arquivos.iterator(); it_arquivo.hasNext();) {
            arquivo = Var.valueOf(it_arquivo.next());

            jsonUm =
            Var.valueOf(salvarArquivoParaJson(arquivo, ideDenuncia, anexoJSON));

            System.out.println(jsonUm.getObjectAsString());
        } // end for

        System.out.println(
        Var.valueOf("fim").getObjectAsString());
    });
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

            cronapi.io.Operations.fileMove(
            cronapi.list.Operations.get(arquivos,
            Var.valueOf(1)),
            Var.valueOf(
            cronapi.io.Operations.fileAppReclycleDir().toString() +
            cronapi.io.Operations.fileSeparator().toString() +
            Var.valueOf("UPLOAD").toString() +
            cronapi.text.Operations.getLettersFromStartToLast((
            cronapi.util.Operations.getCurrentUserName()),
            Var.valueOf(3)).toString()));
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
public static void definirIdeDenuncia(@ParamMetaData(description = "ideDenuncia") Var ideDenuncia) throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.screen.Operations.addTokenClaim(
    Var.valueOf("AsmIdeDenuncia"), ideDenuncia);

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("ASM_AnexoGrid"),
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
// Descreva esta função...
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
public static Var excluirAnexoDenuncia(@ParamMetaData(description = "ideArquivo") Var ideArquivo) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    blockly.ArquivoDenuncia.excluirAnexo(ideArquivo);

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("ASMAnexo"),
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
public static Var exibicaoGradeAnexoDocumento(@ParamMetaData(description = "ideDenuncia") Var ideDenuncia) throws Exception {
 return new Callable<Var>() {

   private Var qtdDenunciaSalvaBD = Var.VAR_NULL;
   private Var retorno = Var.VAR_NULL;

   public Var call() throws Exception {

    qtdDenunciaSalvaBD =
    cronapi.database.Operations.getField(
    cronapi.database.Operations.query(Var.valueOf("asm.entity.ASM_Denuncia"),Var.valueOf("select COUNT(a.ide_denuncia) from ASM_Denuncia a where a.ide_denuncia = :ide_denuncia"),Var.valueOf("ide_denuncia",ideDenuncia)),
    Var.valueOf("this[0]"));

    if (
    Var.valueOf(qtdDenunciaSalvaBD.compareTo(
    Var.valueOf(0)) > 0).getObjectAsBoolean()) {

        retorno =
        Var.VAR_TRUE;
    } else {

        retorno =
        Var.VAR_FALSE;
    }
    return retorno;
   }
 }.call();
}

/**
 */
// Descreva esta função...
public static void obtemInformacaoArquivoDenuncia() throws Exception {
  new Callable<Var>() {

   private Var dadosArquivo = Var.VAR_NULL;
   private Var infoArquivo = Var.VAR_NULL;
   private Var nomeArquivo = Var.VAR_NULL;
   private Var nomExtensaoArquivo = Var.VAR_NULL;

   public Var call() throws Exception {

    dadosArquivo =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("ASM_AnexoGrid.active.informacaoArquivo"));

    infoArquivo =
    cronapi.json.Operations.toJson(dadosArquivo);

    nomeArquivo =
    cronapi.json.Operations.getJsonOrMapField(infoArquivo,
    Var.valueOf("name"));

    nomExtensaoArquivo =
    cronapi.text.Operations.getLettersFromStartToLast((
    cronapi.json.Operations.getJsonOrMapField(infoArquivo,
    Var.valueOf("fileExtension"))),
    Var.valueOf(2));

    if (
    Var.valueOf(
    /*# sourceMappingStart=8IR(ntp%vgu=G?lLu|aw */
    cronapi.logic.Operations.isNullOrEmpty(nomeArquivo).negate().getObjectAsBoolean() &&
    /*# sourceMappingStart==E_lM;n!lM=M#8Iow{Q_ */
    cronapi.logic.Operations.isNullOrEmpty(nomeArquivo).negate().getObjectAsBoolean()).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("ASM_AnexoGrid.active.nome"), nomeArquivo);

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("ASM_AnexoGrid.active.extensao"), nomExtensaoArquivo);

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.post"),
        Var.valueOf("ASM_AnexoGrid"));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
        Var.valueOf("modalASM_AnexoGrid"));
    }
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var obterIdeDenuncia() throws Exception {
 return new Callable<Var>() {

   private Var ideArquivo = Var.VAR_NULL;

   public Var call() throws Exception {
    return
cronapi.screen.Operations.getTokenClaim(
Var.valueOf("AsmIdeDenuncia"));
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
public static Var obterQtdAnexosDenuncia(@ParamMetaData(description = "ideDenuncia") Var ideDenuncia) throws Exception {
 return new Callable<Var>() {

   private Var qtdArqDenuncia = Var.VAR_NULL;

   public Var call() throws Exception {

    // recebo o ide_denuncia na qry passando o valor data.ide_denuncia, aí obtenho um campo da consulta Abrir Consulta.
    qtdArqDenuncia =
    cronapi.database.Operations.getField(
    cronapi.database.Operations.query(Var.valueOf("asm.entity.ASM_Anexo"),Var.valueOf("select COUNT(anexo.fk_asm_denuncia) from ASM_Anexo anexo where anexo.fk_asm_denuncia = :fk_asm_denuncia"),Var.valueOf("fk_asm_denuncia",ideDenuncia)),
    Var.valueOf("this[0]"));
    return qtdArqDenuncia;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 */
// Descreva esta função...
public static void salvarArquivo(@ParamMetaData(description = "path") Var path, @ParamMetaData(description = "ideDenuncia") Var ideDenuncia) throws Exception {
  new Callable<Var>() {

   private Var posicaoSeparador = Var.VAR_NULL;
   private Var Exception = Var.VAR_NULL;

   public Var call() throws Exception {

    posicaoSeparador =
    cronapi.math.Operations.sum(
    Var.valueOf(path.getObjectAsString().lastIndexOf(
    cronapi.io.Operations.fileSeparator().getObjectAsString()) + 1),
    Var.valueOf(1));

    try {

        cronapi.database.Operations.beginTransaction(Var.VAR_NULL);

        cronapi.database.Operations.insert(Var.valueOf("asm.entity.ASM_Anexo"),Var.valueOf("extensao",
        cronapi.io.Operations.getFileExtension(path)),Var.valueOf("data_criacao",
        cronapi.dateTime.Operations.getNow()),Var.valueOf("arquivo",
        cronapi.io.Operations.fileReadAllToBytes(
        cronapi.io.Operations.fileOpenToRead(path))),Var.valueOf("ide_arquivo",
        cronapi.util.Operations.generateUUID()),Var.valueOf("login_criacao",
        cronapi.util.Operations.getCurrentUserName()),Var.valueOf("nome",
        cronapi.text.Operations.getLettersFromStartToLast(path,posicaoSeparador)),Var.valueOf("fk_asm_denuncia",ideDenuncia));

        cronapi.database.Operations.commitTransaction(Var.VAR_NULL);
     } catch (Exception Exception_exception) {
          Exception = Var.valueOf(Exception_exception);

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
public static Var salvarArquivoDenuncia(@ParamMetaData(description = "path") Var path, @ParamMetaData(description = "ideDenuncia") Var ideDenuncia) throws Exception {
 return new Callable<Var>() {

   private Var posicaoSeparador = Var.VAR_NULL;

   public Var call() throws Exception {

    posicaoSeparador =
    cronapi.math.Operations.sum(
    Var.valueOf(path.getObjectAsString().lastIndexOf(
    cronapi.io.Operations.fileSeparator().getObjectAsString()) + 1),
    Var.valueOf(1));

    cronapi.database.Operations.insert(Var.valueOf("asm.entity.ASM_Anexo"),Var.valueOf("extensao",
    cronapi.io.Operations.getFileExtension(path)),Var.valueOf("data_criacao",
    cronapi.dateTime.Operations.getNow()),Var.valueOf("arquivo",
    cronapi.io.Operations.fileReadAllToBytes(
    cronapi.io.Operations.fileOpenToRead(path))),Var.valueOf("ide_arquivo",
    cronapi.util.Operations.generateUUID()),Var.valueOf("login_criacao",
    cronapi.util.Operations.getCurrentUserName()),Var.valueOf("nome",
    cronapi.text.Operations.getLettersFromStartToLast(path,posicaoSeparador)),Var.valueOf("fk_asm_denuncia",
    Var.valueOf(obterIdeDenuncia())));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 */
// Descreva esta função...
public static void salvarArquivoParaJSONsemretorno(@ParamMetaData(description = "path") Var path, @ParamMetaData(description = "ideDenuncia") Var ideDenuncia, @ParamMetaData(description = "json") Var json) throws Exception {
  new Callable<Var>() {

   private Var posicaoSeparador = Var.VAR_NULL;
   private Var Exception = Var.VAR_NULL;

   public Var call() throws Exception {

    if (Var.VAR_FALSE.getObjectAsBoolean()) {

        posicaoSeparador =
        cronapi.math.Operations.sum(
        Var.valueOf(path.getObjectAsString().lastIndexOf(
        cronapi.io.Operations.fileSeparator().getObjectAsString()) + 1),
        Var.valueOf(1));

        try {

            cronapi.database.Operations.beginTransaction(Var.VAR_NULL);

            cronapi.database.Operations.insert(Var.valueOf("asm.entity.ASM_Anexo"),Var.valueOf("extensao",
            cronapi.io.Operations.getFileExtension(path)),Var.valueOf("data_criacao",
            cronapi.dateTime.Operations.getNow()),Var.valueOf("arquivo",
            cronapi.io.Operations.fileReadAllToBytes(
            cronapi.io.Operations.fileOpenToRead(path))),Var.valueOf("ide_arquivo",
            cronapi.util.Operations.generateUUID()),Var.valueOf("login_criacao",
            cronapi.util.Operations.getCurrentUserName()),Var.valueOf("nome",
            cronapi.text.Operations.getLettersFromStartToLast(path,posicaoSeparador)),Var.valueOf("fk_asm_denuncia",ideDenuncia));

            cronapi.database.Operations.commitTransaction(Var.VAR_NULL);
         } catch (Exception Exception_exception) {
              Exception = Var.valueOf(Exception_exception);

            cronapi.database.Operations.rollbackTransaction(Var.VAR_NULL);
         }
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
public static Var salvarArquivoParaJson(@ParamMetaData(description = "path") Var path, @ParamMetaData(description = "ideDenuncia") Var ideDenuncia, @ParamMetaData(description = "jsonFile") Var jsonFile) throws Exception {
 return new Callable<Var>() {

   private Var posicaoSeparador = Var.VAR_NULL;
   private Var item = Var.VAR_NULL;
   private Var Exception = Var.VAR_NULL;

   public Var call() throws Exception {

    posicaoSeparador =
    cronapi.math.Operations.sum(
    Var.valueOf(path.getObjectAsString().lastIndexOf(
    cronapi.io.Operations.fileSeparator().getObjectAsString()) + 1),
    Var.valueOf(1));

    item =
    cronapi.json.Operations.createObjectJson();

    try {

        cronapi.json.Operations.setJsonOrMapField(jsonFile,
        Var.valueOf("arquivo"),
        cronapi.io.Operations.fileReadAllToBytes(
        cronapi.io.Operations.fileOpenToRead(path)));

        cronapi.json.Operations.setJsonOrMapField(item,
        Var.valueOf("nome"),
        cronapi.text.Operations.getLettersFromStartToLast(path,posicaoSeparador));
     } catch (Exception Exception_exception) {
          Exception = Var.valueOf(Exception_exception);

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Exception);
     }
    return item;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
public static Var testeEventosComponentes(@ParamMetaData(description = "x") Var x) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    System.out.println(
    Var.valueOf("testeEventosComponentes").getObjectAsString());

    System.out.println(x.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

