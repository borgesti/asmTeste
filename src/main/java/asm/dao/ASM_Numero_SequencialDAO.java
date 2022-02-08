package asm.dao;

import asm.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*;


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("ASM_Numero_SequencialDAO")
@Transactional(transactionManager="asm-TransactionManager")
public interface ASM_Numero_SequencialDAO extends JpaRepository<ASM_Numero_Sequencial, java.lang.String> {

}
