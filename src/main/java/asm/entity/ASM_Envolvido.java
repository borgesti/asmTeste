package asm.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela ASM_Envolvido
* @generated
*/
@Entity
@Table(name = "\"ASM_Envolvido\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("asm.entity.ASM_Envolvido")
public class ASM_Envolvido implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "ide_envolvido", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String ide_envolvido = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ide_denuncia", nullable = false, referencedColumnName = "ide_denuncia", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ASM_Denuncia fk_asm_denuncia;

    /**
    * @generated
    */
    @Column(name = "nom_envolvido", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_envolvido;

    /**
    * @generated
    */
    @Column(name = "cod_tipo_relacionamento", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tipo_relacionamento;

    /**
    * @generated
    */
    @Column(name = "des_relacionamento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricao_relacionamento;

    /**
    * Construtor
    * @generated
    */
    public ASM_Envolvido(){
    }

    /**
    * Obtém ide_envolvido
    * return ide_envolvido
    * @generated
    */
    
    public java.lang.String getIde_envolvido(){
        return this.ide_envolvido;
    }

    /**
    * Define ide_envolvido
    * @param ide_envolvido ide_envolvido
    * @generated
    */
    public ASM_Envolvido setIde_envolvido(java.lang.String ide_envolvido){
        this.ide_envolvido = ide_envolvido;
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
    public ASM_Envolvido setFk_asm_denuncia(ASM_Denuncia fk_asm_denuncia){
        this.fk_asm_denuncia = fk_asm_denuncia;
        return this;
    }
    /**
    * Obtém nome_envolvido
    * return nome_envolvido
    * @generated
    */
    
    public java.lang.String getNome_envolvido(){
        return this.nome_envolvido;
    }

    /**
    * Define nome_envolvido
    * @param nome_envolvido nome_envolvido
    * @generated
    */
    public ASM_Envolvido setNome_envolvido(java.lang.String nome_envolvido){
        this.nome_envolvido = nome_envolvido;
        return this;
    }
    /**
    * Obtém tipo_relacionamento
    * return tipo_relacionamento
    * @generated
    */
    
    public java.lang.String getTipo_relacionamento(){
        return this.tipo_relacionamento;
    }

    /**
    * Define tipo_relacionamento
    * @param tipo_relacionamento tipo_relacionamento
    * @generated
    */
    public ASM_Envolvido setTipo_relacionamento(java.lang.String tipo_relacionamento){
        this.tipo_relacionamento = tipo_relacionamento;
        return this;
    }
    /**
    * Obtém descricao_relacionamento
    * return descricao_relacionamento
    * @generated
    */
    
    public java.lang.String getDescricao_relacionamento(){
        return this.descricao_relacionamento;
    }

    /**
    * Define descricao_relacionamento
    * @param descricao_relacionamento descricao_relacionamento
    * @generated
    */
    public ASM_Envolvido setDescricao_relacionamento(java.lang.String descricao_relacionamento){
        this.descricao_relacionamento = descricao_relacionamento;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
ASM_Envolvido object = (ASM_Envolvido)obj;
        if (ide_envolvido != null ? !ide_envolvido.equals(object.ide_envolvido) : object.ide_envolvido != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((ide_envolvido == null) ? 0 : ide_envolvido.hashCode());
        return result;
    }

}