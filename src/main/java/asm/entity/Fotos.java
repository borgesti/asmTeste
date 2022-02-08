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
* Classe que representa a tabela FOTOS
* @generated
*/
@Entity
@Table(name = "\"FOTOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("asm.entity.Fotos")
public class Fotos implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_carro", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Carro carro;

    /**
    * @generated
    */
    @Column(name = "arquivo", nullable = true, unique = false, insertable=true, updatable=true)
    @CronapiByteHeaderSignature
        
        private byte[] arquivo;

    /**
    * Construtor
    * @generated
    */
    public Fotos(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Fotos setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém carro
    * return carro
    * @generated
    */
    
    public Carro getCarro(){
        return this.carro;
    }

    /**
    * Define carro
    * @param carro carro
    * @generated
    */
    public Fotos setCarro(Carro carro){
        this.carro = carro;
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
    public Fotos setArquivo(byte[] arquivo){
        this.arquivo = arquivo;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Fotos object = (Fotos)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}