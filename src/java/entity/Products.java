/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Tran Van Tung
 */
public class Products {

    String P_code;
    String P_name;
    String P_color;
    int Cate_id;
    int P_price;
    String P_size;
    String P_image;
    String P_discount;
    String P_description;
    String P_dateadd;
    int Seller_id;

    public Products() {
    }

    public Products(String P_code, String P_name, String P_color, int Cate_id, int P_price, String P_size, String P_image, String P_discount, String P_description, String P_dateadd, int Seller_id) {
        this.P_code = P_code;
        this.P_name = P_name;
        this.P_color = P_color;
        this.Cate_id = Cate_id;
        this.P_price = P_price;
        this.P_size = P_size;
        this.P_image = P_image;
        this.P_discount = P_discount;
        this.P_description = P_description;
        this.P_dateadd = P_dateadd;
        this.Seller_id = Seller_id;
    }

    public String getP_code() {
        return P_code;
    }

    public void setP_code(String P_code) {
        this.P_code = P_code;
    }

    public String getP_name() {
        return P_name;
    }

    public void setP_name(String P_name) {
        this.P_name = P_name;
    }

    public String getP_color() {
        return P_color;
    }

    public void setP_color(String P_color) {
        this.P_color = P_color;
    }

    public int getCate_id() {
        return Cate_id;
    }

    public void setCate_id(int Cate_id) {
        this.Cate_id = Cate_id;
    }

    public int getP_price() {
        return P_price;
    }

    public void setP_price(int P_price) {
        this.P_price = P_price;
    }

    public String getP_size() {
        return P_size;
    }

    public void setP_size(String P_size) {
        this.P_size = P_size;
    }

    public String getP_image() {
        return P_image;
    }

    public void setP_image(String P_image) {
        this.P_image = P_image;
    }

    public String getP_discount() {
        return P_discount;
    }

    public void setP_discount(String P_discount) {
        this.P_discount = P_discount;
    }

    public String getP_description() {
        return P_description;
    }

    public void setP_description(String P_description) {
        this.P_description = P_description;
    }

    public String getP_dateadd() {
        return P_dateadd;
    }

    public void setP_dateadd(String P_dateadd) {
        this.P_dateadd = P_dateadd;
    }

    public int getSeller_id() {
        return Seller_id;
    }

    public void setSeller_id(int Seller_id) {
        this.Seller_id = Seller_id;
    }

    @Override
    public String toString() {
        return "Products{" + "P_code=" + P_code + ", P_name=" + P_name + ", P_color=" + P_color + ", Cate_id=" + Cate_id + ", P_price=" + P_price + ", P_size=" + P_size + ", P_image=" + P_image + ", P_discount=" + P_discount + ", P_description=" + P_description + ", P_dateadd=" + P_dateadd + ", Seller_id=" + Seller_id + '}';
    }

}
