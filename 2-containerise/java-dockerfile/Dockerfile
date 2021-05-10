FROM adoptopenjdk/openjdk11:ubi
COPY . .
RUN javac App.java FizzBuzz.java
RUN ls -la
RUN java App
CMD ["java", "App"]
