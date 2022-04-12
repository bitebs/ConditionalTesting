package Triangles.test;

import Triangles.Triangles;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class TrianglesTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream origOut = System.out;

    private final ByteArrayOutputStream outErr = new ByteArrayOutputStream();
    private final PrintStream origErr = System.err;

    @Test
    void checkIsTriangleExists() {
        assertTrue(Triangles.checkIsTriangleExists(1, 1, 1));
        assertTrue(Triangles.checkIsTriangleExists(2, 2, 3));
        assertTrue(Triangles.checkIsTriangleExists(3, 4, 5));

        assertFalse(Triangles.checkIsTriangleExists(1, 2, 3));
        assertFalse(Triangles.checkIsTriangleExists(-1, 2, 3));
    }

    @BeforeEach
    public void setStream() {
        System.setOut(new PrintStream(out));
        System.setOut(new PrintStream(outErr));
    }

    @AfterEach
    public void restoreStream() {
        System.setOut(origOut);
        System.setOut(origErr);
    }

    @Test
    public void hello() {
        System.out.print("hello");
        assertEquals("hello", out.toString());
    }

    @Test
    public void equilateral() {
        Triangles.checkTriangle(1, 1, 1);
        assertEquals("Equilateral triangle\r\n", out.toString());
    }

    @Test
    public void isosceles() {
        Triangles.checkTriangle(2, 2, 3);
        assertEquals("Isosceles triangle\r\n", out.toString());

    }

    @Test
    public void Rectangular() {
        Triangles.checkTriangle(3, 4, 5);
        assertEquals("Rectangular triangle\r\n", out.toString());

    }

    @Test
    public void Scalene() {
        Triangles.checkTriangle(3, 4, 6);
        assertEquals("Scalene triangle\r\n", out.toString());

    }

    @Test
    public void invalid() {
        Triangles.checkTriangle(0, 4, 6);
        assertEquals("Error, the triangle is not valid\r\n", outErr.toString());

    }
}