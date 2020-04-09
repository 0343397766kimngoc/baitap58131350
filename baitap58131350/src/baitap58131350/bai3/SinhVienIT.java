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
public class SinhVienIT extends SinhVienPoly {

  // attributes
  public double diemJava;
  public double diemCss;
  public double diemHtml;

  // constructor
  public SinhVienIT(String HoTen, String NganhHoc, double diemJava, double diemCss, double diemHtml) {
    super(HoTen, NganhHoc);
    this.diemJava = diemJava;
    this.diemCss = diemCss;
    this.diemHtml = diemHtml;
  }

  // defined abstract method
  @Override
  public double getDiem() {
    return (2 * this.diemJava + this.diemHtml + this.diemCss) / 4;
  };
}