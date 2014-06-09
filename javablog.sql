create table if not exists user(
uid int primary key auto_increment,
username varchar(20) unique not null,
password text not null,
e_mail text not null
);

create table if not exists user_detail(
did int primary key auto_increment,
uid int unique,
dsex int,
dbirth date,
dpage text,
foreign key(uid) references user(uid)
);

create table if not exists blog_content(
bid int primary key auto_increment,
username varchar(20),
btitle varchar(64),
bprivilege int not null,
bdate datetime,
bkind varchar(64),
bcontent mediumtext,
bclick int,
foreign key(username) references user(username)
);

create table if not exists blog_comment(
cmid int primary key auto_increment,
username varchar(64),
bid int,
cmcontent text,
cmreply text,
cmdate datetime,
foreign key(username) references user(username),
foreign key(bid) references blog_content(bid)
);