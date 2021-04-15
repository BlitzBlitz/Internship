package com.ikubinfo.Internship.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FuelSupplyData {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Double suppliedAmount;
    @Column(nullable = false)
    private Double suppliedPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    private Fuel fuelType;

    @ManyToOne(fetch = FetchType.LAZY)
    private Financier boughtByFinancier;

}
