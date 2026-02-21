package com.netflix;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println(
            "<h1 style='color:red;'>Welcome to Netflix Demo App</h1>" +
            "<p>Streaming Unlimited Movies & TV Shows</p>"
        );
    }
}
