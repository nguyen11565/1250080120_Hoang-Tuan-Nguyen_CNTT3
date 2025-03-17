/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplab4;
 class circle {
    private double radius=1.0;
    private String color="red";
    public circle(){
        this.radius=1.0;
        this.color="red";
    }
    public double getradius(){
        return radius;
    }
    public String getcolor(){
        return color;
    }
    public void setradius(double radius){
        this.radius=1.0;
    }
    public void setcolor(String color){
        this.color="red";
    }
    public double getarea(){
        return  Math.PI * radius * radius;
    }
    
        @Override
        public String toString(){
       return "circle[radius=" + radius + ", color=" + color + "]";
    }
 }

class cylinder extends circle{
    private double height=1.0;
    public cylinder(){
        this.height=1.0;
    }
    public cylinder (double radius){
        super();
    }
    public cylinder(double radius, double height) {
        super();
        this.height=height;
    }
    public cylinder(double radius, double height,String color) {
        super();
        this.height=height;
    }
    public double getheight(){
        return height;
    }
    public void setheight(double height){
        this.height=height;
    }
    public double setvolume(){
        return getarea() * height;
    }
    @Override
    public String toString(){
        return "cylinder[" + super.toString() + ", height=" + height + "]";
    }
}
public class bai1{
    public static void main(String[]args){
        circle cir = new circle(2.0,"blue");
        System.out.println(cir);
        System.out.println("dien tich circle"+ cir.getarea());
        
        cylinder cyl = new cylinder(2.0,3.0,"green");
        System.out.println(cyl);
          System.out.println("the tich cylinder"+ cyl.getvolume());
    }
}