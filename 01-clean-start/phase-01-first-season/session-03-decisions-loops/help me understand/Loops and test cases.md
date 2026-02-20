# Loops and test cases (Session 03)

Loops are how you run the **same check** for **many inputs** (test cases) without copy/pasting.

If you’re a tester, you already do this mentally:

- test age 16
- test age 18
- test age 21

A loop turns that into a small test run.

## The mental model

A loop is:

> “For each input in this set of test cases, run the same check and print the result.”

In Session 03 we use a *for-each* loop.

## Array loop (numbers)

```java
int[] ages = { 16, 17, 18, 21 };
for (int a : ages) {
    System.out.println(a + " -> " + (a >= 18));
}
```

How to read it:

- `ages` is the list of test inputs
- `a` is the current test input
- `(a >= 18)` produces `true` or `false`
- the printed line is a mini report: `input -> actual`

## List loop (strings)

```java
List<String> families = List.of("Bridgerton", "", "Featherington");
for (String f : families) {
    boolean respectable = f != null && !f.isBlank();
    System.out.println("\"" + f + "\" -> " + respectable);
}
```

This is the same idea as the ages loop, just with text inputs.

## What usually goes wrong

### 1) Loop syntax errors

A for-each loop has this shape:

```java
for (TYPE name : container) {
    // ...
}
```

Common mistakes:
- forgetting the colon `:`
- forgetting braces `{}`

### 2) The output is hard to read

Make output more test-report-like:

- print the input
- print the result

That’s exactly why the TODO prints `a + " -> " + ...`.

### 3) You see “cannot find symbol: List”

You need the import:

```java
import java.util.List;
```
