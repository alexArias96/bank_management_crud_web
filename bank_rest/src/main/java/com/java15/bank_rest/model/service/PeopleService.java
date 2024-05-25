package com.java15.bank_rest.model.service;

import com.java15.bank_rest.model.entity.People;
import com.java15.bank_rest.repositories.IPeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeopleService {

    @Autowired
    IPeopleRepository peopleRepository;

//    public List<People> getPeople() {
//        return peopleRepository.findAll();
//    }
//
//    public Optional<People>getPeopleById(Long id){
//        return peopleRepository.findById(id);
//    }
//
//    public void saveOrUpdate(People people){
//        peopleRepository.save(people);
//    }
//
//    public void delete(Long id){
//        peopleRepository.deleteById(id);
//    }
}
