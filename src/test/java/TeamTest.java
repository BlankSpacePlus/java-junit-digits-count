import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.blankspace.test.DigitCount;
import com.blankspace.test.exception.ANoLessThanBException;
import com.blankspace.test.exception.NumberOutOfBoundException;

public class TeamTest {

    @Test
    public void testByStudent1() {
        Assertions.assertDoesNotThrow(() -> {
            Assertions.assertArrayEquals(new long[]{0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, DigitCount.digitCount(1, 2));
            Assertions.assertArrayEquals(new long[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 0}, DigitCount.digitCount(5, 8));
            Assertions.assertArrayEquals(new long[]{763, 1760, 1860, 861, 860, 860, 860, 860, 860, 860}, DigitCount.digitCount(200, 3000));
            Assertions.assertArrayEquals(new long[]{22, 20, 20, 20, 20, 120, 21, 20, 20, 20}, DigitCount.digitCount(500, 600));
            Assertions.assertArrayEquals(new long[]{3, 3, 10, 14, 14, 8, 3, 3, 3, 3}, DigitCount.digitCount(23, 54));
            Assertions.assertArrayEquals(new long[]{37, 137, 70, 29, 26, 27, 32, 37, 37, 37}, DigitCount.digitCount(65, 232));
            Assertions.assertArrayEquals(new long[]{36, 136, 72, 32, 26, 26, 26, 30, 36, 36}, DigitCount.digitCount(76, 235));
            Assertions.assertArrayEquals(new long[]{1778, 2778, 2778, 2770, 2767, 2703, 2253, 1778, 1778, 1778}, DigitCount.digitCount(657, 6532));
            Assertions.assertArrayEquals(new long[]{1, 1, 0, 0, 0, 0, 0, 0, 0, 1}, DigitCount.digitCount(9, 10));
            Assertions.assertArrayEquals(new long[]{496, 1496, 641, 386, 386, 386, 391, 431, 496, 496}, DigitCount.digitCount(765, 2224));
            Assertions.assertArrayEquals(new long[]{1164, 2164, 2143, 2066, 1415, 1174, 1174, 1173, 1165, 1164}, DigitCount.digitCount(438, 4278));
            Assertions.assertArrayEquals(new long[]{2231281, 3231280, 3169171, 3129681, 2360181, 2138890, 2222380, 2222271, 2227881, 2231281}, DigitCount.digitCount(583490, 4237890));
            Assertions.assertArrayEquals(new long[]{1175, 1175, 1114, 1085, 1776, 2165, 2165, 2165, 1405, 1175}, DigitCount.digitCount(4389, 8238));
            Assertions.assertArrayEquals(new long[]{36, 136, 46, 27, 27, 34, 37, 37, 37, 37}, DigitCount.digitCount(53, 219));
            Assertions.assertArrayEquals(new long[]{620, 1710, 810, 619, 620, 620, 620, 620, 620, 617}, DigitCount.digitCount(94, 2190));
            Assertions.assertArrayEquals(new long[]{2, 11, 3, 2, 2, 2, 2, 2, 2, 2}, DigitCount.digitCount(2, 20));
        });
        Assertions.assertThrows(ANoLessThanBException.class, () -> DigitCount.digitCount(1, 1));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(-1, 2));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(1, 100000000000000L));
        Assertions.assertThrows(ANoLessThanBException.class, () -> DigitCount.digitCount(10, 3));
    }

    @Test
    public void testByStudent2() {
        Assertions.assertDoesNotThrow(() -> {
            Assertions.assertArrayEquals(new long[]{1, 4, 1, 0, 1, 1, 1, 1, 1, 1}, DigitCount.digitCount(4, 12));
            Assertions.assertArrayEquals(new long[]{4, 13, 14, 14, 5, 4, 4, 4, 4, 4}, DigitCount.digitCount(2, 40));
            Assertions.assertArrayEquals(new long[]{5, 15, 15, 15, 15, 6, 5, 5, 5, 5}, DigitCount.digitCount(1, 50));
            Assertions.assertArrayEquals(new long[]{2568, 3679, 3679, 3678, 3678, 3678, 3678, 3678, 3537, 2568}, DigitCount.digitCount(1, 8882));
            Assertions.assertArrayEquals(new long[]{112662, 223772, 155414, 115011, 112662, 112662, 112662, 112662, 112662, 112662}, DigitCount.digitCount(3, 232323));
            Assertions.assertArrayEquals(new long[]{15858941, 26893259, 19986383, 15982369, 15858941, 15858941, 15858941, 15858941, 15858941, 15858941}, DigitCount.digitCount(4, 23123213));
            Assertions.assertArrayEquals(new long[]{94704344, 126228422, 95926880, 94704354, 94704346, 94704344, 94704344, 94704344, 94704344, 94704344}, DigitCount.digitCount(2, 121211241));
            Assertions.assertArrayEquals(new long[]{16466344, 27517939, 21617638, 17476354, 16608830, 16466344, 16466344, 16466344, 16466344, 16466344}, DigitCount.digitCount(1, 24141241));
            Assertions.assertArrayEquals(new long[]{22253360, 33295444, 32394544, 24400118, 22255160, 22253360, 22253360, 22253360, 22253360, 22253360}, DigitCount.digitCount(34342, 32142141));
            Assertions.assertArrayEquals(new long[]{158302, 268302, 262572, 183332, 158548, 158302, 158302, 158302, 158302, 158302}, DigitCount.digitCount(3223, 324242));
            Assertions.assertArrayEquals(new long[]{92812541, 123308312, 93098873, 92611030, 92816780, 92812541, 92812541, 92812541, 92812541, 92812541}, DigitCount.digitCount(3212412, 121244124));
            Assertions.assertArrayEquals(new long[]{32471921, 33241407, 33541707, 42350507, 43583021, 43583024, 43583029, 42358626, 33267725, 32471921}, DigitCount.digitCount(31231257, 78787867));
            Assertions.assertArrayEquals(new long[]{5183023, 6293024, 6293083, 6293124, 6293892, 6294134, 6294134, 6281891, 5978861, 5183023}, DigitCount.digitCount(4241, 8787878));
            Assertions.assertArrayEquals(new long[]{168266062, 271463171, 180563240, 168276495, 168269726, 168266120, 168266062, 168266062, 168266062, 168266062}, DigitCount.digitCount(3231, 212143553));
            Assertions.assertArrayEquals(new long[]{1253422, 2283993, 1390600, 1254557, 1253430, 1253423, 1253423, 1253422, 1253422, 1253422}, DigitCount.digitCount(23123, 2131246));
            Assertions.assertArrayEquals(new long[]{8857979, 13014151, 9861066, 8980994, 8857979, 8857979, 8857979, 8857979, 8857979, 8857979}, DigitCount.digitCount(3232, 13123123));
            Assertions.assertArrayEquals(new long[]{2607034, 3716938, 3708147, 3705923, 3050169, 2606545, 2607023, 2607025, 2607034, 2607034}, DigitCount.digitCount(5478, 4422111));
        });
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(-2, -3));
        Assertions.assertThrows(ANoLessThanBException.class, () -> DigitCount.digitCount(34, 2));
        Assertions.assertThrows(ANoLessThanBException.class, () -> DigitCount.digitCount(23, 23));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(1, 1000000000000000000L));
    }

    @Test
    public void testByStudent3() {
        Assertions.assertDoesNotThrow(() -> {
            Assertions.assertArrayEquals(new long[]{2, 12, 3, 2, 2, 2, 2, 2, 2, 2}, DigitCount.digitCount(1, 20));
            Assertions.assertArrayEquals(new long[]{40, 139, 140, 41, 40, 40, 40, 40, 40, 40}, DigitCount.digitCount(101, 300));
            Assertions.assertArrayEquals(new long[]{654320, 777782, 654320, 654320, 654320, 654320, 654320, 654320, 654320, 654320}, DigitCount.digitCount(11, 1111111));
            Assertions.assertArrayEquals(new long[]{302506, 301505, 252504, 201502, 205521, 356542, 453504, 202502, 256530, 302531}, DigitCount.digitCount(5845981, 6251001));
            Assertions.assertArrayEquals(new long[]{1, 1, 0, 0, 0, 0, 0, 0, 0, 1}, DigitCount.digitCount(9, 10));
            Assertions.assertArrayEquals(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 23}, DigitCount.digitCount(999999999998L, 999999999999L));
            Assertions.assertArrayEquals(new long[]{2704, 3701, 3700, 3700, 3700, 3700, 3700, 3700, 3700, 3700}, DigitCount.digitCount(1000, 10000));
            Assertions.assertArrayEquals(new long[]{304697, 348398, 404698, 404797, 404797, 408498, 414266, 374525, 305456, 304688}, DigitCount.digitCount(156299, 768768));
            Assertions.assertArrayEquals(new long[]{980, 8771, 2081, 2081, 1596, 995, 980, 980, 980, 980}, DigitCount.digitCount(111111, 114514));
            Assertions.assertArrayEquals(new long[]{1500, 1505, 1990, 2501, 2501, 2504, 2500, 2015, 1500, 1500}, DigitCount.digitCount(2511, 7514));
            Assertions.assertArrayEquals(new long[]{9340, 9392, 9440, 14291, 19434, 20134, 10439, 10439, 10383, 10183}, DigitCount.digitCount(35148, 59842));
            Assertions.assertArrayEquals(new long[]{1888, 1896, 1899, 2387, 2899, 2987, 2999, 2999, 2999, 2999}, DigitCount.digitCount(3512, 9999));
            Assertions.assertArrayEquals(new long[]{3037, 9700, 3037, 3037, 3037, 3037, 2653, 1927, 1927, 1954}, DigitCount.digitCount(9991, 16661));
        });
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(10000000000000L, 10000000000001L));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(-1, 15));
        Assertions.assertThrows(ANoLessThanBException.class, () -> DigitCount.digitCount(156, 6));
        Assertions.assertThrows(ANoLessThanBException.class, () -> DigitCount.digitCount(486, 486));
    }

    @Test
    public void testByStudent4() {
        Assertions.assertDoesNotThrow(() -> {
            Assertions.assertArrayEquals(new long[]{2, 12, 3, 2, 2, 2, 2, 2, 2, 2}, DigitCount.digitCount(1, 20));
            Assertions.assertArrayEquals(new long[]{40, 139, 140, 41, 40, 40, 40, 40, 40, 40}, DigitCount.digitCount(101, 300));
            Assertions.assertArrayEquals(new long[]{0, 1, 1, 1, 0, 0, 0, 0, 0, 0}, DigitCount.digitCount(1, 3));
            Assertions.assertArrayEquals(new long[]{1, 4, 1, 1, 1, 1, 1, 1, 1, 1}, DigitCount.digitCount(1, 11));
            Assertions.assertArrayEquals(new long[]{11, 20, 19, 19, 19, 19, 19, 19, 19, 19}, DigitCount.digitCount(10, 100));
            Assertions.assertArrayEquals(new long[]{87, 185, 185, 185, 185, 96, 95, 95, 95, 95}, DigitCount.digitCount(50, 500));
            Assertions.assertArrayEquals(new long[]{468, 1515, 566, 565, 565, 575, 575, 575, 575, 575}, DigitCount.digitCount(150, 2000));
            Assertions.assertArrayEquals(new long[]{72400, 141863, 83400, 83400, 83400, 81863, 73400, 73400, 72863, 72400}, DigitCount.digitCount(463, 158462));
            Assertions.assertArrayEquals(new long[]{434400, 545400, 545400, 545400, 545400, 545400, 545400, 545400, 533070, 434400}, DigitCount.digitCount(888, 888888));
            Assertions.assertArrayEquals(new long[]{68888687, 79999690, 79999699, 79999699, 79999699, 79999699, 79999699, 79999699, 79999699, 79999699}, DigitCount.digitCount(1010, 100000000));
            Assertions.assertArrayEquals(new long[]{4132, 13996, 4279, 4021, 4021, 4022, 4021, 4021, 4021, 4021}, DigitCount.digitCount(10115, 20225));
            Assertions.assertArrayEquals(new long[]{114486, 213937, 207486, 127966, 107436, 107456, 107407, 107407, 107417, 107416}, DigitCount.digitCount(102480, 320548));
            Assertions.assertArrayEquals(new long[]{3430130, 4432676, 4435676, 4436222, 4436226, 4436286, 4065965, 3325222, 3325222, 3325222}, DigitCount.digitCount(1002546, 6666666));
            Assertions.assertArrayEquals(new long[]{23, 3, 0, 0, 0, 0, 0, 0, 0, 0}, DigitCount.digitCount(1000000000000L, 1000000000001L));
            Assertions.assertArrayEquals(new long[]{7320980, 1888895, 654321, 654321, 654321, 654321, 654321, 654321, 654321, 654321}, DigitCount.digitCount(1000000000001L, 1000001111111L));
        });
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(9999999999999L, 10000000000000L));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(0, 11));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(-2, 22));
        Assertions.assertThrows(NumberOutOfBoundException.class, () -> DigitCount.digitCount(10000000000000L, 10000000000001L));
        Assertions.assertThrows(ANoLessThanBException.class, () -> DigitCount.digitCount(333333, 222222));
    }

}
