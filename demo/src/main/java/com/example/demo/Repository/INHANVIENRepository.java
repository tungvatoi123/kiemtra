package com.example.demo.Repository;


import com.example.demo.Entity.NHANVIEN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INHANVIENRepository extends JpaRepository<NHANVIEN, Long> {
}
