package tca.maissocial.dominio.jovem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface JovemRepository extends JpaRepository<Jovem,Long> {
    UserDetails findByEmail(String email);
    List<Jovem> findByall();
    Jovem findByNome (int nome);
}
