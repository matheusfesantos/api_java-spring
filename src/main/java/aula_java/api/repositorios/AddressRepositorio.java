package aula_java.api.repositorios;

import aula_java.api.domain.adress.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepositorio extends JpaRepository <Address, UUID> {
}
