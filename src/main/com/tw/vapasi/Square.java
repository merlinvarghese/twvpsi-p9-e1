package com.tw.vapasi;

//Shape with 4 equal sides
public class Square implements IShape {

    private  double side;
    Square(double side)
    {
        this.side = side;
    }
    public double area() {
        return side * side;
    }
    public double perimeter() {
        return 4 * side;
    }
}
