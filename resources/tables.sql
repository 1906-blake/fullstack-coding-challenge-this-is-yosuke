CREATE TABLE grocery_list (
    list_id SERIAL PRIMARY KEY,
    list_name TEXT NOT NULL
)

CREATE TABLE grocery_type (
    type_id SERIAL PRIMARY KEY,
    type_name TEXT NOT NULL
)

CREATE TABLE grocery_item (
    item_id SERIAL PRIMARY KEY,
    item_name TEXT NOT NULL,
    type_id INTEGER REFERENCES grocery_type (type_id),
    list_id INTEGER REFERENCES grocery_list (list_id)
)