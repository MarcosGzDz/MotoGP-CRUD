package com.mgd.sports.motogp.presentation.common.resource;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Builder
@Getter
public class DriverResource {

    @NonNull
    @DateTimeFormat
    private final LocalDate birthDate;

    @NonNull
    private final String name;

    @NonNull
    private final String nationality;

    @NonNull
    private final String number;

    private final String surname;

}
