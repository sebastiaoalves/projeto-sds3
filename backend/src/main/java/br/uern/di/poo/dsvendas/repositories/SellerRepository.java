package br.uern.di.poo.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uern.di.poo.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
