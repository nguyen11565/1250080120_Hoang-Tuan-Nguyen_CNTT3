/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplab4;
 class shape {
private String color="red" ;
private boolean filled=true;
public shape(){
this.color = "red";
this.filled = true;
}
public shape(String color, boolean filled) {
this.color = color;
this.filled = filled;
}
public String getcolor() {
return color;
}
public void setcolor(String color) {
this.color = color;
}
public boolean getfilled() {
return filled;
}
public void setfilled(boolean filled) {
this.filled = filled;
}
@Override
public String toString(){
    return "shape[color=" + color + ", filled=" + filled + "]";
}
}
class circle extends shape{
     private double radius=1.0;
    public circle(){
        this.radius=1.0;
    }
    public circle(double raidius,String color,boolean filled){
        super(color,filled);
    }
    public double getradius(){
        return radius;
    }
    public void setradius(double radius){
        this.radius=1.0;
    }
    public double getarea(){
        return  Math.PI * radius * radius;
    }
    public double getperimeter(){
        return 2 * Math.PI * radius;
    }
     @Override
    public String toString() {
        return "circle[" + super.toString() + ", radius=" + radius + "]";
}
}
class rectangle extends shape{
    private double width = 1.0;
    private double length = 1.0;
    public rectangle(){
        super();
    }
    public rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
      public double getwidth(){
        return width;
    }
    public void setwidth(double width){
        this.width=width;
    }
          public double getlength(){
        return length;
    }
    public void setlength(double length){
        this.length=length;
}
     public double getarea(){
        return  width * length;
    }
    public double getperimeter(){
        return 2 *(width * length);
    }
     @Override
    public String toString() {
        return "rectangle[" + super.toString() + ", width=" + width + ", length=" + length +"]";
}
}
    class square extends rectangle{
        public square(){
        }
        public square(double side){
            super(side,side);
        }
        public square(double side, String color, boolean filled){
            super(side,side,color,filled);
        }
          public double getside(){
        return getwidth();
    }
    public void setside(double side){
        setwidth(side);
        setlength(side);
}
    @Override
  public void setwidth(double side){
  super.setwidth(side);
    super.setlength(side);
}
   @Override
  public void setlength(double side){
  super.setwidth(side);
    super.setlength(side);
}
   @Override
  public String toString(){
      return "square[" + super.toString() + "]";
}
}
public class bai3{
    public static void main(String[] args){
        shape sha=new shape("blue",false);
        System.out.println(sha);
        
     circle cir=new circle(2.0,"green",true);
          System.out.println("dt circle"+cir.getarea());
           System.out.println("cv circle"+cir.getperimeter());
            System.out.println(cir);
        
    rectangle rec=new rectangle(3.0, 4.0,"yellow",false);
           System.out.println("dt circle"+rec.getarea());
           System.out.println("cv circle"+rec.getperimeter());
            System.out.println(rec);
           
    square squ=new square( 2.5,"purple",true);
           System.out.println("dt circle"+squ.getarea());
           System.out.println("cv circle"+squ.getperimeter());
           System.out.println(squ);
    }
}
