FROM openjdk:11
COPY src/main/kotlin/ /tmp
WORKDIR /tmp
CMD java com.delta.security