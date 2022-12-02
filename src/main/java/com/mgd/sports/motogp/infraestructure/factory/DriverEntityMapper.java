package com.mgd.sports.motogp.infraestructure.factory;

import com.mgd.sports.motogp.business.domain.Driver;
import com.mgd.sports.motogp.infraestructure.entities.DriverEntity;
import org.springframework.stereotype.Component;

@Component
public class DriverEntityMapper {

    public DriverEntity map(Driver driver){
        if (driver == null){
            return null;
        }

        DriverEntity driverEntity = new DriverEntity();
        driverEntity.setBirthDate(driver.getBirthDate());
        driverEntity.setName(driver.getName());
        driverEntity.setNumber(driver.getNumber());
        driverEntity.setNationality(driver.getNationality());
        driverEntity.setSurname(driver.getSurname());

        return driverEntity;

    }
}
