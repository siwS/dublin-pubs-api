package com.pubs_api.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "pub")
public class Pub {
    // this initialValue is to avoid IntegrityExceptions when clashing with the ids from the import.sql.
    // we can remove later if not needed - thought it would be handy to put some seeding data there for now
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="rating")
    private Integer rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name;
    }
}
