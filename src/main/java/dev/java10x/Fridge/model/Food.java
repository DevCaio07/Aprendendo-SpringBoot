package dev.java10x.Fridge.model;
//Objeto Principal

import jakarta.persistence.*;

import java.time.LocalDate;
//Anotation
//Essa anotation diz para o banco de dados que essa class é uma entidade no banco de dados
@Entity
@Table(name = "food_name")
public class Food {

    @Id //Gera um ID automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY) //A estrategia é: Toda vez que adiocionar uma nova comida o id gerado
    // e gerado a partir do 1, e a proxima comida adiciona 1 + 1, ou seja, 2
    private Long id;
    private String name;
    private LocalDate expirationDate;
    private Integer quantity;

    public Food(Long id, String name, LocalDate expirationDate, Integer quantity) {
        this.id = id;
        this.name = name;
        this.expirationDate = expirationDate;
        this.quantity = quantity;
    }

    public Long getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public LocalDate getExpirationDate() {

        return expirationDate;
    }

    public Integer getQuantity() {

        return quantity;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setExpirationDate(LocalDate expirationDate) {

        this.expirationDate = expirationDate;
    }

    public void setQuantity(Integer quantity) {

        this.quantity = quantity;
    }
}
