/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap58131350.bai2;

import baitap58131350.bai1.NhanVien;

/**
 *
 * @author Admin
 */
public class bai2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        NhanVien nv = new NhanVien("Ngoc","20","Ninh Hoa", 1530, 230);
        NhanVien nv1 = new NhanVien("Nga","21","Vạn Ninh", 1400, 450);
        NhanVien nv2 = new NhanVien("Tuan","50","Nha Trang", 1300, 190);
        NhanVien nv3 = new NhanVien("Na","29","Vạn Giã", 1400, 250);
        NhanVien nv4 = new NhanVien("Thanh","18","Sai Gon", 1230, 350);
        var qlnv = new QuanLyNhanVien();
        qlnv.them(nv);
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.inDS();
    }
}