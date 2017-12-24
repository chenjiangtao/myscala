import sbt.Path

name := "myscala"

version := "0.1"

scalaVersion := "2.12.4"

exportJars := true

resolvers += "Local Maven Repository" at "file://"+ Path.userHome.absolutePath+"/.m2/repository"
//resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
//这个是ping++的，不能少
resolvers += "Local Maven Repository" at "file://"+ Path.userHome.absolutePath+"/.m2/repository"

libraryDependencies ++= Seq(
  ("mysql"%"mysql-connector-java"%"5.1.42"),
  ("org.mybatis.spring.boot"%"mybatis-spring-boot-starter"%"1.3.0"),
  ("org.springframework.boot"%"spring-boot-starter-web"%"1.5.4.RELEASE")
    .exclude("org.springframework.boot","spring-boot-starter-tomcat")
    .exclude( "com.fasterxml.jackson.core","jackson-databind"),
  ("org.springframework.boot"%"spring-boot-starter-undertow"%"1.5.4.RELEASE"),
  ("org.springframework.boot"%"spring-boot-starter-aop"%"1.5.4.RELEASE"),
  ("com.typesafe.play" % "play-json_2.11" % "2.5.15"),
  ("com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.8.8"),
  ("com.foxinmy" % "weixin4j-mp" % "1.7.6"),
  ("com.typesafe.scala-logging" % "scala-logging_2.11" % "3.1.0"),
  ("ch.qos.logback" % "logback-classic" % "1.1.7"),
  ("net.logstash.logback" % "logstash-logback-encoder" % "4.11"),
  ("org.apache.commons" % "commons-io" % "1.3.2"),
  ("com.google.code.gson" % "gson" % "2.8.1"),
  ("commons-codec" % "commons-codec" % "1.10"),
  ("Pingplusplus"%"pingpp-java"%"2.2.4"),
  ("org.scala-lang.modules"%%"scala-xml"%"1.0.6"),
  ("org.json" % "json" % "20170516"),
  ("org.apache.httpcomponents" % "httpclient" % "4.5.3"),
  ("commons-codec" % "commons-codec" % "1.10"),
  ("net.coobird"%"thumbnailator"%"0.4.8"),
  ("org.apache.poi" % "poi" % "3.17")
)


javacOptions ++= Seq("-encoding", "UTF-8")
scalacOptions ++= Seq("-encoding", "UTF-8")
scalacOptions ++= Seq("-feature", "-language:_")
scalacOptions ++= Seq("-Xlint", "-unchecked")
scalacOptions ++= Seq("-deprecation")
scalacOptions += "-Ylog-classpath"