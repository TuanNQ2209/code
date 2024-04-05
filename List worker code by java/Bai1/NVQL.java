package Bai1;

import java.util.Scanner;

public class NVQL extends Nhanvien {
    private String chuyenmon;
    private double pccv;
    
    double Tinhluong(){
        return luongcoban + pccv;
    }
    public void Nhap(){
        super.NhapNv();
        Scanner sc= new Scanner( System.in);
        System.out.print("Moi nhap chuyen mon cua nhan vien: ");
        chuyenmon=sc.nextLine();
        System.out.print("Phu cap chuc vu: ");
        pccv=sc.nextDouble();
    }
    public void XuatNv(){
        super.XuatNv();
        System.out.println("Chuyen mon: "+ chuyenmon);
        System.out.println("Luong: "+ Tinhluong());
    }
}
