package com.example.demo.service;

import com.example.demo.Entity.NHANVIEN;
import com.example.demo.Repository.INHANVIENRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NHANVIENSERVICE {
    @Autowired
    private INHANVIENRepository nhanvienRepository;

    public List<NHANVIEN> getAllNHANVIENs(){
        return nhanvienRepository.findAll();
    }
    public NHANVIEN getNHANVIENById(Long Ma_NV){
        return nhanvienRepository.findById(Ma_NV).orElse(null);
    }

    public void addNHANVIEN(NHANVIEN nhanvien){
        nhanvienRepository.save(nhanvien);
    }

    public void updateNHANVIEN(NHANVIEN nhanvien){
        nhanvienRepository.save(nhanvien);
    }
    public void deleteNHANVIEN(Long Ma_NV){
        nhanvienRepository.deleteById(Ma_NV);
    }
}
