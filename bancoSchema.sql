--
-- Application Schema SQL DDL Script
-- Generated with Matisse Schema Definition Language 9.1.10 
--
-- Generation date: Thu Apr 05 06:40:56 2018
-- Generated from database 'banco@LAPTOP-4O3CF97N'
--


CREATE NAMESPACE IF NOT EXISTS banco;

SET CURRENT_NAMESPACE banco;

--
-- Classes Definitions
--

CREATE TABLE IF NOT EXISTS CuentasBancarias (
  Id_CuentaBancaria INTEGER NOT NULL,
  Numero_Cuenta VARCHAR(20) NOT NULL,
  Propietario VARCHAR(20) NOT NULL,
  DNI VARCHAR(20) NOT NULL,
  Saldo INTEGER NOT NULL,
  CONSTRAINT Id_pk UNIQUE (Id_CuentaBancaria),
  CONSTRAINT cuent UNIQUE (Numero_Cuenta),
  CONSTRAINT dn UNIQUE (DNI)
);

CREATE TABLE IF NOT EXISTS Propietarios (
  Id_Propietario INTEGER NOT NULL,
  DNI VARCHAR(20) NOT NULL,
  Usuario VARCHAR(20) NOT NULL,
  Nombre VARCHAR(20) NOT NULL,
  Primer_Apellido VARCHAR(20) NOT NULL,
  Segundo_Apellido VARCHAR(20) NOT NULL,
  Numero_Secreto VARCHAR(20) NOT NULL,
  CONSTRAINT id_prop UNIQUE (Id_Propietario),
  CONSTRAINT dn2 UNIQUE (DNI)
);

CREATE TABLE IF NOT EXISTS Historial (
  Id_Historial INTEGER NOT NULL,
  Tipo_Evento VARCHAR(30) NOT NULL,
  Fecha_Hora VARCHAR(30) NOT NULL,
  Numero_Cuenta VARCHAR(30) NOT NULL,
  CONSTRAINT prim UNIQUE (Id_Historial)
);

CREATE TABLE IF NOT EXISTS Operaciones (
  Id_Operacion INTEGER NOT NULL,
  Fecha_Hora VARCHAR(30) NOT NULL,
  Numero_Cuenta VARCHAR(30) NOT NULL,
  Tipo_Operacion VARCHAR(30) NOT NULL,
  Cantidad INTEGER NOT NULL,
  CONSTRAINT prim2 UNIQUE (Id_Operacion)
);

--
-- Commit the Application Schema Updates
--
COMMIT;

