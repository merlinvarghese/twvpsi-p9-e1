package com.tw.vapasi;
//Shape with  4 sides with 2 opposite sides equal to each other
 class Rectangle  implements IShape{
     private  double length;
     private double breadth;

     Rectangle(double length, double breadth)
     {
         this.length = length;
         this.breadth = breadth;
     }

    @Override
    public double area()
    {
        return  length * breadth;
    }

    @Override
   public double perimeter()
    {
        return (2 * length)  + ( 2 * breadth);
    }
}
