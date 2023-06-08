package com.example.demo.Repository;

import com.example.demo.Entity.PHONGBAN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPHONGBANRepository extends JpaRepository<PHONGBAN, Long> {
}
