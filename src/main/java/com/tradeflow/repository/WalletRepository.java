package com.tradeflow.repository;

import com.tradeflow.model.User;
import com.tradeflow.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
    // Busca a carteira vinculada a um usuário específico
    Optional<Wallet> findByUser(User user);
}