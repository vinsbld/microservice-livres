package com.bibliotheque.microservicelivres.controller;

import com.bibliotheque.microservicelivres.dao.LivreDao;
import com.bibliotheque.microservicelivres.exceptions.livreIntrouvableException;
import com.bibliotheque.microservicelivres.model.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class LivreController {

    @Autowired
    private LivreDao livreDao;

    //livres
    @GetMapping(value = "Livres")
    public List<Livre> listeDeLivres(){
        return livreDao.findAll();

    }


    //livre/{id}
    @GetMapping(value = "Livre/{id}")
    public Livre afficherUnLivre(@PathVariable long id) throws livreIntrouvableException {

        Livre livre = livreDao.findById(id);
        if (livre==null) throw new livreIntrouvableException("Ce livre n'existe pas");

        return livre;
    }

    @PostMapping(value = "/Livre")
    public ResponseEntity<Void> ajouterUnLivre(@RequestBody Livre livre){

        Livre newLivre = livreDao.save(livre);

        if (livre==null){
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newLivre.getId())
                .toUri();
        return ResponseEntity.created(location).build();

    }
}