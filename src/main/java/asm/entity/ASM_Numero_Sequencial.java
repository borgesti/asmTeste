package asm.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela ASM_Numero_Sequencial
* @generated
*/
@Entity
@Table(name = "\"ASM_Numero_Sequencial\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("asm.entity.ASM_Numero_Sequencial")
public class ASM_Numero_Sequencial implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "ide_sequencial", nullable = false, length=0, insertable=true, updatable=true)
        private java.lang.String ide_sequencial = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "ano_sequencial", nullable = false, unique = false, length=4, insertable=true, updatable=true)
        
        private java.lang.String ano_sequencial;

    /**
    * @generated
    */
    @Column(name = "num_sequencial", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer num_sequencial;

    /**
    * Construtor
    * @generated
    */
    public ASM_Numero_Sequencial(){
    }

    /**
    * Obtém ide_sequencial
    * return ide_sequencial
    * @generated
    */
    
    public java.lang.String getIde_sequencial(){
        return this.ide_sequencial;
    }

    /**
    * Define ide_sequencial
    * @param ide_sequencial ide_sequencial
    * @generated
    */
    public ASM_Numero_Sequencial setIde_sequencial(java.lang.String ide_sequencial){
        this.ide_sequencial = ide_sequencial;
        return this;
    }
    /**
    * Obtém ano_sequencial
    * return ano_sequencial
    * @generated
    */
    
    public java.lang.String getAno_sequencial(){
        return this.ano_sequencial;
    }

    /**
    * Define ano_sequencial
    * @param ano_sequencial ano_sequencial
    * @generated
    */
    public ASM_Numero_Sequencial setAno_sequencial(java.lang.String ano_sequencial){
        this.ano_sequencial = ano_sequencial;
        return this;
    }
    /**
    * Obtém num_sequencial
    * return num_sequencial
    * @generated
    */
    
    public java.lang.Integer getNum_sequencial(){
        return this.num_sequencial;
    }

    /**
    * Define num_sequencial
    * @param num_sequencial num_sequencial
    * @generated
    */
    public ASM_Numero_Sequencial setNum_sequencial(java.lang.Integer num_sequencial){
        this.num_sequencial = num_sequencial;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
ASM_Numero_Sequencial object = (ASM_Numero_Sequencial)obj;
        if (ide_sequencial != null ? !ide_sequencial.equals(object.ide_sequencial) : object.ide_sequencial != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((ide_sequencial == null) ? 0 : ide_sequencial.hashCode());
        return result;
    }

}