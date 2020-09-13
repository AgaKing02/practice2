package Controllers;

import Models.User;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "Login")
public class Login extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init"+this.getClass().getSimpleName());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username=request.getParameter("txtUsername");
    String password=request.getParameter("txtPassword");
        User newuser=new User();
        newuser.setUsername(username);
        newuser.setPassword(password);
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        response.sendRedirect(request.getContextPath()+"/profile");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request,response);

    }
}
