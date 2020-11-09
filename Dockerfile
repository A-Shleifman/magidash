FROM adoptopenjdk/openjdk11:jdk-11.0.9_11-alpine

WORKDIR /app

ADD https://raw.githubusercontent.com/eficode/wait-for/master/wait-for ./

RUN chmod +x ./wait-for

COPY . .

RUN ./gradlew build

CMD ./wait-for mysql-db:3306 -- java -jar build/libs/*.jar