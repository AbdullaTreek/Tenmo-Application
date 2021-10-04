package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Balance;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.math.BigDecimal;

@Component
public class AccountJDBCDAO implements AccountDAO {

    private JdbcTemplate jdbcTemplate;

    // Explain that ds is automatically wired in on account of
    // what you have in application.properties

    public AccountJDBCDAO(DataSource ds) {
        this.jdbcTemplate = new JdbcTemplate(ds);
    }

    @Override
    public Balance getBalance(String user) {

        Balance balance = new Balance();

        // Mention that this is obviously from the database, and we're just hardcoding this
        // for now.

        balance.setBalance(new BigDecimal("200"));

        return balance;
    }
}
