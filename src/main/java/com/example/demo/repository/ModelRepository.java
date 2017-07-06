package com.example.demo.repository;

import com.example.demo.model.Citire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by qqqqwww on 05/07/2017.
 */

@Repository
public interface ModelRepository extends JpaRepository<Citire, Long>{
}
