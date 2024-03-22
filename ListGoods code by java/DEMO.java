package Bai1;

import java.util.Scanner;

public class DEMO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DShanghoa ds = new DShanghoa();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Thêm hàng điện máy");

            System.out.println("2. Thêm hàng thực phẩm");
            System.out.println("3. Xuất danh sách hàng điện máy");

            System.out.println("4. Xuất danh sách hàng thực phẩm");
            System.out.println("5. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    HANGDM DienMay = new HANGDM();
                    DienMay.NhapHangDM();
                    ds.themMH(DienMay);
                    break;
                case 2:
                    HANGTP ThucPham = new HANGTP();
                    ThucPham.NhapHangTP();
                    ds.themMH(ThucPham);
                    break;
                case 3:
                    ds.Xuat((byte) 1);
                    break;
                case 4:
                    ds.Xuat((byte) 3);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    }
}