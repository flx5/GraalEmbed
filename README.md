Call an embedded GraalVM from another JVM.
Might be useful for environments like Android where not all Java classes are available.

=== RUN ==

- ./gradlew app:sharedLibrary
- LD_LIBRARY_PATH=$(pwd)/app/build/graal/ ./gradlew client:run