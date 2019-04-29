-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 30, 2019 at 12:52 AM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sikad_itenas`
--

-- --------------------------------------------------------

--
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `akunID` int(3) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `akun`
--

INSERT INTO `akun` (`akunID`, `email`, `password`) VALUES
(1, 'hunbun@gmail.com', 'bebasaja'),
(2, 'tuyuls@gmail.com', 'bodo123');

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `NIP` varchar(10) NOT NULL,
  `idAkun` int(3) NOT NULL,
  `namaDosen` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`NIP`, `idAkun`, `namaDosen`) VALUES
('16001', 2, 'Aditya Nugraha');

-- --------------------------------------------------------

--
-- Table structure for table `jadwalperwalian`
--

CREATE TABLE `jadwalperwalian` (
  `jadwalPerwalianID` int(4) NOT NULL,
  `startDate` date NOT NULL,
  `endDate` date NOT NULL,
  `tahunAjaran` date NOT NULL,
  `semester` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jadwalperwalian`
--

INSERT INTO `jadwalperwalian` (`jadwalPerwalianID`, `startDate`, `endDate`, `tahunAjaran`, `semester`) VALUES
(1, '2019-05-05', '2019-05-19', '2019-08-04', 'Ganjil');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `NRP` varchar(10) NOT NULL,
  `idAkun` int(3) NOT NULL,
  `NIP` varchar(10) NOT NULL,
  `namaMahasiswa` varchar(30) NOT NULL,
  `prodi` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`NRP`, `idAkun`, `NIP`, `namaMahasiswa`, `prodi`) VALUES
('162017004', 1, '16001', 'Nuralia Rafina', 'Sistem Informasi');

-- --------------------------------------------------------

--
-- Table structure for table `matakuliah`
--

CREATE TABLE `matakuliah` (
  `kodeMatkul` varchar(10) NOT NULL,
  `NIP` varchar(10) NOT NULL,
  `namaMatkul` varchar(25) NOT NULL,
  `SKS` int(11) NOT NULL,
  `jadwal` varchar(10) NOT NULL,
  `ruang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `matakuliah`
--

INSERT INTO `matakuliah` (`kodeMatkul`, `NIP`, `namaMatkul`, `SKS`, `jadwal`, `ruang`) VALUES
('ISA001', '16001', 'Rekayasa Perangkat Lunak', 4, 'Senin', 3303);

-- --------------------------------------------------------

--
-- Table structure for table `perwalian`
--

CREATE TABLE `perwalian` (
  `perwalianID` int(4) NOT NULL,
  `kodeMatkul` varchar(10) NOT NULL,
  `NRP` varchar(10) NOT NULL,
  `jadwalPerwalianID` int(4) NOT NULL,
  `createDate` date NOT NULL,
  `status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perwalian`
--

INSERT INTO `perwalian` (`perwalianID`, `kodeMatkul`, `NRP`, `jadwalPerwalianID`, `createDate`, `status`) VALUES
(1, 'ISA001', '162017004', 1, '2019-05-08', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`akunID`);

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`NIP`),
  ADD KEY `fk_dosen` (`idAkun`);

--
-- Indexes for table `jadwalperwalian`
--
ALTER TABLE `jadwalperwalian`
  ADD PRIMARY KEY (`jadwalPerwalianID`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`NRP`),
  ADD KEY `fk_mahasiswa` (`idAkun`),
  ADD KEY `fk_mahasiswa2` (`NIP`);

--
-- Indexes for table `matakuliah`
--
ALTER TABLE `matakuliah`
  ADD PRIMARY KEY (`kodeMatkul`),
  ADD KEY `fk_matakuliah` (`NIP`);

--
-- Indexes for table `perwalian`
--
ALTER TABLE `perwalian`
  ADD PRIMARY KEY (`perwalianID`),
  ADD KEY `fk_perwalian` (`kodeMatkul`),
  ADD KEY `fk_perwalian2` (`NRP`),
  ADD KEY `fk_perwalian3` (`jadwalPerwalianID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `akun`
--
ALTER TABLE `akun`
  MODIFY `akunID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `perwalian`
--
ALTER TABLE `perwalian`
  MODIFY `perwalianID` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `dosen`
--
ALTER TABLE `dosen`
  ADD CONSTRAINT `fk_dosen` FOREIGN KEY (`idAkun`) REFERENCES `akun` (`akunID`);

--
-- Constraints for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD CONSTRAINT `fk_mahasiswa` FOREIGN KEY (`idAkun`) REFERENCES `akun` (`akunID`),
  ADD CONSTRAINT `fk_mahasiswa2` FOREIGN KEY (`NIP`) REFERENCES `dosen` (`NIP`);

--
-- Constraints for table `matakuliah`
--
ALTER TABLE `matakuliah`
  ADD CONSTRAINT `fk_matakuliah` FOREIGN KEY (`NIP`) REFERENCES `dosen` (`NIP`);

--
-- Constraints for table `perwalian`
--
ALTER TABLE `perwalian`
  ADD CONSTRAINT `fk_perwalian` FOREIGN KEY (`kodeMatkul`) REFERENCES `matakuliah` (`kodeMatkul`),
  ADD CONSTRAINT `fk_perwalian2` FOREIGN KEY (`NRP`) REFERENCES `mahasiswa` (`NRP`),
  ADD CONSTRAINT `fk_perwalian3` FOREIGN KEY (`jadwalPerwalianID`) REFERENCES `jadwalperwalian` (`jadwalPerwalianID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
