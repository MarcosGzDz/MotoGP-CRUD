package com.mgd.sports.motogp.business.hadler;

import com.mgd.sports.motogp.business.domain.Driver;
import com.mgd.sports.motogp.business.port.infraestructure.DriverRepositoryPort;
import com.mgd.sports.motogp.business.port.presentation.GetDriverPort;
import org.springframework.stereotype.Service;

@Service
public class GetDriverHandler implements GetDriverPort {

    private DriverRepositoryPort driverRepositoryPort;

    public GetDriverHandler(DriverRepositoryPort driverRepositoryPort) {
        this.driverRepositoryPort = driverRepositoryPort;
    }

    @Override
    public Driver getDriver(Long driverId) {
        return driverRepositoryPort.getDriverById(driverId);
    }
}
