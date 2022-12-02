package com.mgd.sports.motogp.presentation.driver;

import com.mgd.sports.motogp.business.domain.Driver;
import com.mgd.sports.motogp.business.port.presentation.CreateDriverPort;
import com.mgd.sports.motogp.business.port.presentation.GetDriverPort;
import com.mgd.sports.motogp.presentation.common.factory.DriverPresentationFactory;
import com.mgd.sports.motogp.presentation.common.factory.DriverResourceFactory;
import com.mgd.sports.motogp.presentation.common.resource.DriverResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.persistence.EntityNotFoundException;

@RestController
public class DriverController {

    private final DriverResourceFactory driverResourceFactory;

    private final GetDriverPort getDriverPort;

    private final CreateDriverPort createDriverPort;

    private final DriverPresentationFactory driverPresentationFactory;

    public DriverController(DriverResourceFactory driverResourceFactory, GetDriverPort getDriverPort, CreateDriverPort createDriverPort, DriverPresentationFactory driverPresentationFactory) {
        this.driverResourceFactory = driverResourceFactory;
        this.getDriverPort = getDriverPort;
        this.createDriverPort = createDriverPort;
        this.driverPresentationFactory = driverPresentationFactory;
    }

    @GetMapping("/motogp/driver/{driverId}")
    @ResponseStatus(value = HttpStatus.OK)
    public DriverResource getDriver (@PathVariable Long driverId){
        Driver driver = getDriverPort.getDriver(driverId);

        return driverResourceFactory.create(driver);
    }

    @PostMapping("/motogp/driver")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createDriver (@RequestBody DriverResource driverResource){
        createDriverPort.createDriver(driverPresentationFactory.create(driverResource));
    }

    @ExceptionHandler
    public ResponseEntity notFoundExceptionHandler (EntityNotFoundException e){
        return new ResponseEntity<Object>(
                e.getMessage(), HttpStatus.NOT_FOUND);
    }

}
