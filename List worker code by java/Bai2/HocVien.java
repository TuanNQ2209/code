package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class HocVien {
    public static void main(String[] args) {
        ArrayList<NVQL> nvql= new ArrayList<>();
        ArrayList<NVNC> nvnc= new ArrayList<>();
        ArrayList<NVPV> nvpv= new ArrayList<>();
        int chon;
        Scanner sc= new Scanner( System.in);
        do{
            System.out.println("1.Tao nhan vien quan ly");
            System.out.println("2.Tao nhan vien nguyen cuu");
            System.out.println("3.Tao nhan vien phuc vu");
            System.out.println("4.Xuat nhan vien quan ly");
            System.out.println("5.Xuat nhan vien nguyen cuu");
            System.out.println("6.Xuat nhan vien phuc vu");
            System.out.println("7.Xuat danh sach nhan vien hoc vien");
            System.out.println("0.Thoat");
            System.out.print("Nhap cu phap: ");
            do{
                chon=sc.nextInt();
                if (chon>7||chon<0){
                    System.out.print("Sai cu phap, moi nhap lai: ");
                }
            }while(chon>7||chon<0);

            switch(chon){

                case 1:
                {
                    NVQL nv1= new NVQL();
                    nv1.Nhap();
                    nvql.add(nv1);
                    break;
                }
                case 2:
                {
                    NVNC nv2= new NVNC();
                    nv2.Nhap();
                    nvnc.add(nv2);
                    break;
                }
                case 3:
                {
                    NVPV nv3= new NVPV();
                    nv3.Nhap();
                    nvpv.add(nv3);
                    break;
                }
                case 4:
                {
                    double tong = 0;
                    System.out.println("NHAN VIEN QUAN LY");
                    for(NVQL nv1: nvql){
                        nv1.XuatNv();
                        tong = tong + nv1.Tinhluong();
                    }
                    System.out.println("Tong luong nhan vien quan ly: " + tong);
                    break;
                }
                case 5:
                {
                    double tong = 0;
                    System.out.println("NHAN VIEN NHGIEN CUU");
                    for(NVNC nv2: nvnc){
                        nv2.XuatNv();
                        tong = tong + nv2.Tinhluong();
                    }
                    System.out.println("Tong luong nhan vien nghien cuu: " + tong);
                    break;
                }
                case 6:
                {
                    double tong = 0;
                    System.out.println("NHAN VIEN PHUC VU");
                    for(NVPV nv3: nvpv){
                        nv3.XuatNv();
                        tong = tong + nv3.Tinhluong();
                    }
                    System.out.println("Tong luong nhan vien phuc vu: " + tong);
                    break;
                }
                case 7:
                {
                    double tong = 0;
                    System.out.println("TAT CA NHAN VIEN HOC VIEN");
                    System.out.println("NHAN VIEN QUAN LY");
                    for(NVQL nv1: nvql){
                        nv1.XuatNv();
                        tong = tong + nv1.Tinhluong();
                    }
                    System.out.println("NHAN VIEN NHGIEN CUU");
                    for(NVNC nv2: nvnc){
                        nv2.XuatNv();
                        tong = tong + nv2.Tinhluong();
                    }
                    System.out.println("NHAN VIEN QUAN LY");
                    for(NVPV nv3: nvpv){
                        nv3.XuatNv();
                        tong = tong + nv3.Tinhluong();
                    }
                    System.out.println("Tong luong nhan vien: " + tong);
                    break;
                }
                default:
                {
                    chon=0;
                    break;
                } 
            }
        }while(chon!=0);
    }
}
