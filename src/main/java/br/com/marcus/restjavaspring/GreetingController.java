
package br.com.marcus.restjavaspring;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * GreetingController
 */
@RestController
public class GreetingController {

  private static String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "Wold") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  };

}
