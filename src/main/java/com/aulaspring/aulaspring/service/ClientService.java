package com.aulaspring.aulaspring.service;

import com.aulaspring.aulaspring.model.Client;
import com.aulaspring.aulaspring.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client create(){
        Client c = new Client();
        c.setNome("Marcelo");
        c.setSobreNome("Barros");
        c.setIdade(33);
        return this.clientRepository.save(c);
    }

    public List<Client> getListClient(){
        return this.clientRepository.findListByNome("Marcelo");
    }
}
