CREATE TABLE users
(
    id       BIGSERIAL PRIMARY KEY, -- Auto-incrementing ID column
    username VARCHAR(255) NOT NULL, -- Username column, assuming a max length of 255 characters
    password VARCHAR(255) NOT NULL, -- Password column for storing hashed passwords
    email    VARCHAR(255)           -- Email column, optional (can be set to NOT NULL if needed)
);