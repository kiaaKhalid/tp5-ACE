import dao.IDao;
import entities.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import util.HibernateConfig;

public class Presentation2 {
    public static void main(String[] args) {
        // Charger la configuration Spring (HibernateConfig)
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

        // Récupérer le bean DAO (implémenté par ProductDaoImpl)
        IDao<Product> productDao = context.getBean(IDao.class);

        // Créer un nouveau produit
        Product product = new Product();
        product.setName("Produit 1");
        product.setPrice(100.0);

        // Sauvegarder le produit dans la base
        productDao.create(product);

        System.out.println("✅ Produit sauvegardé : " + product.getName());
    }
}
