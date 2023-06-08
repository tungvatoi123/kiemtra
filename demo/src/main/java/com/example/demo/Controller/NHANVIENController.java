package com.example.demo.Controller;

import com.example.demo.Entity.NHANVIEN;
import com.example.demo.service.NHANVIENSERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/nhanvien")
public class NHANVIENController {
    @Autowired
    private NHANVIENSERVICE nhanvienservice;

    @GetMapping
    public String showAllNHANVIEN(Model model){
        List<NHANVIEN> nhavien = nhanvienservice.getAllNHANVIENs();
        model.addAttribute("nhanvien",nhavien);
        return "nhanvien/list";
    }
}
