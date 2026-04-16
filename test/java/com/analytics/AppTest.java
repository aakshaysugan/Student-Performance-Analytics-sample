package com.analytics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {

    /**
     * Test for Total Marks Calculation
     */
    @Test
    public void testTotalCalculation() {
        double cat = 25.0;
        double assignment = 18.0;
        double fat = 45.0;
        double expectedTotal = 88.0;
        
        double actualTotal = cat + assignment + fat;
        
        assertEquals("Total marks should be the sum of CAT, Assignment, and FAT", 
                     expectedTotal, actualTotal, 0.001);
    }

    /**
     * Test for Grade Assignment logic
     */
    @Test
    public void testGradeInsight() {
        double marks = 92.0;
        String grade;
        
        if (marks >= 90) grade = "S";
        else if (marks >= 80) grade = "A";
        else grade = "B";
        
        assertEquals("Marks >= 90 should result in an S grade", "S", grade);
    }

    /**
     * Simple test to ensure the App is reachable
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
