package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bread")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bread {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String breadName;
    @Column(nullable = false)
    private Integer price;

}
