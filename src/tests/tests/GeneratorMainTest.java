package tests;

import id_generator_5Digits.GeneratorMain;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class GeneratorMainTest {

    @Test
    void createEmployee() {
    }

    @Test
    void generateID_LinusIvarsson19930807_returns15863() {
        final int expected = 15863;
        final int actual = GeneratorMain.generateID("linus", "ivarsson", 19930807);
        Assert.assertEquals(actual, expected);
    }

    @Test
    void generateID_HugoHempel19960308_returns12345() {
        final int expected = 12345;
        final int actual = GeneratorMain.generateID("hugo", "hempel", 19960308);
        Assert.assertEquals(actual, expected);
    }
    @Test
    void inputString() {
    }

    @Test
    void inputInt() {
    }

    @Test
    void main() {
    }
}