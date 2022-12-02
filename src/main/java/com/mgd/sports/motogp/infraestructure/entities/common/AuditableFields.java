package com.mgd.sports.motogp.infraestructure.entities.common;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class AuditableFields {

    @Column(name = "AUD_CREATION_DATE", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime creationDate;

    @Column(name = "AUD_UPDATE_DATE")
    @UpdateTimestamp
    private LocalDateTime updateDate;

}
