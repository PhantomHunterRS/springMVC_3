package com.phantom.controller;

import com.phantom.model.Product;
import com.phantom.repository.ProductRepository;
import com.phantom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
//@Profile("phantom")
public class ProductsController {

    private final ProductService productService;

//    @Autowired
//    public ProductsController(ProductService productService) {
//        this.productService = productService;
//    }

    @RequestMapping(path ="/{id}",method = RequestMethod.GET)
    public String findProductById(Model model, @PathVariable Integer id,
                                  @RequestParam(name = "random",defaultValue = "false",required = false) Boolean isRandom){
        Product product;
        if (isRandom){
            product = productService.getRandomProduct();
        }else{
            product = productService.getFindById(id);
        }
        model.addAttribute("product",product);
        return "productById";
    }

    @ModelAttribute("products/all")
    public String showAll( Model model){
        productService.showAll();
        return "products";
    }

    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String showForm(Model model){
        model.addAttribute("newProduct",new Product());
        return "productCreate";

    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String processForm(Product product){
        if(product.getId() == 0){
            productService.create(product);
        }
        return "redirect:products/all";
    }


}
