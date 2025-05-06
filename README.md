# ✏️ Last Pencils – Java Edition

## Présentation

**Last Pencils** est une version console du jeu de stratégie "Last Pencil", inspiré du jeu de Nim. Deux joueurs retirent à tour de rôle 1, 2 ou 3 crayons d’un tas. Le joueur qui prend le dernier perd la partie.

Dans cette version, vous pouvez affronter une IA redoutable qui applique une stratégie optimale. Un jeu simple, rapide et efficace pour s’amuser en ligne de commande !

---

## 🎮 Fonctionnalités

* 🔁 Jeu à 2 joueurs : humain contre IA
* 🧠 Intelligence artificielle basée sur la stratégie de Nim (modulo 4)
* 🖥 Interface 100 % console avec affichage dynamique des crayons
* 🔎 Vérification des saisies utilisateur pour éviter les erreurs
* 🎉 Messages clairs et victoire automatiquement annoncée

---

## 📦 Télécharger et lancer

⭐ Pensez à mettre une étoile au projet si vous l'appréciez !

**➡️ [Télécharger le .jar](https://github.com/ScrimaliAnthony/lastpencils-java/releases/latest)**

### ▶️ Lancement (Java requis)

```bash
java -jar LastPencils.jar
```

Suivez les instructions pour :

1. Définir le nombre initial de crayons
2. Choisir qui commence (vous ou l’ordinateur)
3. Retirer entre 1 et 3 crayons à votre tour

Le dernier à retirer un crayon a perdu

---

## 🧱 Structure du projet

```
src/
├── lastpencil/
│   ├── Main.java        → Point d’entrée
│   ├── Game.java        → Logique de tour et alternance
│   ├── Player.java      → Joueur humain
│   ├── Computer.java    → IA stratégique
│   ├── GameBoard.java   → Gestion des crayons restants
│   └── Display.java     → Affichage console
```

### 🔨 Compilation manuelle

```bash
javac -d out $(find src -name "*.java")
jar cfm LastPencils.jar manifest.txt -C out .
```
