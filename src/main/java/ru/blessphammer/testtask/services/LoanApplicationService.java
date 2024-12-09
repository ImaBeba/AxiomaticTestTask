package ru.blessphammer.testtask.services;

import ru.blessphammer.testtask.entities.LoanApplicationEntity;
import ru.blessphammer.testtask.models.LoanApplicationForm;

import java.util.List;

public interface LoanApplicationService
{
    List<LoanApplicationEntity> allLoanApplications();
    long create(LoanApplicationForm form);
    void makeDecision(LoanApplicationEntity loanApplicationEntity);
    void delete(LoanApplicationEntity loanApplicationEntity);
    LoanApplicationEntity getById(long id);
}
