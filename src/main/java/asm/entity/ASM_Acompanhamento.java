package asm.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela ASM_Acompanhamento
* @generated
*/
@Entity
@Table(name = "\"ASM_Acompanhamento\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("asm.entity.ASM_Acompanhamento")
public class ASM_Acompanhamento implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "ide_acompanhamento", nullable = false, insertable=true, updatable=true)
        private java.lang.String ide_acompanhamento = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ide_denuncia", nullable = false, referencedColumnName = "ide_denuncia", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ASM_Denuncia fk_asm_denuncia;

    /**
    * @generated
    */
    @Column(name = "tex_login_servidor", nullable = false, unique = false, length=10, insertable=true, updatable=true)
        
        private java.lang.String login_servidor;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dat_acompanhamento", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_acompanhamento;

    /**
    * @generated
    */
    @Column(name = "des_providencia", nullable = false, unique = false, length=1000, insertable=true, updatable=true)
        
        private java.lang.String descricao_providencia;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dat_providencia", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_providencia;

    /**
    * @generated
    */
    @Column(name = "nom_contato_providencia", nullable = true, unique = false, length=150, insertable=true, updatable=true)
        
        private java.lang.String nome_contato_providencia;

    /**
    * @generated
    */
    @Column(name = "nom_orgao_providencia", nullable = true, unique = false, length=150, insertable=true, updatable=true)
        
        private java.lang.String nome_orgao_providencia;

    /**
    * @generated
    */
    @Column(name = "tex_endereco_email_providencia", nullable = true, unique = false, length=150, insertable=true, updatable=true)
        
        private java.lang.String endereco_email_providencia;

    /**
    * @generated
    */
    @Column(name = "num_telefone_providencia", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String numero_telefone_providencia;

    /**
    * @generated
    */
    @Column(name = "des_resposta", nullable = true, unique = false, length=1000, insertable=true, updatable=true)
        
        private java.lang.String descricao_resposta;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dat_resposta", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_resposta;

    /**
    * @generated
    */
    @Column(name = "nom_contato_resposta", nullable = true, unique = false, length=150, insertable=true, updatable=true)
        
        private java.lang.String nome_contato_resposta;

    /**
    * @generated
    */
    @Column(name = "tex_endereco_email_resposta", nullable = true, unique = false, length=150, insertable=true, updatable=true)
        
        private java.lang.String endereco_email_resposta;

    /**
    * @generated
    */
    @Column(name = "num_telefone_resposta", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String numero_telefone_resposta;

    /**
    * Construtor
    * @generated
    */
    public ASM_Acompanhamento(){
    }

    /**
    * Obtém ide_acompanhamento
    * return ide_acompanhamento
    * @generated
    */
    
    public java.lang.String getIde_acompanhamento(){
        return this.ide_acompanhamento;
    }

    /**
    * Define ide_acompanhamento
    * @param ide_acompanhamento ide_acompanhamento
    * @generated
    */
    public ASM_Acompanhamento setIde_acompanhamento(java.lang.String ide_acompanhamento){
        this.ide_acompanhamento = ide_acompanhamento;
        return this;
    }
    /**
    * Obtém fk_asm_denuncia
    * return fk_asm_denuncia
    * @generated
    */
    
    public ASM_Denuncia getFk_asm_denuncia(){
        return this.fk_asm_denuncia;
    }

    /**
    * Define fk_asm_denuncia
    * @param fk_asm_denuncia fk_asm_denuncia
    * @generated
    */
    public ASM_Acompanhamento setFk_asm_denuncia(ASM_Denuncia fk_asm_denuncia){
        this.fk_asm_denuncia = fk_asm_denuncia;
        return this;
    }
    /**
    * Obtém login_servidor
    * return login_servidor
    * @generated
    */
    
    public java.lang.String getLogin_servidor(){
        return this.login_servidor;
    }

    /**
    * Define login_servidor
    * @param login_servidor login_servidor
    * @generated
    */
    public ASM_Acompanhamento setLogin_servidor(java.lang.String login_servidor){
        this.login_servidor = login_servidor;
        return this;
    }
    /**
    * Obtém data_acompanhamento
    * return data_acompanhamento
    * @generated
    */
    
    public java.util.Date getData_acompanhamento(){
        return this.data_acompanhamento;
    }

    /**
    * Define data_acompanhamento
    * @param data_acompanhamento data_acompanhamento
    * @generated
    */
    public ASM_Acompanhamento setData_acompanhamento(java.util.Date data_acompanhamento){
        this.data_acompanhamento = data_acompanhamento;
        return this;
    }
    /**
    * Obtém descricao_providencia
    * return descricao_providencia
    * @generated
    */
    
    public java.lang.String getDescricao_providencia(){
        return this.descricao_providencia;
    }

    /**
    * Define descricao_providencia
    * @param descricao_providencia descricao_providencia
    * @generated
    */
    public ASM_Acompanhamento setDescricao_providencia(java.lang.String descricao_providencia){
        this.descricao_providencia = descricao_providencia;
        return this;
    }
    /**
    * Obtém data_providencia
    * return data_providencia
    * @generated
    */
    
    public java.util.Date getData_providencia(){
        return this.data_providencia;
    }

    /**
    * Define data_providencia
    * @param data_providencia data_providencia
    * @generated
    */
    public ASM_Acompanhamento setData_providencia(java.util.Date data_providencia){
        this.data_providencia = data_providencia;
        return this;
    }
    /**
    * Obtém nome_contato_providencia
    * return nome_contato_providencia
    * @generated
    */
    
    public java.lang.String getNome_contato_providencia(){
        return this.nome_contato_providencia;
    }

    /**
    * Define nome_contato_providencia
    * @param nome_contato_providencia nome_contato_providencia
    * @generated
    */
    public ASM_Acompanhamento setNome_contato_providencia(java.lang.String nome_contato_providencia){
        this.nome_contato_providencia = nome_contato_providencia;
        return this;
    }
    /**
    * Obtém nome_orgao_providencia
    * return nome_orgao_providencia
    * @generated
    */
    
    public java.lang.String getNome_orgao_providencia(){
        return this.nome_orgao_providencia;
    }

    /**
    * Define nome_orgao_providencia
    * @param nome_orgao_providencia nome_orgao_providencia
    * @generated
    */
    public ASM_Acompanhamento setNome_orgao_providencia(java.lang.String nome_orgao_providencia){
        this.nome_orgao_providencia = nome_orgao_providencia;
        return this;
    }
    /**
    * Obtém endereco_email_providencia
    * return endereco_email_providencia
    * @generated
    */
    
    public java.lang.String getEndereco_email_providencia(){
        return this.endereco_email_providencia;
    }

    /**
    * Define endereco_email_providencia
    * @param endereco_email_providencia endereco_email_providencia
    * @generated
    */
    public ASM_Acompanhamento setEndereco_email_providencia(java.lang.String endereco_email_providencia){
        this.endereco_email_providencia = endereco_email_providencia;
        return this;
    }
    /**
    * Obtém numero_telefone_providencia
    * return numero_telefone_providencia
    * @generated
    */
    
    public java.lang.String getNumero_telefone_providencia(){
        return this.numero_telefone_providencia;
    }

    /**
    * Define numero_telefone_providencia
    * @param numero_telefone_providencia numero_telefone_providencia
    * @generated
    */
    public ASM_Acompanhamento setNumero_telefone_providencia(java.lang.String numero_telefone_providencia){
        this.numero_telefone_providencia = numero_telefone_providencia;
        return this;
    }
    /**
    * Obtém descricao_resposta
    * return descricao_resposta
    * @generated
    */
    
    public java.lang.String getDescricao_resposta(){
        return this.descricao_resposta;
    }

    /**
    * Define descricao_resposta
    * @param descricao_resposta descricao_resposta
    * @generated
    */
    public ASM_Acompanhamento setDescricao_resposta(java.lang.String descricao_resposta){
        this.descricao_resposta = descricao_resposta;
        return this;
    }
    /**
    * Obtém data_resposta
    * return data_resposta
    * @generated
    */
    
    public java.util.Date getData_resposta(){
        return this.data_resposta;
    }

    /**
    * Define data_resposta
    * @param data_resposta data_resposta
    * @generated
    */
    public ASM_Acompanhamento setData_resposta(java.util.Date data_resposta){
        this.data_resposta = data_resposta;
        return this;
    }
    /**
    * Obtém nome_contato_resposta
    * return nome_contato_resposta
    * @generated
    */
    
    public java.lang.String getNome_contato_resposta(){
        return this.nome_contato_resposta;
    }

    /**
    * Define nome_contato_resposta
    * @param nome_contato_resposta nome_contato_resposta
    * @generated
    */
    public ASM_Acompanhamento setNome_contato_resposta(java.lang.String nome_contato_resposta){
        this.nome_contato_resposta = nome_contato_resposta;
        return this;
    }
    /**
    * Obtém endereco_email_resposta
    * return endereco_email_resposta
    * @generated
    */
    
    public java.lang.String getEndereco_email_resposta(){
        return this.endereco_email_resposta;
    }

    /**
    * Define endereco_email_resposta
    * @param endereco_email_resposta endereco_email_resposta
    * @generated
    */
    public ASM_Acompanhamento setEndereco_email_resposta(java.lang.String endereco_email_resposta){
        this.endereco_email_resposta = endereco_email_resposta;
        return this;
    }
    /**
    * Obtém numero_telefone_resposta
    * return numero_telefone_resposta
    * @generated
    */
    
    public java.lang.String getNumero_telefone_resposta(){
        return this.numero_telefone_resposta;
    }

    /**
    * Define numero_telefone_resposta
    * @param numero_telefone_resposta numero_telefone_resposta
    * @generated
    */
    public ASM_Acompanhamento setNumero_telefone_resposta(java.lang.String numero_telefone_resposta){
        this.numero_telefone_resposta = numero_telefone_resposta;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
ASM_Acompanhamento object = (ASM_Acompanhamento)obj;
        if (ide_acompanhamento != null ? !ide_acompanhamento.equals(object.ide_acompanhamento) : object.ide_acompanhamento != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((ide_acompanhamento == null) ? 0 : ide_acompanhamento.hashCode());
        return result;
    }

}