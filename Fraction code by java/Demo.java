package Bai2_PhanSO;
import java.util.Scanner;

public class Demo {
 public static void main(String[] args) {
     // Khai báo 2 đối tượng phân số
     try (Scanner scanner = new Scanner(System.in)) {
         // Khai báo 2 đối tượng phân số
         PHANSO ps1 = new PHANSO();
         PHANSO ps2 = new PHANSO(4,16);
         
         
         // Nhập dữ liệu cho phân số thứ nhất
         System.out.print("Phan so thu 1: ");
         ps1.output();
         System.out.print("Phan so thu 2: ");
         ps2.output();
         
         
         System.out.println("Nhap phan so thu 3 ");
         System.out.print("Nhap tu so phan so thu 3: ");
         int tuSo3 = scanner.nextInt();
         System.out.print("Nhap mau so phan so thu 3: ");
         int mauSo3 = scanner.nextInt();
         PHANSO ps3 = new PHANSO(tuSo3, mauSo3);
         
         ps3.output();
         
         
         // Cộng hai phân số
         System.out.print("Tong 2 phan so 1 va 3: ");
         
         PHANSO ketQuaCong = ps1.congPhanSo(ps3);
         ketQuaCong.output();
         
         int tuSo4 = ketQuaCong.tuso;
         int mauSo4 =ketQuaCong.mauso;
         PHANSO ps4 = new PHANSO(tuSo4,mauSo4);
         
         System.out.print("Phan so 4 dua tren tong phan so 1 va 3 la: ");
         ps4.output();
         System.out.print("Hieu 2 phan so 2 va 3 : ");
         PHANSO ketQuaTru = ps2.truPhanSo(ps3);
         ketQuaTru.output();
         System.out.print("Tich hai phan so 4 va 2 ");
         PHANSO ketQuaNhan = ps4.nhanPhanSo(ps2);
         ketQuaNhan.output();
         System.out.print("Thuong hai phan so 2 va 3: ");
         PHANSO ketQuaChia = ps2.chiaPhanSo(ps3);
         ketQuaChia.output();
     }
    }
}
