package asm.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
    import cronapi.CronapiByteHeaderSignature;


/**
* Classe que representa a tabela ASM_Anexo
* @generated
*/
@Entity
@Table(name = "\"ASM_Anexo\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("asm.entity.ASM_Anexo")
public class ASM_Anexo implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "ide_arquivo", nullable = false, insertable=true, updatable=true)
        private java.lang.String ide_arquivo = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "arq_anexo", nullable = true, unique = false, insertable=true, updatable=true)
    @CronapiByteHeaderSignature
        
        private byte[] arquivo;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dat_criacao", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_criacao;

    /**
    * @generated
    */
    @Column(name = "tex_extensao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String extensao;

    /**
    * @generated
    */
    @Column(name = "tex_login_criacao", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String login_criacao;

    /**
    * @generated
    */
    @Column(name = "nom_arquivo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ide_denuncia", nullable = true, referencedColumnName = "ide_denuncia", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ASM_Denuncia fk_asm_denuncia;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ide_acompanhamento", nullable = true, referencedColumnName = "ide_acompanhamento", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ASM_Acompanhamento fk_asm_acompanhamento;

    /**
    * @generated
    */
    @Column(name = "cod_tipo_acompanhamento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer cod_tipo_acompanhamento;

    /**
    * @generated
    */
    @Column(name = "des_arquivo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String informacaoArquivo;

    /**
    * Construtor
    * @generated
    */
    public ASM_Anexo(){
    }

    /**
    * Obtém ide_arquivo
    * return ide_arquivo
    * @generated
    */
    
    public java.lang.String getIde_arquivo(){
        return this.ide_arquivo;
    }

    /**
    * Define ide_arquivo
    * @param ide_arquivo ide_arquivo
    * @generated
    */
    public ASM_Anexo setIde_arquivo(java.lang.String ide_arquivo){
        this.ide_arquivo = ide_arquivo;
        return this;
    }
    /**
    * Obtém arquivo
    * return arquivo
    * @generated
    */
    
    public byte[] getArquivo(){
        return this.arquivo;
    }

    /**
    * Define arquivo
    * @param arquivo arquivo
    * @generated
    */
    public ASM_Anexo setArquivo(byte[] arquivo){
        this.arquivo = arquivo;
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
    public ASM_Anexo setData_criacao(java.util.Date data_criacao){
        this.data_criacao = data_criacao;
        return this;
    }
    /**
    * Obtém extensao
    * return extensao
    * @generated
    */
    
    public java.lang.String getExtensao(){
        return this.extensao;
    }

    /**
    * Define extensao
    * @param extensao extensao
    * @generated
    */
    public ASM_Anexo setExtensao(java.lang.String extensao){
        this.extensao = extensao;
        return this;
    }
    /**
    * Obtém login_criacao
    * return login_criacao
    * @generated
    */
    
    public java.lang.String getLogin_criacao(){
        return this.login_criacao;
    }

    /**
    * Define login_criacao
    * @param login_criacao login_criacao
    * @generated
    */
    public ASM_Anexo setLogin_criacao(java.lang.String login_criacao){
        this.login_criacao = login_criacao;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    
    public java.lang.String getNome(){
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public ASM_Anexo setNome(java.lang.String nome){
        this.nome = nome;
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
    public ASM_Anexo setFk_asm_denuncia(ASM_Denuncia fk_asm_denuncia){
        this.fk_asm_denuncia = fk_asm_denuncia;
        return this;
    }
    /**
    * Obtém fk_asm_acompanhamento
    * return fk_asm_acompanhamento
    * @generated
    */
    
    public ASM_Acompanhamento getFk_asm_acompanhamento(){
        return this.fk_asm_acompanhamento;
    }

    /**
    * Define fk_asm_acompanhamento
    * @param fk_asm_acompanhamento fk_asm_acompanhamento
    * @generated
    */
    public ASM_Anexo setFk_asm_acompanhamento(ASM_Acompanhamento fk_asm_acompanhamento){
        this.fk_asm_acompanhamento = fk_asm_acompanhamento;
        return this;
    }
    /**
    * Obtém cod_tipo_acompanhamento
    * return cod_tipo_acompanhamento
    * @generated
    */
    
    public java.lang.Integer getCod_tipo_acompanhamento(){
        return this.cod_tipo_acompanhamento;
    }

    /**
    * Define cod_tipo_acompanhamento
    * @param cod_tipo_acompanhamento cod_tipo_acompanhamento
    * @generated
    */
    public ASM_Anexo setCod_tipo_acompanhamento(java.lang.Integer cod_tipo_acompanhamento){
        this.cod_tipo_acompanhamento = cod_tipo_acompanhamento;
        return this;
    }
    /**
    * Obtém informacaoArquivo
    * return informacaoArquivo
    * @generated
    */
    
    public java.lang.String getInformacaoArquivo(){
        return this.informacaoArquivo;
    }

    /**
    * Define informacaoArquivo
    * @param informacaoArquivo informacaoArquivo
    * @generated
    */
    public ASM_Anexo setInformacaoArquivo(java.lang.String informacaoArquivo){
        this.informacaoArquivo = informacaoArquivo;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
ASM_Anexo object = (ASM_Anexo)obj;
        if (ide_arquivo != null ? !ide_arquivo.equals(object.ide_arquivo) : object.ide_arquivo != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((ide_arquivo == null) ? 0 : ide_arquivo.hashCode());
        return result;
    }

}