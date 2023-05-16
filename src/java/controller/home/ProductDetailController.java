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
public class ProductDetailController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String P_code = req.getParameter("P_code");
        DAO dao = new DAO();
        Products p = dao.getProductBycode(P_code);
        ArrayList<Category> arr1 = dao.getAllCategory();
        Products last = dao.getLastProduct();

        req.setAttribute("arr1", arr1);
        req.setAttribute("lp", last);
        req.setAttribute("ProductDetail", p);
        req.getRequestDispatcher("ProductDetail.jsp").forward(req, resp);
    }

}
