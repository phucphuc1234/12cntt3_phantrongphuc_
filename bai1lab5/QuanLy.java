/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1lab5;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public abstract class QuanLy extends NhanVien {
    private String chuyenMon;
private double phuCapChucVu;
public QuanLy() {
     this.chuyenMon="";
     this.phuCapChucVu=0.0;
}
public QuanLy(String maNhanVien, String tenNhanVien, String trinhDo, String
chuyenMon, double phuCapChucVu) {
    super(maNhanVien,tenNhanVien,trinhDo);
    this.chuyenMon=chuyenMon;
    this.phuCapChucVu=phuCapChucVu;
}
    public String getChuyenMon() {
        return chuyenMon;
    }
    public double getPhuCapChucVu() {
        return phuCapChucVu;
    }
    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }
    public void setPhuCapChucVu(double phuCapChucVu) {
        this.phuCapChucVu = phuCapChucVu;
    }
    @Override
public void nhap() {
   super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuyen mon : ");
        chuyenMon = scanner.nextLine();
        System.out.print("Nhap chuc vu : ");
        phuCapChucVu = scanner.nextDouble();
}
    @Override
public void xuat(){
   super.xuat();
    System.out.print("chuyen mon : "+chuyenMon);
    System.out.print("chuc vu : "+phuCapChucVu);
}
@Override
public double tinhLuong() {
return luongCoBan+phuCapChucVu;
}
}

    