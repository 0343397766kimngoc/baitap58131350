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
public interface IQLDS {
  // them ca nhan
  public abstract int them(CaNhan cn);
  // xoa xa nhan
  public abstract int xoa(String ten);
  // in ds ca nhan
  public abstract void inDS();
}
