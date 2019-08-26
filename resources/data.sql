INSERT INTO grocery_list (list_name)
VALUES ('party'),
       ('pot luck'),
       ('birthday gifts'),
       ('graduation gifts');

INSERT INTO grocery_type (type_name)
VALUES ('food'), ('electronics'), ('clothes');

INSERT INTO grocery_item (item_name, type_id, list_id)
VALUES ('chips', (SELECT type_id FROM grocery_type WHERE 
        grocery_type.type_name = 'food'), (SELECT list_id FROM grocery_list WHERE grocery_list.list_name = 'party')),
        ('blender', (SELECT type_id FROM grocery_type WHERE 
        grocery_type.type_name = 'electronics'), (SELECT list_id FROM grocery_list WHERE grocery_list.list_name = 'graduation gifts')),
        ('hat', (SELECT type_id FROM grocery_type WHERE 
        grocery_type.type_name = 'clothes'), (SELECT list_id FROM grocery_list WHERE grocery_list.list_name = 'birthday gifts'))