package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        XmlReader xr = new XmlReader();
        Assert.assertEquals(xr.convertIntToChar("100"), "A");

    }
}
