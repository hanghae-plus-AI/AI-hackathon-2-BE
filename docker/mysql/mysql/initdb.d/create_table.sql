CREATE DATABASE IF NOT EXISTS tredi DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;;
ALTER DATABASE tredi CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

USE tredi;

-- task 테이블 생성
CREATE TABLE IF NOT EXISTS task
(
    task_id   BIGINT NOT NULL AUTO_INCREMENT,
    status          ENUM ('PENDING','COMPLETE'),
    created_at DATETIME(6),
    updated_at DATETIME(6),
    PRIMARY KEY (task_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

-- results 테이블 생성
CREATE TABLE IF NOT EXISTS results
(
    result_id BIGINT NOT NULL AUTO_INCREMENT,
    task_id BIGINT,
    url       VARCHAR(255),
    title    VARCHAR(255),
    summary    VARCHAR(255),
    thumbnail VARCHAR(255),
    created_at DATETIME(6),
    updated_at DATETIME(6),
    PRIMARY KEY (result_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;