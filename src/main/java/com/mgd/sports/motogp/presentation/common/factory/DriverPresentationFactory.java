package com.mgd.sports.motogp.presentation.common.factory;

import com.mgd.sports.motogp.business.domain.Driver;
import com.mgd.sports.motogp.presentation.common.resource.DriverResource;
import org.springframework.stereotype.Component;

@Component
public class DriverPresentationFactory {

    public Driver create (DriverResource driverResource){
        if (driverResource == null) {
            return null;
        }

        return Driver.builder()
                .birthDate(driverResource.getBirthDate())
                .name(driverResource.getName())
                .nationality(driverResource.getNationality())
                .number(driverResource.getNumber())
                .surname(driverResource.getSurname())
                .build();
    }
}
