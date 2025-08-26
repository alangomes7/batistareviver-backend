package com.reviver.apirestfull;

import com.reviver.apirestfull.model.Product;
import com.reviver.apirestfull.repository.ProductRepository;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfullApplication implements CommandLineRunner {

  @Autowired private ProductRepository productRepository;

  public static void main(String[] args) {
    SpringApplication.run(RestfullApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Product product =
        new Product(
            "camisa_branca.png",
            "roupa",
            LocalDate.of(2025, 8, 25),
            BigDecimal.valueOf(59.9),
            250,
            true,
            "camisa branca",
            "Camisa branca",
            "Camisa branca - Reviver Uma Nova Chance");
    productRepository.save(product);
    product =
        new Product(
            "camisa_branca_oversized.png",
            "roupa",
            LocalDate.of(2025, 8, 25),
            BigDecimal.valueOf(69.9),
            250,
            true,
            "camisa branca oversized",
            "camisa branca oversized",
            "Camisa branca oversized - Reviver Uma Nova Chance");
    productRepository.save(product);
    product =
        new Product(
            "camisa_preta.png",
            "roupa",
            LocalDate.of(2025, 8, 25),
            BigDecimal.valueOf(59.9),
            250,
            true,
            "camisa preta",
            "camisa preta",
            "Camisa preta oversized - Reviver Uma Nova Chance");
    productRepository.save(product);
    product =
        new Product(
            "camisa_preta_oversized.png",
            "roupa",
            LocalDate.of(2025, 8, 25),
            BigDecimal.valueOf(69.9),
            250,
            true,
            "camisa preta oversized",
            "camisa preta oversized",
            "Camisa branca oversized - Reviver Uma Nova Chance");
    productRepository.save(product);
  }
}
