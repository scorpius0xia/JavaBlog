-- phpMyAdmin SQL Dump
-- version 4.1.8
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 2014-06-24 02:42:53
-- 服务器版本： 5.5.33-MariaDB
-- PHP Version: 5.3.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `javablog`
--

-- --------------------------------------------------------

--
-- 表的结构 `blog_comment`
--

CREATE TABLE IF NOT EXISTS `blog_comment` (
  `cmid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) DEFAULT NULL,
  `bid` int(11) DEFAULT NULL,
  `cmcontent` text,
  `cmreply` text,
  `cmdate` datetime DEFAULT NULL,
  PRIMARY KEY (`cmid`),
  KEY `username` (`username`),
  KEY `bid` (`bid`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- 转存表中的数据 `blog_comment`
--

INSERT INTO `blog_comment` (`cmid`, `username`, `bid`, `cmcontent`, `cmreply`, `cmdate`) VALUES
(4, 'coolwind', 5, '<p><br/><img src="http://img.baidu.com/hi/jx2/j_0001.gif" _src="http://img.baidu.com/hi/jx2/j_0001.gif"/></p>', NULL, '2014-06-10 21:33:59'),
(5, 'haha', 6, '<p><br/><img src="http://img.baidu.com/hi/jx2/j_0003.gif" _src="http://img.baidu.com/hi/jx2/j_0003.gif"/></p>', NULL, '2014-06-11 12:28:43');

-- --------------------------------------------------------

--
-- 表的结构 `blog_content`
--

CREATE TABLE IF NOT EXISTS `blog_content` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `btitle` varchar(64) DEFAULT NULL,
  `bprivilege` int(11) NOT NULL,
  `bdate` datetime DEFAULT NULL,
  `bkind` varchar(64) DEFAULT NULL,
  `bcontent` mediumtext,
  `bclick` int(11) DEFAULT NULL,
  PRIMARY KEY (`bid`),
  KEY `username` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- 转存表中的数据 `blog_content`
--

INSERT INTO `blog_content` (`bid`, `username`, `btitle`, `bprivilege`, `bdate`, `bkind`, `bcontent`, `bclick`) VALUES
(5, 'haha', '你好', 0, '2014-06-10 21:33:37', '你好', '<p>你好！<br/></p>', 8),
(6, 'coolwind', '千本桜', 0, '2014-06-11 17:21:14', '初音', '<p>这里什么也没有～\r\n &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</p>', 6);

-- --------------------------------------------------------

--
-- 表的结构 `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` text NOT NULL,
  `e_mail` text NOT NULL,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=9 ;

--
-- 转存表中的数据 `user`
--

INSERT INTO `user` (`uid`, `username`, `password`, `e_mail`) VALUES
(4, 'coolwind', 'e10adc3949ba59abbe56e057f20f883e', 'ht20092009@126.com'),
(5, 'haha', 'e10adc3949ba59abbe56e057f20f883e', 'xiahaitao@exape.com'),
(7, 'xht', 'e10adc3949ba59abbe56e057f20f883e', 'xiahaitao@exmaple.com'),
(8, 'wangjian', '25d55ad283aa400af464c76d713c07ad', 'xiahaitao@exmaple2.com');

-- --------------------------------------------------------

--
-- 表的结构 `user_click`
--

CREATE TABLE IF NOT EXISTS `user_click` (
  `username` varchar(40) NOT NULL,
  `uclick` int(11) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `user_click`
--

INSERT INTO `user_click` (`username`, `uclick`) VALUES
('coolwind', 6),
('haha', 8),
('wangjian', 0),
('xht', 0);

-- --------------------------------------------------------

--
-- 表的结构 `user_detail`
--

CREATE TABLE IF NOT EXISTS `user_detail` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `dsex` int(11) DEFAULT NULL,
  `dbirth` date DEFAULT NULL,
  `demail` text,
  `dpage` text,
  PRIMARY KEY (`did`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=8 ;

--
-- 转存表中的数据 `user_detail`
--

INSERT INTO `user_detail` (`did`, `username`, `dsex`, `dbirth`, `demail`, `dpage`) VALUES
(3, 'coolwind', 0, NULL, 'ht20092009@126.com', NULL),
(4, 'haha', 0, NULL, 'xiahaitao@exape.com', NULL),
(6, 'xht', 0, NULL, 'xiahaitao@exmaple.com', NULL),
(7, 'wangjian', 0, NULL, 'xiahaitao@exmaple2.com', NULL);

--
-- 限制导出的表
--

--
-- 限制表 `blog_comment`
--
ALTER TABLE `blog_comment`
  ADD CONSTRAINT `blog_comment_ibfk_1` FOREIGN KEY (`username`) REFERENCES `user` (`username`),
  ADD CONSTRAINT `blog_comment_ibfk_2` FOREIGN KEY (`bid`) REFERENCES `blog_content` (`bid`) ON DELETE CASCADE;

--
-- 限制表 `blog_content`
--
ALTER TABLE `blog_content`
  ADD CONSTRAINT `blog_content_ibfk_1` FOREIGN KEY (`username`) REFERENCES `user` (`username`);

--
-- 限制表 `user_click`
--
ALTER TABLE `user_click`
  ADD CONSTRAINT `user_click_ibfk_1` FOREIGN KEY (`username`) REFERENCES `user` (`username`);

--
-- 限制表 `user_detail`
--
ALTER TABLE `user_detail`
  ADD CONSTRAINT `user_detail_ibfk_1` FOREIGN KEY (`username`) REFERENCES `user` (`username`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
