-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: emp
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'Primary Key',
  `departmentName` char(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (101,'教学部'),(102,'市场部'),(103,'教研部'),(104,'运营部'),(105,'后勤部');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` int NOT NULL,
  `lastName` char(20) NOT NULL,
  `email` char(20) NOT NULL,
  `gender` tinyint NOT NULL,
  `department_id` int DEFAULT NULL,
  `birth` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (485,'李白','20200120647@nxmu.e',0,101,'2019-1-1'),(526,'孔繁帮','2665300871@qq.com',1,103,'1001-01-12'),(601,'赵柳','2665300871@qq.com',0,102,'1001-01-12'),(632,'孔繁帮','2665300871@qq.com',1,103,'1001-01-12'),(845,'李白','20200120647@nxmu.e',0,103,'1001-01-12'),(865,'张三武','2665300871@qq.com',1,104,'2013-12-3'),(888,'赵柳','2665300871@qq.com',1,102,'2003-01-12'),(909,'chuchen time','20200120647@nxmu.e',1,102,'2019-1-1'),(929,'李白','20200120647@nxmu.e',0,101,'2019-1-1'),(1002,'鞠婧祎','2663200871@qq.com',0,103,'2000-4-9'),(1003,'穆婷婷','2322300871@qq.com',0,101,'2019-1-1');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-20 23:10:24
