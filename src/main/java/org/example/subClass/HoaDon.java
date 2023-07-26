package org.example.subClass;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Data
public class HoaDon {
    private String maHD;
    private String ngayLap;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private List<Phong> danhSachPhong;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hóa đơn: ");
        maHD = sc.nextLine();
        System.out.print("Ngày lập hóa đơn: ");
        ngayLap = sc.nextLine();
        System.out.println("Nhập thông tin khách hàng");
        khachHang = new KhachHang();
        khachHang.nhap();
        System.out.println("Thông tin nhân viên lập");
        nhanVien = new NhanVien();
        nhanVien.nhap();
        System.out.println("Nhập thông tin phòng:");
        danhSachPhong = new ArrayList<>();
        Phong phong = new Phong();
        phong.nhap();
        danhSachPhong.add(phong);


    }

    public void xuat() {
        System.out.println("Mã hóa đơn: " + maHD);
        System.out.println("Ngày lập hóa đơn: " + ngayLap);

        // Xuất thông tin của khách hàng
        System.out.println("Thông tin khách hàng:");
        khachHang.xuat();

        // Xuất thông tin của nhân viên
        System.out.println("Thông tin nhân viên lập");
        nhanVien.xuat();

        // Xuất thông tin các phòng được thuê
        System.out.println("Thông tin các phòng được thuê");
        for (int i = 0; i < danhSachPhong.size(); i++) {
            System.out.println("Phòng thứ " + (i + 1) + ":");
            danhSachPhong.get(i).xuat();
        }

        System.out.println("Tổng số tiền: " + TongTien());

    }
    public double TongTien() {
        double tongTien = 0;
        for (Phong phong : danhSachPhong) {
            tongTien += phong.ThanhTien();
        }
        return tongTien;
    }
}
