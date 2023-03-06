/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doancanhan;

/**
 *
 * @author Tran Viet Duc
 */
public abstract class Nguoi {
    private String ma, hoTen,ngaysinh ;
    private boolean gioiTinh;
    private double soGio, donGia;
    public abstract double tinhThanhTien();

    public Nguoi(String ma, String hoTen, String ngaysinh, boolean gioiTinh, double soGio, double donGia) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaysinh = ngaysinh;
        this.gioiTinh = gioiTinh;
        this.soGio = soGio;
        this.donGia = donGia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getSoGio() {
        return soGio;
    }

    public void setSoGio(double soGio) {
        this.soGio = soGio;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Nguoi:" + "ma=" + ma + ", hoTen=" + hoTen + ", ngaysinh=" + ngaysinh + ", gioiTinh=" + (gioiTinh?" nam ":" nu ") + ", soGio=" + soGio + ", donGia=" + donGia+", tien luong: "+tinhThanhTien() ;
    }

    public static void main(String[] args) {
        
    }
    }



