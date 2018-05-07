DROP TABLE IF EXISTS users;
CREATE TABLE users (
		geid VARCHAR(20) PRIMARY KEY NOT NULL
		,soeid VARCHAR(10)
		,name VARCHAR(255)
		,location VARCHAR(255)
		);

INSERT INTO users
VALUES (
	'1234567891'
	,'SS12345'
	,'Saitama Sensei'
	,'Nippon'
	);

INSERT INTO users
VALUES (
	'1234567890'
	,'YL12345'
	,'Yagami Light'
	,'Osaka'
	);

SELECT *
FROM users;

DROP TABLE IF EXISTS skills;
CREATE TABLE skills (
		id INT PRIMARY KEY AUTO_INCREMENT NOT NULL
		,name VARCHAR(255)
		);

INSERT INTO skills
VALUES ('JAVA');

INSERT INTO skills
VALUES ('PYTHON');

SELECT *
FROM skills;

DROP TABLE IF EXISTS challenges;
CREATE TABLE challenges (
		id INT PRIMARY KEY AUTO_INCREMENT NOT NULL
		,name VARCHAR(255) NOT NULL
		,content VARCHAR(4000)
		,LEVEL INT
		,skill_id INT
		,FOREIGN KEY (skill_id) REFERENCES skills(id)
		);

INSERT INTO challenges (
	name
	,content
	,LEVEL
	,skill_id
	)
VALUES (
	'TRAINING'
	,'DO TRAINING'
	,1
	,1
	);

INSERT INTO challenges (
	name
	,content
	,LEVEL
	,skill_id
	)
VALUES (
	'PROJECT'
	,'DO PROJECT'
	,3
	,2
	);

SELECT *
FROM challenges;

DROP TABLE IF EXISTS user_skills;
CREATE TABLE user_skills (
		geid VARCHAR(20)
		,skill_id INT
		,LEVEL INT NOT NULL
		,is_certified VARCHAR(10)
		,FOREIGN KEY (geid) REFERENCES users(geid)
		,FOREIGN KEY (skill_id) REFERENCES skills(id)
		);

INSERT INTO user_skills
VALUES (
	'1234567891'
	,1
	,1
	,'Y'
	);

INSERT INTO user_skills
VALUES (
	'1234567890'
	,1
	,4
	,'N'
	);

SELECT *
FROM user_skills;

DROP TABLE IF EXISTS user_challenges;
CREATE TABLE user_challenges (
		geid VARCHAR(20)
		,skill_id INT
		,challenge_id INT
		,FOREIGN KEY (geid) REFERENCES users(geid)
		,FOREIGN KEY (challenge_id) REFERENCES challenges(id)
		,FOREIGN KEY (skill_id) REFERENCES skills(id)
		);

INSERT INTO user_challenges
VALUES (
	'1234567891'
	,1
	,7
	);

INSERT INTO user_challenges
VALUES (
	'1234567890'
	,2
	,8
	);

SELECT *
FROM user_challenges;