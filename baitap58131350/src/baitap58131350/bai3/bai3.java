/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap58131350.bai3;

/**
 *
 * @author Admin
 */
public class bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    SinhVienIT it = new SinhVienIT("Nguyen Van A", "CNTT", 9, 10, 10);
    SinhVienBiz biz = new SinhVienBiz("Nguyen Van B", "Biz", 5, 6);
    it.xuat();
    System.out.println("diem: " + it.getDiem());
    System.out.println("hoc luc: " + it.getHocLuc());
    biz.xuat();
    System.out.println("diem: " + biz.getDiem());
    System.out.println("hoc luc: " + biz.getHocLuc());
  }
}