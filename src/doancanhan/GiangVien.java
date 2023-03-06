/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doancanhan;

/**
 *
 * @author Tran Viet Duc
 */
public class GiangVien extends Nguoi{
    private String khoa;
 
    public GiangVien(String khoa, String ma, String hoTen, String ngaysinh, boolean gioiTinh, double soGio, double donGia) {
        super(ma, hoTen, ngaysinh, gioiTinh, soGio, donGia);
        this.khoa = khoa;
    }

  
  
    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    
    @Override
    public double tinhThanhTien(){
        if(khoa=="CNTT")
            return getSoGio()*getDonGia()+25000;
        return getSoGio()*getDonGia()+20000;
    }

    @Override
    public String toString() {
        return "GiangVien"+super.toString() + " khoa=" + khoa + '}';
    }

    
    public static void main(String[] args) {
        GiangVien x= new GiangVien("CNTT", "001", "Trung", "1/1/2022", true, 50, 50000);
        System.out.println(x);
        GiangVien y= new GiangVien("KinhTe", "001", "Trung", "1/1/2022", true, 50, 50000);
        System.out.println(y);
    }
}
