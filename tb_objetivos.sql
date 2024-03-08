SELECT * FROM db_atividade_canva.tb_objetivos;
USE db_atividade_canva;

-- Limpar a tabela
TRUNCATE TABLE tb_objetivos;

-- Inserindo os valores a nossa tabela de BSM da generation
INSERT INTO tb_objetivos(objetivo)
VALUES("Comunicação"),
("Mentalidade de Crescimento"),
("Orientação ao Futuro"),
("Responsabilidade Pessoal"),
("Trabalho em Equipe");