
# `=` vs `==`

These two look similar, but they mean very different things in Java.

## `=` means “store a value” (assignment)

Use `=` when you are *giving a variable a value*.

```java
int age = 21;
String status = "OK";
boolean invited = true;
```

Read `int age = 21;` as:

> Create a variable named `age` and put the number `21` into it.

Later you can assign a new value:

```java
age = 22;
```

## `==` means “are these equal?” (comparison)

Use `==` inside an expression that produces `true` or `false`.

```java
int a = 2;
int b = 3;
System.out.println(a == b); // prints false
```

### Common beginner mistake

Trying to use `=` inside `if (...)`:

```java
// WRONG (does not mean “compare”)
// if (age = 21) { ... }
```

Java will usually reject this with a compile error (which is good!).

## Important note about Strings

For `String`, `==` is usually **not** what you want.

If you mean “same text”, use:

```java
expected.equals(actual)
```

That topic is explained in: `equals vs == vs !=.md`.
