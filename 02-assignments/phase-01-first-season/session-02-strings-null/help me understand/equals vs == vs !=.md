
# `.equals(...)` vs `==` vs `!=` (Strings + null)

Java has *two different kinds of “equality”*:

1. “Do these two variables refer to the same object?” (`==`)
2. “Do these values have the same contents?” (`.equals(...)`)

For numbers (`int`) those often feel the same.
For Strings, they often don’t.

## The beginner rule (for this course)

- If you are comparing **text** (`String`): use **`.equals(...)`**.
- If you are checking for **missing value**: use **`== null`** or **`!= null`**.

## `==` with Strings: what it really asks

With Strings, `a == b` asks:

> “Are these the exact same String object in memory?”

Two different String objects can contain the same letters.
So `==` can be `false` even when both look like `"Penelope loves reading"`.

## `.equals(...)` with Strings: what you usually meant

`a.equals(b)` asks:

> “Do these two Strings have the same characters?”

Example:

```java
String expected = "OK";
String actual = "OK";
System.out.println(expected.equals(actual)); // true
```

## What about `!=`?

`!=` is just “not equal”.

- `x != null` means “x is not missing”.
- `a != b` means “a and b are not the same thing (identity)”.

In beginner Java, you will often use `!= null` before calling methods.

## Null safety: avoiding `NullPointerException`

If `actual` is `null`, this crashes:

```java
// DANGEROUS if actual is null
actual.equals("OK")
```

Because you are trying to call a method on `null`.

### Safe pattern #1 (recommended here)

Put the known non-null value on the left:

```java
"OK".equals(actual)
```

If `actual` is `null`, the result is just `false` (no crash).

### Safe pattern #2 (also fine)

Check for null first:

```java
actual != null && actual.equals("OK")
```

This works because Java evaluates left-to-right, and stops early:

- if `actual != null` is `false`, it never runs `actual.equals(...)`.

## Summary

- `=` assigns (stores a value in a variable)
- `==` compares identity (and works as value-compare for primitives like `int`)
- `.equals(...)` compares content (use this for String text)
- `!= null` is your “do I have a value?” check
