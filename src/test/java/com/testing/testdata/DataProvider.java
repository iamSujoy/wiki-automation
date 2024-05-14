package com.testing.testdata;


public class DataProvider {

    @org.testng.annotations.DataProvider(name = "sampledata")
    public Object[][] getCountryNameWithCapital(){

        return new Object[][]{{"India","New Delhi"}, {"England","London"},{"France","Berlin"}};
    }
}
