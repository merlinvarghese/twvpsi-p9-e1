package com.tw.vapasi;

public class RectangleModel {

    private double length;
    private  double breadth;

    double area(double length, double breadth)
    {
        return  length * breadth;
    }
    double perimeter(double length, double breadth)
    {
        return (2 * length)  + ( 2 * breadth);
    }

}
