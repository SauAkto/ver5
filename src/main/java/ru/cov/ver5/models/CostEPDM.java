package ru.cov.ver5.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cost_epdm")
@Getter
@Setter
@NoArgsConstructor
public class CostEPDM {

    @Id
    private Long id;

    @OneToOne(mappedBy = "costepdm")
    private User user;

}
