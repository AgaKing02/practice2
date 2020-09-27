package Controllers;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FileUpload")
public class FileUpload extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletFileUpload fileUpload=new ServletFileUpload(new DiskFileItemFactory());
        try {
            List<FileItem> items=fileUpload.parseRequest(request);
            for(FileItem fileItem:items){
                try{
                    fileItem.write(new File("C:\\Users\\HP\\Desktop\\newfile\\practice2\\src\\main\\java\\Repositories\\ "+fileItem.getName()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
        response.getWriter().println("The files uploaded successfully");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/fileupload.jsp").forward(request, response);
    }
}
