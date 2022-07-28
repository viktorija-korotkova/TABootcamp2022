package com.bootcampexcercise.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        person = new Person();
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testGetterAndSetters() {
        int testWeight1 = 60;
        float testHeight1 = 180;
        person.setWeight(testWeight1);
        person.setHeight(testHeight1);
        assertEquals(testWeight1, person.getWeight());
        assertEquals(testHeight1, person.getHeight());

        int testWeight2 = 50;
        float testHeight2 = 150;
        person.setWeight(testWeight2);
        person.setHeight(testHeight2);
        assertEquals(testWeight2, person.getWeight());
        assertEquals(testHeight2, person.getHeight());
    }

    //TODO: create unit test for getBodyMassIndex method
    public void testGetBodyMassIndex() {
        int testWeight1 = 40;
        float testHeight1 = 180;
        double expected1 = testWeight1 / Math.pow(testHeight1, 2);
        assertEquals(expected1, person.getBodyMassIndex(testWeight1, testHeight1));

        int testWeight2 = 0;
        float testHeight2 = 180;
        double expected2 = 0;
        assertEquals(expected2, person.getBodyMassIndex(testWeight2, testHeight2));

        int testWeight3 = 40;
        float testHeight3 = 0;
        double expected3 = 0;
        assertEquals(expected3, person.getBodyMassIndex(testWeight3, testHeight3));
    }

    public void testGetBodyMassIndexAsString() {
        int testWeight1 = 40;
        float testHeight1 = 180;
        String expected1 = "BMI index:0.0012345679012345679";
        assertEquals(expected1, person.getBodyMassIndexAsString(testWeight1, testHeight1));

        int testWeight2 = 0;
        float testHeight2 = 180;
        String expected2 = "Invalid input, couldn't calculate the BMI";
        assertEquals(expected2, person.getBodyMassIndexAsString(testWeight2, testHeight2));

        int testWeight3 = 40;
        float testHeight3 = 0;
        String expected3 = "Invalid input, couldn't calculate the BMI";
        assertEquals(expected3, person.getBodyMassIndexAsString(testWeight3, testHeight3));
    }
}
