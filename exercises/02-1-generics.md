# Exercise: Working with Generics

## Overview

In this exercise, you will gain experience of working with generics.

## Core Exercise

1. Define a class named `MyArrayList` that is a generic class and the type of items it works with are supplied when the variable is defined using `MyArrayList<Type>`. Your class should only store 10 items maximum in it.
2. Add methods `add(T)`, `T get(index)` and `remove(index)` to your arraylist.
3. Define a new class named `Driver` and write some code to verify your generic class above works.

## Additional Exercise (If Time Permits)

4. Modify your class above so that it implements the `Iterable<T>` interface.
5. In your main method, use the for each loop to iterate over your array list to verify the iterator implementation works.
