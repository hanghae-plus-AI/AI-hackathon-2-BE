USE tredi;

-- Create task
INSERT INTO task (status, created_at, updated_at)
VALUES ('PENDING', NOW(), NOW());
SET @last_task_id = LAST_INSERT_ID();

-- Create results
INSERT INTO results (task_id,url,title,summary,thumbnail , created_at, updated_at)
VALUES (@last_task_id,'www.example1.com','java1','java good1','www.hello.com', NOW(), NOW()),
       (@last_task_id,'www.example2.com','java2','java good2','www.hello.com', NOW(), NOW()),
    (@last_task_id,'www.example3.com','java3','java good3','www.hello.com', NOW(), NOW());