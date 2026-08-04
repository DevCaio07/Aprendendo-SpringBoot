package dev.java10x.Fridge.service;
// Funcoes que podem ser feitas com o objeto principal

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    //Me
    //LISTAR
    public List<Food> getALL() {return foodRepository.findAll();}
    //CRIAR
    public Food save(Food food){return foodRepository.save(food);}
    //CRIAR
    public void delete(Long id){foodRepository.deleteById(id);}
}


