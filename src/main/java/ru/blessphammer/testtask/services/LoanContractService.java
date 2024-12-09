package ru.blessphammer.testtask.services;

import ru.blessphammer.testtask.entities.LoanContractEntity;
import ru.blessphammer.testtask.models.LoanContractForm;

import java.util.List;

public interface LoanContractService
{
    List<LoanContractEntity> allLoanContracts();
    List<LoanContractEntity> allSignedLoanContracts();
        void sign(LoanContractForm loanContractForm, long loanApplicationId);
    void update(LoanContractEntity loanContractEntity);
    void delete(LoanContractEntity loanContractEntity);
    LoanContractEntity getById(long id);
}
