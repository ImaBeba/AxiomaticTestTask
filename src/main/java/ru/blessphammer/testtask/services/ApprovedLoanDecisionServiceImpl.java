package ru.blessphammer.testtask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.blessphammer.testtask.dao.ApprovedLoanDecisionDAO;
import ru.blessphammer.testtask.entities.LoanApplicationEntity;

import javax.transaction.Transactional;

@Service
public class ApprovedLoanDecisionServiceImpl implements ApprovedLoanDecisionService
{
    private ApprovedLoanDecisionDAO approvedLoanDecisionDAO;

    @Autowired
    public void setApprovedLoanDecisionDAO(ApprovedLoanDecisionDAO approvedLoanDecisionDAO)
    {
        this.approvedLoanDecisionDAO = approvedLoanDecisionDAO;
    }

    @Transactional
    @Override
    public void create(LoanApplicationEntity loanApplicationEntity) {}
    }

