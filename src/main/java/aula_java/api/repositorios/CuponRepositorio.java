package aula_java.api.repositorios;

import aula_java.api.domain.cupon.Cupon;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CuponRepositorio extends JpaRepository<Cupon, UUID> {
}
