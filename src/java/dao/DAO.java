/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Account;
import entity.Category;
import entity.Products;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.ConnectToDB;

/**
 *
 * @author Tran Van Tung
 */
public class DAO {

    Connection cnn; //Dung de ket noi DB
    Statement stm; //Thuc thi cac cau lenh sql
    PreparedStatement pstm; //Ban nang cap cua stm
    ResultSet rs; //Luu tru va xu ly du lieu

    public ArrayList<Products> getAllProducts() {
        ArrayList<Products> arr = new ArrayList<>();
        String query = "select * from Products";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            //"executeUpdate()": INSERT, UPDATE hoặc DELETE. Phương thức này trả về số lượng hàng được ảnh hưởng bởi truy vấn.
            //"execute()": SELECT. Phương thức này trả về true nếu kết quả trả về là một ResultSet, ngược lại nó trả về false.
            //"executeQuery()": SELECT và trả về một đối tượng ResultSet chứa dữ liệu được truy vấn từ cơ sở dữ liệu.
            //phương thức "executeQuery()" được sử dụng khi chúng ta muốn thực thi một truy vấn SQL trả về dữ liệu từ cơ sở dữ liệu 
            //và xử lý kết quả trả về trong ResultSet. Nó trả về một đối tượng ResultSet chứa các bản ghi được trả về bởi truy vấn SQL, mà chúng ta có thể lặp qua và truy xuất dữ liệu từ mỗi bản ghi.
            //Vì vậy, nếu chúng ta muốn lấy dữ liệu từ cơ sở dữ liệu bằng cách sử dụng câu lệnh SELECT, 
            //chúng ta nên sử dụng phương thức "executeQuery()" để thực thi truy vấn và nhận kết quả trả về dưới dạng ResultSet.
            rs = pstm.executeQuery();
            while (rs.next()) {
                arr.add(new Products(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11))
                );
            }
        } catch (Exception e) {
            System.out.println("getALLProduct:" + e.getMessage());
        }
        return arr;
    }

    public ArrayList<Products> getAllProductsByPriceGiam() {
        ArrayList<Products> arr = new ArrayList<>();
        String query = "SELECT * FROM Products "
                + "ORDER BY "
                + "P_price "
                + "DESC";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            //"executeUpdate()": INSERT, UPDATE hoặc DELETE. Phương thức này trả về số lượng hàng được ảnh hưởng bởi truy vấn.
            //"execute()": SELECT. Phương thức này trả về true nếu kết quả trả về là một ResultSet, ngược lại nó trả về false.
            //"executeQuery()": SELECT và trả về một đối tượng ResultSet chứa dữ liệu được truy vấn từ cơ sở dữ liệu.
            //phương thức "executeQuery()" được sử dụng khi chúng ta muốn thực thi một truy vấn SQL trả về dữ liệu từ cơ sở dữ liệu 
            //và xử lý kết quả trả về trong ResultSet. Nó trả về một đối tượng ResultSet chứa các bản ghi được trả về bởi truy vấn SQL, mà chúng ta có thể lặp qua và truy xuất dữ liệu từ mỗi bản ghi.
            //Vì vậy, nếu chúng ta muốn lấy dữ liệu từ cơ sở dữ liệu bằng cách sử dụng câu lệnh SELECT, 
            //chúng ta nên sử dụng phương thức "executeQuery()" để thực thi truy vấn và nhận kết quả trả về dưới dạng ResultSet.
            rs = pstm.executeQuery();
            while (rs.next()) {
                arr.add(new Products(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11))
                );
            }
        } catch (Exception e) {
            System.out.println("getALLProductByPriceGiam:" + e.getMessage());
        }
        return arr;
    }
    
    public ArrayList<Products> getAllProductsByPriceTang() {
        ArrayList<Products> arr = new ArrayList<>();
        String query = "SELECT * FROM Products "
                + "ORDER BY "
                + "P_price "
                + "ASC";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            //"executeUpdate()": INSERT, UPDATE hoặc DELETE. Phương thức này trả về số lượng hàng được ảnh hưởng bởi truy vấn.
            //"execute()": SELECT. Phương thức này trả về true nếu kết quả trả về là một ResultSet, ngược lại nó trả về false.
            //"executeQuery()": SELECT và trả về một đối tượng ResultSet chứa dữ liệu được truy vấn từ cơ sở dữ liệu.
            //phương thức "executeQuery()" được sử dụng khi chúng ta muốn thực thi một truy vấn SQL trả về dữ liệu từ cơ sở dữ liệu 
            //và xử lý kết quả trả về trong ResultSet. Nó trả về một đối tượng ResultSet chứa các bản ghi được trả về bởi truy vấn SQL, mà chúng ta có thể lặp qua và truy xuất dữ liệu từ mỗi bản ghi.
            //Vì vậy, nếu chúng ta muốn lấy dữ liệu từ cơ sở dữ liệu bằng cách sử dụng câu lệnh SELECT, 
            //chúng ta nên sử dụng phương thức "executeQuery()" để thực thi truy vấn và nhận kết quả trả về dưới dạng ResultSet.
            rs = pstm.executeQuery();
            while (rs.next()) {
                arr.add(new Products(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11))
                );
            }
        } catch (Exception e) {
            System.out.println("getALLProductByPriceTang:" + e.getMessage());
        }
        return arr;
    }

    public ArrayList<Products> getAllProductsByCateid(String Cate_id) {
        ArrayList<Products> arr = new ArrayList<>();
        String query = "select * from Products where Cate_id = ?";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            pstm.setString(1, Cate_id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                arr.add(new Products(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11))
                );
            }
        } catch (Exception e) {
            System.out.println("getALLProductByid:" + e.getMessage());
        }
        return arr;
    }

    public Products getLastProduct() {
        String query = "SELECT top 1 * FROM Products "
                + "ORDER BY "
                + "P_price "
                + "DESC";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return new Products(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11)
                );

            }
        } catch (Exception e) {
            System.out.println("getLastProduct: " + e.getMessage());
        }
        return null;
    }

    public Products getProductBycode(String P_code) {
        String query = "select * from Products where P_code = ?";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            pstm.setString(1, P_code);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return new Products(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11)
                );

            }
        } catch (Exception e) {
            System.out.println("getProductBycode: " + e.getMessage());
        }
        return null;
    }

    public ArrayList<Category> getAllCategory() {
        ArrayList<Category> arr = new ArrayList<>();
        String query = "select * from Category";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            rs = pstm.executeQuery();
            while (rs.next()) {
                arr.add(new Category(rs.getInt(1),
                        rs.getString(2)
                )
                );
            }
        } catch (Exception e) {
            System.out.println("getALLCategory: " + e.getMessage());
        }
        return arr;
    }

    public ArrayList<Products> searchByName(String txtSearch) {
        ArrayList<Products> arr = new ArrayList<>();
        String query = "select * from Products where P_name like ?";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            pstm.setString(1, "%" + txtSearch + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                arr.add(new Products(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11))
                );
            }
        } catch (Exception e) {
            System.out.println("searchByName: " + e.getMessage());
        }
        return arr;
    }

    public Account Login(Account acpa) {
        String query = "select * from Account "
                + "where account = ? "
                + "and password = ?";

        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            pstm.setString(1, acpa.getAccount());
            pstm.setString(2, acpa.getPassword());
            rs = pstm.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9),
                        rs.getString(10));
            }
        } catch (Exception e) {
            System.out.println("Login: " + e.getMessage());
        }
        return null;
    }

    public Account checkAccountExits(String account) {
        String query = "select * from Account "
                + "where account = ?";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            pstm.setString(1, account);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9),
                        rs.getString(10));
            }
        } catch (Exception e) {
            System.out.println("checkAccountExits: " + e.getMessage());
        }
        return null;
    }

    public void signUp(Account ac) {
        String query = "INSERT INTO Account (account,password,A_name,A_dob,A_phone,A_email,A_address,is_admin,is_seller) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            cnn = new ConnectToDB().getConnect();

            pstm = cnn.prepareStatement(query);
            System.out.println(ac.getA_dob());
            pstm.setString(1, ac.getAccount());
            pstm.setString(2, ac.getPassword());
            pstm.setString(3, ac.getA_name());
            pstm.setString(4, ac.getA_dob());
            pstm.setString(5, ac.getA_phone());
            pstm.setString(6, ac.getA_email());
            pstm.setString(7, ac.getA_address());
            pstm.setInt(8, ac.getIs_admin());
            pstm.setString(9, ac.getIs_seller());

            pstm.execute();
        } catch (Exception e) {
            System.out.println("signUp: " + e.getMessage());
        }
    }

    public ArrayList<Products> getAllProductsBySellerID(int sell_id) {
        ArrayList<Products> data = new ArrayList<>();
        String query = "select * from Products where Seller_id = ?";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            pstm.setInt(1, sell_id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                data.add(new Products(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11))
                );
            }
        } catch (Exception e) {
            System.out.println("getALLProductBySellerID:" + e.getMessage());
        }
        return data;
    }

    public void deleteProductByP_code(String P_code) {
        String query = "delete from Products where P_code = ?";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            pstm.setString(1, P_code);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("deleteProductByP_code: " + e.getMessage());
        }
    }

    public Account getAccountByID(String A_id) {
        String query = "select * from Account where A_id = ?";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            pstm.setString(1, A_id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9),
                        rs.getString(10)
                );

            }
        } catch (Exception e) {
            System.out.println("getProductBycode: " + e.getMessage());
        }
        return null;
    }

    public void deleteAccountByID(String A_id) {
        String query = "delete from Account where A_id = ?";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            pstm.setString(1, A_id);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("deleteAccountByID: " + e.getMessage());
        }
    }

    public void addProduct(String P_code, String P_name, String P_color, String Cate_id, String P_price, String P_size, String P_image, String P_discount, String P_description, String P_dateadd, int Seller_id) {
        String query = "INSERT [dbo].[Products]\n"
                + "([P_code]\n"
                + ",[P_name]\n"
                + ",[P_color]\n"
                + ",[Cate_id]\n"
                + ",[P_price]\n"
                + ",[P_size]\n"
                + ",[P_image]\n"
                + ",[P_discount]\n"
                + ",[P_description]\n"
                + ",[P_dateadd]\n"
                + ",[Seller_id]) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            pstm.setString(1, P_code);
            pstm.setString(2, P_name);
            pstm.setString(3, P_color);
            pstm.setString(4, Cate_id);
            pstm.setString(5, P_price);
            pstm.setString(6, P_size);
            pstm.setString(7, P_image);
            pstm.setString(8, P_discount);
            pstm.setString(9, P_description);
            pstm.setString(10, P_dateadd);
            pstm.setInt(11, Seller_id);

            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("addProduct: " + e.getMessage());
        }
    }

    public void editProductByCode(String P_name, String P_color, String P_price, String P_size, String P_image, String P_discount, String P_description, String P_dateadd, String Cate_id, String P_code) {
        String query = "update Products set "
                + "P_name = ?, "
                + "P_color = ?, "
                + "P_price = ?, "
                + "P_size = ?, "
                + "P_image = ?, "
                + "P_discount = ?, "
                + "P_description = ?, "
                + "P_dateadd = ?, "
                + "Cate_id = ? "
                + "where P_code = ?";

        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            pstm.setString(1, P_name);
            pstm.setString(2, P_color);
            pstm.setString(3, P_price);
            pstm.setString(4, P_size);
            pstm.setString(5, P_image);
            pstm.setString(6, P_discount);
            pstm.setString(7, P_description);
            pstm.setString(8, P_dateadd);
            pstm.setString(9, Cate_id);
            pstm.setString(10, P_code);

            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("editProductByCode: " + e.getMessage());
        }
    }

    public ArrayList<Account> getAllAccount() {
        ArrayList<Account> arr = new ArrayList<>();
        String query = "select * from Account";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            rs = pstm.executeQuery();
            while (rs.next()) {
                arr.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9),
                        rs.getString(10))
                );
            }
        } catch (Exception e) {
            System.out.println("getALLAccount: " + e.getMessage());
        }
        return arr;
    }

    public void editInfoByID(String A_name, String A_phone, String A_email, String A_address, String A_id) {
        String query = "update Account set "
                + "A_name = ?, "
                + "A_phone = ?, "
                + "A_email = ?, "
                + "A_address = ? "
                + "where A_id = ? ";

        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            pstm.setString(1, A_name);
            pstm.setString(2, A_phone);
            pstm.setString(3, A_email);
            pstm.setString(4, A_address);
            pstm.setString(5, A_id);

            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("editInfoByID: " + e.getMessage());
        }
    }

    public int getTotalProduct() {
        String query = "select count(*) from Products";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("getTotalProduct: " + e.getMessage());
        }
        return 0;
    }

    public ArrayList<Products> pagingProduct(int index) {
        ArrayList<Products> list = new ArrayList<>();
        String query = "select * from Products \n"
                + "order by P_code\n"
                + "OFFSET ? rows fetch next 6 rows only;";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            pstm.setInt(1, (index - 1) * 6);
            rs = pstm.executeQuery();
            while (rs.next()) {
                list.add(new Products(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11))
                );
            }
        } catch (Exception e) {
            System.out.println("pagingProduct: " + e.getMessage());
        }
        return list;
    }

    public int getTotalAccount() {
        String query = "select count(*) from Account";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("getTotalAccount: " + e.getMessage());
        }
        return 0;
    }

    public ArrayList<Account> pagingAccount(int index) {
        ArrayList<Account> list = new ArrayList<>();
        String query = "select * from Account\n"
                + "order by A_id\n"
                + "OFFSET ? rows fetch next 6 rows only;";
        try {
            cnn = new ConnectToDB().getConnect();
            pstm = cnn.prepareStatement(query);
            pstm.setInt(1, (index - 1) * 6);
            rs = pstm.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9),
                        rs.getString(10))
                );
            }
        } catch (Exception e) {
            System.out.println("pagingAccount: " + e.getMessage());
        }
        return list;
    }
//    public Account getNameByAccount(String username) {
//        String query = "select * from Account where account = ?";
//        try {
//            cnn = new ConnectToDB().getConnect();
//            pstm = cnn.prepareStatement(query);
//            pstm.setString(1, username);
//            rs = pstm.executeQuery();
//            while (rs.next()) {
//                String id = String.valueOf(rs.getInt(1));
//                String account = rs.getString(2);
//                String password = rs.getString(3);
//                String A_name = rs.getString(4);
//                String A_dob = rs.getString(5);
//                String A_phone = rs.getString(6);
//                String A_email = rs.getString(7);
//                String A_address = rs.getString(8);
//                String is_admin = rs.getString(9);
//                String is_seller = rs.getString(10);
//                Account a = new Account(0, account, password, A_name, A_dob, A_phone, A_email, A_address, 0, 0);
//                return a;
//            }
//        } catch (Exception e) {
//            System.out.println("getNameByAccount: " + e.getMessage());
//        }
//        return null;
//    }
    //  public String get

    public static void main(String[] args) {
        DAO dao = new DAO();
        ArrayList<Products> list = dao.pagingProduct(1);

//        ArrayList<Products> arr = dao.getAllProducts();
//        ArrayList<Category> arr1 = dao.getAllCategory();
//       Products p = dao.getProductBycode(P_code);
        for (Products c : list) {
            System.out.println(c);
        }
    }

}
