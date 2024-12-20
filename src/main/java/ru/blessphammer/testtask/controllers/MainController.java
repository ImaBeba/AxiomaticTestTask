package ru.blessphammer.testtask.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.blessphammer.testtask.entities.ClientEntity;
import ru.blessphammer.testtask.entities.LoanApplicationEntity;
import ru.blessphammer.testtask.entities.LoanContractEntity;
import ru.blessphammer.testtask.models.SearchingForm;
import ru.blessphammer.testtask.services.ClientService;
import ru.blessphammer.testtask.services.LoanApplicationService;
import ru.blessphammer.testtask.services.LoanContractService;

import java.util.List;

@Controller
public class MainController
{
    private ClientService clientService;
    private LoanApplicationService loanApplicationService;
    private LoanContractService loanContractService;

    @Autowired
    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    @Autowired
    public void setLoanApplicationService(LoanApplicationService loanApplicationService)
    {
        this.loanApplicationService = loanApplicationService;
    }

    @Autowired
    public void setLoanContractService(LoanContractService loanContractService)
    {
        this.loanContractService = loanContractService;
    }

    @GetMapping("/")
    public ModelAndView index()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/clients")
    public ModelAndView allClients()
    {
        List<ClientEntity> clientEntities = clientService.allClients();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("clients");
        modelAndView.addObject("clientsList", clientEntities);
        return modelAndView;
    }

    @PostMapping("/clients")
    public ModelAndView clientFilter(@ModelAttribute SearchingForm form)
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("clients");
        modelAndView.addObject("clientsList", clientService.searchClients(form));
        return modelAndView;
    }

    @GetMapping("/clients/{id}")
    public ModelAndView showClient(@PathVariable long id)
    {
        ClientEntity clientEntity = clientService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("client");
        modelAndView.addObject("client", clientEntity);
        return modelAndView;
    }

    @GetMapping("/loanApplications")
    public ModelAndView allLoanApplications()
    {
        List<LoanApplicationEntity> loanApplicationEntities = loanApplicationService.allLoanApplications();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("loanApplications");
        modelAndView.addObject("loanApplicationsList", loanApplicationEntities);
        return modelAndView;
    }

    @GetMapping("/loanApplications/{id}")
    public ModelAndView showLoanApplication(@PathVariable long id)
    {
        LoanApplicationEntity loanApplicationEntity = loanApplicationService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("loanApplication");
        modelAndView.addObject("loanApplication", loanApplicationEntity);
        return modelAndView;
    }

    @GetMapping("/loanContracts")
    public ModelAndView allLoanContracts()
    {
        List<LoanContractEntity> loanContracts = loanContractService.allSignedLoanContracts();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("loanContracts");
        modelAndView.addObject("loanContractsList", loanContracts);
        return modelAndView;
    }
}
