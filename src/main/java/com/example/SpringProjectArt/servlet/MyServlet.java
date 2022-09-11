package com.example.SpringProjectArt.servlet;

import com.example.SpringProjectArt.service.ProductService;
import org.hibernate.service.spi.InjectService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MyServlet", value = "/MyServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cook = "";


        response.addCookie(new Cookie("user", "Hello"));
        var cookies = request.getCookies();
        for(Cookie c: cookies)
        {
            cook = c.getName() + " " + c.getValue() + "\n";
        }

        response.getWriter().print("<html>" +
                "<head>" +
                "</head>" +
                "<body>" +
                "<h1>Welcome!</h1>" +
                "<p>This is a very cool page!</p>" + cook +
                "</body>" +
                "</html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
