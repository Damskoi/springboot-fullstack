# Full Stack application

Transpilation une application React avec Spring Boot.

Ceci est une application *Single Page Application* React developé avec *create-react-app* comme frontend, et le backend avec Spring-Boot. L'interface React contient un simple formulaire demandant de renseigner un nom et un prenom. Le backend est contient un controller pour l'*entité user*. Le backend interagie avec une base de données MYSQL afin de persister les données.

## Qu'est qui a été fait ?

L'application frontend à été embarqué avec le backend.
Pour ce faire, deux applications ont été développé séparément:

- frontend react qui fait appel à des APIs
- backend springboot qui expose des API RESTs

Le but était de gérer un fichier jar exécutable qui contiendrait le backend et le frontend. Les applications Spring Boot peuvent afficher des contenus statiques lorsqu'ils se trouvent dans le dossier *classes/public*. Les applications react peuvent générer *static bundle* en exécutant un `npm build` depuis la racine du frontend.

Pour ce faire, il y a deux étapes :

- créer un *production build* du frontend
- copier le *production build* dans le dossier *target/classes/public* du backend

### Automatiser la transpilation via maven

Le plugin *frontend-maven-plugin* a été utilisé dans le fichier POM.xml à la racine du dossier __frontend__. Ce fichier intègre le plugin *frontend-maven-plugin* et les instructions nécessaires afin de générer depuis __Maven__ grâce à la commande `mvn clean install`

### Embarquer avec le fichier jar exécutable du spring boot

Le fichier POM.xml se trouvant à la racine du dossier __backendspring__ contient les instructions afin de copier les fichiers build du frontend grâce au plugin Maven *copy-ressources*.

### Testez l'application

Vous pouvez tester l'application en récupérant le fichier project\backend-spring\target\backend-spring-0.0.1-SNAPSHOT.jar et l'exécuter à l'aide de la commande `java -jar backend-spring-0.0.1-SNAPSHOT.jar`

## Pour aller plus loin

Nous avons la possibilité de créer un projet multi-module depuis un fichier __POM.xml__ parent afin de gérer un groupe de sous-modules. Les sous-modules étant nos deux applications react et spring boot. Utile pour développer une application à partir d'une seule commande surtout quand il est constitué de plusieurs sous-modules. Dans mon cas mon POM parent me permet grâce a maven de gérer l'ordre d'exécution de mes applications. A savoir exécuté le pom du frontend et obtenir la dernière version de mon front puis exécuté le pom du backend. Tout cela se fait simplement grave à la commande `mvn clean install` depuis la racine du projet.
