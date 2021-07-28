package ru.leroymerlin.qa.tests.TestNGTests;
import org.testng.Assert;
import org.testng.annotations.*;
import ru.leroymerlin.qa.tests.Calculator.Calculator;


public class CalculatorTest {

    Calculator calculator = new Calculator();

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("@AfterMethod");
    }

    @BeforeGroups
    public void beforeGroups() throws Exception {
        System.out.println("BeforeGroups");
    }

    @AfterGroups
    public void afterGroups() throws Exception {
        System.out.println("@AfterGroups");
    }

    @BeforeClass
    public void beforeClass() throws Exception {
        System.out.println("@BeforeClass");
    }

    @BeforeTest
    public void beforeTest() throws Exception {
        System.out.println("@BeforeTest");
    }

    @AfterTest
    public void afterTest() throws Exception {
        System.out.println("@AfterTest");
    }

    @AfterClass
    public void afterClass() throws Exception {
        System.out.println("@AfterClass");
    }

    @BeforeSuite
    public void beforeSuite() throws Exception {
        System.out.println("@BeforeSuite");
    }

    @AfterSuite
    public void afterSuite() throws Exception {
        System.out.println("@AfterSuite");
    }

    @Test
    public void testCalc() throws Exception {
        Assert.assertEquals(5, calculator.add(2,3));
        System.out.println("@Test1");
    }

    @Test
    @Parameters(value = {"a", "b", "res"})
    public void testCalcParametrized(int a, int b, int sum) throws Exception {
        int res = calculator.add(a, b);
        Assert.assertEquals(res,sum,"bad add!");
        System.out.println("@Test2");
    }

    @Test
    public void testNotNull(){
        int result = calculator.add(5,5);
        Assert.assertNotNull(result);
        System.out.println("@Test3");
    }

}
