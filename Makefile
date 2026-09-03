BUILD_DIR ?= build
SOURCES := $(wildcard src/*.java)

.PHONY: all test clean

all:
	mkdir -p $(BUILD_DIR)
	javac -Xlint:all -Werror -d $(BUILD_DIR) $(SOURCES)

test: all
	python3 tests/run_cli_tests.py $(BUILD_DIR)

clean:
	rm -rf $(BUILD_DIR)
