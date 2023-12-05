FROM mysql:8.2
ENV MYSQL_ROOT_PASSWORD=root
COPY ./init.sql /docker-entrypoint-initdb.d/
CMD ["mysqld", "--character-set-server=utf8mb4", "--collation-server=utf8mb4_unicode_ci"]