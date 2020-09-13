package com.fpoly.services;

import com.fpoly.models.Collection;
import com.fpoly.repositories.CollectionRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CollectionServiceImpl implements CollectionService{

    private CollectionRepository collectionRepository;

    public CollectionServiceImpl(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    public <S extends Collection> S save(S s) {
        return collectionRepository.save(s);
    }

    public <S extends Collection> Iterable<S> saveAll(Iterable<S> iterable) {
        return collectionRepository.saveAll(iterable);
    }

    public Optional<Collection> findById(Integer integer) {
        return collectionRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return collectionRepository.existsById(integer);
    }

    public Iterable<Collection> findAll() {
        return collectionRepository.findAll();
    }

    public Iterable<Collection> findAllById(Iterable<Integer> iterable) {
        return collectionRepository.findAllById(iterable);
    }

    public long count() {
        return collectionRepository.count();
    }

    public void deleteById(Integer integer) {
        collectionRepository.deleteById(integer);
    }

    public void delete(Collection collection) {
        collectionRepository.delete(collection);
    }

    public void deleteAll(Iterable<? extends Collection> iterable) {
        collectionRepository.deleteAll(iterable);
    }

    public void deleteAll() {
        collectionRepository.deleteAll();
    }
}
