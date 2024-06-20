# Streams - Exploring Collectors

__Objective__: To understand and apply various collectors provided by the `Collectors` utility class in Java Streams API.


### 1. Collecting to a List

1. Create a list of names: "John", "Emma", "Michael".
1. Use the `collect()` method with `Collectors.toList()` to collect the stream of names into a list.
1. Print the collected list.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("John", "Emma", "Michael");
    List<String> collectedList = names.stream().collect(Collectors.toList());
    System.out.println(collectedList); // [John, Emma, Michael]
  }
}
```
</details>


### 2. Collecting to a Set

1. Create a list of names with duplicates: "Sophia", "Emma", "Sophia", "Olivia", "Emma".
1. Use the `collect()` method with `Collectors.toSet()` to collect the stream of names into a set.
1. Print the collected set.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Sophia", "Emma", "Sophia", "Olivia");
    Set<String> collectedSet = names.stream().collect(Collectors.toSet());
    System.out.println(collectedSet); // [Sophia, Emma, Olivia]
  }
}
```
</details>


### 3. Collecting to a Map

1. Create a list of names: "Alex", "Brian", "Charles".
1. Use the `collect()` method with `Collectors.toMap()` to collect the stream of names into a map where the keys are the names and the values are the lengths of the names.
1. Print the collected map.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Alex", "Brian", "Charles");
    Map<String, Integer> nameLengthMap = names.stream()
        .collect(Collectors.toMap(name -> name, name -> name.length()));
    System.out.println(nameLengthMap); // {Alex=4, Brian=5, Charles=7}
  }
}
```
</details>


### 4. Grouping Elements

1. Create a list of names: "Anna", "Ben", "Clara", "David", "Eve".
1. Use the `collect()` method with `Collectors.groupingBy()` to group the names by their lengths.
1. Print the grouped map.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Anna", "Ben", "Clara", "David", "Eve");
    Map<Integer, List<String>> groupedByLength = names.stream()
        .collect(Collectors.groupingBy(String::length));
    System.out.println(groupedByLength); // {3=[Ben, Eve], 4=[Anna], 5=[Clara, David]}
  }
}
```
</details>


### 5. Partitioning Elements

1. Create a list of names: "Olivia", "Liam", "Emma", "Noah".
1. Use the `collect()` method with `Collectors.partitioningBy()` to partition the names based on whether their lengths are greater than 3.
1. Print the partitioned map.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Olivia", "Liam", "Emma", "Noah");
    Map<Boolean, List<String>> partitioned = names.stream()
        .collect(Collectors.partitioningBy(name -> name.length() > 3));
    System.out.println(partitioned); // {false=[Liam, Emma], true=[Olivia, Noah]}
  }
}
```
</details>


### 6. Counting Elements

1. Create a list of names: "Ava", "Ethan", "Sophia".
1. Use the `collect()` method with `Collectors.counting()` to count the number of names in the list.
1. Print the count.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Ava", "Ethan", "Sophia");
    Long count = names.stream().collect(Collectors.counting());
    System.out.println(count); // 3
  }
}
```
</details>


### 7. Summarizing Statistics

1. Create a list of names: "John", "Alice", "Robert".
1. Use the `collect()` method with `Collectors.summarizingInt()` to summarize the lengths of the names.
1. Print the summary statistics.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("John", "Alice", "Robert");
    IntSummaryStatistics stats = names.stream()
        .collect(Collectors.summarizingInt(String::length));
    System.out.println(stats);
    // IntSummaryStatistics{count=3, sum=15, min=4, average=5.000000, max=6}
  }
}
```
</details>


### 8. Joining Strings

1. Create a list of names: "Anna", "Elsa", "Olaf".
1. Use the `collect()` method with `Collectors.joining(", ")` to join the names into a single string with commas separating each name.
1. Print the joined string.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Anna", "Elsa", "Olaf");
    String joined = names.stream().collect(Collectors.joining(", "));
    System.out.println(joined); // Anna, Elsa, Olaf
  }
}
```
</details>
