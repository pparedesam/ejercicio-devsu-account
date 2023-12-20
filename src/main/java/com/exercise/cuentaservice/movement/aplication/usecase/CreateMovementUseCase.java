package com.exercise.cuentaservice.movement.aplication.usecase;

import com.exercise.cuentaservice.account.domain.entities.Account;
import com.exercise.cuentaservice.movement.aplication.port.CreateMovementPort;
import com.exercise.cuentaservice.movement.domain.entities.Movement;
import com.exercise.cuentaservice.movement.domain.repository.CreateMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateMovementUseCase  implements CreateMovementPort {

    @Autowired
    private CreateMovementRepository createMovementRepository;

    @Override
    public Movement execute(Movement movement) {
        return createMovementRepository.create(movement);
    }
}
