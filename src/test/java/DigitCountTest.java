import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.blankspace.test.exception.ANoLessThanBException;
import com.blankspace.test.DigitCount;
import com.blankspace.test.exception.NumberOutOfBoundException;

public class DigitCountTest {

    @Test
    public void demoTest() {
        Assertions.assertDoesNotThrow(() -> {
            long[] expectedArray1 = new long[]{2, 12, 3, 2, 2, 2, 2, 2, 2, 2};
            long[] actualArray1 = DigitCount.digitCount(1, 20);
            Assertions.assertArrayEquals(expectedArray1, actualArray1);
            long[] expectedArray2 = new long[]{40, 139, 140, 41, 40, 40, 40, 40, 40, 40};
            long[] actualArray2 = DigitCount.digitCount(101, 300);
            Assertions.assertArrayEquals(expectedArray2, actualArray2);
        });
    }

    @Test
    public void normalTest() {
        Assertions.assertDoesNotThrow(() -> {
            Assertions.assertArrayEquals(new long[]{488895, 600001, 600000, 600000, 600000, 600000, 600000, 600000, 600000, 600000}, DigitCount.digitCount(1, 1000000));
            Assertions.assertArrayEquals(new long[]{488895, 600000, 600000, 600000, 600000, 600000, 600000, 600000, 600000, 600000}, DigitCount.digitCount(2, 1000000));
            Assertions.assertArrayEquals(new long[]{1088888400000L, 1199999400000L, 1199999400000L, 1199999400000L, 1199999400000L, 1199999400000L, 1199999400000L, 1199999400000L, 1199999400000L, 1199999399988L}, DigitCount.digitCount(1000000, 999999999998L));
            Assertions.assertArrayEquals(new long[]{1088888400000L, 1199999400000L, 1199999400000L, 1199999400000L, 1199999400000L, 1199999400000L, 1199999400000L, 1199999400000L, 1199999400000L, 1199999400000L}, DigitCount.digitCount(1000000, 999999999999L));
            Assertions.assertArrayEquals(new long[]{0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, DigitCount.digitCount(1, 2));
            Assertions.assertArrayEquals(new long[]{1088888888889L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1199999999988L}, DigitCount.digitCount(1, 999999999998L));
            Assertions.assertArrayEquals(new long[]{1088888888889L, 1199999999999L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1199999999988L}, DigitCount.digitCount(2, 999999999998L));
            Assertions.assertArrayEquals(new long[]{1088888888889L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L}, DigitCount.digitCount(1, 999999999999L));
            Assertions.assertArrayEquals(new long[]{1088888888889L, 1199999999999L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L, 1200000000000L}, DigitCount.digitCount(2, 999999999999L));
            Assertions.assertArrayEquals(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 23}, DigitCount.digitCount(999999999998L, 999999999999L));
        });
    }

    @Test
    public void aNoLessThanBTest() {
        Assertions.assertThrows(ANoLessThanBException.class, () -> DigitCount.digitCount(1000000, 1000000));
        Assertions.assertThrows(ANoLessThanBException.class, () -> DigitCount.digitCount(999999999998L, 1000000));
        Assertions.assertThrows(ANoLessThanBException.class, () -> DigitCount.digitCount(1, 1));
        Assertions.assertThrows(ANoLessThanBException.class, () -> DigitCount.digitCount(999999999998L, 2));
    }

    @Test
    public void AOrBOutOfBoundTest() {
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(0, 1));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(0, 2));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(0, 1000000));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(0, 999999999998L));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(0, 999999999999L));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(0, 10000000000000L));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(1, 10000000000000L));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(2, 10000000000000L));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(1000000, 10000000000000L));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(999999999998L, 10000000000000L));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(999999999999L, 10000000000000L));
    }

}
