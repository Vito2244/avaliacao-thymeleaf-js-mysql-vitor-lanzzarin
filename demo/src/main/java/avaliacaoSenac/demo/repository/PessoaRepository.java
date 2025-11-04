package avaliacaoSenac.demo.repository;

import avaliacaoSenac.demo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
