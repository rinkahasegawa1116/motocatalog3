-- バイクのデータ
INSERT INTO m_motorcycle (moto_no, moto_name, seat_height, cylinder, cooling, price, comment, brand_id, version, ins_dt, upd_dt) VALUES('001', 'CB400SF', 755, 4, '水冷', 850000, '扱いやすく初心者向け', '01', 1, NOW(), NOW());
INSERT INTO m_motorcycle (moto_no, moto_name, seat_height, cylinder, cooling, price, comment, brand_id, version, ins_dt, upd_dt) VALUES('002', 'Z900RS', 800, 4, '水冷', 1350000, 'ネオクラシックの王道', '02', 1, NOW(), NOW());

-- バイクメーカーのデータ
INSERT INTO m_brand (brand_id, brand_name) VALUES ('01', 'Honda');
INSERT INTO m_brand (brand_id, brand_name) VALUES ('02', 'Kawasaki');
INSERT INTO m_brand (brand_id, brand_name) VALUES ('03', 'Yamaha');
INSERT INTO m_brand (brand_id, brand_name) VALUES ('04', 'Suzuki'); 
INSERT INTO m_brand (brand_id, brand_name) VALUES ('05', 'moto guzzi');
