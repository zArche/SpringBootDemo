# SpringBootDemo #
A demo of studying spring boot frame  
## How to run this?  ##
1.  Install mysql
	*  sudo apt-get install mysql-server  
	*  sudo apt-get isntall mysql-client  
	*  sudo apt-get install libmysqlclient-dev  
2.  Set up mysql  
	*  mysql -u root -p
	*  mysql> use mysql;
	*  mysql> GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' IDENTIFIED BY 'password' WITH GRANT OPTION; #allow remote client to access database

	*  mysql> create database account;
	*  mysql> use account;
	*  mysql> CREATE TABLE \`account\` (
  \`id\` int(11) NOT NULL AUTO_INCREMENT,
  \`name\` varchar(20) NOT NULL,
  \`money\` double DEFAULT NULL,
  PRIMARY KEY (\`id\`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
INSERT INTO \`account\` VALUES ('1', 'aaa', '1000');
INSERT INTO \`account\` VALUES ('2', 'bbb', '1000');
INSERT INTO \`account\` VALUES ('3', 'ccc', '1000');  
  *  sudo sed -i 's/bind-address/#bind-address/' /etc/mysql/my.cnf
	*  sudo service mysql restart
	

3.  Run this project with Intellij Idea  
4.  Use browser browse "localhost:8080"
