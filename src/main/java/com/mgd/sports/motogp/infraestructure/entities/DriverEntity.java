package com.mgd.sports.motogp.infraestructure.entities;

import com.mgd.sports.motogp.infraestructure.entities.common.AuditableFields;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table (name = "DRIVER")
public class DriverEntity extends AuditableFields {

    @Id
    @GeneratedValue(generator = "seq", strategy=GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq", allocationSize = 1)
    private Long id;

    @DateTimeFormat
    @Column (name = "BIRTH_DATE")
    private LocalDate birthDate;

    @Column (name = "NAME", columnDefinition = "varchar(255)", nullable = false)
    private  String name;

    @Column (name = "NATIONALITY", columnDefinition = "varchar(255)", nullable = false)
    private  String nationality;

    @Column (name = "NUMBER", columnDefinition = "varchar(2)", nullable = false)
    private  String number;

    @Column (name = "SURNAME", columnDefinition = "varchar(255)")
    private  String surname;

}
