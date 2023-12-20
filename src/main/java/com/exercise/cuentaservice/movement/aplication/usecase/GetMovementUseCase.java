package com.exercise.cuentaservice.movement.aplication.usecase;

import com.exercise.cuentaservice.movement.aplication.port.GetMovementPort;
import com.exercise.cuentaservice.movement.domain.entities.Movement;
import com.exercise.cuentaservice.movement.domain.repository.GetMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GetMovementUseCase implements GetMovementPort {

    @Autowired
    private GetMovementRepository getMovementRepository;
    @Override
    public List<Movement> execute() {
        return getMovementRepository.findAll();
    }
}
