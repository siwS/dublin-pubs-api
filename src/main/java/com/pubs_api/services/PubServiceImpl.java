package com.pubs_api.services;

import com.pubs_api.entities.Pub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pubs_api.repositories.PubRepository;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PubServiceImpl implements PubService{

    @Autowired
    private PubRepository pubRepository;

    @Override
    public Pub getPubById(Long id) {
        return pubRepository.findById(id).orElseThrow(() ->new EntityNotFoundException());
    }

    @Override
    public Pub getPubByName(String name) {
        return pubRepository.findByName(name).orElseThrow(() ->new EntityNotFoundException());
    }

    @Override
    public List<Pub> getAllPubs() {
        List<Pub> pubList = new ArrayList<>();
        pubRepository.findAll().forEach(pub -> pubList.add(pub));
        return pubList;
    }

    @Override
    public Pub savePub(Pub pub) {
        return pubRepository.save(pub);
    }

    @Override
    public void deletePub(Long id) {

    }
}

