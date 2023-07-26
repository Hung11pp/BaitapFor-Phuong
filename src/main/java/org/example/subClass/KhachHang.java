package org.example.subClass;

import lombok.Data;

import java.util.Scanner;

@Data
public class KhachHang extends Nguoi{
    private String maSoThue;
    private String diaChi;
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã số thuế: ");
        maSoThue = sc.nextLine();
        System.out.print("Nhập đia chỉ: ");
        diaChi = sc.nextLine();
    }

    public void xuat() {
        super.xuat();
        System.out.println("Mã số thuế: " + String.format("%-10s", maSoThue));
        System.out.println("Địa chỉ: " + String.format("%-10s", diaChi));
    }
}
