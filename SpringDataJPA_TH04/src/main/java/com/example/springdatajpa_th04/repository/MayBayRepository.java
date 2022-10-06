package com.example.springdatajpa_th04.repository;


import com.example.springdatajpa_th04.entity.MayBay;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface MayBayRepository extends CrudRepository<MayBay, Integer> {

}
