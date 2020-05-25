create table comment
(
	id BIGINT auto_increment,
	"Parent_id" BIGINT,
	type int,
	commentator int,
	gmt_create BIGINT,
	gmt_modified BIGINT,
	like_count BIGINT,
	constraint COMMENT_PK
		primary key (id)
);

