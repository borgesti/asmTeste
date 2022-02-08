package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoDenuncia {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// BlocoDenuncia
public static synchronized Var obterNumeroSequencial(@ParamMetaData(description = "denuncia") Var denuncia) throws Exception {
 return new Callable<Var>() {

   private Var numeroDenuncia = Var.VAR_NULL;

   public Var call() throws Exception {

    numeroDenuncia =
    blockly.GeralServerSide.definirNumeroRegistro();

    cronapi.database.Operations.updateField(denuncia,
    Var.valueOf("numero_registro"), numeroDenuncia);
    return numeroDenuncia;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
public static synchronized Var adicionarAcompanhamentoGradeEmDenuncia(@ParamMetaData(description = "ideDenuncia") Var ideDenuncia) throws Exception {
 return new Callable<Var>() {

   private Var numeroDenuncia = Var.VAR_NULL;
   private Var denuncia = Var.VAR_NULL;
   private Var cpf = Var.VAR_NULL;
   private Var qtdeAcompanhamentos = Var.VAR_NULL;
   private Var mapa = Var.VAR_NULL;
   private Var envolvimento = Var.VAR_NULL;
   private Var descricao = Var.VAR_NULL;

   public Var call() throws Exception {
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
public static synchronized Var contarQuantidadeAcompanhamentos(@ParamMetaData(description = "ideDenuncia") Var ideDenuncia) throws Exception {
 return new Callable<Var>() {

   private Var qtdeAcompanhamentos = Var.VAR_NULL;

   public Var call() throws Exception {

    qtdeAcompanhamentos =
    cronapi.database.Operations.getField(
    cronapi.database.Operations.query(Var.valueOf("asm.entity.ASM_Acompanhamento"),Var.valueOf("select COUNT(ac.fk_asm_denuncia) from ASM_Acompanhamento ac where ac.fk_asm_denuncia = :fk_asm_denuncia"),Var.valueOf("fk_asm_denuncia",ideDenuncia)),
    Var.valueOf("this[0]"));
    return qtdeAcompanhamentos;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
public static synchronized Var navegarEntre_Abas(@ParamMetaData(description = "abaAtual") Var abaAtual, @ParamMetaData(description = "proximaAba") Var proximaAba) throws Exception {
 return new Callable<Var>() {

   private Var poderMudarAba = Var.VAR_NULL;

   public Var call() throws Exception {

    poderMudarAba =
    Var.VAR_TRUE;

    if (
    Var.valueOf(
    Var.valueOf(abaAtual.equals(
    Var.valueOf("tab-qualquer"))).getObjectAsBoolean() &&
    Var.valueOf(proximaAba.equals(
    Var.valueOf("tab-gravar"))).getObjectAsBoolean()).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
        Var.valueOf("tab-gravar"));
    }

    if (
    Var.valueOf(
    Var.valueOf(abaAtual.equals(
    Var.valueOf("tab-caso"))).getObjectAsBoolean() &&
    Var.valueOf(proximaAba.equals(
    Var.valueOf("tab-identificacao"))).getObjectAsBoolean()).getObjectAsBoolean()) {

        if (
        Var.valueOf(
        cronapi.logic.Operations.isNullOrEmpty(
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("ASM_Denuncia.active.cod_origem_denuncia"))).getObjectAsBoolean() && poderMudarAba.getObjectAsBoolean()).getObjectAsBoolean()) {

            poderMudarAba =
            Var.VAR_FALSE;

            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeContent"),
            Var.valueOf("modal_nome_campo_a_preencher"),
            Var.valueOf("Origem da Denúncia"),
            Var.valueOf("true"));

            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.showModal"),
            Var.valueOf("denunciaModalPreencher"));
        }

        if (poderMudarAba.getObjectAsBoolean()) {

            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
            Var.valueOf("tab-identificacao"));
        }
    }

    if (
    Var.valueOf(
    Var.valueOf(abaAtual.equals(
    Var.valueOf("tab-identificacao"))).getObjectAsBoolean() &&
    Var.valueOf(proximaAba.equals(
    Var.valueOf("tab-caso"))).getObjectAsBoolean()).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
        Var.valueOf("tab-caso"));
    } else {

        if (
        Var.valueOf(
        Var.valueOf(abaAtual.equals(
        Var.valueOf("tab-identificacao"))).getObjectAsBoolean() &&
        Var.valueOf(proximaAba.equals(
        Var.valueOf("tab-vitima"))).getObjectAsBoolean()).getObjectAsBoolean()) {

            if (
            Var.valueOf(
            cronapi.logic.Operations.isNullOrEmpty(
            cronapi.screen.Operations.getValueOfField(
            Var.valueOf("ASM_Denuncia.active.denunciante_nome"))).getObjectAsBoolean() && poderMudarAba.getObjectAsBoolean()).getObjectAsBoolean()) {

                poderMudarAba =
                Var.VAR_FALSE;

                cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeContent"),
                Var.valueOf("modal_nome_campo_a_preencher"),
                Var.valueOf("Nome do Denunciante"),
                Var.valueOf("true"));

                cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.showModal"),
                Var.valueOf("denunciaModalPreencher"));
            }

            if (poderMudarAba.getObjectAsBoolean()) {

                cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
                Var.valueOf("tab-vitima"));
            }
        }
    }

    if (
    Var.valueOf(
    Var.valueOf(abaAtual.equals(
    Var.valueOf("tab-vitima"))).getObjectAsBoolean() &&
    Var.valueOf(proximaAba.equals(
    Var.valueOf("tab-identificacao"))).getObjectAsBoolean()).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
        Var.valueOf("tab-identificacao"));
    } else {

        if (
        Var.valueOf(
        Var.valueOf(abaAtual.equals(
        Var.valueOf("tab-vitima"))).getObjectAsBoolean() &&
        Var.valueOf(proximaAba.equals(
        Var.valueOf("tab-fato"))).getObjectAsBoolean()).getObjectAsBoolean()) {

            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
            Var.valueOf("tab-fato"));
        }
    }

    if (
    Var.valueOf(
    Var.valueOf(abaAtual.equals(
    Var.valueOf("tab-fato"))).getObjectAsBoolean() &&
    Var.valueOf(proximaAba.equals(
    Var.valueOf("tab-vitima"))).getObjectAsBoolean()).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
        Var.valueOf("tab-vitima"));
    } else {

        if (
        Var.valueOf(abaAtual.equals(
        Var.valueOf("tab-fato"))).getObjectAsBoolean()) {

            if (
            cronapi.logic.Operations.isNullOrEmpty(
            cronapi.screen.Operations.getValueOfField(
            Var.valueOf("ASM_Denuncia.active.fato_ocorrido"))).getObjectAsBoolean()) {

                cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeContent"),
                Var.valueOf("modal_nome_campo_a_preencher"),
                Var.valueOf("Fato Ocorrido"),
                Var.valueOf("true"));

                cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.showModal"),
                Var.valueOf("denunciaModalPreencher"));
            } else {

                if (
                cronapi.logic.Operations.isNullOrEmpty(
                cronapi.screen.Operations.getValueOfField(
                Var.valueOf("ASM_Denuncia.active.data_ocorrencia"))).getObjectAsBoolean()) {

                    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeContent"),
                    Var.valueOf("modal_nome_campo_a_preencher"),
                    Var.valueOf("Data da Ocorrência"),
                    Var.valueOf("true"));

                    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.showModal"),
                    Var.valueOf("denunciaModalPreencher"));
                } else {

                    if (
                    Var.valueOf(proximaAba.equals(
                    Var.valueOf("tab-questionario"))).getObjectAsBoolean()) {

                        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
                        Var.valueOf("tab-questionario"));
                    }
                }
            }
        } else {
          {}
        }
    }

    if (
    Var.valueOf(
    Var.valueOf(abaAtual.equals(
    Var.valueOf("tab-questionario"))).getObjectAsBoolean() &&
    Var.valueOf(proximaAba.equals(
    Var.valueOf("tab-fato"))).getObjectAsBoolean()).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
        Var.valueOf("tab-fato"));
    } else {

        if (
        Var.valueOf(abaAtual.equals(
        Var.valueOf("tab-questionario"))).getObjectAsBoolean()) {

            if (
            Var.valueOf(proximaAba.equals(
            Var.valueOf("tab-envolvido"))).getObjectAsBoolean()) {

                cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
                Var.valueOf("tab-envolvido"));
            }

            if (
            Var.valueOf(proximaAba.equals(
            Var.valueOf("tab-gravar"))).getObjectAsBoolean()) {

                cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
                Var.valueOf("tab-gravar"));
            }
        }
    }

    if (
    Var.valueOf(
    Var.valueOf(abaAtual.equals(
    Var.valueOf("tab-envolvido"))).getObjectAsBoolean() &&
    Var.valueOf(proximaAba.equals(
    Var.valueOf("tab-questionario"))).getObjectAsBoolean()).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
        Var.valueOf("tab-questionario"));
    } else {

        if (
        Var.valueOf(abaAtual.equals(
        Var.valueOf("tab-envolvido"))).getObjectAsBoolean()) {

            // avançar para aba "Salvar" em inserção
            if (
            Var.valueOf(proximaAba.equals(
            Var.valueOf("tab-gravar"))).getObjectAsBoolean()) {

                cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
                Var.valueOf("tab-gravar"));
            }

            // avançar para aba "Acompanhamento" em alteração
            if (
            Var.valueOf(proximaAba.equals(
            Var.valueOf("tab-anexo"))).getObjectAsBoolean()) {

                cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
                Var.valueOf("tab-anexo"));
            }
        }
    }

    if (
    Var.valueOf(
    Var.valueOf(abaAtual.equals(
    Var.valueOf("tab-anexo"))).getObjectAsBoolean() &&
    Var.valueOf(proximaAba.equals(
    Var.valueOf("tab-envolvido"))).getObjectAsBoolean()).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
        Var.valueOf("tab-envolvido"));
    } else {

        if (
        Var.valueOf(
        Var.valueOf(abaAtual.equals(
        Var.valueOf("tab-anexo"))).getObjectAsBoolean() &&
        Var.valueOf(proximaAba.equals(
        Var.valueOf("tab-acompanhamento"))).getObjectAsBoolean()).getObjectAsBoolean()) {

            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
            Var.valueOf("tab-acompanhamento"));
        }
    }

    if (
    Var.valueOf(
    Var.valueOf(abaAtual.equals(
    Var.valueOf("tab-acompanhamento"))).getObjectAsBoolean() &&
    Var.valueOf(proximaAba.equals(
    Var.valueOf("tab-anexo"))).getObjectAsBoolean()).getObjectAsBoolean()) {

        // Voltar para aba anterior
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
        Var.valueOf("tab-anexo"));
    } else {

        if (
        Var.valueOf(
        Var.valueOf(abaAtual.equals(
        Var.valueOf("tab-acompanhamento"))).getObjectAsBoolean() &&
        Var.valueOf(proximaAba.equals(
        Var.valueOf("tab-gravar"))).getObjectAsBoolean()).getObjectAsBoolean()) {

            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
            Var.valueOf("tab-gravar"));
        }
    }

    if (
    Var.valueOf(
    Var.valueOf(abaAtual.equals(
    Var.valueOf("tab-gravar"))).getObjectAsBoolean() &&
    Var.valueOf(proximaAba.equals(
    Var.valueOf("tab-caso"))).getObjectAsBoolean()).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.setActiveTab"),
        Var.valueOf("tab-caso"));
    }
    return abaAtual;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Usado na fonte de dados de denúncia, para exibição em campo calculado em grade.
public static synchronized Var resolveCodigoEnvolvimento(@ParamMetaData(description = "envolvimento") Var envolvimento) throws Exception {
 return new Callable<Var>() {

   private Var mapa = Var.VAR_NULL;
   private Var descricao = Var.VAR_NULL;

   public Var call() throws Exception {

    mapa =
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("0",
    Var.valueOf(
    Var.valueOf("Outro: ").toString() +
    cronapi.database.Operations.getField(envolvimento,
    Var.valueOf("descricao_relacionamento")).toString())) , Var.valueOf("1",
    Var.valueOf("Mãe")) , Var.valueOf("2",
    Var.valueOf("Pai")) , Var.valueOf("3",
    Var.valueOf("Irmão")) , Var.valueOf("4",
    Var.valueOf("Companheiro(a)")) , Var.valueOf("5",
    Var.valueOf("Marido")) , Var.valueOf("6",
    Var.valueOf("Esposa")));

    descricao =
    cronapi.map.Operations.getMapField(mapa,
    cronapi.database.Operations.getField(envolvimento,
    Var.valueOf("tipo_relacionamento")));
    return descricao;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
public static synchronized Var validarCPF(@ParamMetaData(description = "cpf") Var cpf) throws Exception {
 return new Callable<Var>() {

   private Var numeroDenuncia = Var.VAR_NULL;
   private Var denuncia = Var.VAR_NULL;

   public Var call() throws Exception {
    return
cronapi.validation.Operations.validateCPF(cpf);
   }
 }.call();
}

}

