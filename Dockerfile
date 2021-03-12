FROM openjdk:8
COPY ./target/Calculator_1.8-1.0-SNAPSHOT.jar ./
COPY ./input.txt ./
WORKDIR ./
CMD java -cp Calculator_1.8-1.0-SNAPSHOT.jar Main < ./input.txt
#CMD ["java", "-cp", "Calculator_1.8-1.0-SNAPSHOT.jar", "Main" ,"<","./input.txt"]
