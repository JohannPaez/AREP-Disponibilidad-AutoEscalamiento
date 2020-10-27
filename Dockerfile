FROM openjdk:8
WORKDIR /application/bin
COPY /target/classes /application/bin/classes
COPY /target/dependency /application/bin/dependency
CMD ["java","-cp","./classes:./dependency/*","com.arep.App"]