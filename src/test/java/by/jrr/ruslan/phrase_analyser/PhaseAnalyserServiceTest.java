package by.jrr.ruslan.phrase_analyser;
import org.junit.Test;
import static org.junit.Assert.*;
public class PhaseAnalyserServiceTest {

    @Test
    public void analyzeTestWithMakeAndGreat() {
        PhaseAnalyserService phaseAnalyserService= new PhaseAnalyserService();
        String expected = "It stands no chance";
        String actual = phaseAnalyserService.analyze("Make something great again");
       assertEquals(expected, actual);
    }
    @Test
    public void analyzeTestWithGreat() {
        PhaseAnalyserService phaseAnalyserService= new PhaseAnalyserService();
        String expected = "It could be worse";
        String actual =  phaseAnalyserService.analyze("Make something");
        assertEquals(expected, actual);
    }
    @Test
    public void analyzeTestWithMake() {
        PhaseAnalyserService phaseAnalyserService= new PhaseAnalyserService();
        String expected = "It could be worse";
        String actual =  phaseAnalyserService.analyze("something great again");
        assertEquals(expected, actual);
    }
    @Test
    public void analyzeTestWithOutMakeAndGreat() {
        PhaseAnalyserService phaseAnalyserService= new PhaseAnalyserService();
        String expected = "It is fine, really";
        String actual =  phaseAnalyserService.analyze("something  again");
        assertEquals(expected, actual);
    }
}