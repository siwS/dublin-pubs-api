package com.pubs_api.services;

import com.pubs_api.entities.Pub;

import java.util.List;

public interface PubService {
    Pub getPubById(Long id);
    Pub getPubByName(String name);
    List<Pub> getAllPubs();
    Pub savePub(Pub pub);
    void deletePub(Long id);
}

