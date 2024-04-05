package Bai1;

import java.util.Scanner;

public class Demo{

    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        
        System.out.println("Moi nhap thong tin nhan vien quan ly");
        NVQL nvQuanLy = new NVQL();
        nvQuanLy.Nhap();
        
        System.out.println("\nMoi nhap thong tin nhan vien nghien cuu");
        NVNC nvNghienCuu = new NVNC();
        nvNghienCuu.Nhap();
        
        System.out.println("\nMoi nhap thong tin nhan vien phuc vu");
        NVPV nvPhucVu = new NVPV();
        nvPhucVu.Nhap();
        
        System.out.println("Thong tin nhan vien quan ly");
        nvQuanLy.XuatNv();
        
        System.out.println("\nThong tin nhan vien nghien cuu");
        nvNghienCuu.XuatNv();
        
        System.out.println("\nThong tin nhan vien phuc vu");
        nvPhucVu.XuatNv();    
    }
    
}
