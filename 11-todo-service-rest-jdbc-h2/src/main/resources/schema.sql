create table todos (
	id bigint auto_increment,
	username varchar(45),
	description varchar(45),
	targetDate datetime, 
	isDone boolean, PRIMARY KEY(id)
);