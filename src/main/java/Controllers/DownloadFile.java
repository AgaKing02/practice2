package Controllers;

import org.apache.commons.io.FileUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@WebServlet(name = "DownloadFile")
public class DownloadFile extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path=request.getParameter("file");
        File source=new File(path);
        File destination=new File("C:\\Users\\HP\\Downloads\\");
        FileUtils.copyFileToDirectory(source, destination);
        response.getWriter().println("The file downloaded");
        File downloaded=new File(destination.getPath()+source.getName());
        if(downloaded.exists()){
            response.getWriter().println("Downloaded");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
