package org.example.subClass;
import lombok.Data;

import java.util.Scanner;

@Data
public class NhanVien  extends Nguoi{
    private String caLam;
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ca làm: ");
        caLam= sc.nextLine();
    }

    public void xuat() {
        super.xuat();
        System.out.println("Ca làm: " + String.format("%-10s", caLam));
    }
}
