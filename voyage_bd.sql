-- phpMyAdmin SQL Dump
-- version 3.2.0.1
-- http://www.phpmyadmin.net
--
-- Serveur: localhost
-- Généré le : Mar 18 Mai 2010 à 10:09
-- Version du serveur: 5.1.36
-- Version de PHP: 5.3.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `voyage`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `id_client` int(3) NOT NULL AUTO_INCREMENT,
  `nom_client` varchar(50) NOT NULL,
  `adresse` text,
  `autres` text,
  PRIMARY KEY (`id_client`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `client`
--


-- --------------------------------------------------------

--
-- Structure de la table `horaire`
--

CREATE TABLE IF NOT EXISTS `horaire` (
  `id_horaire` int(3) NOT NULL AUTO_INCREMENT,
  `jour` varchar(10) NOT NULL,
  `heure` varchar(5) NOT NULL,
  `dure` int(2) NOT NULL,
  PRIMARY KEY (`id_horaire`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `horaire`
--


-- --------------------------------------------------------

--
-- Structure de la table `itineraire`
--

CREATE TABLE IF NOT EXISTS `itineraire` (
  `id_itineraire` int(3) NOT NULL AUTO_INCREMENT,
  `id_nomtvoie` varchar(3) NOT NULL,
  `id_horaire` varchar(3) NOT NULL,
  `point_depart` varchar(15) NOT NULL,
  `point_arrive` varchar(15) NOT NULL,
  `cout` int(10) NOT NULL,
  PRIMARY KEY (`id_itineraire`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `itineraire`
--


-- --------------------------------------------------------

--
-- Structure de la table `nomtvoie`
--

CREATE TABLE IF NOT EXISTS `nomtvoie` (
  `id_nomtvoie` int(3) NOT NULL AUTO_INCREMENT,
  `id_tvoie` varchar(3) NOT NULL,
  `nomtvoie` varchar(15) NOT NULL,
  `nbre_place` int(3) NOT NULL,
  PRIMARY KEY (`id_nomtvoie`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `nomtvoie`
--


-- --------------------------------------------------------

--
-- Structure de la table `point`
--

CREATE TABLE IF NOT EXISTS `point` (
  `id_point` int(3) NOT NULL AUTO_INCREMENT,
  `point` varchar(15) NOT NULL,
  `pays` varchar(15) NOT NULL,
  PRIMARY KEY (`id_point`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `point`
--


-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE IF NOT EXISTS `reservation` (
  `id_reservation` int(3) NOT NULL AUTO_INCREMENT,
  `id_client` varchar(3) NOT NULL,
  `id_itineraire` varchar(3) NOT NULL,
  `date_reservation` varchar(14) NOT NULL,
  `date_depart` varchar(14) NOT NULL,
  PRIMARY KEY (`id_reservation`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `reservation`
--


-- --------------------------------------------------------

--
-- Structure de la table `tvoie`
--

CREATE TABLE IF NOT EXISTS `tvoie` (
  `id_tvoie` int(3) NOT NULL AUTO_INCREMENT COMMENT 'Identifiant de type de voie',
  `id_voie` varchar(3) NOT NULL COMMENT 'clef secondaire provenant de table voie',
  `tvoie` varchar(15) NOT NULL COMMENT 'Sorte de voie air bus, jet, paquebo',
  PRIMARY KEY (`id_tvoie`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COMMENT='Défini le type de voie (jet, airbus)' AUTO_INCREMENT=1 ;

--
-- Contenu de la table `tvoie`
--


-- --------------------------------------------------------

--
-- Structure de la table `voie`
--

CREATE TABLE IF NOT EXISTS `voie` (
  `id_voie` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Identifiant de voie ',
  `voie` varchar(15) NOT NULL COMMENT 'aérienne, terrestre, maritime',
  PRIMARY KEY (`id_voie`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 COMMENT='Défini le voie de transport (aérienne, terrestre, maritime)' AUTO_INCREMENT=4 ;

--
-- Contenu de la table `voie`
--

INSERT INTO `voie` (`id_voie`, `voie`) VALUES
(1, 'Aerienne'),
(2, 'Maritime'),
(3, 'Terrestre');
