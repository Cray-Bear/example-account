
##
docker run --name mysql-region -p 3306:3306 -e MYSQL_ROOT_PASSWORD=mysql-region  -d mysql:5.7 --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci

##
# 1. 进入mysql-region容器
docker exec -it mysql-region /bin/bash

# 2. 登录mysql
mysql -u root

# 3. 创建example
create database example default character set utf8mb4 collate utf8mb4_unicode_ci;

