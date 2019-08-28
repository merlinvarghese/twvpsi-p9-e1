package com.tw.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    void expectArea16ForSide4()
    {
        IShape square = new Square(4);
        Assertions.assertEquals(16,square.area());
    }
    @Test
    void expectArea28_09ForSide5_3()
    {
        IShape square = new Square(5.3);
        Assertions.assertEquals(28.09,square.area());
    }
    @Test
    void expectPerimeter28ForSide7()
    {
        IShape square = new Square(7);
        Assertions.assertEquals(28,square.perimeter());
    }
    @Test
    void expectPerimeter21_2ForSide5_3()
    {
        IShape square = new Square(5.3);
        Assertions.assertEquals(21.2,square.perimeter());
    }
}
