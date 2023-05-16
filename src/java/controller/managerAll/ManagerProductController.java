/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.managerAll;

import dao.DAO;
import entity.Account;
import entity.Category;
import entity.Products;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Tran Van Tung
 */
public class ManagerProductController extends HttpServlet {

    private String sell_id;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Account a = (Account) session.getAttribute("acc");//ep kieu tu str ve object
        int sell_id = a.getA_id();
        DAO dao = new DAO();

        if (a.getIs_admin() == 1) {
            String indexPage = req.getParameter("index");
            if (indexPage == null) {
                indexPage = "1";
            }
            int index = Integer.parseInt(indexPage);
            //paging
            int count = dao.getTotalProduct();
            int endPage = count / 6;
            if (count % 6 != 0) {
                endPage++;
            }

            ArrayList<Products> arr = dao.getAllProducts();
            ArrayList<Products> list = dao.pagingProduct(index);
            ArrayList<Category> arr1 = dao.getAllCategory();
            req.setAttribute("endP", endPage);
            req.setAttribute("arr1", arr1);
            req.setAttribute("data", arr);
            req.setAttribute("listPP", list);
            req.setAttribute("tag", index);
            req.getRequestDispatcher("ManagerProduct.jsp").forward(req, resp);
        } else {
            ArrayList<Products> data = dao.getAllProductsBySellerID(sell_id);
            ArrayList<Category> arr1 = dao.getAllCategory();
            req.setAttribute("arr1", arr1);
            req.setAttribute("listPP", data);
            req.getRequestDispatcher("ManagerProduct.jsp").forward(req, resp);

        }

    }

}
