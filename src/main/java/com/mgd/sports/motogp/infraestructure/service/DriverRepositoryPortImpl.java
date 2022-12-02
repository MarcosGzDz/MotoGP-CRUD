package com.mgd.sports.motogp.infraestructure.service;

import com.mgd.sports.motogp.business.domain.Driver;
import com.mgd.sports.motogp.business.port.infraestructure.DriverRepositoryPort;
import com.mgd.sports.motogp.infraestructure.entities.DriverEntity;
import com.mgd.sports.motogp.infraestructure.factory.DriverEntityMapper;
import com.mgd.sports.motogp.infraestructure.factory.DriverInfraFactory;
import com.mgd.sports.motogp.infraestructure.repository.DriverRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class DriverRepositoryPortImpl implements DriverRepositoryPort {

   private DriverRepository driverRepository;

   private DriverInfraFactory driverInfraFactory;

   private DriverEntityMapper driverEntityFactory;

    public DriverRepositoryPortImpl(DriverRepository driverRepository, DriverInfraFactory driverInfraFactory, DriverEntityMapper driverEntityFactory) {
        this.driverRepository = driverRepository;
        this.driverInfraFactory = driverInfraFactory;
        this.driverEntityFactory = driverEntityFactory;
    }

    @Override
    public Driver getDriverById(Long driverId) {
        Optional<DriverEntity> driverEntity =
                Optional.ofNullable(driverRepository.findById(driverId)
                        .orElseThrow(() ->
                                new EntityNotFoundException(String.format("Driver with id %s not found. ", driverId))));
        return driverInfraFactory.create(driverEntity.get());
    }

    @Override
    public void createDriver(Driver driver) {
        driverRepository.save(driverEntityFactory.map(driver));
    }
}
