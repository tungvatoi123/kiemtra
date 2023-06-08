package com.example.demo.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "phongban")
public class PHONGBAN {
    @Id
    @Column(name="MaPhong")
    private String Ma_Phong;

    @Column(name="TenPhong")
    private String Ten_Phong;

    @OneToMany(mappedBy = "phongban",cascade = CascadeType.ALL)
    private List<NHANVIEN> nhanviens;
}