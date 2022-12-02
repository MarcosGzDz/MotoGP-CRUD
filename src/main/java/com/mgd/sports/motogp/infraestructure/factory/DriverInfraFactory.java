package com.mgd.sports.motogp.infraestructure.factory;

import com.mgd.sports.motogp.business.domain.Driver;
import com.mgd.sports.motogp.infraestructure.entities.DriverEntity;
import org.springframework.stereotype.Component;

@Component
public class DriverInfraFactory {

    public Driver create(DriverEntity driverEntity){
        if (driverEntity == null){
            return null;
        }
        return Driver.builder().birthDate(driverEntity.getBirthDate())
                 .id(driverEntity.getId())
                 .name(driverEntity.getName())
                 .nationality(driverEntity.getNationality())
                 .number(driverEntity.getNumber())
                 .surname(driverEntity.getSurname())
                 .build();

    }
}
