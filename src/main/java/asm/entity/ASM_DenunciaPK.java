package asm.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class ASM_DenunciaPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.String ide_denuncia = UUID.randomUUID().toString().toUpperCase();

  /**
   * @generated
   */
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
   * Construtor
   * @generated
   */
  public ASM_DenunciaPK(){
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
  public ASM_DenunciaPK setIde_denuncia(java.lang.String ide_denuncia){
    this.ide_denuncia = ide_denuncia;
    return this;
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
  public ASM_DenunciaPK setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
ASM_DenunciaPK object = (ASM_DenunciaPK)obj;
    if (ide_denuncia != null ? !ide_denuncia.equals(object.ide_denuncia) : object.ide_denuncia != null) return false;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((ide_denuncia == null) ? 0 : ide_denuncia.hashCode());
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
