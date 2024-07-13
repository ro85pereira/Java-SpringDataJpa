package rodrigo.estudo.projetoJpa.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rodrigo.estudo.projetoJpa.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository <Aluno, Long>{
}
