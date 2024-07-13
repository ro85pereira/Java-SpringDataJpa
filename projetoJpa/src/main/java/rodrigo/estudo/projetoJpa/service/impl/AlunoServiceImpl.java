package rodrigo.estudo.projetoJpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rodrigo.estudo.projetoJpa.entity.Aluno;
import rodrigo.estudo.projetoJpa.entity.AvaliacaoFisica;
import rodrigo.estudo.projetoJpa.entity.form.AlunoForm;
import rodrigo.estudo.projetoJpa.entity.form.AlunoUpdateForm;
import rodrigo.estudo.projetoJpa.service.IAlunoService;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setId(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());

    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll(String dataDeNascimento) {
        return List.of();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        return List.of();
    }
}
