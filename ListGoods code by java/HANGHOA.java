package Bai1;

import java.util.Scanner;

public class HANGHOA {
    protected String mahang, tenhang;
    protected long gia;
    
    public HANGHOA(){
        mahang="";
        tenhang="";
        gia=0;
    }
    public HANGHOA(String mahang, String tenhang, long gia){
        this.mahang= mahang;
        this.tenhang= tenhang;
        this.gia= gia;
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Moi nhap ma hang; ");
        mahang=sc.nextLine();
        System.out.print("moi nhap ten hang: ");
        tenhang=sc.nextLine();
        System.out.print("moi nhap gia");
        gia=sc.nextLong();
    }
    public void xuat(){
        System.out.print(" ma hang: " + mahang);
        System.out.print(" ten hang: " + tenhang);
        System.out.print(" gia hang: " + gia);
    }
}
