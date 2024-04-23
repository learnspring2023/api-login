select * from user_info
where id = 1
and password = 'pass1';

delete from user_info;
insert into user_info values (1,'User1','pass1');
insert into user_info values (2,'User3','pass2');
select * from user_info;