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
public class CategoryController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //lấy cate_id vào
        String Cate_id = req.getParameter("Cate_id");
        DAO dao = new DAO();
        ArrayList<Products> arr = dao.getAllProductsByCateid(Cate_id);
        ArrayList<Category> arr1 = dao.getAllCategory();
        Products last = dao.getLastProduct();

        req.setAttribute("listPP", arr);
        req.setAttribute("arr1", arr1);
        req.setAttribute("lp", last);
        req.setAttribute("choose", Cate_id);
        req.getRequestDispatcher("Home.jsp").forward(req, resp);
    }

}
