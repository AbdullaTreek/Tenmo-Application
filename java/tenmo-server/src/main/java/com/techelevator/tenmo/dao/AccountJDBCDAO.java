package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Balance;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.math.BigDecimal;

@Component
public class AccountJDBCDAO implements AccountDAO {

    private JdbcTemplate jdbcTemplate;

    // ds is automatically wired in on account of
    // what you have in application.properties

    public AccountJDBCDAO(DataSource ds) {
        this.jdbcTemplate = new JdbcTemplate(ds);
    }

    @Override
    public Balance getBalance(String user) {

        Balance balance = new Balance();

        // from the database, and I had to just hardcoding this
        // for now.

        balance.setBalance(new BigDecimal("200"));

        return balance;
    }
}
