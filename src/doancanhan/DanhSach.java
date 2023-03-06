/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doancanhan;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tran Viet Duc
 */
public class DanhSach {
    private final ArrayList<Nguoi> a= new ArrayList<>();
    public void docFile(String tenFile){
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                System.out.println("1.Da mo duoc file");
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String ma,ht, ngay;
                    boolean gt;
                    double sg,dg;
                    ma=line.next();
                    ht=line.next();
                    ngay=line.next();
                    gt=line.nextBoolean();
                    sg=line.nextDouble();
                    dg=line.nextDouble();
                    if(line.hasNextBoolean()){
                        String khoa= line.next();
                        a.add(new GiangVien(khoa, ma, ht, ngay, gt, sg, dg));
                    }else{
                        String congviec=line.next();
                        a.add(new NhanVien(congviec, ma, ht, ngay, gt, sg, dg));
                    }
                }   
                }else System.out.println("file khong ton tai");
        } catch (Exception e) {
        }
    }
    public ArrayList<Nguoi> getA(){
        return a;
    }
    public void setA(ArrayList<Nguoi> a){
        a=this.a;
    }
    public void xuat(String noiDung){
        System.out.println(noiDung);
        for(Nguoi x:a)
            System.out.println(x);
    }
     public boolean them(Nguoi y){
        for(Nguoi x:a)
            if(x.getMa().equalsIgnoreCase(y.getMa())){
                return false;
            }
        a.add(y);
        return true;
    }
        public Nguoi timTheoMa(String ma) {
        for(Nguoi x:a)
            if(x.getMa().equalsIgnoreCase(ma)) {
                return x;
            }
        return null;
    }
      public boolean xoaTheoMa(String ma){
        for(Nguoi x:a)
            if(x.getMa().equalsIgnoreCase(ma)){
                a.remove(x);
                return true;
            }
        return false;
    }
 
    public Nguoi nhapthem(){
        System.out.println("Nhap 1 giao dich: ");
        Scanner line = new Scanner(System.in);
                    String ma,ht, ngay;
                    boolean gt;
                    double sg,dg;
                    System.out.println("- Nhap ma: ");
                    ma=line.next();
                    System.out.println("- Nhap HovaTen: ");
                    ht=line.next();
                    System.out.println("- Nhap Ngay: ");
                    ngay=line.next();
                    System.out.println("- Nhap Gioi Tinh: ");
                    gt=line.nextBoolean();
                    System.out.println("- Nhap so gio lam: ");
                    sg=line.nextDouble();
                    System.out.println("- Nhap tien luong co ban: ");
                    dg=line.nextDouble();
                    System.out.println("- Nhap khoa hoac chuc vu: ");
                    if(line.hasNextBoolean()){
                        String khoa= line.next();
                        return new GiangVien(khoa, ma, ht, ngay, gt, sg, dg);
                    }else{
                        String congviec=line.next();
                        return new NhanVien(congviec, ma, ht, ngay, gt, sg, dg);
                    }
                        }
                        
    public ArrayList<GiangVien> tachGiangVien(){
        ArrayList<GiangVien> GV = tachGiangVien();
        for(GiangVien x:GV)
            if( x instanceof GiangVien)
                GV.add((GiangVien)x);
        return  GV;
    }
        public ArrayList<NhanVien> tachNhanVien(){
        ArrayList<NhanVien> NV = tachNhanVien();
        for(NhanVien x:NV)
            if( x instanceof NhanVien)
                NV.add((NhanVien)x);
        return  NV;
    }
            public void ghiFile(String tenFile) {
        try {
            File f= new File(tenFile);
            if(!f.exists()) {
                PrintStream out= new PrintStream(f);
                for(Nguoi x: a) {
                    if(x instanceof GiangVien) 
                        out.println(x.getMa()+" "+x.getHoTen()+" "+x.getNgaysinh()+" "+x.isGioiTinh()+" "+x.getSoGio()+x.getDonGia()
                                +((GiangVien) x).getKhoa());
                    else out.println(x.getMa()+" "+x.getHoTen()+" "+x.getNgaysinh()+" "+x.isGioiTinh()+" "+x.getSoGio()+x.getDonGia()
                                +((NhanVien) x).getCongViec());
                }
            }else System.out.println("File da ton tai");
        } catch (Exception e) {
        }
    }
        public double tongTienGV() {
        double s=0;
        for(Nguoi x:a)
            if(x instanceof GiangVien)
                s=s+x.tinhThanhTien();
        return s;
    }
        public double tongTienNV() {
        double s=0;
        for(Nguoi x:a)
            if(x instanceof NhanVien)
                s=s+x.tinhThanhTien();
        return s;
    }
        public double tongDoanhThu() {
        return tongTienGV()+tongTienNV();
    }
    public void output(){
        xuat(" ");
        System.out.println("- Them mot giang vien hoac nhan vien: ");
        Nguoi x= nhapthem();
        if(them(x)==true)
            xuat("Danh sach giang vien va nhan vien vua them 1 giao dich co ma la: "+x.getMa());
        else System.out.println("Giao dich co ma: "+x.getMa()+"da ton tai trong DS");
        System.out.println("\n- Xoa mot giang vien hoac nhan vien ");
        System.out.println("Nhap 1 ma giao dich: ");
        Scanner line = new Scanner(System.in);
        String ma=line.nextLine();
        if(xoaTheoMa(ma)==true)
            xuat("DS Giao Dich vua xoa ma: "+ma);
        else System.out.println("Khong co giao dich co ma "+ ma+ " trong danh sach ");
    }
    public static void main(String[] args) {
        DanhSach x=new DanhSach();
        x.docFile("F://DS.txt");
        x.output();
    }

    void xoaTheoMa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean them(DanhSach y) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
