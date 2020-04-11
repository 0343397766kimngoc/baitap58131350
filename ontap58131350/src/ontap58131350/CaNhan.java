/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap58131350;

/**
 *
 * @author Admin
 */
public abstract class CaNhan {

  // attributes
  protected String HoTen;
  protected int Tuoi;
  protected String DiaChi;
  protected String Sdt;

  // contructor
  public CaNhan() {
    this.HoTen = " ";
    this.Tuoi = 0;
    this.DiaChi = " ";
    this.Sdt = " ";
  }
  public CaNhan(String HoTen, int Tuoi, String DiaChi, String Sdt) {
    this.HoTen = HoTen;
    this.Tuoi = Tuoi;
    this.DiaChi = DiaChi;
    this.Sdt = Sdt;
  }

  // getter, setter
  public void setHoTen(String HoTen) { this.HoTen = HoTen; }
  public void setTuoi(int Tuoi) { this.Tuoi = Tuoi; }
  public void setDiaChi(String DiaChi) { this.DiaChi = DiaChi; }
  public void setSdt(String Sdt) { this.Sdt = Sdt; }
  public String getHoTen() { return this.HoTen; }
  public int getTuoi() { return this.Tuoi; }
  public String getDiaChi() { return this.DiaChi; }
  public String getSdt() { return this.Sdt; }

  // methods
  public abstract String hienThiThongTin();
}