package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Bread;

public interface BreadRepository extends JpaRepository<Bread, Integer> {
    //@Query("SELECT x FROM Bread x ORDER BY x.breadName, x.price")
    //List<Bread> findAllOrderByName();
}
