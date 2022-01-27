package mvc.model.producctt;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;

import mvc.model.producctt.dao.ProduitRepository;
import mvc.model.producctt.entities.Produit;

 //import mvc.model.producctt.dao.ProduitRepository;
// import mvc.model.producctt.entities.Produit;

@SpringBootApplication
public class ProduccttApplication  implements CommandLineRunner  {
	@Autowired
	 ProduitRepository produitRepository;

	public static void main(String[] args) {
		
		 SpringApplication.run(ProduccttApplication.class, args);
	}
		 
		@Override
		public void run(String... args) throws Exception {
			
		    produitRepository.save(new Produit("LX 500",670,90));
			produitRepository.save(new Produit("Epson",370,20));
		    produitRepository.save(new Produit("Hp 54",509,40));
			List<Produit> ps =  produitRepository.findAll();
			System.out.println("-------------------------");
			System.out.println(ps);
			for (Produit produit : ps) {
			 System.out.println(produit.getDesignation());
			 }
			 
		  
	
			for (int i = 0; i < ps.size(); i++) {
			Produit pTemp = ps.get(i);
			System.out.println(pTemp.getDesignation() + " " + pTemp.getPrix());
			}
		 	System.out.println("-------------------------");
		}
}	



			 // ApplicationContext ctx = 
		
		
// 		ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
// 		produitRepository.save(new Produit("LX 500",670 , 90));
// 		produitRepository.save(new Produit("Epson",370 , 20));
// 		produitRepository.save(new Produit("Hp 54",509 , 40));
	

// 	 produitRepository.findAll().forEach(p -> System.out.println(p.getDesignation()));
// 	}
// }	

	// @Override
	// public void run(String... args) throws Exception {
	// 	// TODO Auto-generated method stub
	
// }
	// @Autowired
	// ProduitService produitService;

	// public static void main(String[] args) {
	// 	SpringApplication.run(ProductsApplication.class, args);
	// }

	// @Override
	// public void run(String... args) throws Exception {
	// 	List<Produit> ps = produitService.findAllProduits();
	// 	System.out.println("-------------------------");
	// 	System.out.println(ps);
	// 	// for (Produit produit : ps) {
	// 	// System.out.println(produit.getDesignation());
	// 	// }

	// 	for (int i = 0; i < ps.size(); i++) {
	// 		Produit pTemp = ps.get(i);
	// 		System.out.println(pTemp.getDesignation() + " " + pTemp.getPrix());
	// 	}
	// 	System.out.println("-------------------------");

	// 	Produit p1 = produitService.findPrduitById(11L);
	// 	System.out.println(p1.getDesignation());

	// }
	// public class ProduccttApplication implements CommandLineRunner {
	// 	@Autowired
	// 	ProduitRepository produitRepository;
	
	// 	public static void main(String[] args) {
	// 		SpringApplication.run(ProduccttApplication.class, args);
	// 	}
	
	
	 	// Produit p1 =  produitRepository.findById(11L);
		//  	System.out.println(p1.getDesignation());
	
		
	
	



