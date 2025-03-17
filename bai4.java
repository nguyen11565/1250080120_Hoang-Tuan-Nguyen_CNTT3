/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplab4;
import java.util.Scanner;
 class hanghoa {
    private String mahang;
    private String tenhang;
    private long dongia;
    public hanghoa(){
   this.mahang = "";
  this.tenhang = "";
   this.dongia = 0;
 }
  public hanghoa(String mahang, String tenhang, long dongia) {
this.mahang = mahang;
this.tenhang=tenhang;
this.dongia = dongia;
  }
  public String getmahang() {
return mahang;
}
public String gettenhang() {
return tenhang;
}

public long getdongia() {
return dongia;
}

public void nhap(){
       Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ma hang: ");
        mahang = scanner.nextLine();
        System.out.print("Nhap ten hang: ");
        tenhang = scanner.nextLine();
        System.out.print("Nhập don gia: ");
        dongia = scanner.nextLong();
    }

public void xuat(){
       System.out.println("ma hang"+mahang);
          System.out.println("ten hang"+tenhang);
             System.out.println("don gia"+dongia);
}
 }
class hangdienmay extends hanghoa{
 private int thoigianbaohanh;
private int dienap;
private int congsuat;
public hangdienmay(){
}
public hangdienmay(String mahang,String tenhang,long dongia,int thoigianbaohanh,int dienap,int congsuat){
    super(mahang,tenhang,dongia);
    this.thoigianbaohanh=thoigianbaohanh;
    this.dienap=dienap;
    this.congsuat=congsuat;
}
public int getthoigianbaohanh() {
return thoigianbaohanh;
}
public int getdienap() {
return dienap;
}
public int getcongsuat() {
return congsuat;
}
public void nhap(){
     Scanner scanner = new Scanner(System.in);
        System.out.print("nhap tg bao hanh: ");
        thoigianbaohanh = scanner.nextInt();
        System.out.print("Nhap dien ap: ");
        dienap = scanner.nextInt();
        System.out.print("nhap cong suat: ");
        congsuat = scanner.nextInt();
    }
public void xuat(){
       System.out.println("thoi gian bao hanh"+thoigianbaohanh);
          System.out.println("dien ap"+dienap);
             System.out.println("cong suat"+congsuat);
}
}
class hangthucpham extends hanghoa{
    private String ngaysanxuat;
    private String ngayhethan;
    public hangthucpham(){
        super();
    }
     public hangthucpham(String mahang, String tenhang, long dongia, String ngaysanxuat, String ngayhethan) {
        super(mahang, tenhang, dongia);
        this.ngaysanxuat = ngaysanxuat;
        this.ngayhethan = ngayhethan;
}
     public String getngaysanxuat() {
return ngaysanxuat;
}
public String getngayhethan(){
    return ngayhethan;
}
public void nhap(){
     Scanner scanner = new Scanner(System.in);
    System.out.println("nhap ngay san xuat");
    ngaysanxuat=scanner.nextLine();
    System.out.println("nhap ngay het han");
    ngayhethan=scanner.nextLine();
}
public void xuat(){
    System.out.println("ngay san xuat"+ngaysanxuat);
        System.out.println("ngay het han"+ngayhethan);
}
}
public class bai4{
    public static void main(String[]args){
       hangdienmay hdm=new hangdienmay("DM001","Tivi",5000000,12,220,100);
       System.out.println("nhap thong tin hang dien may");
       hdm.nhap();
         System.out.println("xuat thong tin hang dien may");
       hdm.xuat();
      
       hangthucpham htp=new hangthucpham("TP001","Gao",20000,"01/03/2025","01/09/2025");
       System.out.println("nhap thong tin hang thuc pham");
     htp.nhap();
       System.out.println("xuat thong tin hang thuc pham");
   htp.xuat();
    }
}
