mvn archetype:generate -DgroupId=test.api.bmserver -DartifactId=testServer -DarchetypeArtifactId=maven-archetype-webapp

//create war package in target folder
mvn package

//Run app using jetty runner
java jar jetty-runner-8.1.14.v20131031.jar my.war

Maven dependencies (POM.xml)
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.eclipse.jetty</groupId>
      <artifactId>jetty-server</artifactId>
      <version>9.2.3.v20140905</version>
    </dependency>

    <dependency>
      <groupId>org.eclipse.jetty</groupId>
      <artifactId>jetty-servlet</artifactId>
      <version>9.2.3.v20140905</version>
    </dependency>

    <dependency>
      <groupId>org.glassfish.jersey.core</groupId>
      <artifactId>jersey-server</artifactId>
      <version>2.7</version>
    </dependency>

    <dependency>
      <groupId>org.glassfish.jersey.containers</groupId>
      <artifactId>jersey-container-servlet-core</artifactId>
      <version>2.7</version>
    </dependency>

    <dependency>
      <groupId>org.glassfish.jersey.containers</groupId>
      <artifactId>jersey-container-jetty-http</artifactId>
      <version>2.7</version>
    </dependency>

    <dependency>
      <groupId>org.glassfish.jersey.core</groupId>
      <artifactId>jersey-server</artifactId>
      <version>2.10.1</version>
    </dependency>

    <dependency>
      <groupId>org.glassfish.jersey.core</groupId>
      <artifactId>jersey-server</artifactId>
      <version>2.10.1</version>
    </dependency>

    <dependency>
      <groupId>org.glassfish.jersey.containers</groupId>
      <artifactId>jersey-container-servlet-core</artifactId>
      <version>2.10.1</version>
    </dependency>

    <dependency>
      <groupId>org.glassfish.jersey.core</groupId>
      <artifactId>jersey-server</artifactId>
      <version>2.10.1</version>
    </dependency>