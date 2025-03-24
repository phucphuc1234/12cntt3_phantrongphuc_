/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1lab5;

/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.util.Scanner;
public class main1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
    QuanLy quanly = new QuanLy("QL001","Nguyen Van A","Dai hoc","Quan tri",2000000);
    quanly.nhap();
    quanly.xuat();
    quanly.tinhLuong();
    NghienCuu nghiencuu = new NghienCuu("NC001","Tran Thi B","thac si","hoa hoc",1500000) ;
    nghiencuu.nhap();
    nghiencuu.xuat();
    nghiencuu.tinhLuong();
    PhucVu phucvu = new PhucVu("PV001","Le Van C","Trung cap");
    phucvu.nhap();
    phucvu.xuat();
    phucvu.tinhLuong();
    danhSachNhanVien.add(quanly);
    danhSachNhanVien.add(nghiencuu);
    danhSachNhanVien.add(phucvu);
    System.out.println("\nDanh sach nhan vien:");
for (NhanVien nv : danhSachNhanVien) {
nv.xuat();
System.out.println("Luong:" + nv.tinhLuong());
}
}
}
    
