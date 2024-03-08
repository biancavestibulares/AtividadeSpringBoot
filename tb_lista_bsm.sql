SELECT * FROM db_atividade_canva.tb_lista_bsm;
USE db_atividade_canva;

-- Limpar a tabela
TRUNCATE TABLE tb_lista_bsm;

-- Inserindo os valores a nossa tabela de BSM da generation
INSERT INTO tb_lista_bsm(nomeBSM)
VALUES("Comunicação"),
("Mentalidade de Crescimento"),
("Orientação ao Detalhe"),
("Orientação ao Futuro"),
("Persistência"),
("Proatividade"),
("Responsabilidade Pessoal"),
("Trabalho em Equipe");
