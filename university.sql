-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 12, 2018 at 09:49 AM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `university`
--

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `idCourse` int(11) NOT NULL,
  `nameC` varchar(15) NOT NULL,
  `hoursC` int(11) NOT NULL,
  `salaryOneHour` int(11) NOT NULL,
  `nameDoctor` varchar(20) NOT NULL,
  `semester` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`idCourse`, `nameC`, `hoursC`, `salaryOneHour`, `nameDoctor`, `semester`) VALUES
(23, 'logic', 2, 15, 'عبدالباسط', '1'),
(1234, 'جافا متقدم', 3, 25, 'عمرو عبداللطيف', '2'),
(1456, 'جافا اساسيات', 5, 1, 'أحمد رأفت ', '2');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `ID` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `password` varchar(15) NOT NULL,
  `mobile` varchar(15) NOT NULL,
  `gender` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`ID`, `name`, `password`, `mobile`, `gender`) VALUES
(1, 'عبدالباسط', '123', '01235469998', 'ذكر'),
(3, 'عمرو عبداللطيف', '12345', '01422356866', 'ذكر'),
(14, 'أحمد رأفت ', '1234', '01114223655', 'ذكر');

-- --------------------------------------------------------

--
-- Table structure for table `registerstudentcourse`
--

CREATE TABLE `registerstudentcourse` (
  `idStudent` int(11) NOT NULL,
  `nameCourse` varchar(20) NOT NULL,
  `hoursCourse` int(11) NOT NULL,
  `mark1` int(11) NOT NULL,
  `mark2` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `semester`
--

CREATE TABLE `semester` (
  `first` varchar(10) NOT NULL,
  `second` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `ID` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `password` varchar(15) NOT NULL,
  `mobile` varchar(15) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `avg` double NOT NULL,
  `amount_it` double NOT NULL,
  `amount_paid` double NOT NULL,
  `restOfFees` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`ID`, `name`, `password`, `mobile`, `gender`, `avg`, `amount_it`, `amount_paid`, `restOfFees`) VALUES
(2011, 'سيد', '1123', '01236586698', 'ذكر', 22, 50000, 20000, 30000),
(2012, 'منصور', '1234', '01512436558', 'ذكر', 21, 30000, 20000, 10000),
(2013, 'ولاء ', '1344', '012546688789', 'أنثى', 21, 24000, 4000, 20000),
(2014, 'عمر', '1444', '021455588', 'ذكر', 20, 150000, 100000, 50000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`idCourse`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `registerstudentcourse`
--
ALTER TABLE `registerstudentcourse`
  ADD PRIMARY KEY (`idStudent`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
