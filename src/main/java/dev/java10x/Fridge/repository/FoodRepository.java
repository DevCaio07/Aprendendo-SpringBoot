package dev.java10x.Fridge.repository;
//Controla todas as requisiçoes

import dev.java10x.Fridge.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {


}
