CREATE TABLE sneakers(
    product_number INTEGER IDENTITY PRIMARY KEY,
    brand TEXT,
    name TEXT ,
    size NUMBER,  
    price NUMBER
);

CREATE TABLE accessories(
    product_number INTEGER IDENTITY PRIMARY KEY,
    type TEXT,
    brand TEXT,
    name TEXT,  
);