package com.exercise.cuentaservice.movement.aplication.port;

import com.exercise.cuentaservice.account.domain.entities.Account;
import com.exercise.cuentaservice.movement.aplication.dtos.MovementRequestDto;
import com.exercise.cuentaservice.movement.aplication.dtos.MovementResponseDto;
import com.exercise.cuentaservice.movement.domain.entities.Movement;

public interface CreateMovementPort {
    MovementResponseDto execute(MovementRequestDto movement);
}
