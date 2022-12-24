package br.com.course.alura.domain.medico;

import br.com.course.alura.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarMedico (
        @NotNull
        Long id,
        String nome,
        String telefone,

        DadosEndereco endereco) {
}
