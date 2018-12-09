package mz.baloi.learning;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( name = "Hello World", urlPatterns = "/hello/*",loadOnStartup = 1)
public class Lesson1 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {

        resp.getWriter().println("Hello World");
        resp.flushBuffer();
    }
}
