package hello.servlet.basic.response;

import hello.servlet.basic.HelloServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(name = "responseHeaderServlet",urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HelloServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //status-line
        response.setStatus(HttpServletResponse.SC_OK);

        //response-header
        response.setHeader("Content-Type","text/plain");
    }
}
