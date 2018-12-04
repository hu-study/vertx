# vertx

�ղ���һЩ����ѧϰVertx��һЩСdemo�������˵�����Բο���<a href="https://blog.csdn.net/king_kgh/article/details/80772657">https://blog.csdn.net/king_kgh/article/details/80772657</a>

## Ŀ¼˵��

* com.stu.vertx.core.httpserver

���������ʹ��Vertx������һ���������HttpServer��ֱ�����м��ɡ�ͨ����������� http://localhost:8888/ ����

* com.stu.vertx.web.route

�������·����ز�����չʾ����������·��ƥ�䣬���󷽷����ƣ�REST���ʵ�֣�����·�ɵȹ���

* com.stu.vertx.core.timer

�������Ҫ��ʾ��ʱ��صĲ�����������ʱִ��һЩ��������ÿ��һ��ʱ��ִ��һЩ������

* com.stu.vertx.core.eventbus

ʹ����Ϣ����ʵ�ֻ����ķ���������ģ��

* com.stu.vertx.cluster.service

����ģ��һ��������΢����ļܹ���ÿ��Verticle������Ϊ�����Ĳ���Ԫ�������ụ�෢�֣�ͨ��EventBus����ͨ��

FirstVerticle�Ƿ�����ṩ�ߣ��ṩһ��sayHello������ÿһ��������Verticle��Ӧ�þ߱������࣬һ��������������Verticle���������FirstVerticle����Ҫһ�����Ⱪ¶�Ľӿڣ��������Service������Ҫһ���ӿڵ�ʵ���࣬�������ServiceImpl��

ListenerVerticle���������������Ȼ��ͨ��EventBus���÷��񣬲���Ӧ���ݡ�

* com.stu.vertx.jdbc

������Ҫ��ʾ����vertx����jdbc���������ݿ⡣��ΪVertx���첽��ܣ����ѡ��ʹ��Vertx�Ͳ���ʹ��������Mybatis��Hibernate������Ŀ�ԴORM��ܣ���Ϊ������ͬ���ģ������ᵼ��Vertx������������Ӱ��Vertx�����ܡ�

* com.stu.core.cache

Vertx�ṩ�˶Ի����֧�֣�����ʹ�õ����Ĺ�����������������ָ�����档

## ��������

* ServiceVertxEBProxy ������Ҳ���������������ʾ����

�������ͨ��Vertx��CodeGenerate���ɵĴ����࣬��Ҫʹ��mvn install�������������ɹ��������ɴ��ࡣ���ִ����mvn install֮����Ȼû�У����԰����²�����飺

1.��pom.xml�н������ã����£�

```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-compiler-plugin</artifactId>
	<version>3.1</version>
	<configuration>
		<source>1.8</source>
		<target>1.8</target>
		<encoding>UTF-8</encoding>
		<annotationProcessors>
			<annotationProcessor>io.vertx.codegen.CodeGenProcessor</annotationProcessor>
		</annotationProcessors>
		<generatedSourcesDirectory>
			${project.basedir}/src/main/generated
		</generatedSourcesDirectory>
		<compilerArgs>
			<arg>-AoutputDirectory=${project.basedir}/src/main</arg>
		</compilerArgs>
	</configuration>
</plugin>
```

�������õ�·���� src/main/generated�£����ʹ��eclipse�����Խ����·�����õ�classpath�¡�

2.���Service�ӿ��Ƿ�ʹ��ע��

```java
@ProxyGen
@VertxGen
```

3. ���package-info.java�Ƿ���ȷ

```java
@ModuleGen(groupPackage = "com.stu.vertx.cluster.service.hello", name = "FirstVerticle")
package com.stu.vertx.cluster.service.hello;

import io.vertx.codegen.annotations.ModuleGen;
```




