package cst.wyz.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    private String id;
    private String name;
    private String password;

    public User(){}

    public User(String id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }


    @Id
    @Column(name = "u_id",nullable = true,unique = true)
    @GenericGenerator(name = "strategy", strategy = "assigned")
    @GeneratedValue(generator = "strategy")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "u_name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "u_password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
