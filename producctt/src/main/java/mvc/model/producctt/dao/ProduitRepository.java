package mvc.model.producctt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mvc.model.producctt.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    
}
