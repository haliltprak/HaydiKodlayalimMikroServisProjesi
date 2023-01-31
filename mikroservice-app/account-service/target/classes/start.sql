CREATE KEYSPACE  springcloud
    WITH replication ={'class' : 'SimpleStrategy', 'replication_factor':3};

use springcloud;
CREATE table emp(
    emp_id int PRIMARY KEY ,
    emp_name text,
    emp_city text,
    emp_sal text,
    emp_phone varint
);