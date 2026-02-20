# `if/else` for testers (Session 03)

Session 03 is about turning a rule you would normally say out loud into runnable code.

Example tester rule:

> If age is 18 or more, then “Eligible”, else “Not eligible”.

## The mental model

An `if/else` is a **fork in the road**. Only one side runs.

```java
if (condition) {
    // runs when condition is true
} else {
    // runs when condition is false
}
```

- `condition` must be something that evaluates to `true` or `false`
- parentheses `(...)` hold the condition
- curly braces `{ ... }` hold the code for that branch

## A concrete example (the one used in the TODO)

```java
int age = 17;
if (age >= 18) {
    System.out.println("Eligible");
} else {
    System.out.println("Not eligible");
}
```

Read it like:

- Is `age >= 18` true?
  - yes → print `Eligible`
  - no  → print `Not eligible`

## What usually goes wrong (and how to fix it)

### 1) Missing braces

This is the most common beginner failure.

Fix: make sure every `{` has a matching `}`.

### 2) Confusing `=` with `==`

Inside `if (...)` you are *comparing*, not assigning.

- assignment: `age = 18;`
- comparison: `age == 18`

(And for Strings, use `.equals(...)` — covered in Session 02 explainers.)

### 3) You don’t know what the condition actually is

Print it:

```java
System.out.println(age >= 18);
```

That prints `true` or `false` so you can see what path should run.
