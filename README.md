# try-kotlin-logging
A demonstration of Kotlin-logging with logback.

## Usage
```
# output a log to STDOUT and file(myApp.log)
$ ./gradlew run
# => 2021-12-11 21:24:02,330 DEBUG [main] Main [Main.kt:7] Hello, Logger! Sat Dec 11 21:24:02 JST 2021

$ cat myApp.log
# => 2021-12-11 21:24:02,330 DEBUG [main] Main [Main.kt:7] Hello, Logger! Sat Dec 11 21:24:02 JST 2021

```
