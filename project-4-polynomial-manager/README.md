# Project 4 — Polynomial Manager

A Java project from my Data Structures course focused on managing polynomials using custom doubly linked lists.

## Overview

The program stores named polynomials with terms containing a coefficient and exponents for `x`, `y`, and `z`.

Users can manage polynomials through four commands:

- `INSERT` — Add a new polynomial
- `DELETE` — Remove an existing polynomial
- `SEARCH` — Find and display a polynomial
- `QUIT` — Exit the program

## Classes

- **`Term`** — Represents an individual polynomial term.
- **`DLList`** — Custom doubly linked list implementation.
- **`Polynomial`** — Represents a named polynomial and its terms.
- **`PolyList`** — Stores and manages multiple polynomials.
- **`Project4`** — Main class that handles user input and runs the program.

## Example

```text
INSERT A 3,2,0,0 5,1,1,0-8,0,2,0 12,0,0,0
