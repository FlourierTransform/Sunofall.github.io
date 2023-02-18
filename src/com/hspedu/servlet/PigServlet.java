package com.hspedu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/pig1","/pig2"},loadOnStartup = 1)
public class PigServlet extends HttpServlet {
    private int getCount =0;
    private int postCount=0;

    @Override
    public void init() throws ServletException {
        System.out.println("init方法被调用");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet被调用");

        System.out.println("访问的浏览器ip=" +req.getRemoteAddr());

        System.out.println(++getCount);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost被调用");
        System.out.println("访问的浏览器ip=" +req.getRemoteAddr());
        System.out.println(++postCount);
    }
}
