package Bai2;

import java.util.Scanner;

public class NVPV extends Nhanvien {
    
    double Tinhluong(){
        return luongcoban;
    }
    public void Nhap(){
        super.NhapNv();
    }
    public void XuatNv(){
        super.XuatNv();
        System.out.println("Luong: "+ Tinhluong());
    }
}
