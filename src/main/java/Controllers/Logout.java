package Controllers;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "Logout")
public class Logout extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init" + this.getClass().getSimpleName());

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Enumeration em = session.getAttributeNames();

        while (em.hasMoreElements()) {
            String element = (String) em.nextElement();
            session.removeAttribute(element);
        }

        response.sendRedirect(request.getContextPath() + "/login");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
