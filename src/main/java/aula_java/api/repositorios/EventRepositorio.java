package aula_java.api.repositorios;

import aula_java.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepositorio extends JpaRepository<Event, UUID>{
}
