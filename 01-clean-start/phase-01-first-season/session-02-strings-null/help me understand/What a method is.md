
# What a method is (absolute beginner)

If the word **method** makes your brain go blank, you are not alone.

For this course, you can think of a method as:

> A named action you can ask a thing to do.

In Java, many values (like Strings) come with built-in actions.

## The shape of a method call

Most method calls look like this:

```java
thing.doSomething()
```

That has three parts:

1. `thing` — the value you already have (a variable)
2. `.` — the dot operator (you can read it as “ask it to…”) 
3. `doSomething()` — the method name + parentheses

Sometimes you pass extra information into the method. These are called **arguments**:

```java
msg.contains("OK")
```

Here, `"OK"` is an argument.

## Real examples you’ve already seen

### Printing

```java
System.out.println("Hello")
```

This means: call the `println(...)` method to print something.

You don’t need to understand `System.out` yet. Treat that whole part as: “Java’s print line thing”.

### String actions

If you have:

```java
String msg = "Status: OK";
```

Then you can ask the String to do things:

```java
msg.contains("OK")
msg.startsWith("Status")
msg.toLowerCase()
"  spaced  ".trim()
```

Read them like sentences:

- “Does `msg` contain `OK`?”
- “Does `msg` start with `Status`?”
- “Give me a lower-case version of `msg`.”
- “Give me a trimmed version of this text.”

## Does a method change the original value?

Some methods **return a new value**.

Strings are a common example: many String methods return a new String.

```java
String lower = msg.toLowerCase();
```

That does *not* rewrite `msg`. It creates a new String and stores it in `lower`.

When you’re unsure: print both.

```java
System.out.println(msg);
System.out.println(lower);
```

## Mini-checklist when you see a method

1. What is the thing on the left of the dot? (example: `msg`)
2. What is the method name? (example: `contains`)
3. What arguments are inside the parentheses? (example: `"OK"`)
4. What does it produce? (print it!)

If you can answer those four questions, you understand enough to keep going.
