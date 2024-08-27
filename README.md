## Micronaut Embedded Server issue in Library code

Trivial library application demos an issue of being unable to create an
EmbeddedServer within the test code.   The test will run if the `io.micronaut.minimal.application`
plugin is used in the `build.gradle.kts` (and the application section is uncommented).

To see the issue just run `./gradlew clean build`

## Why is this important?
I'd like to write test code that utilizes library code running in a Micronaut server.
