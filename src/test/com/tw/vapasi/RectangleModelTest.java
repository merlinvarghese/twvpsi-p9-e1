package com.tw.vapasi;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleModelTest
{
    @Test
    void areaOfRectangleLength5Breadth2()
    {
        RectangleModel rectangleModel = new RectangleModel();
        assertEquals(10, rectangleModel.Area(5,2));
    }
    @Test
    void areaOfRectangleLength52Breadth25()
    {
        RectangleModel rectangleModel = new RectangleModel();
        assertEquals(1300, rectangleModel.Area(52,25));
    }
}
