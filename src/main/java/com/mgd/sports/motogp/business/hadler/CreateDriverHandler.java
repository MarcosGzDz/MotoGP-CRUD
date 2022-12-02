package com.mgd.sports.motogp.business.hadler;

import com.mgd.sports.motogp.business.domain.Driver;
import com.mgd.sports.motogp.business.port.infraestructure.DriverRepositoryPort;
import com.mgd.sports.motogp.business.port.presentation.CreateDriverPort;
import org.springframework.stereotype.Service;

@Service
public class CreateDriverHandler implements CreateDriverPort {

    private DriverRepositoryPort driverRepositoryPort;

    public CreateDriverHandler(DriverRepositoryPort driverRepositoryPort) {
        this.driverRepositoryPort = driverRepositoryPort;
    }

    @Override
    public void createDriver(Driver driver) {
        driverRepositoryPort.createDriver(driver);
    }
}
