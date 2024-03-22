
package Bai1;

import java.util.Scanner;

class HANGDM extends HANGHOA{
    private int thoigianbaohanh;
    private int dienap;
    private int congsuat;
    
    public HANGDM() {
        super();
        thoigianbaohanh=0;
        dienap=0;
        congsuat=0;
    }
    public HANGDM( String mh, String th, long money, int tgbh, int da, int cs){
        super(mh, th, money);
        thoigianbaohanh= tgbh;
        dienap=da;
        congsuat=cs;
    }
    public void NhapHangDM(){
        Scanner sc= new Scanner( System.in);
        super.nhap();
        System.out.print(" Thoi gian bao hanh: ");
        thoigianbaohanh=sc.nextInt();
        System.out.print(" Dien ap: ");
        dienap=sc.nextInt();
        System.out.print(" Cong suat: ");
        congsuat=sc.nextInt();
    }
    public void XuatHangDM(){
        super.xuat();
        System.out.print("Thoi gian bao hanh cua mat hang: " + thoigianbaohanh);
        System.out.print("Dien ap cua mat hang: " + dienap);
        System.out.print("Cong suat cua mat hang: " + congsuat);
    }
}