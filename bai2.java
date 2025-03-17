/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplab4;

 class person {
    private String name;
    private String address;
    public person(String name,String address){
     this.name=name;
     this.address=address;
 }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(String addresss){
        this.address=address;
    }
    @Override
    public String toString(){
        return "person[name=" + name + ", address=" + address + "]";
    }
}
class student extends person{
    private String program;
    private int year;
    private double fee;
    public student(String name,String address,String program,int year,double fee){
        super(name,address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }
    public String getprogram(){
        return program;
    }
    public void setprogram(String program){
        this.program=program;
    }
     public int getyear(){
        return year;
    }
    public void setyear(int year){
        this.year=year;
    }
     public double getfee(){
        return fee;
    }
    public void setfee(double fee){
        this.fee=fee;
    }
    @Override
    public String toString(){
        return "student[" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }
}
class staff extends person{
    private String school;
    private double pay;
   
   public staff(String name ,String address,String school,double pay){
       super(name,address);
       this.school=school;
       this.pay=pay;
   }
    public String getschool(){
        return school;
    }
    public void setschool(String school){
        this.school=school;
    }
     public double getpay(){
        return pay;
    }
    public void setpay(double pay){
        this.pay=pay;
    }
      @Override
    public String toString(){
        return "staff[" + super.toString() + ", school=" + school + ",pay=" + pay + "]";
}
}
public class bai2{
    public static void main(String[] args) {
        person per=new person("Nguyen Van Phep" ,"123 Le Van Sy");
        System.out.println(per);
    
        student stu=new student("Nguyen Thi No", "456 Cong Hoa","Computer Science",2,5000.0);
        System.out.println(stu);

        staff sta=new staff("Anh Huynh", "789 Cao Thang", "Tech University", 60000.0);
        System.out.println(sta);
    }
}