package Bai1_DSHocSinh;
import java.util.Scanner;

public class DSHocSinh {
    private int s1;
    private HOCSINH []ds ;

public void nhapDS(){
 Scanner x = new Scanner (System.in);
 System.out.print("Nhap so luong hoc sinh cua danh sach: ");
 s1=x.nextInt();
 
 ds = new HOCSINH[s1];
 System.out.println("Nhap danh sach hoc sinh ");
 for(int i=0; i<s1 ; i++){
     ds[i]=new HOCSINH();
     ds[i].input();
 }
}
public void xuatDS(){
    //System.out.println("Danh sach hoc sinh la ");
    for(int i=0; i<s1 ; i++){
     ds[i].output();
 }
}
public void sapXep(){
    System.out.println("Sap xep danh sach theo diem trung binh giam dan: ");
    for(int i=0; i< ds.length -1 ; i++){
        for(int j = i+1 ; j<ds.length ; j++ ){
        if(ds[i].getdiemTB() < ds[j].getdiemTB()){
            HOCSINH temp = ds[i];
            ds[i] = ds[j];
            ds[j] = temp;
        }           
        }
    }
    System.out.println("Danh sach sau khi sap xep ");
    for(int i=0; i<s1 ; i++){
     ds[i].output();
} 
}
}