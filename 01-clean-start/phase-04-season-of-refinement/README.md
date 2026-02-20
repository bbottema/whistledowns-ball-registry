# Phase 4 – Season of Refinement (optional bonus)

Welcome to the optional expansion sessions! These sessions are completely optional but offer great fun and valuable practice with Java fundamentals and test automation patterns.

If Sessions 01–10 were enough: you are done, you got the basics down, and are ready.

If you want more reps (and more “test automation pattern” moments), these sessions keep the same rhythm:
read a tiny idea → run code → observe output → adjust → rerun.

## What you’ll get out of this

By the end of Phase 4, you will be able to:

- use small “automation patterns” in plain Java (AAA, parameterized cases, reporting)
- keep runs readable: when something fails, you can see *why*
- work with external test data (CSV) without crashing on one bad row

## Concepts (quick read)

### This phase is about signals

Phase 1–3 were mostly about getting code to run.
Phase 4 is about making runs **useful**: better diagnostics, more structure, and clearer output.

If you’ve ever stared at a failing automated test and thought “okay, but *why*?”, this is that skill.

## Start here

Start with **Session 11** and go in order.

Each session folder has its own `README.md`.
Open the session’s `SXX_Assignment.java` and follow the TODO blocks.

## How to run

Exactly like the earlier sessions:

1. Open the session’s `SXX_Assignment.java`.
2. Uncomment the TODO blocks in order.
3. Click the green ▶ next to `main(...)`.

## Plan B

If the green ▶ is hiding:

1. Right-click inside the session’s `SXX_Assignment.java`
2. Choose **Run 'SXX_Assignment.main()'**

## What “success” looks like

- You can pick any session (11–18), run it, and get the “expected style” of output described in that session’s README.
- When output is wrong, you can usually point to the exact rule/check that produced the line.

## Troubleshooting

### I’m tired

- Stop here. Phase 4 is optional.
- “I stopped because I was tired” is a correct engineering decision.

### A session mentions imports (Map/List/ArrayList)

- If IntelliJ shows `Map`/`List` in red, add the import at the top of the file.
- The session README will tell you the exact import line.

### A file can’t be found (Session 15)

- That’s a working-directory issue, not a “you did it wrong” issue.
- Session 15’s troubleshooting section shows how to set the IntelliJ Working directory.
