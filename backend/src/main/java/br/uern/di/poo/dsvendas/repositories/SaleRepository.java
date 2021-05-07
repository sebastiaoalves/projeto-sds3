package br.uern.di.poo.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uern.di.poo.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
