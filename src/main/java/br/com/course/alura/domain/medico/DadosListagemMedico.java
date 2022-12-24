package br.com.course.alura.domain.medico;

import br.com.course.alura.domain.medico.Especialidade;
import br.com.course.alura.domain.medico.Medico;

public record DadosListagemMedico(Long id, String nome, String email, String crm, Especialidade especialidade) {

    public DadosListagemMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
