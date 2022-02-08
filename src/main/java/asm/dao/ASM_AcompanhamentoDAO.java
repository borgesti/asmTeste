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
@Repository("ASM_AcompanhamentoDAO")
@Transactional(transactionManager="asm-TransactionManager")
public interface ASM_AcompanhamentoDAO extends JpaRepository<ASM_Acompanhamento, java.lang.String> {

}
