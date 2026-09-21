# Software 1 - Homework 2

A 2018 CS BSc Java assignment submission containing seven small command-line programs for early Java fundamentals: character codes, numeric loops, formatted output, Fibonacci numbers, alphabet printing, and grid construction.

## Behavior

- `Assignment02Q01Sec01`: prints input characters whose ASCII code is odd, one per line.
- `Assignment02Q01Sec02`: prints the ASCII-code sum for each input string.
- `Assignment02Q01Sec03`: counts integer arguments whose value modulo 3 equals 1.
- `Assignment02Q02`: approximates pi with the requested number of Gregory-Leibniz terms and prints both Java's `Math.PI` and the approximation to two decimals.
- `Assignment02Q03`: prints the first `n` Fibonacci numbers, starting with `1 1`, and their sum.
- `Assignment02Q04`: prints the English alphabet forward and backward.
- `Assignment02Q05`: prints a fixed 6x6 `w`/`b` checkerboard.

## Build

```bash
make
```

This compiles the Java sources into `build/` using `javac -Xlint:all -Werror`.

## Usage

```bash
java -cp build Assignment02Q03 6
```

The command prints:

```text
The first 6 Fibonacci numbers are:
1 1 2 3 5 8
The sum is:
20
```

## Testing

```bash
make test
```

The regression tests cover all seven command-line programs.

## Repository Structure

- `src/`: my Java implementations, maintained for current toolchains
- `tests/run_cli_tests.py`: maintained command-line regression tests
