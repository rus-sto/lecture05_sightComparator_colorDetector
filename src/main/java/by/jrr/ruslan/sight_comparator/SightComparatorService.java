package by.jrr.ruslan.sight_comparator;
public class SightComparatorService {
     public String compare(int number) {
        if (number > 0) {
            return  "this Number is positive";
        } else if (number<0) {
            return "this Number is negative";
        }
        return "this Number is equal to ZERO";
    }
}