package ru.blessphammer.testtask.services;

import ru.blessphammer.testtask.entities.ClientEntity;
import ru.blessphammer.testtask.models.SearchingForm;

import java.util.List;

public interface ClientService
{
    List<ClientEntity> allClients();
    void create(ClientEntity clientEntity);
    void update(ClientEntity clientEntity);
    void delete(ClientEntity clientEntity);
    ClientEntity getById(long id);
    List<ClientEntity> searchClients(SearchingForm form);
}
