package Controllers;

import Controllers.interfaces.DeleteFile;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet(name = "Download")
public class FileDownload extends HttpServlet implements DeleteFile {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getParameter("file");
        path = path.replace("\\", "\\\\");
        File willbedeleted = new File(path);
        boolean deleted=delete(willbedeleted);
        if(deleted){
            response.getWriter().println("deleted");
        }else{
            response.getWriter().println("not deleted");

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Creating a File object for directory
        File directoryPath = new File("C:\\Users\\HP\\Desktop\\newfile\\practice2\\src\\main\\java\\Repositories");
        if (directoryPath == null) {
            throw new NullPointerException("The repo not found");
        }
        request.setAttribute("repository", directoryPath);
        request.getRequestDispatcher("/filedownload.jsp").forward(request, response);
    }

    @Override
    public boolean delete(File file) {
        if (file.delete()) {
            return true;
        } else {
            return false;
        }
    }
}

