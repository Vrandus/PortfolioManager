
-- Generate portfolio schema
CREATE SCHEMA `portfolio` ;


-- Generate accounts table
CREATE TABLE `portfolio`.`accounts` (
                                       `id` INT NOT NULL AUTO_INCREMENT,
                                       `account_type` VARCHAR(64) NOT NULL COMMENT 'Only \"Investment\" or \"Cash\"',
                                       `bank_name` VARCHAR(64) NULL COMMENT 'Name of brokerage',
                                       `description` VARCHAR(128) NULL COMMENT 'Description of the account type',
                                       `cash_value` DECIMAL(65,3) NULL COMMENT 'only set if cash account',
                                       PRIMARY KEY (`id`));


-- Generate investments table

CREATE TABLE `portfolio`.`transactions` (
                                            `id` INT NOT NULL AUTO_INCREMENT,
                                            `account_id` INT NOT NULL,
                                            `transaction_type` VARCHAR(45) NOT NULL COMMENT 'BUY, SELL, TRANSFER',
                                            `ticker` VARCHAR(45) NOT NULL,
                                            `units` DECIMAL(65,3) NOT NULL,
                                            `unit_price` DECIMAL(65,3) NOT NULL,
                                            `transaction_time` DATETIME NOT NULL,
                                            `asset_type` VARCHAR(45) NOT NULL COMMENT '\"bond\", \"stock\", \"future\", \"etf\"',
                                            INDEX `fk_transactions_account_id_idx` (`account_id` ASC) VISIBLE,
                                            PRIMARY KEY (`id`),
                                            CONSTRAINT `fk_transactions_account_id`
                                                FOREIGN KEY (`account_id`)
                                                    REFERENCES `portfolio`.`accounts` (`id`)
                                                    ON DELETE NO ACTION
                                                    ON UPDATE NO ACTION);
