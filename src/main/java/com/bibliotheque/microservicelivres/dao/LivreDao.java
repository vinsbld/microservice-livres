package com.bibliotheque.microservicelivres.dao;

import com.bibliotheque.microservicelivres.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivreDao extends JpaRepository<Livre, Long> {

    public List<Livre> findAll();

    public Livre findById(long id);

    public Livre save(Livre livre);
}
