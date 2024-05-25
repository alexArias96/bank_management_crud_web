package com.java15.bank_rest.repositories;

import com.java15.bank_rest.model.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPeopleRepository extends JpaRepository<People, Integer> {

    Optional<People> findByUsername(String username);
}
