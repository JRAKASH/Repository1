FROM openjdk:17
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN ["javac", "PatternDaemonTest.java"]
CMD ["java", "PatternDaemonTest"]
