INSERT INTO customer (id, cid, name) VALUES (1, "C001", "Alan Jones");
INSERT INTO customer (id, cid, name) VALUES (2, "C002", "Mary Whelan");
INSERT INTO customer (id, cid, name) VALUES (3, "C003", "Tom O'Connor");
INSERT INTO customer (id, cid, name) VALUES (4, "C004", "Bob Macdonald");
INSERT INTO customer (id, cid, name) VALUES (5, "C005", "Thomas Healy");

INSERT INTO vehicle (id, reg, make, hireable) VALUES (1, "191-G-568", "Toyota Corolla", "false");
INSERT INTO vehicle (id, reg, make, hireable) VALUES (2, "192-MO-9068", "Toyota Yaris", "true");
INSERT INTO vehicle (id, reg, make, hireable) VALUES (3, "191-MO-566", "Honda Civic", "true");
INSERT INTO vehicle (id, reg, make, hireable) VALUES (4, "202-G-1468", "Toyota Corolla", "true");
INSERT INTO vehicle (id, reg, make, hireable) VALUES (5, "191-RN-1234", "Nissan Leaf", "true");

INSERT INTO hires (hid, hire_start_date, cid_fk, reg_fk) VALUES ("H01", "2020-02-02", 1, 2);
INSERT INTO hires (hid, hire_start_date, cid_fk, reg_fk) VALUES ("H02", "2020-04-15", 1, 2);
INSERT INTO hires (hid, hire_start_date, cid_fk, reg_fk) VALUES ("H03", "2021-02-22", 2, 5);
INSERT INTO hires (hid, hire_start_date, cid_fk, reg_fk) VALUES ("H04", "2020-12-17", 3, 2);
INSERT INTO hires (hid, hire_start_date, cid_fk, reg_fk) VALUES ("H05", "2021-11-22", 4, 1);
INSERT INTO hires (hid, hire_start_date, cid_fk, reg_fk) VALUES ("H06", "2020-11-19", 3, 3);
INSERT INTO hires (hid, hire_start_date, cid_fk, reg_fk) VALUES ("H07", "2019-12-04", 3, 2);