/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap58131350.bai4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList<ChuyenXeNoiThanh> arrChuyenXeNoiThanh = new ArrayList<>();
        ArrayList<ChuyenXeNgoaiThanh> arrChuyenXeNgoaiThanh = new ArrayList<>();
        int soChuyenNoiThanh, soChuyenNgoaiThanh;
        double doanhThuXeNoiThanh = 0, doanhThuXeNgoaiThanh = 0;
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số chuyến xe nội thành: ");
        soChuyenNoiThanh = scanner.nextInt();
        System.out.print("Nhập số chuyến xe ngoại thành: ");
        soChuyenNgoaiThanh = scanner.nextInt();
         
        System.out.println("Nhập thông tin chuyến xe nội thành:");
        for (int i = 0; i < soChuyenNoiThanh; i++) {
            System.out.println("Nhập thông tin chuyến xe thứ " + (i + 1) + ":");
            ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh();
            chuyenXeNoiThanh.nhapThongTinChuyenXe();
            doanhThuXeNoiThanh += chuyenXeNoiThanh.getDoanhThu();
            arrChuyenXeNoiThanh.add(chuyenXeNoiThanh);
        }
         
        System.out.println("Nhập thông tin chuyến xe ngoại thành:");
        for (int i = 0; i < soChuyenNgoaiThanh; i++) {
            System.out.println("Nhập thông tin chuyến xe thứ " + (i + 1) + ":");
            ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();
            chuyenXeNgoaiThanh.nhapThongTinChuyenXe();
            doanhThuXeNgoaiThanh += chuyenXeNgoaiThanh.getDoanhThu();
            arrChuyenXeNgoaiThanh.add(chuyenXeNgoaiThanh);
        }
         
        System.out.println("-----Thông tin chuyến xe nội thành-----");
        for (int i = 0; i < arrChuyenXeNoiThanh.size(); i++) {
            System.out.println(arrChuyenXeNoiThanh.get(i).toString());
        }
         
        System.out.println("-----Thông tin chuyến xe ngoại thành-----");
        for (int i = 0; i < arrChuyenXeNgoaiThanh.size(); i++) {
            System.out.println(arrChuyenXeNgoaiThanh.get(i).toString());
        }
         
        System.out.println("Doanh thu từng chuyến xe: ");
        System.out.println("Doanh thu chuyến xe nội thành: " + doanhThuXeNoiThanh);
        System.out.println("Doanh thu chuyến xe ngoại thành: " + doanhThuXeNgoaiThanh);
    }
 
}
