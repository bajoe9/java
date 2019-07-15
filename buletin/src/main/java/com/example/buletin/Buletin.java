package com.example.buletin;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "buletin")
public class Buletin {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String number;
    private Date startDate;
    private Date endDate;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
