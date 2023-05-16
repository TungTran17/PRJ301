/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.addProductAccount;

import dao.DAO;
import entity.Account;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Tran Van Tung
 */
public class SignUpController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        String repassword = req.getParameter("repassword");
        String name = req.getParameter("name");
        String dob = req.getParameter("dob");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String seller = req.getParameter("permission");
        if (!password.equals(repassword)) {
            resp.sendRedirect("Login.jsp");
        } else {
            Account ac = new Account(account, password, name, dob, phone, email, address, 0, seller);
            DAO dao = new DAO();
            Account a = dao.checkAccountExits(account);
            if (a == null) {
                //Được tạo
                dao.signUp(ac);
                resp.sendRedirect("home");
            } else {
                //Bắt tạo tài khoản khác
                resp.sendRedirect("Login.jsp");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
