package ru.blessphammer.testtask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.blessphammer.testtask.dao.LoanApplicationDAO;
import ru.blessphammer.testtask.dao.LoanContractDAO;
import ru.blessphammer.testtask.entities.LoanContractEntity;
import ru.blessphammer.testtask.models.LoanContractForm;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class LoanContractServiceImpl implements LoanContractService
{

    LoanContractDAO loanContractDAO;

    LoanApplicationDAO loanApplicationDAO;

    @Autowired
    public void setLoanContractDAO(LoanContractDAO loanContractDAO)
    {
        this.loanContractDAO = loanContractDAO;
    }

    @Autowired
    public void setLoanApplicationDAO(LoanApplicationDAO loanApplicationDAO)
    {
        this.loanApplicationDAO = loanApplicationDAO;
    }

    @Override
    @Transactional
    public List<LoanContractEntity> allLoanContracts()
    {
        return loanContractDAO.allLoanContracts();
    }

    @Override
    @Transactional
    public List<LoanContractEntity> allSignedLoanContracts()
    {
        return loanContractDAO.allSignedLoanContracts();
    }

    @Override
    @Transactional
    public void sign(LoanContractForm loanContractForm, long loanApplicationId)
    {
        LoanContractEntity contract = new LoanContractEntity();
        contract.setSigningStatus(loanContractForm.getSigningStatus());
        contract.setSigningDate(new Date(System.currentTimeMillis()));
        contract.setLoanApplicationEntity(loanApplicationDAO.getById(loanApplicationId));
        loanContractDAO.create(contract);
    }

    @Override
    @Transactional
    public void update(LoanContractEntity loanContractEntity) { }

    @Override
    @Transactional
    public void delete(LoanContractEntity loanContractEntity) { }

    @Override
    @Transactional
    public LoanContractEntity getById(long id) { return null; }
}
