package Controllers;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "Logout")
public class Logout extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init"+this.getClass().getSimpleName());

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        session.removeAttribute("username");
        session.invalidate();
        response.sendRedirect(request.getContextPath()+"/login");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
