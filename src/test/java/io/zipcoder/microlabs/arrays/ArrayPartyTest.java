package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        //: Given
        String[] sports = {"hockey", "football", "basketball", "soccer"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nsoccer";

        //: When
        String actual = arrayParty.lastElement(sports);

        //: Then
        Assert.assertEquals(expected, actual);
    }

    //TODO Define the method lastButOneTest
    @Test
    public void lastButOneTest(){
        //: Given
        String[] sports = {"hockey", "football", "basketball", "soccer"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nbasketball";

        //: When
        String actual = arrayParty.lastButOne(sports);

        //: Then
        Assert.assertEquals(expected, actual);
    }

    //TODO Define the method reverseTest
    @Test
    public void reverseTest(){
        String[] fruits = {"apple", "orange", "watermelon", "banana", "plum"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nplum\nbanana\nwatermelon\norange\napple";

        String actual = arrayParty.reverse(fruits);

        Assert.assertEquals(expected, actual);
    }

    //TODO Define the method isPalindromeTest
    @Test
    public void isPalindromeTest(){
        String[] sports = {"hockey", "football", "soccer", "football", "hockey"};
        ArrayParty arrayParty = new ArrayParty();
        boolean expected = true;
        boolean actual = arrayParty.isPalindrome(sports);

        Assert.assertEquals(expected, actual);

    }

    //TODO Define the method compressTest
    @Test
    public void compressTest(){
        ArrayParty arrayParty = new ArrayParty();
        int[] ints = {1, 2, 2, 2, 3, 1, 1, 4, 4, 4, 6, 7, 6};
        String expected = "*** Output ***\n1\n2\n3\n1\n4\n6\n7\n6";
        String actual = arrayParty.compress(ints);

        Assert.assertEquals(expected, actual);
    }

    //TODO Define the method packTest
    @Test
    public void packTest(){
        ArrayParty arrayParty = new ArrayParty();
        char [] letters = {'a','a', 'a', 'a','b','c','c','a','a','d','e','e','e','e'};
        String expected = "*** Output ***\naaaa, b, cc, aa, d, eeee";
        String actual = arrayParty.pack(letters);

        Assert.assertEquals(expected, actual);
    }


}
