# Notes Java

## 1 - Base

### 1.1 - Chapitre 1

#### 1.1.1 - JVM

- Un programme Java n'est pas spécifique à une plateforme native (la plate-forme cible est une machine virtuelle Java, ou JVM)
- Un programme Java s'écris pour s'exécuter sur une JVM.
- La plupart des JVM sont écrites en C ou C++.
- Lorsqu'on exécute un programme Java, on exécute en réalité une JVM et la JVM interprète notre code Java.
- Problème de lenteur des anciennes JVM
- JVM moderne qui intègre la fonctionnalité JIT (Just-In-Time) rend le processus plus efficace.
- Un compilateur JIT prend en fait votre bytecode Java et le traduit en code natif.
  
#### Editions

- Composants d'origine:
  - la spécification du langage de programmation
  - la spécification de l'environnement d'exécution Java
- J2EE est un ensemble de technologies Java qui créent une plate-forme pour les applications distribuées.
- Une servlet est une application Java qui s'exécute sur un serveur Web.
- Serveurs d'applications les plus populaires :
  - WebSphere d'IBM
  - WebLogic de BEA Systems et
  - JRun de Macromedia.
- les applications J2EE s'exécutent sur un serveur d'applications compatible J2EE.
- JDBC permet aux applications Java d'accéder à une base de données.
- Une JavaServer Page est similaire à une servlet et permet la création de pages Web dynamiques.
- JTA permet aux applications Java d'accéder à un service de transaction.
- Les Java Web Services permettent aux applications Java de tirer parti des technologies émergentes de services Web.

#### Premier Program

- Une classe est une description d'un objet et un objet est une instance d'une classe.
- `Sytem.out.pintnl()` permet d'afficher des informations en console

#### À noter

Java est un langage de programmation orienté objet qui est interprété par une machine virtuelle Java (JVM), ce qui lui permet d'être indépendant de la plate-forme.

Il existe trois éditions de Java : J2SE, la plate-forme Java 2, édition standard, qui est traitée dans ce livre ; J2ME, la plate-forme Java 2, Micro Edition, qui est destinée aux appareils électroniques avec des ressources limitées ; et J2EE, la plate-forme Java 2, Enterprise Edition, qui est un ensemble de technologies Java comprenant des servlets, des pages JavaServer et des Enterprise JavaBeans.

L'écriture de code Java implique l'écriture de classes. Une classe est enregistrée dans un fichier `.java` et une seule classe publique peut apparaître dans un fichier `.java`. Le nom du fichier `.java` doit être le nom de la classe publique déclarée dans le fichier.

Le code Java compilé est appelé bytecode. Le bytecode apparaît dans un fichier .class.

Pour compiler un programme Java, vous utilisez l'outil javac fourni avec le kit de développement standard (SDK), qui est téléchargeable gratuitement sur le site Web de Sun.

Pour exécuter un programme Java, vous utilisez l'outil Java fourni avec le SDK. L'outil Java est une JVM.

La JVM invoque la méthode `main()`. La signature de main() est `public static void main(String [] args)`.

### 1.2 - Chapitre 2

#### 1.2.1 - Types primitifs

- Huit types de données, souvent appelés types primitifs

## 2 - Moock

### 2.1 - Récursivité

- La récursivité est une action qui s'initialise à l'intérieur d'elle-même.
- Les méthodes récursives servent à passer des structures en couches.

### 2.2 - Erreurs et Exceptions

#### 2.2.1 - Erreurs

- erreurs de compilation
- erreurs d'exécution

#### 2.2.2 - Exceptions
