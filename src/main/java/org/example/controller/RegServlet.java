package org.example.controller;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.dto.RegDTO;
import org.example.service.RegService;
import org.example.service.api.IRegService;
import java.io.IOException;

@WebServlet(urlPatterns = "/registr")
public class RegServlet extends HttpServlet {
    //private final static IRegService dataService = RegService.getInstance();
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException,
            IOException {

        req.getRequestDispatcher("/template/next.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String datereg = request.getParameter("datereg");
        String role = request.getParameter("role");

        if(login.isEmpty() || password.isEmpty() || name.isEmpty() || birthday.isEmpty()
                || datereg.isEmpty()|| role.isEmpty())
        {
            RequestDispatcher req = request.getRequestDispatcher("registr_1.jsp");
            req.include(request, response);
        }
        else
        {
            RequestDispatcher req = request.getRequestDispatcher("register_2.jsp");
            req.forward(request, response);
        }
    }
}

