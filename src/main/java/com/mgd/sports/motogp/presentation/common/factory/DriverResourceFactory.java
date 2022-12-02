package com.mgd.sports.motogp.presentation.common.factory;

import com.mgd.sports.motogp.business.domain.Driver;
import com.mgd.sports.motogp.presentation.common.resource.DriverResource;
import org.springframework.stereotype.Component;

@Component
public class DriverResourceFactory {

    public DriverResource create (Driver driver){

        if (driver == null) {
            return null;
        }

        return DriverResource.builder()
                .birthDate(driver.getBirthDate())
                .name(driver.getName())
                .nationality(driver.getNationality())
                .number(driver.getNumber())
                .surname(driver.getSurname())
                .build();
    }
}
