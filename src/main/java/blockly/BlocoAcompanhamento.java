package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoAcompanhamento {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// BlocoAcompanhamento
public static Var retornaCampoInformado(@ParamMetaData(description = "denuncia") Var denuncia) throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {

    item =
    cronapi.object.Operations.getObjectField(denuncia, Var.valueOf("numero_registro"));
    return item;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// BlocoAcompanhamento
public static Var retornaNumRegistro(@ParamMetaData(description = "acompanhamento") Var acompanhamento) throws Exception {
 return new Callable<Var>() {

   private Var ide_denuncia = Var.VAR_NULL;
   private Var num_registro = Var.VAR_NULL;

   public Var call() throws Exception {

    ide_denuncia =
    cronapi.object.Operations.getObjectField(acompanhamento, Var.valueOf("fk_asm_denuncia"));

    num_registro =
    cronapi.database.Operations.getField(
    cronapi.database.Operations.query(Var.valueOf("asm.entity.ASM_Denuncia"),Var.valueOf("select d.numero_registro from ASM_Denuncia d where d.ide_denuncia = :ide_denuncia"),Var.valueOf("ide_denuncia",ide_denuncia)),
    Var.valueOf("this[0]"));
    return num_registro;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
public static Var alterarCodigoSituacaoDenuncia(@ParamMetaData(description = "ideDenuncia") Var ideDenuncia, @ParamMetaData(description = "codigoSituacao") Var codigoSituacao) throws Exception {
 return new Callable<Var>() {

   private Var ide_denuncia = Var.VAR_NULL;

   public Var call() throws Exception {

    cronapi.database.Operations.beginTransaction(Var.VAR_NULL);

    cronapi.database.Operations.execute(Var.valueOf("asm.entity.ASM_Denuncia"), Var.valueOf("update ASM_Denuncia set cod_situacao_denuncia = :codSituacaoDenuncia where ide_denuncia = :ide_denuncia"),Var.valueOf("codSituacaoDenuncia",codigoSituacao),Var.valueOf("ide_denuncia",ideDenuncia));

    cronapi.database.Operations.commitTransaction(Var.VAR_NULL);
    return ideDenuncia;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
public static Var concatenaNumeroNomeCasoLogin(@ParamMetaData(description = "denuncia") Var denuncia) throws Exception {
 return new Callable<Var>() {

   private Var numeroRegistro = Var.VAR_NULL;
   private Var nomeCaso = Var.VAR_NULL;
   private Var LoginInclusao = Var.VAR_NULL;
   private Var retornoConcatenacao = Var.VAR_NULL;

   public Var call() throws Exception {

    numeroRegistro =
    cronapi.object.Operations.getObjectField(denuncia, Var.valueOf("numero_registro"));

    nomeCaso =
    cronapi.object.Operations.getObjectField(denuncia, Var.valueOf("nome_caso"));

    LoginInclusao =
    cronapi.object.Operations.getObjectField(denuncia, Var.valueOf("login_inclusao_denuncia"));

    retornoConcatenacao =
    Var.valueOf(
    numeroRegistro.toString() +
    Var.valueOf(" - ").toString() +
    nomeCaso.toString() +
    Var.valueOf(" - ").toString() +
    LoginInclusao.toString());
    return retornoConcatenacao;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
public static Var retornarCodigoSituacaoDenuncia(@ParamMetaData(description = "ideDenuncia") Var ideDenuncia) throws Exception {
 return new Callable<Var>() {

   private Var codSituacaoDenuncia = Var.VAR_NULL;

   public Var call() throws Exception {

    codSituacaoDenuncia =
    cronapi.database.Operations.getField(
    cronapi.database.Operations.query(Var.valueOf("asm.entity.ASM_Denuncia"),Var.valueOf("select d.cod_situacao_denuncia from ASM_Denuncia d where d.ide_denuncia = :ide_denuncia"),Var.valueOf("ide_denuncia",ideDenuncia)),
    Var.valueOf("this[0]"));
    return codSituacaoDenuncia;
   }
 }.call();
}

}

