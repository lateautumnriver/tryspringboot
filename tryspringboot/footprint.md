# footprint

* [Springboot](https://spring.io/guides/gs/spring-boot/) はSpringbootのスタートガイド
* [アプリケーションイニシアライザ](https://start.spring.io/) は最初のアプリケーション構築までのパッケージを作成するのに便利。

ビルドして実行

```
./gradlew build
BUILD SUCCESSFUL in 1s
5 actionable tasks: 5 up-to-date

java -jar build/libs/tryspringboot-0.0.1-SNAPSHOT.jar

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.4.RELEASE)

2018-08-18 14:54:30.353  INFO 9681 --- [           main] j.l.t.TryspringbootApplication           : Starting TryspringbootApplication on inno.gdt.local with PID 9681 (/Users/satoshi/work/rainyspring/tryspring/tryspringboot/build/libs/tryspringboot-0.0.1-SNAPSHOT.jar started by satoshi in /Users/satoshi/work/rainyspring/tryspring/tryspringboot)
2018-08-18 14:54:30.358  INFO 9681 --- [           main] j.l.t.TryspringbootApplication           : No active profile set, falling back to default profiles: default
2018-08-18 14:54:30.410  INFO 9681 --- [           main] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@3339ad8e: startup date [Sat Aug 18 14:54:30 JST 2018]; root of context hierarchy
2018-08-18 14:54:31.784  INFO 9681 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2018-08-18 14:54:31.820  INFO 9681 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2018-08-18 14:54:31.821  INFO 9681 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.32
2018-08-18 14:54:31.836  INFO 9681 --- [ost-startStop-1] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [/Users/satoshi/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.]
2018-08-18 14:54:31.929  INFO 9681 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2018-08-18 14:54:31.930  INFO 9681 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1523 ms
2018-08-18 14:54:32.020  INFO 9681 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Servlet dispatcherServlet mapped to [/]
2018-08-18 14:54:32.024  INFO 9681 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2018-08-18 14:54:32.024  INFO 9681 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2018-08-18 14:54:32.025  INFO 9681 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2018-08-18 14:54:32.025  INFO 9681 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2018-08-18 14:54:32.201  INFO 9681 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-08-18 14:54:32.537  INFO 9681 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@3339ad8e: startup date [Sat Aug 18 14:54:30 JST 2018]; root of context hierarchy
2018-08-18 14:54:32.628  INFO 9681 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/]}" onto public java.lang.String jp.lateautumnriver.tryspringboot.controller.HelloController.index()
2018-08-18 14:54:32.633  INFO 9681 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2018-08-18 14:54:32.634  INFO 9681 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2018-08-18 14:54:32.676  INFO 9681 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-08-18 14:54:32.677  INFO 9681 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-08-18 14:54:33.017  INFO 9681 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-08-18 14:54:33.082  INFO 9681 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2018-08-18 14:54:33.087  INFO 9681 --- [           main] j.l.t.TryspringbootApplication           : Started TryspringbootApplication in 18.146 seconds (JVM running for 18.81)
2018-08-18 14:56:01.367  INFO 9681 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring FrameworkServlet 'dispatcherServlet'
2018-08-18 14:56:01.368  INFO 9681 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization started
2018-08-18 14:56:01.414  INFO 9681 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization completed in 46 ms
```

ローカルホストへアクセス

```
curl -i 'http://localhost:8080/'
HTTP/1.1 200 
Content-Type: text/plain;charset=UTF-8
Content-Length: 27
Date: Sat, 18 Aug 2018 05:59:55 GMT

Greetings from Spring Boot!
```



# notes

* [Springトップ](https://spring.io/)
* [さまざまなプロジェクト](https://spring.io/projects)
* [ガイド](https://spring.io/guides)

