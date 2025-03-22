/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplab4;
import java.util.Scanner;
  class sach {
private String masach;
private String tensach;
private String tacgia;
private long gia;

public sach() {
this.masach = "";
this.tensach = "";
this.tacgia = "";
this.gia = 0;
}

public sach(String masach, String tensach, String tacgia, long gia) {
this.masach = masach;
this.tensach = tensach;
this.tacgia = tacgia;
this.gia = gia;
}

public String getmasach() {
return masach;
}
public String gettensach() {
return tensach;

}
public String gettacgia() {
return tacgia;
}
public long getgia() {
return gia;
}
public long getgiasaugiam() {
return gia;
}
public void xuat() {
System.out.println("Ma sach: " + masach + ", Ten sach: " + tensach + ", Tac gia : "+ tacgia + ", Gia : " + gia);
}
}
class sachvanhoc extends sach {
private int lanxuatban;
public sachvanhoc() {
    this.lanxuatban=lanxuatban;
}
    public sachvanhoc(String masach, String tensach, String tacgia, long gia, int lanxuatban) {
        super(masach,tensach, tacgia, gia);
        this.lanxuatban = lanxuatban;
    }
    public int getlanxuatban() {
    return lanxuatban;
    }
    @Override
public long getgiasaugiam() {
    return (gia > 300000) ? gia * 0.8 : gia;
}
@Override
public void xuat() {
 System.out.println("lan xuat ban: " + lanxuatban );
}
}
class sachgiaokhoa extends sach {
private int lop;
private String nhaxuatban;
public sachgiaokhoa() {
    this.lop=lop;
    this.nhaxuatban=nhaxuatban;
}
public sachgiaokhoa(String masach, String tensach, String tacgia, long gia, int lop, String nhaxuatban) {
    super(masach,tensach, tacgia, gia);
     this.lop=lop;
    this.nhaxuatban=nhaxuatban;
}
public int getlop() {
return lop;
}
public String getnhaxuatban() {
    return nhaxuatban;
}
@Override
public long getgiasaugiam() {
    return (nhaxuatban.equalsIgnoreCase("Giao Duc")) ? gia * 0.9 : gia;
}
}
public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<sach> danhsachsach = new ArrayList<sach>();
        
        sachvanhoc vanhoc = new sachvanhoc("VH001", "Truyện Kiều", "Nguyễn Du", 400000, 5);
          danhsachsach.add(vanhoc);
        sachgiaokhoa giaokhoa = new sachgiaokhoa("GK001", "Toán 10", "Hoàng Xuân", 250000, 10, "Giáo Dục");
        danhsachsach.add(giaokhoa);
        System.out.println("nhap thong tin quyen sach:");
        for (sach sach : danhsachsach) {
           sach.nhap();
        }

        System.out.println("thong tin quyen sach khi giam gia:");
        for (sach sach : danhsachsach) {
            sach.xuat();
            System.out.println("gia sau giam: " + sach.getgiasaugiam());
        }
        sach sachgiamax = danhsachsach.get(0);
        for (sach sach : danhsachsach) {
            if (sach.getgiasaugiam() > sachgiamax.getgiasaugiam()) {
                sachgiamax = sach;
            }
        }
        
        System.out.println("sach co gia lon nhat sau khi giam: ");
        sachgiamax.xuat();
        System.out.println("giasaigiam: " + sachgiamax.getgiasaugiam());
    }
    }