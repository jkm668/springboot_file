create table t_user(
    id int(11) primary key ,
    username varchar(40),
    password varchar(40)
);

create table files
(
    id          int          not null
        primary key,
    oldFileName varchar(200) null,
    newFileName varchar(300) null,
    ext         varchar(20)  null,
    path        varchar(300) null,
    size        varchar(200) null,
    type        varchar(120) null,
    isImg       varchar(8)   null,
    downcounts  int(6)       null,
    uploadTime  datetime     null,
    userid int(8) not null ,
    constraint foreign key (userid) references t_user(id)
);