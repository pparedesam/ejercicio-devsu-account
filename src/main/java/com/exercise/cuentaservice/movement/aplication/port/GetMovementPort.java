package com.exercise.cuentaservice.movement.aplication.port;

import com.exercise.cuentaservice.movement.aplication.dtos.MovementResponseDto;
import com.exercise.cuentaservice.movement.domain.entities.Movement;

import java.util.List;

public interface GetMovementPort {
    List<MovementResponseDto> execute();
}
