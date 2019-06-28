package com.lambdaschool.tipsease.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "transaction")
public class Transaction {

    private double ammount;
    // the ammount of the transaction

    private Date date;
    // date of the transaction

    // who its from

    // who its to

}
