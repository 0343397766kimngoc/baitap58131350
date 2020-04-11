/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap58131350;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ontap58131350 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // tao giao vien chu nhiem
    GiaoVien gvch = new GiaoVien();
    gvch.setHoTen("Nguyen van dai");
    gvch.setTuoi(28);
    gvch.setDiaChi("Nha Trang - Khanh Hoa");
    gvch.setSdt("0123456789");
    gvch.setMonDay("Lap Trinh di dong");
    gvch.setToBoMon("Lap Trinh java");

    // tao lop hoc voi giao vien chu nhiem
    LopHoc lopHoc = new LopHoc(gvch);

    // them danh sach hoc hinh vao lop
    // tao hoc sinh
    HocSinh hs1 = new HocSinh();
    hs1.setHoTen("Nguyen thi kim ngoc");
    hs1.setTuoi(23);
    hs1.setDiaChi("Nha Trang - Khanh Hoa");
    hs1.setSdt("0123458329");
    hs1.setLop("Lap trinh java");
    hs1.setNangKhieu("nau an");
    // them hs vao lop
    lopHoc.themHocSinh(hs1);

    // tao them hoc sinh
    HocSinh hs2 = new HocSinh("Nguyen van hai", 12, "Tuy Hoa - Yen", "0231546794", "LTCC", "Hat");
    // them hs vao lop
    lopHoc.themHocSinh(hs2);

    Scanner input = new Scanner(System.in);
    // tao them hoc sinh
    HocSinh hs3 = new HocSinh();
    System.out.print("ten hoc sinh: ");
    hs3.setHoTen(input.nextLine());
    System.out.print("tuoi: ");
    hs3.setTuoi(input.nextInt());
    input.nextLine();
    System.out.print("dia chi: ");
    hs3.setDiaChi(input.nextLine());
    System.out.print("so dien thoai: ");
    hs3.setSdt(input.nextLine());
    System.out.print("lop: ");
    hs3.setLop(input.nextLine());
    System.out.print("nang khieu: ");
    hs3.setNangKhieu(input.nextLine());
    // them hs vao lop
    lopHoc.themHocSinh(hs3);
     // in danh sach hos sinh trong lop
    lopHoc.inDSHS();

  }
}
