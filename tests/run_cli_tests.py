#!/usr/bin/env python3
from __future__ import annotations

import subprocess
import sys
from pathlib import Path


def run_java(build_dir: Path, class_name: str, *args: str) -> str:
    result = subprocess.run(
        ["java", "-cp", str(build_dir), class_name, *args],
        check=True,
        capture_output=True,
        text=True,
    )
    return result.stdout


def expect(build_dir: Path, class_name: str, args: tuple[str, ...], expected: str) -> None:
    actual = run_java(build_dir, class_name, *args)
    if actual != expected:
        raise AssertionError(
            f"{class_name} {args} output mismatch\nExpected: {expected!r}\nActual:   {actual!r}"
        )


def main() -> int:
    if len(sys.argv) != 2:
        print("usage: run_cli_tests.py BUILD_DIR", file=sys.stderr)
        return 2

    build_dir = Path(sys.argv[1])
    expect(build_dir, "Assignment02Q01Sec01", ("A", "a", "C", "f"), "A\na\nC\n")
    expect(build_dir, "Assignment02Q01Sec01", ("B", "d"), "")
    expect(build_dir, "Assignment02Q01Sec02", ("A", "az", "Hi"), "65\n219\n177\n")
    expect(build_dir, "Assignment02Q01Sec03", ("1", "2", "4", "7", "9", "10"), "4\n")
    expect(build_dir, "Assignment02Q02", ("1",), "3.14 4.00\n")
    expect(build_dir, "Assignment02Q02", ("5",), "3.14 3.34\n")
    expect(
        build_dir,
        "Assignment02Q03",
        ("6",),
        "The first 6 Fibonacci numbers are:\n1 1 2 3 5 8\nThe sum is:\n20\n",
    )
    expect(
        build_dir,
        "Assignment02Q04",
        (),
        "The English ABC is:\nabcdefghijklmnopqrstuvwxyz\nNow backwards:\nzyxwvutsrqponmlkjihgfedcba",
    )
    expect(
        build_dir,
        "Assignment02Q05",
        (),
        "w b w b w b \nb w b w b w \nw b w b w b \nb w b w b w \nw b w b w b \nb w b w b w \n",
    )
    print("9 CLI checks passed")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
