FROM maven:3.6.3-jdk-11 AS maven

WORKDIR /build

# copy only poms for max cachability of just dependency downloads
COPY pom.xml .

# download maven dependencies
RUN mvn -T 1C --batch-mode \
  -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer.Slf4jMavenTransferListener=warn \
  --file "pom.xml" \
  dependency:resolve

COPY ./src ./src

RUN mvn -T 1C --batch-mode \
              -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer.Slf4jMavenTransferListener=warn \
              --file "pom.xml" \
              package -Dmaven.test.skip


