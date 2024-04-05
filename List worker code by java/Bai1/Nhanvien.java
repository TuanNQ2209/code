package Bai1;

import java.util.Scanner;

abstract class Nhanvien {
    protected String manv;
    protected String ten;
    protected String trinhdo;
    protected long luongcoban;
    
    abstract double Tinhluong();
    
    public void NhapNv(){
        Scanner sc= new Scanner( System.in);
        System.out.print("Moi nhap ma nhan vien: ");
        manv=sc.nextLine();
        System.out.print("Moi nhap ten nhan vien: ");
        ten=sc.nextLine();
        System.out.print("Moi nhap trinh do nhan vien: ");
        trinhdo=sc.nextLine();
        System.out.print("Moi nhap luong co ban cua nhan vien: ");
        luongcoban= sc.nextLong();   
    }
    public void XuatNv(){
        System.out.println("Ma nhan vien: "+ manv);
        System.out.println("Ten nhan vien: "+ ten);
        System.out.println("Trinh do: "+ trinhdo);
        System.out.println("Luong co ban: "+ luongcoban);
    }
}
