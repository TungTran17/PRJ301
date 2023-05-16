/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Tran Van Tung
 */
public class Account {

    int A_id;
    String account;
    String password;
    String A_name;
    String A_dob;
    String A_phone;
    String A_email;
    String A_address;
    int is_admin;
    String is_seller;

    public Account() {
    }

    public Account(String account, String password, String A_name, String A_dob, String A_phone, String A_email, String A_address, int is_admin, String is_seller) {
        this.account = account;
        this.password = password;
        this.A_name = A_name;
        this.A_dob = A_dob;
        this.A_phone = A_phone;
        this.A_email = A_email;
        this.A_address = A_address;
        this.is_admin = is_admin;
        this.is_seller = is_seller;
    }

    public Account(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public Account(int A_id, String account, String password, String A_name, String A_dob, String A_phone, String A_email, String A_address, int is_admin, String is_seller) {
        this.A_id = A_id;
        this.account = account;
        this.password = password;
        this.A_name = A_name;
        this.A_dob = A_dob;
        this.A_phone = A_phone;
        this.A_email = A_email;
        this.A_address = A_address;
        this.is_admin = is_admin;
        this.is_seller = is_seller;
    }

    public int getA_id() {
        return A_id;
    }

    public void setA_id(int A_id) {
        this.A_id = A_id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pasword) {
        this.password = pasword;
    }

    public String getA_name() {
        return A_name;
    }

    public void setA_name(String A_name) {
        this.A_name = A_name;
    }

    public String getA_dob() {
        return A_dob;
    }

    public void setA_dob(String A_dob) {
        this.A_dob = A_dob;
    }

    public String getA_phone() {
        return A_phone;
    }

    public void setA_phone(String A_phone) {
        this.A_phone = A_phone;
    }

    public String getA_email() {
        return A_email;
    }

    public void setA_email(String A_email) {
        this.A_email = A_email;
    }

    public String getA_address() {
        return A_address;
    }

    public void setA_address(String A_address) {
        this.A_address = A_address;
    }

    public int getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(int is_admin) {
        this.is_admin = is_admin;
    }

    public String getIs_seller() {
        return is_seller;
    }

    public void setIs_seller(String is_seller) {
        this.is_seller = is_seller;
    }

    @Override
    public String toString() {
        return "Account{account=" + account + ", pasword=" + password + ", " + "A_id=" + A_id + ", A_name=" + A_name + ", A_dob=" + A_dob + ", A_phone=" + A_phone + ", A_email=" + A_email + ", A_address=" + A_address + ", is_admin=" + is_admin + ", is_seller=" + is_seller + '}';
    }

}
