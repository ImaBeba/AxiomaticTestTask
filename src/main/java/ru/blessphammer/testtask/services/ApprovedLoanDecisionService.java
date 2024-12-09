package ru.blessphammer.testtask.services;

import ru.blessphammer.testtask.entities.LoanApplicationEntity;

public interface ApprovedLoanDecisionService
{
    void create(LoanApplicationEntity loanApplicationEntity);
}
