package com.example.demo.adventure;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@Table
public class Adventure {
    @Id
    @SequenceGenerator(
            name = "adventure_sequence",
            sequenceName = "adventure_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "adventure_sequence"
    )
    private int id;
    private String name;
    private int reward;
    private String rank;

    public Adventure() {
    }

    public Adventure(int id, String name, int reward, String rank) {
        this.id = id;
        this.name = name;
        this.reward = reward;
        this.rank = rank;
    }

    public Adventure(String name, int reward, String rank) {
        this.name = name;
        this.reward = reward;
        this.rank = rank;
    }

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

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Adventure{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", reward=" + reward +
                ", rank='" + rank + '\'' +
                '}';
    }
}
