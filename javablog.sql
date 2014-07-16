create table if not exists user(
uid int primary key auto_increment,
username varchar(20) unique not null,
password text not null,
e_mail text not null
);

create table if not exists user_detail(
did int primary key auto_increment,
username varchar(20) unique,
dsex int,
dbirth date,
demail text,
dpage text,
foreign key(username) references user(username)
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
foreign key(bid) references blog_content(bid) on delete cascade
);

create table if not exists user_click(
username varchar(40) primary key,
uclick int,
foreign key(username) references user(username)
);