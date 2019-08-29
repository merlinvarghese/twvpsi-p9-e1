package com.tw.vapasi;
//Shape with  4 sides with 2 opposite sides equal to each other
 class Rectangle{
     private  double length;
     private double breadth;

     Rectangle(double length, double breadth)
     {
         this.length = length;
         this.breadth = breadth;
     }
    public double area()
    {
        return  length * breadth;
    }
    public double perimeter()
    {
        return 2 * ( length + breadth );
    }
}
