package com.tw.vapasi;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleModelTest
{
    @Test
    void areaOfRectangleLength5Breadth2()
    {
        RectangleModel rectangleModel = new RectangleModel();
        assertEquals(10, rectangleModel.area(5,2));
    }
    @Test
    void areaOfRectangleLength52Breadth25()
    {
        RectangleModel rectangleModel = new RectangleModel();
        assertEquals(1300, rectangleModel.area(52,25));
    }
    @Test
    void areaOfRectangleLength0Breadth25()
    {
        RectangleModel rectangleModel = new RectangleModel();
        assertEquals(0, rectangleModel.area(0,25));
    }
    @Test
    void perimeterOfRectangleLength5Breadth2()
    {
        RectangleModel rectangleModel = new RectangleModel();
        assertEquals(14, rectangleModel.perimeter(5,2));
    }
}
