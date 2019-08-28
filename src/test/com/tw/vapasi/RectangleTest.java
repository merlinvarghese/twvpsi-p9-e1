package com.tw.vapasi;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest
{
    @Test
    void expectAreaForLength5Breadth2()
    {
        IShape rectangle = new Rectangle(5,2);
        assertEquals(10, rectangle.area());
    }
    @Test
    void expectAreaForLength52Breadth25()
    {
        IShape rectangle = new Rectangle(52,25);
        assertEquals(1300, rectangle.area());
    }
    @Test
    void expectAreaForLength5_8Breadth2_6()
    {
        IShape rectangle = new Rectangle(5.8,2.6);
        assertEquals(15.08, rectangle.area());
    }
    @Test
    void expectPerimeterForLength5Breadth2()
    {
        IShape rectangle = new Rectangle(5,2);
        assertEquals(14, rectangle.perimeter());
    }
    @Test
    void expectPerimeterForLength5_8Breadth2_6()
    {
        IShape rectangle = new Rectangle(5.8, 2.6);
        assertEquals(16.8, rectangle.perimeter());
    }
}
