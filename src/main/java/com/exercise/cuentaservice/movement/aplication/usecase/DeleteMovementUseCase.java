package com.exercise.cuentaservice.movement.aplication.usecase;

import com.exercise.cuentaservice.movement.aplication.port.DeleteMovementPort;
import com.exercise.cuentaservice.movement.domain.repository.DeleteMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteMovementUseCase implements DeleteMovementPort {

    @Autowired
    DeleteMovementRepository deleteMovementRepository;

    @Override
    public void deleteById(Long idMovement) {
        deleteMovementRepository.deleteById(idMovement);
    }
}
