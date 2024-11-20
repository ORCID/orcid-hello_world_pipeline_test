FROM maven:3.6.3-jdk-11 AS maven

WORKDIR /build

COPY pom.xml .

COPY hello-world/pom.xml hello-world/pom.xml

COPY hello-world-alt/pom.xml hello-world-alt/pom.xml

# download maven dependencies
RUN mvn -T 1C --batch-mode \
  --file "pom.xml" \
  dependency:resolve

RUN mvn -T 1C --batch-mode \
  --file "hello-world/pom.xml" \
  dependency:resolve

COPY hello-world/src hello-world/src

RUN mvn -T 1C --batch-mode \
              --file "hello-world/pom.xml" \
              package -Dmaven.test.skip


