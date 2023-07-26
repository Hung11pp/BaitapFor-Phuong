package org.example.subClass;
import lombok.Data;

import java.util.Scanner;

@Data
public class Phong {
    private String maPhong;
    private String loaiPhong;
    private double gioSudung;
    private double donGia;

    public double ThanhTien() {
        return gioSudung * donGia;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phòng: ");
        maPhong = sc.nextLine();
        System.out.print("Nhập loại phòng: ");
        loaiPhong = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
        System.out.println();
        System.out.print("Nhập giờ sử dụng: ");
        gioSudung = sc.nextDouble();
        System.out.println();

    }

    public void xuat() {
        System.out.println("Mã phòng: " + String.format("%-10s", maPhong));
        System.out.println("Loại phòng: " + String.format("%-10s", loaiPhong));
        System.out.println("Giờ sử dụng: " + String.format("%-10s", gioSudung));
        System.out.println("Đơn giá: " + String.format("%-10s", donGia));
    }

}
