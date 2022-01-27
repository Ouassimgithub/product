package mvc.model.producctt.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import mvc.model.producctt.dao.ProduitRepository;
import mvc.model.producctt.entities.Produit;

import org.springframework.web.bind.annotation.RequestMapping;





@Controller
public class ProduitController {
    @Autowired
    private ProduitRepository produitRepository;
    @RequestMapping(value ="/index")
     public String index(Model model){
         //controlleur fait appel a la couche metier pour recuperer les produits
         List<Produit> produits= produitRepository.findAll();
         //controlleur stocke les produits dans le model
         model.addAttribute("listProduits", produits);
         //controlleur va vers la vue
         return "produits";
     }

  
}
