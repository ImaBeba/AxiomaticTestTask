package ru.blessphammer.testtask.dao;

import ru.blessphammer.testtask.entities.LoanApplicationEntity;

import java.util.List;

public interface LoanApplicationDAO
{
    List<LoanApplicationEntity> allLoanApplications();
    void create(LoanApplicationEntity loanApplicationEntity);
    void update(LoanApplicationEntity loanApplicationEntity);
    void delete(LoanApplicationEntity loanApplicationEntity);
    LoanApplicationEntity getById(long id);
}
