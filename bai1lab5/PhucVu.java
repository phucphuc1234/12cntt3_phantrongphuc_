/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1lab5;

/**
 *
 * @author admin
 */
public abstract class PhucVu extends NhanVien{
    public PhucVu() {
       super();
    }
    public PhucVu(String maNhanVien, String tenNhanVien, String trinhDo) {
    super(maNhanVien, tenNhanVien, trinhDo);
}
    @Override
public double tinhLuong() {

return luongCoBan;
}
}
