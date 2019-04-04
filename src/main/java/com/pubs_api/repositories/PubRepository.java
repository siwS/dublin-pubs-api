package com.pubs_api.repositories;

import com.pubs_api.entities.Pub;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PubRepository extends CrudRepository<Pub, Long> {
    Optional<Pub> findByName(String name);
}