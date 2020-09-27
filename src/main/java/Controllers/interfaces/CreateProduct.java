package Controllers.interfaces;

import Models.Product;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface CreateProduct {
    void create(Product product) throws IOException;
}
