package Bai1;

import java.util.Scanner;

public class DShanghoa {
    private int soluong;
    private HANGHOA ds[];

    public DShanghoa() {
        ds = new HANGHOA[100];
        soluong = 0;
    }

    public void themMH(HANGHOA h) {
        ds[soluong] = h;
        soluong++;
    }

    public void Xuat(byte loai) {
        System.out.println("\nDanh sách hàng hóa:");
        if (loai == 1) {
            for (int i = 0; i < soluong; i++) {
                if (ds[i] instanceof HANGDM) {
                    HANGDM DienMay = (HANGDM) ds[i];
                    DienMay.xuat();
                }
            }
        } else if (loai == 3) {
            for (int i = 0; i < soluong; i++) {
                if (ds[i] instanceof HANGTP) {
                    HANGTP ThucPham = (HANGTP) ds[i];
                    ThucPham.xuat();
                }
            }
        }
    }
}