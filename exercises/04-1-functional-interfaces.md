# Functional Interfaces

__Objective__: To create and use a custom Functional Interface

### Step-by-Step Exercise

Follow these steps:

<style>
details {
  margin: 2em;
}
</style>

1. Define a functional interface `IntFunction` with a method `apply(Integer i)` which returns an `Integer`.

<details>
<summary>Reveal Solution</summary>

We'll place this in a file called "IntFunction.java":

```java
@FunctionalInterface
public interface IntFunction {
  Integer apply(Integer i);
}
```
</details>

2. Create a class `Driver` with a `main` method.

<details>
<summary>Reveal Solution</summary>

We'll place this in a file called "Driver.java":

```java
public class Driver {
  public static void main(String[] args) {

  }
}
```
</details>

3. In the `main` method, create a variable of the interface type, called `doubleIt`.

<details>
<summary>Reveal Solution</summary>

```java
public class Driver {
  public static void main(String[] args) {
    IntFunction doubleIt;
  }
}
```
</details>

4. Now implement the interface using an anonymous class, and assign that to `doubleIt`. The method should double its parameter and return it.

<details>
<summary>Reveal Solution</summary>

```java
public class Driver {
  public static void main(String[] args) {
    IntFunction doubleIt = new IntFunction() {
      @Override
      public Integer apply(Integer i) {
        return i * 2;
      }
    };
  }
}
```
</details>

5. Print out the result of calling the method with an integer of your choice.

<details>
<summary>Reveal Solution</summary>

```java
public class Driver {
  public static void main(String[] args) {
    IntFunction doubleIt = new IntFunction() {
      @Override
      public Integer apply(Integer i) {
        return i * 2;
      }
    };
    System.out.println(doubleIt.apply(3));
  }
}
```
</details>

## Complete code

IntFunction.java:

```java
@FunctionalInterface
public interface IntFunction {
  Integer apply(Integer i);
}
```

Driver.java:

```java
public class Driver {
  public static void main(String[] args) {
    IntFunction doubleIt = new IntFunction() {
      @Override
      public Integer apply(Integer i) {
        return i * 2;
      }
    };
    System.out.println(doubleIt.apply(3));
  }
}
```

