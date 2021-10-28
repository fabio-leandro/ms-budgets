package com.fabio.controlbudget.entities;

import com.fabio.controlbudget.entities.enums.PhoneType;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class PhoneEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long phoneCode;
    @Column(nullable = false, length = 20)
    private PhoneType type;
    @Column(unique = true, nullable = false, length = 30)
    private String number;


}
