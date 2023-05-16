/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Tran Van Tung
 */
public class Category {
    
    int Cate_id;
    String Cate_name;

    public Category() {
    }

    public Category(int Cate_id, String Cate_name) {
        this.Cate_id = Cate_id;
        this.Cate_name = Cate_name;
    }

    public int getCate_id() {
        return Cate_id;
    }

    public void setCate_id(int Cate_id) {
        this.Cate_id = Cate_id;
    }

    public String getCate_name() {
        return Cate_name;
    }

    public void setCate_name(String Cate_name) {
        this.Cate_name = Cate_name;
    }

    @Override
    public String toString() {
        return "Category{" + "Cate_id=" + Cate_id + ", Cate_name=" + Cate_name + '}';
    }
    
    
}
