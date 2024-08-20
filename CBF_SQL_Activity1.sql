CREATE DATABASE IF NOT EXISTS InstaBook; 
USE InstaBook;
CREATE TABLE Profiles (
ProfileId int NOT NULL AUTO_INCREMENT PRIMARY KEY,
FullName VARCHAR (255) NOT NULL, -- Supply values when making a new column
UserHandle VARCHAR(255) NOT NULL,
EmailAddress VARCHAR(255) NOT NULL,
Description VARCHAR(1000) NULL, 
Picture VARCHAR(500) NULL
);

ALTER TABLE Profiles
ADD dob DATE;

INSERT INTO Profiles (FullName, UserHandle, EmailAddress) -- The brackets tell me what column we want to enter data into. We can't provide the ProfileId because it's the Primary Key 
VALUES ('Andrew Jackson', '@Andrew', 'andrew@gmail.com'); -- For multiple values, instead of ending this line with a semi-colon, you'd end with a comma and input more data for the next row without adding VALUES on each new line, just VALUES on the first line
-- To query something, enter SELECT * FROM Profiles

CREATE TABLE Posts(
   PostId       bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
   ProfileId    int NOT NULL ,
   PostDate     datetime NOT NULL,
   PostPicture  varchar(500) NOT NULL,
   PostCaption  varchar(500) NULL
 );

CREATE TABLE Comments(
   CommentId    bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
   PostId       bigint NOT NULL ,
   ProfileId    int NOT NULL ,
   CommentDate  datetime NOT NULL,
   CommentText  varchar(1000) NULL
 );

ALTER TABLE Posts    ADD CONSTRAINT FK_PostProfile FOREIGN KEY (ProfileId) REFERENCES Profiles(ProfileId);
ALTER TABLE Comments ADD CONSTRAINT FK_CommentPost FOREIGN KEY (PostId) REFERENCES Posts(PostId);
ALTER TABLE Comments ADD CONSTRAINT FK_CommentProfile FOREIGN KEY (ProfileId) REFERENCES Profiles(ProfileId);

INSERT INTO Profiles(FullName,UserHandle,EmailAddress,Description,Picture,DOB) VALUES('serena williams','serenawilliams','serena@tennis.com','I''m Olympia''s mom. @serena ships WORLDWIDE www.serenawilliams.com','serena.jpg', '10.03.1999');
INSERT INTO Profiles(FullName,UserHandle,EmailAddress,Description,Picture) VALUES('Beyoncé Giselle Knowles-Carter','beyoncé','bey@sashafierce.com','tiny.cc/6y3mnz','beyonce.png');
INSERT INTO Profiles(FullName,UserHandle,EmailAddress,Description,Picture) VALUES('Jane Doe','janedow','janedoe@gmail.com',NULL,NULL);

INSERT INTO Posts(ProfileId,PostDate,PostPicture,PostCaption) VALUES(1,'2019/01/24','Instafab.acs73d','Best tennis racket ever');
INSERT INTO Posts(ProfileId,PostDate,PostPicture,PostCaption) VALUES(1,'2020/02/02','Instafab.8iqfa','Picture of me on a magazine');
INSERT INTO Posts(ProfileId,PostDate,PostPicture,PostCaption) VALUES(2,'2020/04/29','Instafab.0d9ass','Jay and me with Blue Ivy');
INSERT INTO Posts(ProfileId,PostDate,PostPicture,PostCaption) VALUES(2,'2020/03/01','Instafab.aoijs','Hi bee hive');

INSERT INTO Comments(PostId,ProfileId,CommentDate,CommentText) VALUES(1,3,'2020/03/11','😍😍😍!');
INSERT INTO Comments(PostId,ProfileId,CommentDate,CommentText) VALUES(3,3,'2020/04/02','🐝😊🥺😉😍😘😚😜😂😝😳😁😣😢');

SELECT * FROM Profiles;