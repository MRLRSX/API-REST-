package br.com.course.alura.domain.paciente;

import br.com.course.alura.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(Long id, String nome, String telefone, DadosEndereco endereco) {
}
