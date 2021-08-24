package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Hires;

public interface HiresRepo extends JpaRepository<Hires, String> {

}