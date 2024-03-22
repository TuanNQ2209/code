package Bai1;

import java.util.Scanner;

class HANGTP extends HANGHOA {
    private int ngaysanxuat;
    private int ngayhethan;
    
    public HANGTP() {
        super();
        ngaysanxuat=0;
        ngayhethan=0;
    }
    
    public HANGTP( String mahang, String tenhang, long gia, int ngaysanxuat, int ngayhethan){
        super( mahang, tenhang, gia);
        this.ngaysanxuat= ngaysanxuat;
        this.ngayhethan= ngayhethan;
    }
    public void NhapHangTP(){
        Scanner sc = new Scanner( System.in);
        super.nhap();
        System.out.print("moi nhap ngay san xuat: ");
        ngaysanxuat=sc.nextInt();
        System.out.print("moi nhap ngay het han: ");
        ngayhethan=sc.nextInt();
    }
    public void XuatHangTP(){
        super.xuat();
        System.out.print("ngay san xuat mat hang; " + ngaysanxuat);
        System.out.print("ngay het han mat hang; " + ngayhethan);
    }
}
