package asm.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela ASM_Denuncia
* @generated
*/
@Entity
@Table(name = "\"ASM_Denuncia\"" ,uniqueConstraints=@UniqueConstraint(name="UNQ_ASM_Denuncia_0", columnNames={
    "ide_denuncia" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("asm.entity.ASM_Denuncia")
public class ASM_Denuncia implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "ide_denuncia", nullable = false, insertable=true, updatable=false)
        private java.lang.String ide_denuncia = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "tex_login_inclusao_denuncia", nullable = false, unique = false, length=10, insertable=true, updatable=true)
        
        private java.lang.String login_inclusao_denuncia;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dat_criacao", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_criacao;

    /**
    * @generated
    */
    @Column(name = "num_registro", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String numero_registro;

    /**
    * @generated
    */
    @Column(name = "nom_caso", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_caso;

    /**
    * @generated
    */
    @Column(name = "nom_denunciante", nullable = false, unique = false, length=150, insertable=true, updatable=true)
        
        private java.lang.String denunciante_nome;

    /**
    * @generated
    */
    @Column(name = "cod_sexo_denunciante", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String denunciante_sexo;

    /**
    * @generated
    */
    @Column(name = "num_cpf_denunciante", nullable = true, unique = false, length=11, insertable=true, updatable=true)
        
        private java.lang.String denunciante_cpf;

    /**
    * @generated
    */
    @Column(name = "num_telefone_denunciante", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String denunciante_telefone;

    /**
    * @generated
    */
    @Column(name = "tex_endereco_email_denunciante", nullable = true, unique = false, length=150, insertable=true, updatable=true)
        
        private java.lang.String denunciante_email;

    /**
    * @generated
    */
    @Column(name = "cod_escolaridade_denunciante", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer denunciante_escolaridade;

    /**
    * @generated
    */
    @Column(name = "num_cep_denunciante", nullable = true, unique = false, length=8, insertable=true, updatable=true)
        
        private java.lang.String denunciante_cep;

    /**
    * @generated
    */
    @Column(name = "tex_endereco_denunciante", nullable = true, unique = false, length=150, insertable=true, updatable=true)
        
        private java.lang.String denunciante_endereco;

    /**
    * @generated
    */
    @Column(name = "nom_bairro_denunciante", nullable = true, unique = false, length=150, insertable=true, updatable=true)
        
        private java.lang.String denunciante_bairro;

    /**
    * @generated
    */
    @Column(name = "nom_cidade_denunciante", nullable = true, unique = false, length=150, insertable=true, updatable=true)
        
        private java.lang.String denunciante_cidade;

    /**
    * @generated
    */
    @Column(name = "sig_uf_denunciante", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String denunciante_uf;

    /**
    * @generated
    */
    @Column(name = "des_fato_ocorrido", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String fato_ocorrido;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dat_ocorrencia", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_ocorrencia;

    /**
    * @generated
    */
    @Column(name = "des_origem_denuncia", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String des_origem_denuncia;

    /**
    * @generated
    */
    @Column(name = "ind_violencia_emocional", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_violencia_emocional = false;

    /**
    * @generated
    */
    @Column(name = "ind_violencia_psicologica", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_violencia_psicologica = false;

    /**
    * @generated
    */
    @Column(name = "ind_violencia_moral", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_violencia_moral = false;

    /**
    * @generated
    */
    @Column(name = "ind_violencia_fisica", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_violencia_fisica = false;

    /**
    * @generated
    */
    @Column(name = "ind_violencia_sexual", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_violencia_sexual = false;

    /**
    * @generated
    */
    @Column(name = "ind_violencia_patrimonial", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_violencia_patrimonial = false;

    /**
    * @generated
    */
    @Column(name = "ind_violencia_politica_genero", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_violencia_politica_genero = false;

    /**
    * @generated
    */
    @Column(name = "ind_violencia_institucional", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_violencia_institucional = false;

    /**
    * @generated
    */
    @Column(name = "ind_assedio_moral", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_assedio_moral = false;

    /**
    * @generated
    */
    @Column(name = "ind_assedio_sexual", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_assedio_sexual = false;

    /**
    * @generated
    */
    @Column(name = "ind_violencia_domestica", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_violencia_domestica = false;

    /**
    * @generated
    */
    @Column(name = "ind_abuso_sexual_ca", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_abuso_sexual_ca = false;

    /**
    * @generated
    */
    @Column(name = "ind_abuso_fisico_ca", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_abuso_fisico_ca = false;

    /**
    * @generated
    */
    @Column(name = "ind_feminicidio", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_feminicidio = false;

    /**
    * @generated
    */
    @Column(name = "ind_irregularidade_processo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_irregularidade_processo = false;

    /**
    * @generated
    */
    @Column(name = "ind_ameaca_morte", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_ameaca_morte = false;

    /**
    * @generated
    */
    @Column(name = "ind_tentativa_feminicidio", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_tentativa_feminicidio = false;

    /**
    * @generated
    */
    @Column(name = "ind_injuria_racial", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_injuria_racial = false;

    /**
    * @generated
    */
    @Column(name = "ind_outra_violencia", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_outra_violencia = false;

    /**
    * @generated
    */
    @Column(name = "des_outra_violencia", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String des_outra_violencia;

    /**
    * @generated
    */
    @Column(name = "ind_alienacao_parental", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_alienacao_parental = false;

    /**
    * @generated
    */
    @Column(name = "ind_violencia_continuada", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_violencia_continuada = false;

    /**
    * @generated
    */
    @Column(name = "tex_material_online", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String texto_material_online;

    /**
    * @generated
    */
    @Column(name = "ind_denunciante_vitima", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ind_denunciante_vitima = true;

    /**
    * @generated
    */
    @Column(name = "nom_vitima", nullable = true, unique = false, length=150, insertable=true, updatable=true)
        
        private java.lang.String vitima_nome;

    /**
    * @generated
    */
    @Column(name = "cod_sexo_vitima", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String vitima_sexo;

    /**
    * @generated
    */
    @Column(name = "num_cpf_vitima", nullable = true, unique = false, length=11, insertable=true, updatable=true)
        
        private java.lang.String vitima_cpf;

    /**
    * @generated
    */
    @Column(name = "num_telefone_vitima", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String vitima_telefone;

    /**
    * @generated
    */
    @Column(name = "tex_endereco_email_vitima", nullable = true, unique = false, length=150, insertable=true, updatable=true)
        
        private java.lang.String vitima_email;

    /**
    * @generated
    */
    @Column(name = "cod_escolaridade_vitima", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer vitima_escolaridade;

    /**
    * @generated
    */
    @Column(name = "num_cep_vitima", nullable = true, unique = false, length=8, insertable=true, updatable=true)
        
        private java.lang.String vitima_cep;

    /**
    * @generated
    */
    @Column(name = "tex_endereco_vitima", nullable = true, unique = false, length=150, insertable=true, updatable=true)
        
        private java.lang.String vitima_endereco;

    /**
    * @generated
    */
    @Column(name = "nom_bairro_vitima", nullable = true, unique = false, length=150, insertable=true, updatable=true)
        
        private java.lang.String vitima_bairro;

    /**
    * @generated
    */
    @Column(name = "nom_cidade_vitima", nullable = true, unique = false, length=150, insertable=true, updatable=true)
        
        private java.lang.String vitima_cidade;

    /**
    * @generated
    */
    @Column(name = "sig_uf_vitima", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String vitima_uf;

    /**
    * @generated
    */
    @Column(name = "cod_origem_denuncia", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer cod_origem_denuncia;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dat_recebimento_denuncia", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dat_recebimento_denuncia;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dat_encerramento_denuncia", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dat_encerramento_denuncia;

    /**
    * @generated
    */
    @Column(name = "des_motivo_encerramento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String des_motivo_encerramento;

    /**
    * @generated
    */
    @Column(name = "cod_situacao_denuncia", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer cod_situacao_denuncia;

    /**
    * @generated
    */
    @Column(name = "des_solicitacao_denunciante", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String des_solicitacao_denunciante;

    /**
    * Construtor
    * @generated
    */
    public ASM_Denuncia(){
    }

    /**
    * Obtém ide_denuncia
    * return ide_denuncia
    * @generated
    */
    
    public java.lang.String getIde_denuncia(){
        return this.ide_denuncia;
    }

    /**
    * Define ide_denuncia
    * @param ide_denuncia ide_denuncia
    * @generated
    */
    public ASM_Denuncia setIde_denuncia(java.lang.String ide_denuncia){
        this.ide_denuncia = ide_denuncia;
        return this;
    }
    /**
    * Obtém login_inclusao_denuncia
    * return login_inclusao_denuncia
    * @generated
    */
    
    public java.lang.String getLogin_inclusao_denuncia(){
        return this.login_inclusao_denuncia;
    }

    /**
    * Define login_inclusao_denuncia
    * @param login_inclusao_denuncia login_inclusao_denuncia
    * @generated
    */
    public ASM_Denuncia setLogin_inclusao_denuncia(java.lang.String login_inclusao_denuncia){
        this.login_inclusao_denuncia = login_inclusao_denuncia;
        return this;
    }
    /**
    * Obtém data_criacao
    * return data_criacao
    * @generated
    */
    
    public java.util.Date getData_criacao(){
        return this.data_criacao;
    }

    /**
    * Define data_criacao
    * @param data_criacao data_criacao
    * @generated
    */
    public ASM_Denuncia setData_criacao(java.util.Date data_criacao){
        this.data_criacao = data_criacao;
        return this;
    }
    /**
    * Obtém numero_registro
    * return numero_registro
    * @generated
    */
    
    public java.lang.String getNumero_registro(){
        return this.numero_registro;
    }

    /**
    * Define numero_registro
    * @param numero_registro numero_registro
    * @generated
    */
    public ASM_Denuncia setNumero_registro(java.lang.String numero_registro){
        this.numero_registro = numero_registro;
        return this;
    }
    /**
    * Obtém nome_caso
    * return nome_caso
    * @generated
    */
    
    public java.lang.String getNome_caso(){
        return this.nome_caso;
    }

    /**
    * Define nome_caso
    * @param nome_caso nome_caso
    * @generated
    */
    public ASM_Denuncia setNome_caso(java.lang.String nome_caso){
        this.nome_caso = nome_caso;
        return this;
    }
    /**
    * Obtém denunciante_nome
    * return denunciante_nome
    * @generated
    */
    
    public java.lang.String getDenunciante_nome(){
        return this.denunciante_nome;
    }

    /**
    * Define denunciante_nome
    * @param denunciante_nome denunciante_nome
    * @generated
    */
    public ASM_Denuncia setDenunciante_nome(java.lang.String denunciante_nome){
        this.denunciante_nome = denunciante_nome;
        return this;
    }
    /**
    * Obtém denunciante_sexo
    * return denunciante_sexo
    * @generated
    */
    
    public java.lang.String getDenunciante_sexo(){
        return this.denunciante_sexo;
    }

    /**
    * Define denunciante_sexo
    * @param denunciante_sexo denunciante_sexo
    * @generated
    */
    public ASM_Denuncia setDenunciante_sexo(java.lang.String denunciante_sexo){
        this.denunciante_sexo = denunciante_sexo;
        return this;
    }
    /**
    * Obtém denunciante_cpf
    * return denunciante_cpf
    * @generated
    */
    
    public java.lang.String getDenunciante_cpf(){
        return this.denunciante_cpf;
    }

    /**
    * Define denunciante_cpf
    * @param denunciante_cpf denunciante_cpf
    * @generated
    */
    public ASM_Denuncia setDenunciante_cpf(java.lang.String denunciante_cpf){
        this.denunciante_cpf = denunciante_cpf;
        return this;
    }
    /**
    * Obtém denunciante_telefone
    * return denunciante_telefone
    * @generated
    */
    
    public java.lang.String getDenunciante_telefone(){
        return this.denunciante_telefone;
    }

    /**
    * Define denunciante_telefone
    * @param denunciante_telefone denunciante_telefone
    * @generated
    */
    public ASM_Denuncia setDenunciante_telefone(java.lang.String denunciante_telefone){
        this.denunciante_telefone = denunciante_telefone;
        return this;
    }
    /**
    * Obtém denunciante_email
    * return denunciante_email
    * @generated
    */
    
    public java.lang.String getDenunciante_email(){
        return this.denunciante_email;
    }

    /**
    * Define denunciante_email
    * @param denunciante_email denunciante_email
    * @generated
    */
    public ASM_Denuncia setDenunciante_email(java.lang.String denunciante_email){
        this.denunciante_email = denunciante_email;
        return this;
    }
    /**
    * Obtém denunciante_escolaridade
    * return denunciante_escolaridade
    * @generated
    */
    
    public java.lang.Integer getDenunciante_escolaridade(){
        return this.denunciante_escolaridade;
    }

    /**
    * Define denunciante_escolaridade
    * @param denunciante_escolaridade denunciante_escolaridade
    * @generated
    */
    public ASM_Denuncia setDenunciante_escolaridade(java.lang.Integer denunciante_escolaridade){
        this.denunciante_escolaridade = denunciante_escolaridade;
        return this;
    }
    /**
    * Obtém denunciante_cep
    * return denunciante_cep
    * @generated
    */
    
    public java.lang.String getDenunciante_cep(){
        return this.denunciante_cep;
    }

    /**
    * Define denunciante_cep
    * @param denunciante_cep denunciante_cep
    * @generated
    */
    public ASM_Denuncia setDenunciante_cep(java.lang.String denunciante_cep){
        this.denunciante_cep = denunciante_cep;
        return this;
    }
    /**
    * Obtém denunciante_endereco
    * return denunciante_endereco
    * @generated
    */
    
    public java.lang.String getDenunciante_endereco(){
        return this.denunciante_endereco;
    }

    /**
    * Define denunciante_endereco
    * @param denunciante_endereco denunciante_endereco
    * @generated
    */
    public ASM_Denuncia setDenunciante_endereco(java.lang.String denunciante_endereco){
        this.denunciante_endereco = denunciante_endereco;
        return this;
    }
    /**
    * Obtém denunciante_bairro
    * return denunciante_bairro
    * @generated
    */
    
    public java.lang.String getDenunciante_bairro(){
        return this.denunciante_bairro;
    }

    /**
    * Define denunciante_bairro
    * @param denunciante_bairro denunciante_bairro
    * @generated
    */
    public ASM_Denuncia setDenunciante_bairro(java.lang.String denunciante_bairro){
        this.denunciante_bairro = denunciante_bairro;
        return this;
    }
    /**
    * Obtém denunciante_cidade
    * return denunciante_cidade
    * @generated
    */
    
    public java.lang.String getDenunciante_cidade(){
        return this.denunciante_cidade;
    }

    /**
    * Define denunciante_cidade
    * @param denunciante_cidade denunciante_cidade
    * @generated
    */
    public ASM_Denuncia setDenunciante_cidade(java.lang.String denunciante_cidade){
        this.denunciante_cidade = denunciante_cidade;
        return this;
    }
    /**
    * Obtém denunciante_uf
    * return denunciante_uf
    * @generated
    */
    
    public java.lang.String getDenunciante_uf(){
        return this.denunciante_uf;
    }

    /**
    * Define denunciante_uf
    * @param denunciante_uf denunciante_uf
    * @generated
    */
    public ASM_Denuncia setDenunciante_uf(java.lang.String denunciante_uf){
        this.denunciante_uf = denunciante_uf;
        return this;
    }
    /**
    * Obtém fato_ocorrido
    * return fato_ocorrido
    * @generated
    */
    
    public java.lang.String getFato_ocorrido(){
        return this.fato_ocorrido;
    }

    /**
    * Define fato_ocorrido
    * @param fato_ocorrido fato_ocorrido
    * @generated
    */
    public ASM_Denuncia setFato_ocorrido(java.lang.String fato_ocorrido){
        this.fato_ocorrido = fato_ocorrido;
        return this;
    }
    /**
    * Obtém data_ocorrencia
    * return data_ocorrencia
    * @generated
    */
    
    public java.util.Date getData_ocorrencia(){
        return this.data_ocorrencia;
    }

    /**
    * Define data_ocorrencia
    * @param data_ocorrencia data_ocorrencia
    * @generated
    */
    public ASM_Denuncia setData_ocorrencia(java.util.Date data_ocorrencia){
        this.data_ocorrencia = data_ocorrencia;
        return this;
    }
    /**
    * Obtém des_origem_denuncia
    * return des_origem_denuncia
    * @generated
    */
    
    public java.lang.String getDes_origem_denuncia(){
        return this.des_origem_denuncia;
    }

    /**
    * Define des_origem_denuncia
    * @param des_origem_denuncia des_origem_denuncia
    * @generated
    */
    public ASM_Denuncia setDes_origem_denuncia(java.lang.String des_origem_denuncia){
        this.des_origem_denuncia = des_origem_denuncia;
        return this;
    }
    /**
    * Obtém ind_violencia_emocional
    * return ind_violencia_emocional
    * @generated
    */
    
    public java.lang.Boolean getInd_violencia_emocional(){
        return this.ind_violencia_emocional;
    }

    /**
    * Define ind_violencia_emocional
    * @param ind_violencia_emocional ind_violencia_emocional
    * @generated
    */
    public ASM_Denuncia setInd_violencia_emocional(java.lang.Boolean ind_violencia_emocional){
        this.ind_violencia_emocional = ind_violencia_emocional;
        return this;
    }
    /**
    * Obtém ind_violencia_psicologica
    * return ind_violencia_psicologica
    * @generated
    */
    
    public java.lang.Boolean getInd_violencia_psicologica(){
        return this.ind_violencia_psicologica;
    }

    /**
    * Define ind_violencia_psicologica
    * @param ind_violencia_psicologica ind_violencia_psicologica
    * @generated
    */
    public ASM_Denuncia setInd_violencia_psicologica(java.lang.Boolean ind_violencia_psicologica){
        this.ind_violencia_psicologica = ind_violencia_psicologica;
        return this;
    }
    /**
    * Obtém ind_violencia_moral
    * return ind_violencia_moral
    * @generated
    */
    
    public java.lang.Boolean getInd_violencia_moral(){
        return this.ind_violencia_moral;
    }

    /**
    * Define ind_violencia_moral
    * @param ind_violencia_moral ind_violencia_moral
    * @generated
    */
    public ASM_Denuncia setInd_violencia_moral(java.lang.Boolean ind_violencia_moral){
        this.ind_violencia_moral = ind_violencia_moral;
        return this;
    }
    /**
    * Obtém ind_violencia_fisica
    * return ind_violencia_fisica
    * @generated
    */
    
    public java.lang.Boolean getInd_violencia_fisica(){
        return this.ind_violencia_fisica;
    }

    /**
    * Define ind_violencia_fisica
    * @param ind_violencia_fisica ind_violencia_fisica
    * @generated
    */
    public ASM_Denuncia setInd_violencia_fisica(java.lang.Boolean ind_violencia_fisica){
        this.ind_violencia_fisica = ind_violencia_fisica;
        return this;
    }
    /**
    * Obtém ind_violencia_sexual
    * return ind_violencia_sexual
    * @generated
    */
    
    public java.lang.Boolean getInd_violencia_sexual(){
        return this.ind_violencia_sexual;
    }

    /**
    * Define ind_violencia_sexual
    * @param ind_violencia_sexual ind_violencia_sexual
    * @generated
    */
    public ASM_Denuncia setInd_violencia_sexual(java.lang.Boolean ind_violencia_sexual){
        this.ind_violencia_sexual = ind_violencia_sexual;
        return this;
    }
    /**
    * Obtém ind_violencia_patrimonial
    * return ind_violencia_patrimonial
    * @generated
    */
    
    public java.lang.Boolean getInd_violencia_patrimonial(){
        return this.ind_violencia_patrimonial;
    }

    /**
    * Define ind_violencia_patrimonial
    * @param ind_violencia_patrimonial ind_violencia_patrimonial
    * @generated
    */
    public ASM_Denuncia setInd_violencia_patrimonial(java.lang.Boolean ind_violencia_patrimonial){
        this.ind_violencia_patrimonial = ind_violencia_patrimonial;
        return this;
    }
    /**
    * Obtém ind_violencia_politica_genero
    * return ind_violencia_politica_genero
    * @generated
    */
    
    public java.lang.Boolean getInd_violencia_politica_genero(){
        return this.ind_violencia_politica_genero;
    }

    /**
    * Define ind_violencia_politica_genero
    * @param ind_violencia_politica_genero ind_violencia_politica_genero
    * @generated
    */
    public ASM_Denuncia setInd_violencia_politica_genero(java.lang.Boolean ind_violencia_politica_genero){
        this.ind_violencia_politica_genero = ind_violencia_politica_genero;
        return this;
    }
    /**
    * Obtém ind_violencia_institucional
    * return ind_violencia_institucional
    * @generated
    */
    
    public java.lang.Boolean getInd_violencia_institucional(){
        return this.ind_violencia_institucional;
    }

    /**
    * Define ind_violencia_institucional
    * @param ind_violencia_institucional ind_violencia_institucional
    * @generated
    */
    public ASM_Denuncia setInd_violencia_institucional(java.lang.Boolean ind_violencia_institucional){
        this.ind_violencia_institucional = ind_violencia_institucional;
        return this;
    }
    /**
    * Obtém ind_assedio_moral
    * return ind_assedio_moral
    * @generated
    */
    
    public java.lang.Boolean getInd_assedio_moral(){
        return this.ind_assedio_moral;
    }

    /**
    * Define ind_assedio_moral
    * @param ind_assedio_moral ind_assedio_moral
    * @generated
    */
    public ASM_Denuncia setInd_assedio_moral(java.lang.Boolean ind_assedio_moral){
        this.ind_assedio_moral = ind_assedio_moral;
        return this;
    }
    /**
    * Obtém ind_assedio_sexual
    * return ind_assedio_sexual
    * @generated
    */
    
    public java.lang.Boolean getInd_assedio_sexual(){
        return this.ind_assedio_sexual;
    }

    /**
    * Define ind_assedio_sexual
    * @param ind_assedio_sexual ind_assedio_sexual
    * @generated
    */
    public ASM_Denuncia setInd_assedio_sexual(java.lang.Boolean ind_assedio_sexual){
        this.ind_assedio_sexual = ind_assedio_sexual;
        return this;
    }
    /**
    * Obtém ind_violencia_domestica
    * return ind_violencia_domestica
    * @generated
    */
    
    public java.lang.Boolean getInd_violencia_domestica(){
        return this.ind_violencia_domestica;
    }

    /**
    * Define ind_violencia_domestica
    * @param ind_violencia_domestica ind_violencia_domestica
    * @generated
    */
    public ASM_Denuncia setInd_violencia_domestica(java.lang.Boolean ind_violencia_domestica){
        this.ind_violencia_domestica = ind_violencia_domestica;
        return this;
    }
    /**
    * Obtém ind_abuso_sexual_ca
    * return ind_abuso_sexual_ca
    * @generated
    */
    
    public java.lang.Boolean getInd_abuso_sexual_ca(){
        return this.ind_abuso_sexual_ca;
    }

    /**
    * Define ind_abuso_sexual_ca
    * @param ind_abuso_sexual_ca ind_abuso_sexual_ca
    * @generated
    */
    public ASM_Denuncia setInd_abuso_sexual_ca(java.lang.Boolean ind_abuso_sexual_ca){
        this.ind_abuso_sexual_ca = ind_abuso_sexual_ca;
        return this;
    }
    /**
    * Obtém ind_abuso_fisico_ca
    * return ind_abuso_fisico_ca
    * @generated
    */
    
    public java.lang.Boolean getInd_abuso_fisico_ca(){
        return this.ind_abuso_fisico_ca;
    }

    /**
    * Define ind_abuso_fisico_ca
    * @param ind_abuso_fisico_ca ind_abuso_fisico_ca
    * @generated
    */
    public ASM_Denuncia setInd_abuso_fisico_ca(java.lang.Boolean ind_abuso_fisico_ca){
        this.ind_abuso_fisico_ca = ind_abuso_fisico_ca;
        return this;
    }
    /**
    * Obtém ind_feminicidio
    * return ind_feminicidio
    * @generated
    */
    
    public java.lang.Boolean getInd_feminicidio(){
        return this.ind_feminicidio;
    }

    /**
    * Define ind_feminicidio
    * @param ind_feminicidio ind_feminicidio
    * @generated
    */
    public ASM_Denuncia setInd_feminicidio(java.lang.Boolean ind_feminicidio){
        this.ind_feminicidio = ind_feminicidio;
        return this;
    }
    /**
    * Obtém ind_irregularidade_processo
    * return ind_irregularidade_processo
    * @generated
    */
    
    public java.lang.Boolean getInd_irregularidade_processo(){
        return this.ind_irregularidade_processo;
    }

    /**
    * Define ind_irregularidade_processo
    * @param ind_irregularidade_processo ind_irregularidade_processo
    * @generated
    */
    public ASM_Denuncia setInd_irregularidade_processo(java.lang.Boolean ind_irregularidade_processo){
        this.ind_irregularidade_processo = ind_irregularidade_processo;
        return this;
    }
    /**
    * Obtém ind_ameaca_morte
    * return ind_ameaca_morte
    * @generated
    */
    
    public java.lang.Boolean getInd_ameaca_morte(){
        return this.ind_ameaca_morte;
    }

    /**
    * Define ind_ameaca_morte
    * @param ind_ameaca_morte ind_ameaca_morte
    * @generated
    */
    public ASM_Denuncia setInd_ameaca_morte(java.lang.Boolean ind_ameaca_morte){
        this.ind_ameaca_morte = ind_ameaca_morte;
        return this;
    }
    /**
    * Obtém ind_tentativa_feminicidio
    * return ind_tentativa_feminicidio
    * @generated
    */
    
    public java.lang.Boolean getInd_tentativa_feminicidio(){
        return this.ind_tentativa_feminicidio;
    }

    /**
    * Define ind_tentativa_feminicidio
    * @param ind_tentativa_feminicidio ind_tentativa_feminicidio
    * @generated
    */
    public ASM_Denuncia setInd_tentativa_feminicidio(java.lang.Boolean ind_tentativa_feminicidio){
        this.ind_tentativa_feminicidio = ind_tentativa_feminicidio;
        return this;
    }
    /**
    * Obtém ind_injuria_racial
    * return ind_injuria_racial
    * @generated
    */
    
    public java.lang.Boolean getInd_injuria_racial(){
        return this.ind_injuria_racial;
    }

    /**
    * Define ind_injuria_racial
    * @param ind_injuria_racial ind_injuria_racial
    * @generated
    */
    public ASM_Denuncia setInd_injuria_racial(java.lang.Boolean ind_injuria_racial){
        this.ind_injuria_racial = ind_injuria_racial;
        return this;
    }
    /**
    * Obtém ind_outra_violencia
    * return ind_outra_violencia
    * @generated
    */
    
    public java.lang.Boolean getInd_outra_violencia(){
        return this.ind_outra_violencia;
    }

    /**
    * Define ind_outra_violencia
    * @param ind_outra_violencia ind_outra_violencia
    * @generated
    */
    public ASM_Denuncia setInd_outra_violencia(java.lang.Boolean ind_outra_violencia){
        this.ind_outra_violencia = ind_outra_violencia;
        return this;
    }
    /**
    * Obtém des_outra_violencia
    * return des_outra_violencia
    * @generated
    */
    
    public java.lang.String getDes_outra_violencia(){
        return this.des_outra_violencia;
    }

    /**
    * Define des_outra_violencia
    * @param des_outra_violencia des_outra_violencia
    * @generated
    */
    public ASM_Denuncia setDes_outra_violencia(java.lang.String des_outra_violencia){
        this.des_outra_violencia = des_outra_violencia;
        return this;
    }
    /**
    * Obtém ind_alienacao_parental
    * return ind_alienacao_parental
    * @generated
    */
    
    public java.lang.Boolean getInd_alienacao_parental(){
        return this.ind_alienacao_parental;
    }

    /**
    * Define ind_alienacao_parental
    * @param ind_alienacao_parental ind_alienacao_parental
    * @generated
    */
    public ASM_Denuncia setInd_alienacao_parental(java.lang.Boolean ind_alienacao_parental){
        this.ind_alienacao_parental = ind_alienacao_parental;
        return this;
    }
    /**
    * Obtém ind_violencia_continuada
    * return ind_violencia_continuada
    * @generated
    */
    
    public java.lang.Boolean getInd_violencia_continuada(){
        return this.ind_violencia_continuada;
    }

    /**
    * Define ind_violencia_continuada
    * @param ind_violencia_continuada ind_violencia_continuada
    * @generated
    */
    public ASM_Denuncia setInd_violencia_continuada(java.lang.Boolean ind_violencia_continuada){
        this.ind_violencia_continuada = ind_violencia_continuada;
        return this;
    }
    /**
    * Obtém texto_material_online
    * return texto_material_online
    * @generated
    */
    
    public java.lang.String getTexto_material_online(){
        return this.texto_material_online;
    }

    /**
    * Define texto_material_online
    * @param texto_material_online texto_material_online
    * @generated
    */
    public ASM_Denuncia setTexto_material_online(java.lang.String texto_material_online){
        this.texto_material_online = texto_material_online;
        return this;
    }
    /**
    * Obtém ind_denunciante_vitima
    * return ind_denunciante_vitima
    * @generated
    */
    
    public java.lang.Boolean getInd_denunciante_vitima(){
        return this.ind_denunciante_vitima;
    }

    /**
    * Define ind_denunciante_vitima
    * @param ind_denunciante_vitima ind_denunciante_vitima
    * @generated
    */
    public ASM_Denuncia setInd_denunciante_vitima(java.lang.Boolean ind_denunciante_vitima){
        this.ind_denunciante_vitima = ind_denunciante_vitima;
        return this;
    }
    /**
    * Obtém vitima_nome
    * return vitima_nome
    * @generated
    */
    
    public java.lang.String getVitima_nome(){
        return this.vitima_nome;
    }

    /**
    * Define vitima_nome
    * @param vitima_nome vitima_nome
    * @generated
    */
    public ASM_Denuncia setVitima_nome(java.lang.String vitima_nome){
        this.vitima_nome = vitima_nome;
        return this;
    }
    /**
    * Obtém vitima_sexo
    * return vitima_sexo
    * @generated
    */
    
    public java.lang.String getVitima_sexo(){
        return this.vitima_sexo;
    }

    /**
    * Define vitima_sexo
    * @param vitima_sexo vitima_sexo
    * @generated
    */
    public ASM_Denuncia setVitima_sexo(java.lang.String vitima_sexo){
        this.vitima_sexo = vitima_sexo;
        return this;
    }
    /**
    * Obtém vitima_cpf
    * return vitima_cpf
    * @generated
    */
    
    public java.lang.String getVitima_cpf(){
        return this.vitima_cpf;
    }

    /**
    * Define vitima_cpf
    * @param vitima_cpf vitima_cpf
    * @generated
    */
    public ASM_Denuncia setVitima_cpf(java.lang.String vitima_cpf){
        this.vitima_cpf = vitima_cpf;
        return this;
    }
    /**
    * Obtém vitima_telefone
    * return vitima_telefone
    * @generated
    */
    
    public java.lang.String getVitima_telefone(){
        return this.vitima_telefone;
    }

    /**
    * Define vitima_telefone
    * @param vitima_telefone vitima_telefone
    * @generated
    */
    public ASM_Denuncia setVitima_telefone(java.lang.String vitima_telefone){
        this.vitima_telefone = vitima_telefone;
        return this;
    }
    /**
    * Obtém vitima_email
    * return vitima_email
    * @generated
    */
    
    public java.lang.String getVitima_email(){
        return this.vitima_email;
    }

    /**
    * Define vitima_email
    * @param vitima_email vitima_email
    * @generated
    */
    public ASM_Denuncia setVitima_email(java.lang.String vitima_email){
        this.vitima_email = vitima_email;
        return this;
    }
    /**
    * Obtém vitima_escolaridade
    * return vitima_escolaridade
    * @generated
    */
    
    public java.lang.Integer getVitima_escolaridade(){
        return this.vitima_escolaridade;
    }

    /**
    * Define vitima_escolaridade
    * @param vitima_escolaridade vitima_escolaridade
    * @generated
    */
    public ASM_Denuncia setVitima_escolaridade(java.lang.Integer vitima_escolaridade){
        this.vitima_escolaridade = vitima_escolaridade;
        return this;
    }
    /**
    * Obtém vitima_cep
    * return vitima_cep
    * @generated
    */
    
    public java.lang.String getVitima_cep(){
        return this.vitima_cep;
    }

    /**
    * Define vitima_cep
    * @param vitima_cep vitima_cep
    * @generated
    */
    public ASM_Denuncia setVitima_cep(java.lang.String vitima_cep){
        this.vitima_cep = vitima_cep;
        return this;
    }
    /**
    * Obtém vitima_endereco
    * return vitima_endereco
    * @generated
    */
    
    public java.lang.String getVitima_endereco(){
        return this.vitima_endereco;
    }

    /**
    * Define vitima_endereco
    * @param vitima_endereco vitima_endereco
    * @generated
    */
    public ASM_Denuncia setVitima_endereco(java.lang.String vitima_endereco){
        this.vitima_endereco = vitima_endereco;
        return this;
    }
    /**
    * Obtém vitima_bairro
    * return vitima_bairro
    * @generated
    */
    
    public java.lang.String getVitima_bairro(){
        return this.vitima_bairro;
    }

    /**
    * Define vitima_bairro
    * @param vitima_bairro vitima_bairro
    * @generated
    */
    public ASM_Denuncia setVitima_bairro(java.lang.String vitima_bairro){
        this.vitima_bairro = vitima_bairro;
        return this;
    }
    /**
    * Obtém vitima_cidade
    * return vitima_cidade
    * @generated
    */
    
    public java.lang.String getVitima_cidade(){
        return this.vitima_cidade;
    }

    /**
    * Define vitima_cidade
    * @param vitima_cidade vitima_cidade
    * @generated
    */
    public ASM_Denuncia setVitima_cidade(java.lang.String vitima_cidade){
        this.vitima_cidade = vitima_cidade;
        return this;
    }
    /**
    * Obtém vitima_uf
    * return vitima_uf
    * @generated
    */
    
    public java.lang.String getVitima_uf(){
        return this.vitima_uf;
    }

    /**
    * Define vitima_uf
    * @param vitima_uf vitima_uf
    * @generated
    */
    public ASM_Denuncia setVitima_uf(java.lang.String vitima_uf){
        this.vitima_uf = vitima_uf;
        return this;
    }
    /**
    * Obtém cod_origem_denuncia
    * return cod_origem_denuncia
    * @generated
    */
    
    public java.lang.Integer getCod_origem_denuncia(){
        return this.cod_origem_denuncia;
    }

    /**
    * Define cod_origem_denuncia
    * @param cod_origem_denuncia cod_origem_denuncia
    * @generated
    */
    public ASM_Denuncia setCod_origem_denuncia(java.lang.Integer cod_origem_denuncia){
        this.cod_origem_denuncia = cod_origem_denuncia;
        return this;
    }
    /**
    * Obtém dat_recebimento_denuncia
    * return dat_recebimento_denuncia
    * @generated
    */
    
    public java.util.Date getDat_recebimento_denuncia(){
        return this.dat_recebimento_denuncia;
    }

    /**
    * Define dat_recebimento_denuncia
    * @param dat_recebimento_denuncia dat_recebimento_denuncia
    * @generated
    */
    public ASM_Denuncia setDat_recebimento_denuncia(java.util.Date dat_recebimento_denuncia){
        this.dat_recebimento_denuncia = dat_recebimento_denuncia;
        return this;
    }
    /**
    * Obtém dat_encerramento_denuncia
    * return dat_encerramento_denuncia
    * @generated
    */
    
    public java.util.Date getDat_encerramento_denuncia(){
        return this.dat_encerramento_denuncia;
    }

    /**
    * Define dat_encerramento_denuncia
    * @param dat_encerramento_denuncia dat_encerramento_denuncia
    * @generated
    */
    public ASM_Denuncia setDat_encerramento_denuncia(java.util.Date dat_encerramento_denuncia){
        this.dat_encerramento_denuncia = dat_encerramento_denuncia;
        return this;
    }
    /**
    * Obtém des_motivo_encerramento
    * return des_motivo_encerramento
    * @generated
    */
    
    public java.lang.String getDes_motivo_encerramento(){
        return this.des_motivo_encerramento;
    }

    /**
    * Define des_motivo_encerramento
    * @param des_motivo_encerramento des_motivo_encerramento
    * @generated
    */
    public ASM_Denuncia setDes_motivo_encerramento(java.lang.String des_motivo_encerramento){
        this.des_motivo_encerramento = des_motivo_encerramento;
        return this;
    }
    /**
    * Obtém cod_situacao_denuncia
    * return cod_situacao_denuncia
    * @generated
    */
    
    public java.lang.Integer getCod_situacao_denuncia(){
        return this.cod_situacao_denuncia;
    }

    /**
    * Define cod_situacao_denuncia
    * @param cod_situacao_denuncia cod_situacao_denuncia
    * @generated
    */
    public ASM_Denuncia setCod_situacao_denuncia(java.lang.Integer cod_situacao_denuncia){
        this.cod_situacao_denuncia = cod_situacao_denuncia;
        return this;
    }
    /**
    * Obtém des_solicitacao_denunciante
    * return des_solicitacao_denunciante
    * @generated
    */
    
    public java.lang.String getDes_solicitacao_denunciante(){
        return this.des_solicitacao_denunciante;
    }

    /**
    * Define des_solicitacao_denunciante
    * @param des_solicitacao_denunciante des_solicitacao_denunciante
    * @generated
    */
    public ASM_Denuncia setDes_solicitacao_denunciante(java.lang.String des_solicitacao_denunciante){
        this.des_solicitacao_denunciante = des_solicitacao_denunciante;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
ASM_Denuncia object = (ASM_Denuncia)obj;
        if (ide_denuncia != null ? !ide_denuncia.equals(object.ide_denuncia) : object.ide_denuncia != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((ide_denuncia == null) ? 0 : ide_denuncia.hashCode());
        return result;
    }

}