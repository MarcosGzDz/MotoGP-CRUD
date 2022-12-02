package com.mgd.sports.motogp.business.port.presentation;

import com.mgd.sports.motogp.business.domain.Driver;

public interface GetDriverPort {

    Driver getDriver(Long driverId);
}
