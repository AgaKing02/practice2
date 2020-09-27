package Controllers;

import Controllers.interfaces.CreateProduct;
import Models.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@WebServlet(name = "CreateFile")
public class CreateFile extends HttpServlet implements CreateProduct {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("nme");
        String description = request.getParameter("description");
        int price = Integer.parseInt(request.getParameter("price"));
        String size = request.getParameter("size");
        String image = request.getParameter("image");
        String category = request.getParameter("category");
        Product product = new Product(1, name, description, price, size, image, category);
        create(product);
        response.getWriter().println("The request will be accepted my moderator");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/filecreate.jsp").forward(request, response);

    }

    @Override
    public void create(Product product) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/HP/Desktop/newfile/practice2/src/main/java/Repositories/Requests/" + product.getName() + ".txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(product.toString());
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
