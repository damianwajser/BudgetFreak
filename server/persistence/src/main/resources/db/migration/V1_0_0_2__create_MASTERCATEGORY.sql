CREATE TABLE BF_MASTERCATEGORY (
  ID IDENTITY,
  NAME VARCHAR(300) NOT NULL,
  DESCRIPTION VARCHAR(300),
  USER_ID BIGINT NOT NULL,

  CONSTRAINT PK_MASTERCATEGORY PRIMARY KEY(ID),
  CONSTRAINT FK_MASTERCATEGORY_USER FOREIGN KEY(USER_ID) REFERENCES BF_USER(ID)
)