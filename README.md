# 软件测试

## 题目描述

原题链接：[洛谷 P2602 \[ZJOI2010\] 数字计数](https://www.luogu.com.cn/problem/P2602)

输入两个正整数a,b，求在$[a,b]$中的所有整数中，每个数码(0\~9)各出现了多少次。

输入格式：<br>
输入两个正整数a, b确定区间$[a,b]$($0$<$a$<$b$<${10}^{13}$)。

输出格式：<br>
在一行中输出0\~9每个数码在$[a,b]$区间内共出现多少次，用空格隔开。

输入样例1：
```text
1 20
```

输出样例1：
```text
2 12 3 2 2 2 2 2 2 2
```

输入样例2：
```text
101 300
```

输出样例2：
```text
40 139 140 41 40 40 40 40 40 40
```

输入样例3：
```text
1 99
```

输出样例3：
```text
9 20 20 20 20 20 20 20 20 20
```

## 实现方法

数位DP，可参考洛谷题解。

## 设计测试用例

| ID | Input a | Input b | Output |
|:----:|:----:|:----:|:----:|
| 1 | 1 | 1000000 | 488895, 600001, 600000, 600000, 600000, 600000, 600000, 600000, 600000, 600000 |
| 2 | 2 | 1000000 | 488895, 600000, 600000, 600000, 600000, 600000, 600000, 600000, 600000, 600000 |
| 3 | 1000000 | 999999999998 | 1088888400000, 1199999400000, 1199999400000, 1199999400000, 1199999400000, 1199999400000, 1199999400000, 1199999400000, 1199999400000, 1199999399988 |
| 4 | 1000000 | 999999999999 | 1088888400000, 1199999400000, 1199999400000, 1199999400000, 1199999400000, 1199999400000, 1199999400000, 1199999400000, 1199999400000, 1199999400000 |
| 5 | 1 | 2 | 0, 1, 1, 0, 0, 0, 0, 0, 0, 0 |
| 6 | 1 | 999999999998 | 1088888888889, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1199999999988 |
| 7 | 2 | 999999999998 | 1088888888889, 1199999999999, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1199999999988 |
| 8 | 1 | 999999999999 | 1088888888889, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1200000000000 |
| 9 | 2 | 999999999999 | 1088888888889, 1199999999999, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1200000000000, 1200000000000 |
| 10 | 999999999998 | 999999999999 | 0, 0, 0, 0, 0, 0, 0, 0, 1, 23 |
| 11 | 0 | 1 | NumberOutOfBoundException |
| 12 | 0 | 2 | NumberOutOfBoundException |
| 13 | 0 | 1000000 | NumberOutOfBoundException |
| 14 | 0 | 999999999998 | NumberOutOfBoundException |
| 15 | 0 | 999999999999 | NumberOutOfBoundException |
| 16 | 0 | 10000000000000 | NumberOutOfBoundException |
| 17 | 1 | 10000000000000 | NumberOutOfBoundException |
| 18 | 2 | 10000000000000 | NumberOutOfBoundException |
| 19 | 1000000 | 10000000000000 | NumberOutOfBoundException |
| 20 | 999999999998 | 10000000000000 | NumberOutOfBoundException |
| 21 | 999999999999 | 10000000000000 | NumberOutOfBoundException |
| 22 | 1000000 | 1000000 | ANoLessThanBException |
| 23 | 999999999998 | 1000000 | ANoLessThanBException |
| 24 | 1 | 1 | ANoLessThanBException |
| 25 | 999999999998 | 2 | ANoLessThanBException |

## 执行测试用例

基于Maven引入JUnit5框架，主要基于`org.junit.jupiter.api.Test`和`org.junit.jupiter.api.Assertions`即可完成任务。

基本的测试思路：
- 如果是正常情况：
    ```java
    Assertions.assertDoesNotThrow(() -> {
        Assertions.assertArrayEquals(expectedArray, DigitCount.digitCount(a, b));
    });
    ```
- 如果是异常情况：
    ```java
    Assertions.assertThrows(XXXException.class, () -> DigitCount.digitCount(a, b));
    ```

正常情况可以套在一个确保非异常的Lambda表达式中执行；而异常情况则应该单测，防止一处异常全体异常。

美中不足的点是魔法数的大量引入。
