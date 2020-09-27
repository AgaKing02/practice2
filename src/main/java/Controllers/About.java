package Controllers;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "About")
public class About extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init" + this.getClass().getSimpleName());

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        int region= Integer.parseInt(request.getParameter("region"));
        int start=Integer.parseInt(request.getParameter("start"));


//        first.regionMatches(true,index , second, start, end)
            if (first.regionMatches(true,region, second, start, second.length())) {
                response.getWriter().println("Equals");
            } else if (!first.regionMatches(true, region, second, start, second.length())) {
                response.getWriter().println("Not equal");
            } else {
                response.getWriter().println("The code has error");
            }
        

//       if(first.equals(second)){
//           response.getWriter().println("=");
//       }else{
//           response.getWriter().println("!=");
//       }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/about.jsp").forward(request, response);
    }
}
