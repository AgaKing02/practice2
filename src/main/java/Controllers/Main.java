package Controllers;

import Models.Product;
import Services.ProductService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Main")
public class Main extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init"+this.getClass().getSimpleName());

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       try{
           request.setAttribute("products",ProductService.getAllProducts());
       }
       catch (NullPointerException e){
           e.printStackTrace();
       }
       finally {
           request.getRequestDispatcher("/main.jsp").forward(request,response);
       }


    }
}
