/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.home;

import dao.DAO;
import entity.Account;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author Tran Van Tung
 */
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        String remember = req.getParameter("remember");
        DAO dao = new DAO();
        Account acpa = new Account(account, password);
        Account a1 = dao.Login(acpa);
//        Account accSession = new Account();
//        accSession = dao.getNameByAccount(account);

//        System.out.println(a1);
        if (a1 == null) {
            req.setAttribute("message", "Tài khoản hoặc mật khẩu sai! Vui lòng nhập lại.");
            req.getRequestDispatcher("Login.jsp").forward(req, resp);
        } else {
            HttpSession session = req.getSession();
            session.setAttribute("acc", a1);

            Cookie a = new Cookie("AccountA", account);
            Cookie p = new Cookie("PasswordA", password);
            //tg tồn tại cookie
            a.setMaxAge(60 * 60 * 24 * 365);
            if (remember != null) {
                p.setMaxAge(60);
            } else {
                p.setMaxAge(0);
            }

            //lưu a va p lên chrome
            resp.addCookie(a);
            resp.addCookie(p);
//            session.setAttribute("nameacc", accSession);
            System.out.println(account);
            System.out.println(password);
            resp.sendRedirect("home");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //lay account tu coookie
        Cookie arr[] = req.getCookies();
        if (arr != null) {
            for (Cookie o : arr) {
                if (o.getName().equals("AccountA")) {
                    req.setAttribute("account", o.getValue());
                }
                if (o.getName().equals("PasswordA")) {
                    req.setAttribute("password", o.getValue());
                }
            }
        }
        //tra ve
        req.getRequestDispatcher("Login.jsp").forward(req, resp);
    }

}
