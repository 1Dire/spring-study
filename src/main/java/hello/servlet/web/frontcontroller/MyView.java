package hello.servlet.web.frontcontroller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MyView {
    public String viewPath;
    public MyView(String viewPath) {
    this.viewPath = viewPath;
    }
    public void render(HttpServletRequest request, HttpServletResponse response) throws Exception , IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);
    }
}
