package Controllers;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Profile")
public class Profile extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init" + this.getClass().getSimpleName());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("username");
        if (name == null) {
            response.sendRedirect(request.getContextPath()+"/login");
        } else {
            request.setAttribute("authuser", name);
            request.getRequestDispatcher("/profile.jsp").forward(request, response);
        }
    }
}
