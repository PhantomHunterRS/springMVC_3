package com.phantom.repository;

import com.phantom.model.Product;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class ProductRepository {
    int id = 1;

    @PostConstruct
    public void init(){
        productList.add(new Product(id++,"Milk",159.00));
        productList.add(new Product(id++,"Butter",249.90));
        productList.add(new Product(id++,"Banana",87.56));
        productList.add(new Product(id++,"Mango",472.90));
        productList.add(new Product(id++,"Bacon",599.90));
        productList.add(new Product(id++,"Sausage",185.99));
        productList.add(new Product(id++,"Sturgeon",762.20));
        productList.add(new Product(id++,"Spinach",187.30));
        productList.add(new Product(id++,"BlackBerry",345.98));
        productList.add(new Product(id++,"Eggs",150.00));
    }

    private final List<Product> productList = new ArrayList<>();

    public void create(Product product){
        productList.add(new Product(id++,product.getTitle(),product.getCost()));
    }

    public Product getFindId(int id){
        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()){
            Product tmp = iterator.next();
            if (tmp.getId() == id){
                return tmp;
            }
        }
        return null;
    }
    public Optional<Product> getFindById(int id){
        return Optional.ofNullable(productList.get(id));
    }

    public List<Product> findAll(){
        return new ArrayList<>(productList);
    }
    public Product edit (Product product){
        Product set = productList.set((int) product.getId(), product);
        return set;
    }
    public Product getRandomProduct(){
        return productList.get((int)Math.random()*(productList.size()+1));
    }

}
