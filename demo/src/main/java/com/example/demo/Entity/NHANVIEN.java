package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@Entity
@Table(name="NhanVien")
public class NHANVIEN {
    @Id
    @Column(name = "ma_nv")
    public String ma_nv;


    @Column(name = "ten_nv")
    public String ten_nv;


    @Column(name = "phai")
    public String phai;


    @Column(name = "noi_sinh")
    public String noi_sinh;


    @ManyToOne
    @JoinColumn(name = "phongban_id")
    public PHONGBAN phongban;


    @Column(name = "luong")
    public int luong;
}