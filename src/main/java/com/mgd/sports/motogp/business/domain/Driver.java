package com.mgd.sports.motogp.business.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.time.LocalDate;

@Builder
@Getter
public class Driver {

    @NonNull
    private final LocalDate birthDate;

    private final Long id;

    @NonNull
    private final String name;

    @NonNull
    private final String nationality;

    @NonNull
    private final String number;

    private final String surname;
}
