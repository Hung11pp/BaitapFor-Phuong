package org.example.subClass;

import lombok.Data;
import java.util.Scanner;

@Data
public class Nguoi {
    private String soDT;
    private String hoTen;
    private String gioiTinh;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện thoại: ");
        soDT = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("nhập giới tính: ");
        gioiTinh = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Số điện thoại: " + String.format("%-10s", soDT));
        System.out.println("Họ tên: " + String.format("%-10s", hoTen));
        System.out.println("Giới tính: " + String.format("%-10s", gioiTinh));
    }

}
