package ru.cov.ver5.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String key;

    @Column
    private String login;

    @Column
    private String userName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cost_id")
    private Cost cost;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "costepdm_id")
    private CostEPDM costepdm;

}
