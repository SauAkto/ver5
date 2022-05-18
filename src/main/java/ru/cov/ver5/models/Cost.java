package ru.cov.ver5.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cost")
@Getter
@Setter
@NoArgsConstructor
public class Cost {

    @Id
    private Long id;

    @OneToOne(mappedBy = "cost")
    private User user;

    @Column
    private double costBindBarrelStand;

    @Column
    private double costBinderBasketStand;

    @Column
    private double costBinderBarrelPS;

    @Column
    private double costBinderBasketPS;

    @Column
    private double costRubberCrumb;

    @Column
    private double costPrimer;

    @Column
    private double costSolven;

    @Column
    private double costPigmentRed;

    @Column
    private double costPigmentGreen;

    @Column
    private double costPigmentOrange;

    @Column
    private double costPigmentBlue;

    @Column
    private double costPigmentYellow;

    @Column
    private double costPigmentBraun;

}
