package com.tradeflow.repository;

import com.tradeflow.model.Asset;
import com.tradeflow.model.Wallet;
import com.tradeflow.model.WalletItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface WalletItemRepository extends JpaRepository<WalletItem, Long> {
    // Lista todos os ativos que estão dentro de uma carteira
    List<WalletItem> findByWallet(Wallet wallet);

    // Verifica se a carteira já possui um ativo específico (útil para atualizar a quantidade em vez de criar uma nova linha)
    Optional<WalletItem> findByWalletAndAsset(Wallet wallet, Asset asset);
}