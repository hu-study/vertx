# vertx

�ղ���һЩ����ѧϰVertx��һЩСdemo�������˵�����Բο���<a href="https://blog.csdn.net/king_kgh/article/details/80772657">https://blog.csdn.net/king_kgh/article/details/80772657</a>

## Ŀ¼˵��

* com.stu.vertx.hello

���������ʹ��Vertx������һ���������HttpServer��ֱ�����м��ɡ�ͨ����������� http://localhost:8888/ ����

* com.stu.vertx.route

�������·����ز�����չʾ����������·��ƥ�䣬���󷽷����ƣ�REST���ʵ�֣�����·�ɵȹ���

* com.stu.vertx.timer

�������Ҫ��ʾ��ʱ��صĲ�����������ʱִ��һЩ��������ÿ��һ��ʱ��ִ��һЩ������

* com.stu.vertx.eventbus

ʹ����Ϣ����ʵ�ֻ����ķ���������ģ��

* com.stu.vertx.cluster.service

����ģ��һ��������΢����ļܹ���ÿ��Verticle������Ϊ�����Ĳ���Ԫ�������ụ�෢�֣�ͨ��EventBus����ͨ��

FirstVerticle�Ƿ�����ṩ�ߣ��ṩһ��sayHello����

ListenerVerticle���������������Ȼ��ͨ��EventBus���÷��񣬲���Ӧ����

## ��������

* ServiceVertxEBProxy ������Ҳ���������������ʾ����

�������ͨ��Vertx��CodeGenerate���ɵĴ����࣬��pom.xml�н������ã����£�

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

�������õ�·���� src/main/generated��


