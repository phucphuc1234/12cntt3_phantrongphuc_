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
public abstract class NghienCuu extends NhanVien {
    private String chuyenMon;
    private double phuCapDocHai;
    public NghienCuu() {
        this.chuyenMon="";
        this.phuCapDocHai=0.0;
    }
    public NghienCuu(String chuyenMon, double phuCapDocHai, String maNhanVien, String tenNhanVien, String trinhDo) {
        super(maNhanVien, tenNhanVien, trinhDo);
        this.chuyenMon = chuyenMon;
        this.phuCapDocHai = phuCapDocHai;
    }
    public String getChuyenMon() {
        return chuyenMon;
    }
    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }
    public double getPhuCapDocHai() {
        return phuCapDocHai;
    }
    public void setPhuCapDocHai(double phuCapDocHai) {
        this.phuCapDocHai = phuCapDocHai;
    }
    @Override
public void nhap() {
     super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuyen mon : ");
        chuyenMon = scanner.nextLine();
        System.out.print("Nhap chuc vu : ");
        phuCapDocHai = scanner.nextDouble();
}
@Override
public void xuat() {
super.xuat();
    System.out.print("chuyen mon : "+chuyenMon);
    System.out.print("chuc vu : "+phuCapDocHai);
}
@Override
public double tinhLuong() {
    return luongCoBan+phuCapDocHai; 
}
}
