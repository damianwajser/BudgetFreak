CREATE TABLE BF_CATEGORYBUDGET (
  ID IDENTITY,
  AMOUNT DECIMAL(20,2) NOT NULL,
  DESCRIPTION VARCHAR(300),
  CATEGORY_ID BIGINT NOT NULL,
  BUDGET_ID BIGINT NOT NULL,

  CONSTRAINT PK_CATEGORYBUDGET PRIMARY KEY(ID),
  CONSTRAINT FK_CATEGORYBUDGET_CATEGORY FOREIGN KEY(CATEGORY_ID) REFERENCES BF_CATEGORY(ID),
  CONSTRAINT FK_CATEGORYBUDGET_BUDGET FOREIGN KEY(BUDGET_ID) REFERENCES BF_BUDGET(ID)
)