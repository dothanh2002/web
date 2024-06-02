package com.example.demo1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
@WebServlet(name = "getCookieServlet", urlPatterns = "/get-cookie")
public class GetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        resp.setContentType("text/html");
        for (Cookie cookie : cookies) {
            resp.getWriter().write("Cookie value is" + URLDecoder.decode(cookie.getValue(), StandardCharsets.UTF_8.toString()));
        }
    }
}