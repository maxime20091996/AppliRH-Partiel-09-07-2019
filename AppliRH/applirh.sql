-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 09 Juillet 2019 à 15:03
-- Version du serveur :  5.7.11
-- Version de PHP :  5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `applirh`
--

-- --------------------------------------------------------

--
-- Structure de la table `formation`
--

CREATE TABLE `formation` (
  `id_formation` int(10) NOT NULL,
  `theme` varchar(50) NOT NULL,
  `date_debut` date NOT NULL,
  `duree` int(3) NOT NULL,
  `description` varchar(255) NOT NULL,
  `avis` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `manager`
--

CREATE TABLE `manager` (
  `id_manager` int(10) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `adresse` varchar(50) NOT NULL,
  `fonction` varchar(50) NOT NULL,
  `date_embauche` date NOT NULL,
  `liste_employes` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `rh`
--

CREATE TABLE `rh` (
  `id_rh` int(10) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `adresse` varchar(50) NOT NULL,
  `fonction` varchar(50) NOT NULL,
  `date_embauche` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `salarie`
--

CREATE TABLE `salarie` (
  `id_salarie` int(10) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `adresse` varchar(50) NOT NULL,
  `fonction` varchar(100) NOT NULL,
  `date_embauche` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `formation`
--
ALTER TABLE `formation`
  ADD PRIMARY KEY (`id_formation`);

--
-- Index pour la table `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`id_manager`);

--
-- Index pour la table `rh`
--
ALTER TABLE `rh`
  ADD PRIMARY KEY (`id_rh`);

--
-- Index pour la table `salarie`
--
ALTER TABLE `salarie`
  ADD PRIMARY KEY (`id_salarie`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `formation`
--
ALTER TABLE `formation`
  MODIFY `id_formation` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `manager`
--
ALTER TABLE `manager`
  MODIFY `id_manager` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `rh`
--
ALTER TABLE `rh`
  MODIFY `id_rh` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `salarie`
--
ALTER TABLE `salarie`
  MODIFY `id_salarie` int(10) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
