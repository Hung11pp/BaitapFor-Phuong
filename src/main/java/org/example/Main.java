package org.example;

import org.example.subClass.HoaDon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<HoaDon> danhSachHoaDon = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("======= MENU =======");
            System.out.println("1: Nhập vào 1 hóa đơn");
            System.out.println("2: In ra danh sách các hóa đơn");
            System.out.println("3: In ra danh sách hóa đơn với tổng tiền tăng dần");
            System.out.println("4: In ra hóa đơn có tổng tiền lớn nhất");
            System.out.println("5: In ra tổng tiền của tất cả hóa đơn");
            System.out.println("6: .............");
            System.out.println("0: Thoát");
            System.out.println("Mời bạn chọn yêu cầu: ");
            System.out.println("==============");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    nhapHoaDon();
                    break;
                case 2:
                    inDanhSachHoaDon();
                    break;
                case 3:
                    inDanhSachHoaDonTangDan();
                    break;
                case 4:
                    inHoaDonCoTongTienLonNhat();
                    break;
                case 5:
                    inTongTienCuaTatCaHoaDon();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Chọn chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);
    }

    private static void nhapHoaDon() {
        Scanner scanner = new Scanner(System.in);
        HoaDon hoaDon = new HoaDon();
        System.out.println("Nhập thông tin cho hóa đơn:");
        hoaDon.nhap();
        danhSachHoaDon.add(hoaDon);
    }

    private static void inDanhSachHoaDon() {
        System.out.println("======= DANH SÁCH HÓA ĐƠN =======");
        for (HoaDon hoaDon : danhSachHoaDon) {
            hoaDon.xuat();
            System.out.println("---------------------------");
        }
    }

    private static void inDanhSachHoaDonTangDan() {
        List<HoaDon> danhSachHoaDonCopy = new ArrayList<>(danhSachHoaDon);
        Collections.sort(danhSachHoaDonCopy, Comparator.comparingDouble(HoaDon::TongTien));

        System.out.println("======= DANH SÁCH HÓA ĐƠN TĂNG DẦN THEO TỔNG TIỀN =======");
        for (HoaDon hoaDon : danhSachHoaDonCopy) {
            hoaDon.xuat();
            System.out.println("---------------------------");
        }
    }

    private static void inHoaDonCoTongTienLonNhat() {
        HoaDon hoaDonLonNhat = Collections.max(danhSachHoaDon, Comparator.comparingDouble(HoaDon::TongTien));

        System.out.println("======= HÓA ĐƠN CÓ TỔNG TIỀN LỚN NHẤT =======");
        hoaDonLonNhat.xuat();
        System.out.println("---------------------------");
    }

    private static void inTongTienCuaTatCaHoaDon() {
        double tongTienTatCaHoaDon = 0;
        for (HoaDon hoaDon : danhSachHoaDon) {
            tongTienTatCaHoaDon += hoaDon.TongTien();
        }

        System.out.println("Tổng tiền của tất cả hóa đơn: " + tongTienTatCaHoaDon);
    }
}
