# 🧱 Spring Hibernate Demo

Ce projet démontre l’intégration **de Spring Framework avec Hibernate** pour la gestion des entités persistantes dans une base de données **MySQL**.  
Il illustre les bonnes pratiques de configuration, d’injection de dépendances et de gestion transactionnelle au sein d’une architecture propre et modulaire.

---

## 🎯 Objectifs pédagogiques

- Comprendre les **bases de la gestion des dépendances** avec Maven  
- Configurer **Spring** pour gérer l’**injection de dépendances** et les **transactions**  
- Intégrer **Hibernate** pour la gestion des **entités persistantes (ORM)**  
- Mettre en œuvre un **DAO générique** pour les opérations **CRUD**  
- Configurer une **base de données MySQL** pour l’interaction avec les entités  

---

## ⚙️ Prérequis techniques

| Outil | Version minimale | Description |
|-------|------------------|--------------|
| ☕ Java | 11+ | Langage principal du projet |
| 🧩 Maven | 3.6+ | Gestionnaire de dépendances |
| 🐬 MySQL | 8.0+ | Système de gestion de base de données |

---

## 🗄️ Configuration de la base de données

1. **Créer la base MySQL** :

```sql
CREATE DATABASE base;
```

2. **Configurer les identifiants de connexion** dans `src/main/resources/application.properties` :

```properties
spring.datasource.username=root
spring.datasource.password=VOTRE_MOT_DE_PASSE
```

3. (Optionnel) Adapter le nom de la base ou le port selon votre environnement :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/base?serverTimezone=UTC
```

---

## 🧩 Structure du projet

```
src/
 └── main/
     ├── java/
     │   ├── dao/
     │   │   └── IDao.java              # Interface générique pour les opérations CRUD
     │   ├── entities/
     │   │   └── Product.java           # Entité JPA représentant un produit
     │   ├── metier/
     │   │   └── ProductDaoImpl.java    # Implémentation du DAO avec Hibernate
     │   ├── util/
     │   │   └── HibernateConfig.java   # Configuration Spring & Hibernate
     │   ├── TestHibernate.java         # Test de la configuration Hibernate
     │   └── Presentation2.java         # Exemple d’utilisation du DAO
     └── resources/
         └── application.properties     # Paramètres de connexion et propriétés Hibernate
```

---

## 🚀 Compilation et exécution

### 1️⃣ Compiler le projet
```bash
mvn clean compile
```

### 2️⃣ Exécuter le test de configuration
```bash
mvn exec:java -Dexec.mainClass="TestHibernate"
```

### 3️⃣ Lancer la démonstration CRUD
```bash
mvn exec:java -Dexec.mainClass="Presentation2"
```

> ✅ Si tout est correctement configuré, un message de confirmation s’affichera dans la console, et le produit sera ajouté dans la base MySQL.

---

## 🧠 Points clés du projet

- **Spring Context** : gère les dépendances via l’injection automatique (`@Autowired`)  
- **Spring ORM** : relie Spring à Hibernate pour le mapping objet-relationnel  
- **Hibernate Core** : gère les entités et la persistance  
- **Spring TX** : simplifie la gestion des transactions avec `@Transactional`  
- **MySQL Connector** : assure la communication entre Java et la base de données  

---

## 🧩 Extensions possibles

- Ajouter une entité `Category` et établir une relation `@ManyToOne` avec `Product`  
- Créer une **interface Web (Spring MVC)** pour manipuler les produits depuis une page web  
- Écrire des **tests unitaires** avec **JUnit** et **Mockito**  
- Intégrer **Spring Boot** pour automatiser la configuration et le déploiement  

---

## 👨‍💻 Auteur

**Khalid**  
Étudiant en ingénierie informatique — passionné par le développement **Java & Spring**  
📧 Contact : *kiaakhalid@gmail.com*  
