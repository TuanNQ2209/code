
package Bai1_DSHocSinh;
import java.util.Scanner;

public class HOCSINH {

    private int maSoHS;
    private String hoTenHS;
    private float diemTB;

    public HOCSINH() {
        maSoHS = 0;
        hoTenHS = "";
        diemTB = 0;
    }

    public HOCSINH(int maSoHS, String hoTenHS, float diemTB) {
        this.maSoHS = maSoHS;
        this.hoTenHS = hoTenHS;
        this.diemTB = diemTB;
    }

    //get maSoHS
    public int getmaSoHS() {
        return maSoHS;
    }

    public String gethoTenHS() {
        return hoTenHS;
    }

    public float getdiemTB() {
        return diemTB;
    }

    //set
    public void setmaSoHS(int ms) {
        maSoHS = ms;
    }

    public void sethoTenHS(String ht) {
        hoTenHS = ht;
    }

    public void setdiemTB(float f) {
        diemTB = f;
    }

    //input HS
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma so HS: ");
        maSoHS = sc.nextInt();

        sc.nextLine();
        System.out.print("Nhap Ho ten HS: ");
        hoTenHS = sc.nextLine();

        do {
            System.out.print("Nhap diem TB cua HS: ");
            diemTB = sc.nextFloat();
        } while ((diemTB < 0) || (diemTB > 10));
    }

    public void output() {
        System.out.printf("MaSoHS \t  DiemTB \t HoTenHS \n");
        System.out.print(maSoHS + "\t" + diemTB + "d \t" + hoTenHS + "\n");
    }

    public void rank() {
        if (diemTB < 5) {
            System.out.print("Yeu");
        } 
        else if (diemTB < 6) {
            System.out.print("Trung binh");
        } 
        else if (diemTB < 7) {
            System.out.print("TB Kha");
        } 
        else if (diemTB < 8) {
            System.out.print("Kha");
        } 
        else if (diemTB < 9) {
            System.out.print("Gioi");
        } 
        else {
            System.out.print("Xuat sac");
        }
    }
}


