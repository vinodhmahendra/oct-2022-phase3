CREATE TABLE `studentdb`.`todos` (
  `id` BIGINT(5) NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(45) NULL,
  `username` VARCHAR(45) NULL,
  `targetDate` TIMESTAMP NULL DEFAULT now(),
  `isDone` TINYINT NULL,
  PRIMARY KEY (`id`));
