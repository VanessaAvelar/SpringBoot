package br.vanessa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.vanessa.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
