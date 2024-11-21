CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE event(
    id UUID gen_random_uuid() PRIMARY KEY,
    title VARCHAR(30) NOT NULL,
    descript VARCHAR(250) NOT NULL,
    img_url VARCHAR(100) NOT NULL,
    event_url VARCHAR(100) NOT NULL,
    date TIMESTAMP NOT NULL,
    remote BOOLEAN NOT NULL
);