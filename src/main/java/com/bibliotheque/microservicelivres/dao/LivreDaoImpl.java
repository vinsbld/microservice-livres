package com.bibliotheque.microservicelivres.dao;

import com.bibliotheque.microservicelivres.model.Livre;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class LivreDaoImpl implements LivreDao {

    public static List<Livre> livres = new ArrayList<>();

    static {
        livres.add(new Livre((long) 1, new String("titre1"), new Date(), new String("nomAuteur1"), new String("prenomAuteur1")));
        livres.add(new Livre((long) 2, new String("titre2"), new Date(), new String("nomAuteur2"), new String("prenomAuteur2")));
        livres.add(new Livre((long) 3, new String("titre3"), new Date(), new String("nomAuteur3"), new String("prenomAuteur3")));
        livres.add(new Livre((long) 4, new String("titre4"), new Date(), new String("nomAuteur4"), new String("prenomAuteur4")));
    }
    @Override
    public List<Livre> findAll() {
        return livres;
    }

    @Override
    public List<Livre> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Livre> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Livre> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Livre livre) {

    }

    @Override
    public void deleteAll(Iterable<? extends Livre> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Livre> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Livre> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Livre> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Livre> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Livre getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Livre> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Livre> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Livre> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Livre> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Livre> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Livre> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public Livre findById(long id) {
        for (Livre livre : livres) {
            if (livre.getId()== id) {
                return livre;
            }
        }
        return null;
    }

    @Override
    public Livre save(Livre livre) {

        livres.add(livre);

        return livre;
    }
}
