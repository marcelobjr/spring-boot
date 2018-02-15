package com.aulaspring.aulaspring.repository;

import com.aulaspring.aulaspring.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {

    public Client findByNome(String nome);
    public List<Client> findListByNome(String name);
}
