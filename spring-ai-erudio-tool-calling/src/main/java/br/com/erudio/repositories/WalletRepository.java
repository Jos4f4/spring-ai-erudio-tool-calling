package br.com.erudio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erudio.entities.Share;

public interface WalletRepository extends JpaRepository<Share, Long> {

}
