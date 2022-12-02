package com.mgd.sports.motogp.business.port.infraestructure;

import com.mgd.sports.motogp.business.domain.Driver;

public interface DriverRepositoryPort {

    Driver getDriverById (Long driverId);

    void createDriver (Driver driver);

}
