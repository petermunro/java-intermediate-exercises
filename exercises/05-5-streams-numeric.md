# Streams - Understanding Numeric Streams

__Objective__: To understand and apply numeric streams in Java for more efficient stream processing of primitive data types.


1. **Creating Numeric Streams from Range**
   - Create an `IntStream` using `IntStream.range(1, 6)`.
   - Print each element in the stream.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.stream.IntStream;

public class NumericStreamsExample {
  public static void main(String[] args) {
    IntStream range = IntStream.range(1, 6);
    range.forEach(System.out::println); // 1, 2, 3, 4, 5
  }
}
```
</details>

2. **Creating Numeric Streams from Array**
   - Create an array of integers: `{2, 4, 6, 8, 10}`.
   - Create an `IntStream` from the array using `Arrays.stream()`.
   - Print each element in the stream.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.stream.IntStream;

public class NumericStreamsExample {
  public static void main(String[] args) {
    int[] numbers = {2, 4, 6, 8, 10};
    IntStream stream = Arrays.stream(numbers);
    stream.forEach(System.out::println); // 2, 4, 6, 8, 10
  }
}
```
</details>

3. **Creating Numeric Streams from Random Values**
   - Create a `DoubleStream` of 5 random double values using `new Random().doubles(5)`.
   - Print each random value in the stream.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Random;
import java.util.stream.DoubleStream;

public class NumericStreamsExample {
  public static void main(String[] args) {
    DoubleStream randoms = new Random().doubles(5);
    randoms.forEach(System.out::println); // 5 random double values
  }
}
```
</details>

4. **Transforming Object Streams to Numeric Streams**
   - Create a list of strings: `{"apple", "banana", "cherry"}`.
   - Use `mapToInt()` to transform the stream of strings into an `IntStream` of their lengths.
   - Print each length in the stream.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {
  public static void main(String[] args) {
    List<String> fruits = Arrays.asList("apple", "banana", "cherry");
    IntStream lengths = fruits.stream().mapToInt(String::length);
    lengths.forEach(System.out::println); // 5, 6, 6
  }
}
```
</details>

5. **Numeric Stream Operations: `sum()`**
   - Create an `IntStream` of the numbers `3, 5, 7, 9`.
   - Use the `sum()` method to calculate the sum of the numbers.
   - Print the sum.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.stream.IntStream;

public class NumericStreamsExample {
  public static void main(String[] args) {
    IntStream numbers = IntStream.of(3, 5, 7, 9);
    int sum = numbers.sum();
    System.out.println(sum); // 24
  }
}
```
</details>

6. **Numeric Stream Operations: `average()`**
   - Create a `DoubleStream` of the numbers `1.5, 2.5, 3.5, 4.5`.
   - Use the `average()` method to calculate the average of the numbers.
   - Print the average if present.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class NumericStreamsExample {
  public static void main(String[] args) {
    DoubleStream numbers = DoubleStream.of(1.5, 2.5, 3.5, 4.5);
    OptionalDouble average = numbers.average();
    average.ifPresent(System.out::println); // 3.0
  }
}
```
</details>

7. **Range Operations: `rangeClosed()`**
   - Create an `IntStream` using `IntStream.rangeClosed(1, 5)`.
   - Print each element in the stream.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.stream.IntStream;

public class NumericStreamsExample {
  public static void main(String[] args) {
    IntStream rangeClosed = IntStream.rangeClosed(1, 5);
    rangeClosed.forEach(System.out::println); // 1, 2, 3, 4, 5
  }
}
```
</details>

8. **Summary Statistics**
   - Create an `IntStream` of the numbers `4, 8, 15, 16, 23, 42`.
   - Use the `summaryStatistics()` method to gather summary statistics.
   - Print the summary statistics.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class NumericStreamsExample {
  public static void main(String[] args) {
    IntStream numbers = IntStream.of(4, 8, 15, 16, 23, 42);
    IntSummaryStatistics stats = numbers.summaryStatistics();
    System.out.println(stats);
    // IntSummaryStatistics{count=6, sum=108, min=4, average=18.000000, max=42}
  }
}
```
</details>

9. **Generating Infinite Streams: `generate()`**
   - Use `IntStream.generate()` to create an infinite stream that generates the number `2`.
   - Limit the stream to 5 elements and print each element.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.stream.IntStream;

public class NumericStreamsExample {
  public static void main(String[] args) {
    IntStream.generate(() -> 2).limit(5).forEach(System.out::println); // 2, 2, 2, 2, 2
  }
}
```
</details>

10. **Generating Infinite Streams: `iterate()`**
    - Use `IntStream.iterate()` to create an infinite stream starting from 0 and incrementing by 3.
    - Limit the stream to 5 elements and print each element.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.stream.IntStream;

public class NumericStreamsExample {
  public static void main(String[] args) {
    IntStream.iterate(0, n -> n + 3).limit(5).forEach(System.out::println); // 0, 3, 6, 9, 12
  }
}
```
</details>
