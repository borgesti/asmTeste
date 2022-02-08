package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class GeralServerSide {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// GeralServerSide
public static Var obterDataHoraAtual() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.dateTime.Operations.getNow();
   }
 }.call();
}

/**
 *
 * @return Var
 */
// GeralServerSide
public static Var obterUsuarioLogado() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.util.Operations.getCurrentUserName();
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var definirNumeroRegistro() throws Exception {
 return new Callable<Var>() {

   private Var anoAtual = Var.VAR_NULL;
   private Var numeroAtual = Var.VAR_NULL;
   private Var zeros = Var.VAR_NULL;
   private Var numeroRegistro = Var.VAR_NULL;

   public Var call() throws Exception {

    anoAtual =
    cronapi.dateTime.Operations.getYear(
    blockly.GeralServerSide.obterDataHoraAtual());

    numeroAtual =
    cronapi.database.Operations.getField(
    cronapi.database.Operations.query(Var.valueOf("asm.entity.ASM_Numero_Sequencial"),Var.valueOf("select ns.num_sequencial from ASM_Numero_Sequencial ns where ns.ano_sequencial = :ano_sequencial"),Var.valueOf("ano_sequencial",anoAtual)),
    Var.valueOf("this[0]"));

    cronapi.database.Operations.beginTransaction(Var.VAR_NULL);

    if (
    cronapi.logic.Operations.isNullOrEmpty(numeroAtual).getObjectAsBoolean()) {

        numeroAtual =
        Var.valueOf(1);

        cronapi.database.Operations.insert(Var.valueOf("asm.entity.ASM_Numero_Sequencial"),Var.valueOf("ano_sequencial",anoAtual),Var.valueOf("ide_sequencial",
        cronapi.util.Operations.generateUUID()),Var.valueOf("num_sequencial",
        Var.valueOf(1)));
    } else {

        numeroAtual =
        cronapi.math.Operations.sum(numeroAtual,
        Var.valueOf(1));

        cronapi.database.Operations.execute(Var.valueOf("asm.entity.ASM_Numero_Sequencial"), Var.valueOf("update ASM_Numero_Sequencial set num_sequencial = :num_sequencial where ano_sequencial = :ano_sequencial"),Var.valueOf("num_sequencial",numeroAtual),Var.valueOf("ano_sequencial",anoAtual));
    }

    cronapi.database.Operations.commitTransaction(Var.VAR_NULL);

    zeros =
    Var.valueOf("00000");

    numeroRegistro =
    Var.valueOf(
    anoAtual.toString() +
    cronapi.text.Operations.getLettersFromStartToFromStart(zeros,
    Var.valueOf(1),(
    cronapi.math.Operations.subtract(
    Var.valueOf(zeros.length()),
    Var.valueOf(numeroAtual.length())))).toString() +
    numeroAtual.toString());
    return numeroRegistro;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var listaDeUFs() throws Exception {
 return new Callable<Var>() {

   private Var listaUFs = Var.VAR_NULL;

   public Var call() throws Exception {

    listaUFs =
    cronapi.json.Operations.toList(
    Var.valueOf("{\n    \"UF\": [\n        {\"nome\": \"Acre\", \"sigla\": \"AC\"},\n        {\"nome\": \"Alagoas\", \"sigla\": \"AL\"},\n        {\"nome\": \"Amapá\", \"sigla\": \"AP\"},\n        {\"nome\": \"Amazonas\", \"sigla\": \"AM\"},\n        {\"nome\": \"Bahia\", \"sigla\": \"BA\"},\n        {\"nome\": \"Ceará\", \"sigla\": \"CE\"},\n        {\"nome\": \"Distrito Federal\", \"sigla\": \"DF\"},\n        {\"nome\": \"Espírito Santo\", \"sigla\": \"ES\"},\n        {\"nome\": \"Goiás\", \"sigla\": \"GO\"},\n        {\"nome\": \"Maranhão\", \"sigla\": \"MA\"},\n        {\"nome\": \"Mato Grosso\", \"sigla\": \"MT\"},\n        {\"nome\": \"Mato Grosso do Sul\", \"sigla\": \"MS\"},\n        {\"nome\": \"Minas Gerais\", \"sigla\": \"MG\"},\n        {\"nome\": \"Pará\", \"sigla\": \"PA\"},\n        {\"nome\": \"Paraíba\", \"sigla\": \"PB\"},\n        {\"nome\": \"Paraná\", \"sigla\": \"PR\"},\n        {\"nome\": \"Pernambuco\", \"sigla\": \"PE\"},\n        {\"nome\": \"Piauí\", \"sigla\": \"PI\"},\n        {\"nome\": \"Rio de Janeiro\", \"sigla\": \"RJ\"},\n        {\"nome\": \"Rio Grande do Norte\", \"sigla\": \"RN\"},\n        {\"nome\": \"Rio Grande do Sul\", \"sigla\": \"RS\"},\n        {\"nome\": \"Rondônia\", \"sigla\": \"RO\"},\n        {\"nome\": \"Roraima\", \"sigla\": \"RR\"},\n        {\"nome\": \"Santa Catarina\", \"sigla\": \"SC\"},\n        {\"nome\": \"São Paulo\", \"sigla\": \"SP\"},\n        {\"nome\": \"Sergipe\", \"sigla\": \"SE\"},\n        {\"nome\": \"Tocantins\", \"sigla\": \"TO\"}\n\n    ]\n}"));
    return listaUFs;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
public static Var retornaTextoReduzidoParaExibicaoGrade(@ParamMetaData(description = "textoLongo") Var textoLongo) throws Exception {
 return new Callable<Var>() {

   private Var maxCaracteresRetorno = Var.VAR_NULL;
   private Var texto_retorno = Var.VAR_NULL;

   public Var call() throws Exception {

    maxCaracteresRetorno =
    Var.valueOf(30);

    texto_retorno =
    Var.valueOf("");

    if (
    Var.valueOf(
    Var.valueOf(textoLongo.length()).compareTo(
    Var.valueOf(0)) > 0).getObjectAsBoolean()) {

        texto_retorno =
        cronapi.text.Operations.getLettersFromStartToFromStart(textoLongo,
        Var.valueOf(1),maxCaracteresRetorno);

        if (
        Var.valueOf(
        Var.valueOf(textoLongo.length()).compareTo(maxCaracteresRetorno) > 0).getObjectAsBoolean()) {

            texto_retorno =
            Var.valueOf(
            texto_retorno.toString() +
            Var.valueOf("...").toString());
        }
    }
    return texto_retorno;
   }
 }.call();
}

}

