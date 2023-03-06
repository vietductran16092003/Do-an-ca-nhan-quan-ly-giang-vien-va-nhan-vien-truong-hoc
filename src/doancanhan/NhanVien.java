/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doancanhan;

/**
 *
 * @author Tran Viet Duc
 */
public class NhanVien extends Nguoi{
    private String congViec;

    public NhanVien(String congViec, String ma, String hoTen, String ngaysinh, boolean gioiTinh, double soGio, double donGia) {
        super(ma, hoTen, ngaysinh, gioiTinh, soGio, donGia);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    
   
    @Override
    public double tinhThanhTien(){
        if(congViec=="TP")
            return getSoGio()*getDonGia()+20000;
        return getSoGio()*getDonGia()+10000;
    }

    @Override
    public String toString() {
        return "NhanVien" +super.toString() +" congViec= " + congViec + '}';
    }

  
    public static void main(String[] args) {
        NhanVien x= new NhanVien("TP", "001", "Chung", "1/1/1999", true, 50, 50000);
        System.out.println(x);
        NhanVien y= new NhanVien("VP", "001", "Chung", "1/1/1999", true, 50, 50000);
        System.out.println(y);
    }
}
