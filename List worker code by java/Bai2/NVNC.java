package Bai2;

import java.util.Scanner;

public class NVNC extends Nhanvien {
    private String chuyenmon;
    private double pcdh;
    
    @Override
    double Tinhluong(){
        return luongcoban + pcdh;
    }
    public void Nhap(){
        super.NhapNv();
        Scanner sc= new Scanner( System.in);
        System.out.print("Moi nhap chuyen mon cua nhan vien: ");
        chuyenmon=sc.nextLine();
        System.out.print("Phu cap doc hai: ");
        pcdh=sc.nextDouble();
    }
    @Override
    public void XuatNv(){
        super.XuatNv();
        System.out.println("Chuyen mon: "+ chuyenmon);
        System.out.println("Luong: "+ Tinhluong());
    }
}
