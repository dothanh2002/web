package com.example.demo1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "setCookieServlet", urlPatterns = "/set-cookie")
public class SetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws ServletException, IOException {
        Cookie cookie = new Cookie("school_name", "NIIT");
        Cookie cookie1 = new Cookie("name", URLEncoder.encode("Nguyen Thanh Luan", StandardCharsets.UTF_8.toString()));
        cookie.setHttpOnly(true);
        cookie.setMaxAge(3600);
        resp.addCookie(cookie);
        resp.addCookie(cookie1);
        //return response
        resp.setContentType("text/html");
        resp.getWriter().write("Add Cookie Success");
    }
}