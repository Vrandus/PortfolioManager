
-- Generate portfolio schema
CREATE SCHEMA `portfolio` ;


-- Generate accounts table
CREATE TABLE `portfolio`.`accounts` (
                                       `id` INT NOT NULL AUTO_INCREMENT,
                                       `account_type` VARCHAR(64) NOT NULL COMMENT 'Only \"Investment\" or \"Cash\"',
                                       `bank_name` VARCHAR(64) NULL COMMENT 'Name of brokerage',
                                       `description` VARCHAR(128) NULL COMMENT 'Description of the account type',
                                       `cash_value` DECIMAL(3) NULL COMMENT 'only set if cash account',
                                       PRIMARY KEY (`id`));


-- Generate investments table

CREATE TABLE `portfolio`.`investments` (
                                           `id` INT NOT NULL AUTO_INCREMENT,
                                           `ticker` VARCHAR(45) NOT NULL COMMENT 'upper case stock code',
                                           `investment_type` VARCHAR(45) NOT NULL COMMENT 'can be: \"bond\", \"stock\", \"future\", \"ETF\"',
                                           `account_id` INT NOT NULL COMMENT 'foreign key to account\'s id value',
  `units` DECIMAL(3) NOT NULL COMMENT 'number of units of investments',
  `open_value` DECIMAL(3) NOT NULL COMMENT 'price the stock was bought at',
  `close_value` DECIMAL(3) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_investments_account_id_idx` (`account_id` ASC) VISIBLE,
  CONSTRAINT `fk_investments_account_id`
    FOREIGN KEY (`account_id`)
    REFERENCES `portfolio`.`accounts` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
