package com.example.ejerciciorestdataJpa.repository;


import com.example.ejerciciorestdataJpa.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
