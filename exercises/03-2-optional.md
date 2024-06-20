# Using the Optional Type

__Objective__: To understand and apply the `Optional` type in Java to handle potential `null` values gracefully, particularly when dealing with methods that may return random values.

### Step-by-Step Exercise

Follow these steps:


1. **Creating an Optional**
   - Create an `Optional` object containing the string "Hello".
   - Print the value of the `Optional`.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Optional;

public class OptionalExample {
  public static void main(String[] args) {
    Optional<String> optional = Optional.of("Hello");
    System.out.println(optional.get()); // Hello
  }
}
```
</details>



2. **Creating a Method that Returns Random Values**
   - Below is a method `getRandomValue()` that returns an `Optional<Integer>`. It returns an empty `Optional` 50% of the time and a random integer between 1 and 100 the other 50% of the time.
   - Print the value of the `Optional` if present, or print "No value present" otherwise.

```java
  public static Optional<Integer> getRandomValue() {
    Random random = new Random();
    if (random.nextBoolean()) {
      return Optional.of(random.nextInt(100) + 1);
    } else {
      return Optional.empty();
    }
  }
```


<details>
<summary>Reveal Solution</summary>

```java
import java.util.Optional;
import java.util.Random;

public class OptionalExample {
  public static void main(String[] args) {
    Optional<Integer> optional = getRandomValue();
    if (optional.isPresent()) {
      System.out.println("Random Value: " + optional.get());
    } else {
      System.out.println("No value present");
    }
  }

  public static Optional<Integer> getRandomValue() {
    Random random = new Random();
    if (random.nextBoolean()) {
      return Optional.of(random.nextInt(100) + 1);
    } else {
      return Optional.empty();
    }
  }
}
```
</details>

3. **Using `orElse()` with Random Values**
   - Modify the `getRandomValue()` method from the previous step to return an `Optional<String>` containing either a random string or an empty `Optional`.
   - Use the `orElse()` method to provide a default value if the `Optional` is empty.
   - Print the value of the `Optional`.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Optional;
import java.util.Random;

public class OptionalExample {
  public static void main(String[] args) {
    Optional<String> optional = getRandomString();
    String value = optional.orElse("Default String");
    System.out.println("Value: " + value);
  }

  public static Optional<String> getRandomString() {
    Random random = new Random();
    if (random.nextBoolean()) {
      return Optional.of("Random String " + (random.nextInt(100) + 1));
    } else {
      return Optional.empty();
    }
  }
}
```
</details>

