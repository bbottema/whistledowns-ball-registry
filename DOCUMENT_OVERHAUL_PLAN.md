# Documentation Overhaul Plan (Sessions 02–18)

Date: 19 February 2026

This document captures the plan for updating the remaining sessions (02–18) to match the Session 01 documentation style.

The audience is **test analysts who are nervous about Java**. The goal is to make each session feel safe, predictable, and runnable without a coach.

---

## Checklist (non‑negotiables)

For every session:

- **Same shape every time**: learners should recognize the page structure immediately.
- **Task-first**: quick “what you’ll get out of this”, then tiny concepts, then do the TODOs.
- **Readable + friendly**: casual, reassuring, “errors are information”, light humor allowed.
- **Testing mindset**: use test analysts’ mental models and jargon when it helps (setup / test data / observe / expected vs actual).
- **No doc sprawl**: avoid slides/duplicate instructions scattered around.
- **Clear boundaries**:
  - Session `README.md` = explanation + how to run + success criteria + troubleshooting
  - Assignment code = action surface (TODO worksheet), minimal commentary, cross-link back to README

---

## Target “doc philosophy” (what Session 01 demonstrates)

### Approach

- **Layered guidance** with a tight feedback loop:
  1) read a small concept chunk
  2) run a tiny snippet / run the program / run tests
  3) observe output or error signals
  4) adjust and rerun

- **Read → do → observe** is the default learning rhythm.

### Documentation density

- **Moderate and purposeful**:
  - enough meaning to reduce fear and confusion
  - not so much that it becomes a textbook

- Concepts are **short and runnable** (a snippet or a rule-of-thumb per concept).

### Style / voice

- Friendly, casual, non-judgy.
- Normalizes mistakes (“not a personal insult”).
- Uses test-analyst framing (“setup”, “test data”, “signals”, “observe”).

---

## The session README contract (template)

Every session `README.md` in `02-assignments/**/session-*/` will be reshaped to this structure:

1. `# Session XX – <topic>`
2. `## What you’ll get out of this` (3–5 bullets; capabilities, not abstract goals)
3. `## Concepts (quick read, then do the TODOs)`
   - 2–5 micro-sections max
   - each micro-section includes:
     - a runnable snippet **or** a tight “rule of thumb” + example
   - keep language test-analyst friendly
4. `## Start here`
   - “Open `<main file>` and follow TODO blocks in order”
5. `## How to run` (primary path)
6. `## Plan B` (one fallback path)
7. `## What “success” looks like` (observable outcomes)
8. `## Troubleshooting` (3–8 common issues + fixes)

### Guardrails (to prevent drift)

- If a concept needs more than ~15 lines without a snippet, it’s probably **coach manual** content.
- “Success” must be observable (output, files produced, tests passing), not “understand X”.
- Troubleshooting should list only the errors learners will realistically hit in that session.

---

## The assignment code contract (top-of-file guidance)

For each session’s main assignment file(s):

- Keep a **short header** that answers:
  - Where do I start?
  - How do I run this?
  - What should I do first?
- Then provide a **numbered TODO map**.
- Avoid long “lesson paragraphs” in code (the README is the place for that).
- Include a **cross-link** back to the session `README.md`.

Allowed in code comments:
- concise operational reminders (JShell copy/paste, remove `//`, run TODOs in order)
- a single reassuring line (“If this is your first time touching Java: you’re doing fine.”)

---

## Tone and jargon guide (for nervous test analysts)

Prefer:

- “setup”, “test data”, “sanity check”, “observe”, “signals”, “debug print/log”, “expected vs actual”, “fail fast”

Normalize:

- exceptions/errors as information
- “this looks scary” moments

Avoid:

- academic wording (“formally define”, “as you know”)
- long theory blocks
- burying the lead (always tell them what to do next)

---

## Phase-by-phase execution plan (because ‘how to run’ changes)

### Phase 01 — First Season (Sessions 02–05)

- Likely still JShell-heavy early on.
- Standardize:
  - JShell as primary path
  - Scratch file as fallback
- Troubleshooting should cover:
  - missing semicolons
  - how to reset JShell state (in IntelliJ JShell Console: Thrash/Bin button)
  - “cannot find symbol” (setup order)
  - `NullPointerException` (Session 02 especially)

### Phase 02 — The Ton (Sessions 06–08)

- Move toward classes/objects and running via `main(...)`.
- Standardize “How to run” around IntelliJ’s green run triangle / run configuration.

### Phase 03 — Whistledown’s Verdict (Sessions 09–10)

- Testing becomes explicit.
- “How to run” becomes **run tests, read failures, rerun**.
- Troubleshooting covers JUnit discovery, wrong folder, imports.

### Phase 04 — Season of Refinement (Sessions 11–18)

- More moving parts (maps, diagnostics, harness, structured results, CSV, parameterized cases, reports, stats).
- Strengthen:
  - “success looks like” (files generated, report output, summary counts)
  - “where to look when it fails” (the first place to check)

---

## Concrete workflow per session (repeatable loop)

For each session folder (S02 … S18):

1. **Inventory**
   - read the session `README.md`
   - identify the main assignment file(s) to point learners at
2. **Rewrite README into the template**
   - keep existing meaning, but reframe into friendly, runnable micro-chunks
   - add example snippet(s) where helpful
3. **Refit assignment code header**
   - short “how to use this file” + numbered TODO map
4. **Cross-link check**
   - README points to code file(s)
   - code header points to README
5. **Regression checks**
   - README still includes concept explanations (not just instructions)
   - “success looks like” is observable
   - troubleshooting matches likely errors
6. **Consistency check against Session 01**
   - structure and tone match

---

## Safeguards (avoid the two common failure modes)

### Failure mode A: README turns into a textbook

Safeguards:
- cap Concepts to 2–5 micro-sections
- each micro-section must connect to a TODO/snippet immediately
- move deeper narrative to `00-coach-manual/`

### Failure mode B: README becomes only run instructions

Safeguards:
- each session README must include:
  - one mental model explanation
  - one runnable snippet or concrete example
  - one “errors are information” framing (especially in early sessions)

---

## Deliverables

When complete:

- Sessions 02–18 in `02-assignments/` have updated, consistent, learner-friendly `README.md` files.
- Each session’s main assignment file(s) have updated, consistent top-of-file guidance and TODO maps.
- (Recommended) Mirror the same README changes into `01-clean-start/` so both tracks feel identical to learners.

---

## Suggested rollout order

1. **Batch 1 (fast alignment)**: Sessions 02–05
2. **Batch 2 (objects/run mode shift)**: Sessions 06–08
3. **Batch 3 (testing begins)**: Sessions 09–10
4. **Batch 4 (advanced refinement)**: Sessions 11–18

After Batch 1, re-check the template/tone with one learner (or your own “cold read”) before continuing.
