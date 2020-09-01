package by.jrr.ruslan.sight_comparator;
import by.jrr.ruslan.sight_comparator.SightComparatorService;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
class SightComparatorServiceTest {
//SightComparatorService sightComparatorService=new SightComparatorService();
    @Test
     void comparePositive() {
        SightComparatorService sightComparatorService = new SightComparatorService();
        boolean expected = true;
        boolean actual = sightComparatorService.compare(100).equals("this Number is positive");
        assertEquals(expected, actual);
    }
    @Test
     void comparePositiveString() {
        SightComparatorService sightComparatorService = new SightComparatorService();
        String expected = "this Number is positive";
        String actual = sightComparatorService.compare(50);
        assertEquals(expected, actual);
    }
    @Test
     void compareNegative() {
        SightComparatorService sightComparatorService = new SightComparatorService();
        boolean expected = true;
        boolean actual = sightComparatorService.compare(-15).equals("this Number is negative");
        assertEquals(expected, actual);
    }
    @Test
     void compareNegativeString() {
        SightComparatorService sightComparatorService = new SightComparatorService();
        String expected = "this Number is negative";
        String  actual = sightComparatorService.compare(-1000500);
        assertEquals(expected, actual);
    }
    @Test
     void compareZero() {
        SightComparatorService sightComparatorService = new SightComparatorService();
        boolean expected = true;
        boolean actual = sightComparatorService.compare(0).equals("this Number is equal to ZERO");
        assertEquals(expected, actual);
    }
    @Test
     void compareZeroString() {
        SightComparatorService sightComparatorService = new SightComparatorService();
        String expected = "this Number is equal to ZERO";
        String actual = sightComparatorService.compare(0);
        assertEquals(expected, actual);
    }
}