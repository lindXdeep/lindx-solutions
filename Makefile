SHELL:=/bin/bash -O globstar  			#You need to tell make to use bash, not sh.

.DEFAULT_GOAL := compile-run

compile:
	javac -sourcepath src -d out/ src/**/*.java

run:
	java -cp out/ App 

compile-run: compile run
