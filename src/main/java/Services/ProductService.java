package Services;

import Models.Product;

import java.util.ArrayList;

import java.util.List;

public class ProductService {
    public static List<Product> getAllProducts(){
        List<Product> products=new ArrayList<>();
        Product product1=new Product(1,"samsung s20","phone",350000,"L","https://fora.kz/images/content/products/613391/samsung-galaxy-s20-gray_5e4385034f7ee.jpg","Smartphone");
        Product product2=new Product(2,"Ipnone X","phone",400000,"L","https://c7.hotpng.com/preview/852/334/384/iphone-8-telephone-apple-a11-iphone-x-iphone-x.jpg","Smartphone");
        Product product3=new Product(3,"Oppo Reno","phone",250000,"M","https://www.kindpng.com/picc/m/490-4903765_oppo-reno-3-pro-5g-hd-png-download.png","Smartphone");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        return products;

    }
}
