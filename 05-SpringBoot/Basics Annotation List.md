# Spring Boot Annotations

Spring Boot’s annotations are key to getting up to speed with the framework. They allow you to direct the framework to do your bidding, taking control and overriding its defaults when needed. Annotations are quick, easy to use, and orders of magnitude faster than building the equivalent functionality yourself.

You can learn more in [Spring’s documentation](https://spring.io/docs). The PDF or web versions are essential reading if you plan on working with Spring Boot.

Knowing how to use annotations can level up your game and help you get the most out of the framework. Listed below are several common annotations, some of them with sample code. Spring Boot works with Java, Kotlin, and Groovy. I’ll use Java for the examples in this article.

## Basic Setup

- `@SpringBootApplication`
- `@Configuration`
- `@ComponentScan`
- `@EnableAutoConfiguration`

## Request Responses

- `@GetMapping`
- `@RequestMapping`
- `@RequestParam`

## Component Types

- `@Component`
- `@Service`
- `@Repository`
- `@Controller`
- `@RestController`

## Testing

- `@SpringBootTest`
- `@MockBean`
- `@Validated`

## Misc

- `@Bean`
- `@ConditionalOnJava`

## List of Essential Spring Boot Annotations

There are many annotations you can use to control and define your applications. Here are some of the most useful, sorted by category.

1. Basic Setup

- `@SpringBootApplication`

Available since version 1.2, `@SpringBootApplication` replaces several other key annotations and as such, is essential to nearly all Spring Boot applications. The 1.2 version delivers the same functionality as the near ubiquitous `@Configuration`, `@ComponentScan`, and `@EnableAutoConfiguration`.

```java
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
   	 SpringApplication.run(DemoApplication.class, args);
    }

}

```