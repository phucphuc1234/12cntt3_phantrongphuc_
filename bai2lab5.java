/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1lab5;
import java.util.Scanner;
interface Hinh {
float pi = 3.14f;
void nhap();
void xuat();
float dienTich();
}
class HinhVuong implements Hinh {
private float canh;
public HinhVuong() {
  this.canh=(float) 0.0;
}
public HinhVuong(float canh) {
  this.canh=canh;
}
@Override
public void nhap() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap canh hinh vuong : ");
    canh = scanner.nextFloat();
}
@Override
public void xuat() {
    System.out.print("canh hinh vuong : "+canh +"dien tich hinh vuong: "+dienTich());
}
@Override
public float dienTich() {
return canh * canh;
}
}
class HinhChuNhat implements Hinh {
private float dai;
private float rong;
public HinhChuNhat() {
    this.dai=(float) 0.0;
    this.rong=(float) 0.0;
}
public HinhChuNhat(float dai, float rong) {
    this.dai = dai;
    this.rong = rong;
}
@Override
public void nhap() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap chieu dai hinh chu nhat : ");
    dai = scanner.nextFloat();
    System.out.print("Nhap chieu rong hinh chu nhat : ");
    rong = scanner.nextFloat();
}
@Override
public void xuat() {
       System.out.print("chieu dai hinh vuong : "+dai +"chieu rong hinh vuong: "+rong+"dien tich hinh vuong"+dienTich());
}
@Override
public float dienTich() {
       return dai * rong;
}
}
class HinhTron implements Hinh {
private float banKinh;
public HinhTron() {
    this.banKinh=(float) 0.0;
}
public HinhTron(float banKinh) {
    this.banKinh=banKinh;
}
@Override
public void nhap() {
     Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap ban kinh hinh tron : ");
     banKinh = scanner.nextFloat();
}
@Override
public void xuat() {
       System.out.print("ban kinh hinh tron: "+banKinh+ "dien tich hinh vuong"+dienTich());
}
@Override
public float dienTich() {
       return pi * banKinh * banKinh;
}
}
public class bai2lab5 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Nhap so luong hinh: ");
int n = scanner.nextInt();
scanner.nextLine();
Hinh ds[] = new Hinh[n];
for (int i = 0; i < n; i++) {
System.out.println("Chon loai hinh se nhap: ");
System.out.println("1: hinh vuong");
System.out.println("2: hinh chu nhat");
System.out.println("3: hinh tron");
int chon = 0;
System.out.print("Nhap lua chon nguoi dung : ");
n = scanner.nextInt();
scanner.nextInt();
switch (chon) {
case 1 -> {
    ds[i] = new HinhVuong();
    ds[i].nhap();
        }
case 2 -> {
    ds[i] = new HinhChuNhat();
    ds[i].nhap();
        }
case 3 -> {
    ds[i] = new HinhTron();
    ds[i].nhap();
        }
default -> System.out.println("Ban phai chon 1 trong 3 loai tren");
}
}
System.out.println("\nDanh sach hinh da nhap:");
        for (int i = 0; i < n; i++) {
            ds[i].xuat();
        }
Hinh hinhDienTichLonNhat = ds[0];
for (Hinh hinh : ds) {
if (hinh.dienTich() > hinhDienTichLonNhat.dienTich()) {
hinhDienTichLonNhat = hinh;
}
}
System.out.println("\nHinh co dien tich lon nhat:");
hinhDienTichLonNhat.xuat();
}
}
