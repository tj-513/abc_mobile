-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 09, 2016 at 05:29 AM
-- Server version: 5.5.34
-- PHP Version: 5.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `abcmobile`
--

-- --------------------------------------------------------

--
-- Table structure for table `phone`
--

CREATE TABLE IF NOT EXISTS `phone` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `price` int(8) NOT NULL,
  `description` varchar(200) NOT NULL,
  `imageURL` varchar(200) NOT NULL,
  `manufacturer` varchar(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `phone`
--

INSERT INTO `phone` (`id`, `name`, `price`, `description`, `imageURL`, `manufacturer`) VALUES
(1, 'Samsung Galaxy S5', 50000, 'Factory Unlocked<br/>Mint Condition<br/>Great Camera<br/>', 'samsunggalaxys5.jpg', 'samsung'),
(2, 'Apple iPhone 6S', 85000, 'Factory Unlocked<br/>Mint Condition<br/>Really expensive<br/>', 'appleiphone6s.jpg', 'apple'),
(3, 'Apple iPhone 5S', 75000, 'Factory Unlocked<br/>Mint Condition<br/>Really expensive<br/>', 'appleiphone5s.jpg', 'apple'),
(4, 'HTC Desire', 40000, 'HTC Original <br/>Factory Unlocked<br/>Good Camera', 'htcdesire.jpg', 'htc'),
(5, 'HTC MI', 60000, 'HTC Beat Sound <br/>Factory Unlocked<br/>13MP Camera', 'htcdesire.jpg', 'htc'),
(6, 'Nokia N7', 75000, 'Factory Unlocked<br/>Mint Condition<br/>Really expensive<br/>', 'appleiphone5s.jpg', 'nokia'),
(7, 'Huawei P7', 75000, 'Factory Unlocked<br/>Mint Condition<br/>Really expensive<br/>', 'appleiphone5s.jpg', 'huawei');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
