create sequence SEQ_ITEM_ID maxvalue 9999999999999999 order

create table ITEM
(
	ID NUMBER not null
		constraint ITEM_PK
			primary key,
	CODE VARCHAR2(20) not null,
	TITLE VARCHAR2(50) not null,
	CREATE_TIME TIMESTAMP(3) not null,
	PRICE NUMBER(20,4) not null
)
