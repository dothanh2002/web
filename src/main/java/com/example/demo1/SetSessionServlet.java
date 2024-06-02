
package com.example.demo1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "SetSessionServlet", urlPatterns = "/set-session")
public class SetSessionServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            HttpSession httpSession = req.getSession();
            User user = new User();
            user.setName("Luan");
            user.setEmail("a@gmail.com");
            httpSession.setAttribute("user", user);

            resp.setContentType("text/html");
            resp.getWriter().write("Set session success");

        }
    }
