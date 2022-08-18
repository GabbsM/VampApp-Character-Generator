CREATE TABLE DATOSPJ(

     ID          INTEGER         NOT NULL,
     NOMBRE      VARCHAR(50)             ,
     JUGADOR     VARCHAR(50)             ,
     CRONICA     VARCHAR(50)             ,
     CONDUCTA    VARCHAR(50)             ,
     CONCEPTO    VARCHAR(50)             ,
     GENERACION  VARCHAR(50)             ,
     REFUGIO     VARCHAR(50)             ,


     PRIMARY KEY(ID)

);


CREATE TABLE CLAN (

        ID          INTEGER             NOT NULL,
        CLAN        VARCHAR(50)                 ,
        DISCIPLINA1 VARCHAR(50)                 ,
        DISCIPLINA2 VARCHAR(50)                 ,
        DISCIPLINA3 VARCHAR(50)                 ,

        PRIMARY KEY(ID)

);

CREATE TABLE ATRIBUTOS(

        ID          INTEGER             NOT NULL,
        FISICOS     INTEGER                     ,
        SOCIALES    INTEGER                     ,
        MENTALES    INTEGER                     ,

        PRIMARY KEY(ID)

);

CREATE TABLE HABILIDADES(

        ID              INTEGER             NOT NULL,
        TALENTOS        INTEGER                     ,
        TECNICAS        INTEGER                     ,
        CONOCIMIENTOS   INTEGER                     ,

        PRIMARY KEY(ID)

);

CREATE TABLE VENTAJAS(

        ID              INTEGER             NOT NULL,
        ALIADOS         INTEGER                     ,
        CONTACTOS       INTEGER                     ,
        GENERACION      INTEGER                     ,
        CRIADOS         INTEGER                     ,
        INFLUENCIA      INTEGER                     ,
        MENTOR          INTEGER                     ,
        REBANIO         INTEGER                     ,
        RECURSOS        INTEGER                     ,
        POSICION        INTEGER                     ,

    PRIMARY KEY(ID)

);