package de.budgetfreak.usermanagement.domain;

import javax.persistence.*;

/**
 * Entity representing an user with an own budget and accounts.
 */
@Entity(name = "BF_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CURRENCY")
    private String currency;

    public User() {
    }

    public User(String name, String currency) {
        this.name = name;
        this.currency = currency;
    }

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public User setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
}
