
-- # Database connection properties
-- database is testdb
-- spring.datasource.url=jdbc:mysql://localhost:3306/testdb?useUnicode=yes&characterEncoding=UTF-8&useSSL=false
-- spring.datasource.username=root
-- spring.datasource.password=key91191


use testdb;
CREATE TABLE IF NOT EXISTS `Dog`(
	`id` int(11) AUTO_INCREMENT PRIMARY KEY NOT NULL,
	`name` varchar(50),
    `breed` varchar(50),
    `age` int,
    `gender` varchar(10),
    `date` varchar(50),
    `comments` varchar(50)
    );

INSERT INTO `Dog` (name, breed, age, gender, date, comments) values ("sy", "chi",1,"male","2-11-2019","N/A");
select*from `Dog`;

