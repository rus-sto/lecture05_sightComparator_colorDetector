package by.jrr.ruslan.color_detector;

import org.junit.Test;

import static org.junit.Assert.*;

public class LightColorDetectorTest {

    @Test
    public void detectViolet() {
        LightColorDetector lightColorDetector=new LightColorDetector();
        String expected = "Violet";
        String actual = lightColorDetector.detect(390);
        assertEquals(expected,actual);
    }
    @Test
    public void detectBlue() {
        LightColorDetector lightColorDetector=new LightColorDetector();
        String expected = "Blue";
        String actual = lightColorDetector.detect(470);
        assertEquals(expected,actual);
    }
    @Test
    public void detectGreen() {
        LightColorDetector lightColorDetector=new LightColorDetector();
        String expected = "Green";
        String actual = lightColorDetector.detect(520);
        assertEquals(expected,actual);
    }
    @Test
    public void detectYellow() {
        LightColorDetector lightColorDetector=new LightColorDetector();
        String expected = "Yellow";
        String actual = lightColorDetector.detect(580);
        assertEquals(expected,actual);
    }
    @Test
    public void detectOrange() {
        LightColorDetector lightColorDetector=new LightColorDetector();
        String expected = "Orange";
        String actual = lightColorDetector.detect(600);
        assertEquals(expected,actual);
    }
    @Test
    public void detectRed() {
        LightColorDetector lightColorDetector=new LightColorDetector();
        String expected = "Red";
        String actual = lightColorDetector.detect(720);
        assertEquals(expected,actual);
    }
    @Test
    public void detectInvisibleLightUp() {
        LightColorDetector lightColorDetector=new LightColorDetector();
        String expected = "Invisible Light";
        String actual = lightColorDetector.detect(800);
        assertEquals(expected,actual);
    }
    @Test
    public void detectInvisibleLightDown() {
        LightColorDetector lightColorDetector=new LightColorDetector();
        String expected = "Invisible Light";
        String actual = lightColorDetector.detect(300);
        assertEquals(expected,actual);
    }

}