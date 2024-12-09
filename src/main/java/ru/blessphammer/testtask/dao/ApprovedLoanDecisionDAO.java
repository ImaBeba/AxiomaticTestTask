package ru.blessphammer.testtask.dao;

import ru.blessphammer.testtask.entities.ApprovedLoanDecisionEntity;

import java.util.List;

public interface ApprovedLoanDecisionDAO
{
    List<ApprovedLoanDecisionEntity> allApprovedLoanDecisions();

    void create(ApprovedLoanDecisionEntity approvedLoanDecisionEntity);

    void update(ApprovedLoanDecisionEntity approvedLoanDecisionEntity);

    void delete(ApprovedLoanDecisionEntity approvedLoanDecisionEntity);

    ApprovedLoanDecisionEntity getById(long id);

    public ApprovedLoanDecisionEntity getByLoanApplicationId(long id);
}
