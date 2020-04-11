/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap58131350;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLDS implements IQLDS {
  // attributes
  private ArrayList<CaNhan> dsCaNhan = new ArrayList<>();

  // methods
  // them ca nhan
  public int them(CaNhan cn) {
    dsCaNhan.add(cn);
    return 1;
  }

  // xoa ca nhan
  public int xoa(String ten) {
    if (dsCaNhan.removeIf(cn -> cn.HoTen == ten)) {
      return 1;
    }
    return 0;
  }

  // in ds ca nhan
  public void inDanhSach() {
    dsCaNhan.forEach(cn -> cn.hienThiThongTin());
  }

    @Override
    public void inDS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
