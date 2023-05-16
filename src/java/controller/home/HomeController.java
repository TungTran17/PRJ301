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
public class HomeController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String indexPage = req.getParameter("index");
        if (indexPage == null) {
            indexPage = "1";
        }
        int index = Integer.parseInt(indexPage);
        DAO dao = new DAO();
        ArrayList<Products> arr = dao.getAllProducts();
        ArrayList<Category> arr1 = dao.getAllCategory();
        Products last = dao.getLastProduct();
        //paging
        int count = dao.getTotalProduct();
        int endPage = count / 6;
        if (count % 6 != 0) {
            endPage++;
        }
        ArrayList<Products> list = dao.pagingProduct(index);

        req.setAttribute("endP", endPage);
        req.setAttribute("data", arr);
        req.setAttribute("arr1", arr1);
        req.setAttribute("lp", last);
        req.setAttribute("listPP", list);
        req.setAttribute("tag", index);
        req.getRequestDispatcher("Home.jsp").forward(req, resp);
    }

}
