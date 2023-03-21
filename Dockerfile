FROM openjdk:17
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN ["javac", "DaemonThreadPrintPattern.java"]
CMD ["java", "DaemonThreadPrintPattern"]
