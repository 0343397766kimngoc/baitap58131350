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
public class GiaoVien extends CaNhan {
    // attributes
    private String MonDay;
    private String ToBoMon;
  
    // contructor
    public GiaoVien() {
      super();
      this.MonDay = " ";
      this.ToBoMon = " ";
    }
    public GiaoVien(String HoTen, int Tuoi, String DiaChi, String Sdt, String MonDay, String ToBoMon) {
      super(HoTen, Tuoi, DiaChi, Sdt);
      this.MonDay = MonDay;
      this.ToBoMon = ToBoMon;
    }
  
    // getter, setter
    public void setMonDay(String MonDay) { this.MonDay = MonDay; }
    public void setToBoMon(String ToBoMon) { this.ToBoMon = ToBoMon; }
    public String getMonDay() { return this.MonDay; }
    public String getToBoMon() { return this.ToBoMon; }

    // methods
    // hien thi thong tin
    @Override
    public String hienThiThongTin() {
      String thongTin = "";
      thongTin = "ho ten: " + this.HoTen + ", tuoi: " + this.Tuoi + ", dia chi: " + this.DiaChi
        + ", sdt: " + this.Sdt + ", mon day: " + this.MonDay + ", to bo mon: " + this.ToBoMon;
  
      System.out.println(thongTin);
      return thongTin;
    }
}