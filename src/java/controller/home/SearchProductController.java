/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.home;

import dao.DAO;
import entity.Category;
import entity.Products;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Tran Van Tung
 */
public class SearchProductController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        //lấy giá trị người dùng nhập vào để tìm kiếm
        String txtSearch = req.getParameter("txt");
        DAO dao = new DAO();
        ArrayList<Products> arr = dao.searchByName(txtSearch);
        ArrayList<Category> arr1 = dao.getAllCategory();
        Products last = dao.getLastProduct();

        req.setAttribute("arr1", arr1);
        req.setAttribute("lp", last);
        req.setAttribute("listPP", arr);
        req.setAttribute("textsearch", txtSearch);
        req.getRequestDispatcher("Home.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String txtSearch = req.getParameter("txt");
//        DAO dao = new DAO();
//        ArrayList<Products> arr = dao.searchByName(txtSearch);
//        ArrayList<Category> arr1 = dao.getAllCategory();
//        Products last = dao.getLastProduct();
//
//        req.setAttribute("arr1", arr1);
//        req.setAttribute("lp", last);
//        req.setAttribute("data", arr);
//        req.getRequestDispatcher("Home.jsp").forward(req, resp);
        resp.sendRedirect("Home.jsp");
    }

}
