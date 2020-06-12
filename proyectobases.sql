-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-06-2020 a las 21:07:32
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectobases`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cambio`
--

CREATE TABLE `cambio` (
  `idcambio` int(25) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `idrepuesto` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cambio`
--

INSERT INTO `cambio` (`idcambio`, `descripcion`, `idrepuesto`) VALUES
(7, 'cambio de partes', '11245'),
(8, 'cambio', '14524'),
(9, 'cambio de partes', '1919'),
(10, 'cambio de cosas', '1919'),
(11, 'cambio', '33245');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `idcliente` varchar(12) NOT NULL,
  `nombres` varchar(30) DEFAULT NULL,
  `apellidos` varchar(30) DEFAULT NULL,
  `direccion` varchar(15) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `tipocliente` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`idcliente`, `nombres`, `apellidos`, `direccion`, `telefono`, `tipocliente`) VALUES
('1151652', 'Kevin Enrique', 'Jimenez Sanchez ', 'av9', '3124327475', 'Vip'),
('1151705', 'Jorge Omar', 'Perez Peñaranda', 'chapi', '32525252', 'Normal'),
('45856', 'Juan', 'Palacios', 'av9-263', '3124585458', 'Normal'),
('5611566', 'pepito', 'pepa', '54566', '5651151', 'Normal');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comprar`
--

CREATE TABLE `comprar` (
  `idcompra` int(25) NOT NULL,
  `idrepuestos` varchar(15) NOT NULL,
  `idfactura` int(25) NOT NULL,
  `valor` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `comprar`
--

INSERT INTO `comprar` (`idcompra`, `idrepuestos`, `idfactura`, `valor`) VALUES
(21, '1919', 17, 65000),
(22, '35142', 17, 55000),
(23, '45321', 17, 45000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `diagnostico`
--

CREATE TABLE `diagnostico` (
  `iddiagnostico` int(25) NOT NULL,
  `analisis` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `distribuidor`
--

CREATE TABLE `distribuidor` (
  `iddistribuidor` varchar(15) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `localidad` varchar(15) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `distribuidor`
--

INSERT INTO `distribuidor` (`iddistribuidor`, `nombre`, `localidad`, `telefono`, `email`) VALUES
(' 648133', ' MUNDO PARTES S.A', ' CÚCUTA', ' 3245687789', ' MUNDOPARTES@GMAIL.COM'),
(' 684522', ' ELPO S.A', ' CÚCUTA', ' 3514487645', ' ELPO@HOTMAIL.COM');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `idempleado` varchar(12) NOT NULL,
  `nombres` varchar(30) DEFAULT NULL,
  `apellidos` varchar(30) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `contraseña` varchar(5) DEFAULT NULL,
  `sueldo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`idempleado`, `nombres`, `apellidos`, `direccion`, `telefono`, `contraseña`, `sueldo`) VALUES
('1010119538', 'Jose Alejandro', 'Pacheco Espinoza', 'Cll 9 #32-19 brr el monte', '3223145079', '53624', 1300000),
('1010456879', 'Ruth Elvira', 'Uzcategui Sanchez', 'cll 7 #18-20 brr san juan', '3154780365', '72915', 1300000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE `facturas` (
  `idfactura` int(25) NOT NULL,
  `fecha` date DEFAULT NULL,
  `valor` int(255) DEFAULT NULL,
  `idmatricula` varchar(10) NOT NULL,
  `idcliente` varchar(12) NOT NULL,
  `idmecanico` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `facturas`
--

INSERT INTO `facturas` (`idfactura`, `fecha`, `valor`, `idmatricula`, `idcliente`, `idmecanico`) VALUES
(17, '2020-06-12', 165000, 'hup99e', '1151652', '1003154426');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mecanicoasignado`
--

CREATE TABLE `mecanicoasignado` (
  `idasignado` int(255) NOT NULL,
  `idmecanico` varchar(12) NOT NULL,
  `idmatricula` varchar(10) NOT NULL,
  `idcliente` varchar(12) NOT NULL,
  `revisado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mecanicoasignado`
--

INSERT INTO `mecanicoasignado` (`idasignado`, `idmecanico`, `idmatricula`, `idcliente`, `revisado`) VALUES
(13, '1003154426', 'ads58w', '1151705', 2),
(14, '1003154426', 'hup99e', '1151652', 2),
(15, '1003154426', 'hup99e', '1151652', 2),
(16, '1003154426', 'hup99e', '1151652', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mecanicos`
--

CREATE TABLE `mecanicos` (
  `idmecanico` varchar(12) NOT NULL,
  `nombres` varchar(30) DEFAULT NULL,
  `apellidos` varchar(30) DEFAULT NULL,
  `direccion` varchar(15) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `contraseña` varchar(5) DEFAULT NULL,
  `sueldo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mecanicos`
--

INSERT INTO `mecanicos` (`idmecanico`, `nombres`, `apellidos`, `direccion`, `telefono`, `contraseña`, `sueldo`) VALUES
('1003154426', 'Omar Alejandro', 'Esteban armero', 'cll 5  #8-23 br', '3224875932', '13546', 1650000),
('1123445871', 'Marco Alonso', 'Perez ortega', 'cll 13 #4-22 br', '3154978621', '16478', 1650000),
('9831542117', 'Mateo Gabriel', 'Plata izquial', 'cll 10 #4-07 br', '3134142556', '48219', 1650000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idpedido` int(255) NOT NULL,
  `iddistribuidor` varchar(12) NOT NULL,
  `idrepuesto` varchar(10) NOT NULL,
  `cantidad` int(12) NOT NULL,
  `marca` varchar(15) DEFAULT NULL,
  `modelo` varchar(15) DEFAULT NULL,
  `referencia` varchar(15) DEFAULT NULL,
  `preciounidad` int(11) DEFAULT NULL,
  `valor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idpedido`, `iddistribuidor`, `idrepuesto`, `cantidad`, `marca`, `modelo`, `referencia`, `preciounidad`, `valor`) VALUES
(1, '684522', '465', 20, 'ELM', 'MOTO', 'bandas', 40000, 50000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reparacion`
--

CREATE TABLE `reparacion` (
  `idreparacion` int(25) NOT NULL,
  `descripción` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reportedia`
--

CREATE TABLE `reportedia` (
  `idreportedia` int(25) NOT NULL,
  `fecha` date DEFAULT NULL,
  `idfactura` int(25) NOT NULL,
  `ingresos` int(11) DEFAULT NULL,
  `idcompra` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reportes`
--

CREATE TABLE `reportes` (
  `idreporte` int(25) NOT NULL,
  `descripción` varchar(255) DEFAULT NULL,
  `tiposervicio` varchar(15) DEFAULT NULL,
  `valor` int(11) DEFAULT NULL,
  `idmecanico` varchar(12) NOT NULL,
  `idmatricula` varchar(10) NOT NULL,
  `idcliente` varchar(12) NOT NULL,
  `checkeado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `reportes`
--

INSERT INTO `reportes` (`idreporte`, `descripción`, `tiposervicio`, `valor`, `idmecanico`, `idmatricula`, `idcliente`, `checkeado`) VALUES
(1, 'cambio de partes', 'cambio', 5, '1003154426', 'hup99e', '1151652', 1),
(2, 'cambio de cosas', 'cambio', 648133, '1003154426', 'hup99e', '1151652', 1),
(3, 'cambio', 'cambio', 25, '1003154426', 'hup99e', '1151652', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repuestos`
--

CREATE TABLE `repuestos` (
  `idrepuestos` varchar(15) NOT NULL,
  `marca` varchar(15) DEFAULT NULL,
  `modelo` varchar(15) DEFAULT NULL,
  `referencia` varchar(15) DEFAULT NULL,
  `valor` int(11) DEFAULT NULL,
  `cantidadstock` int(11) DEFAULT NULL,
  `iddistribuidor` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `repuestos`
--

INSERT INTO `repuestos` (`idrepuestos`, `marca`, `modelo`, `referencia`, `valor`, `cantidadstock`, `iddistribuidor`) VALUES
('0', '0', ' 0', '0', 0, 0, '0'),
('11245', 'RPM', ' MOTO', 'bandas', 35000, 684522, '684522'),
('14524', 'continental', ' CARRO', 'valvulas', 55000, 684522, '684522'),
('1919', 'ELECTRO', ' MOTO', 'FUSIBLE', 55000, 648133, '648133'),
('33245', 'VORTEX', ' MOTO', 'Filtro de aire', 25000, 684522, '684522'),
('35142', 'TARANTO', ' CARRO', 'Radiador', 45000, 15, '648133'),
('38542', 'K&N', ' MOTO', 'disco delantero', 15000, 30, '684522'),
('45172', 'RPM', ' MOTO', 'cadena', 30000, 20, '684522'),
('45321', 'NGK', ' CARRO', 'Sensores', 35000, 20, '648133'),
('465', 'ELM', 'MOTO', 'bandas', 50000, 20, '684522'),
('51245', 'PHILIPS', ' CARRO', 'Poleas', 30000, 25, '648133'),
('55421', 'ALLBALLS', ' MOTO', 'aceite', 30000, 20, '684522'),
('64845', 'DZE', ' CARRO', 'relacion', 20000, 34, '648133'),
('777', 'VORTEX', 'CARRO', 'Filtro de aire', 25000, 25, '684522');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculos`
--

CREATE TABLE `vehiculos` (
  `idmatricula` varchar(10) NOT NULL,
  `tipovehiculo` varchar(100) DEFAULT NULL,
  `modelo` varchar(15) DEFAULT NULL,
  `color` varchar(15) DEFAULT NULL,
  `fechaentrada` timestamp NULL DEFAULT current_timestamp(),
  `fechasalida` varchar(500) NOT NULL DEFAULT current_timestamp(),
  `idcliente` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `vehiculos`
--

INSERT INTO `vehiculos` (`idmatricula`, `tipovehiculo`, `modelo`, `color`, `fechaentrada`, `fechasalida`, `idcliente`) VALUES
('hup99e', 'Motocicleta', 'cb110', 'gris', '2020-06-12 18:46:36', '0', '1151652');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculosreg`
--

CREATE TABLE `vehiculosreg` (
  `idmatricula` varchar(12) NOT NULL,
  `tipovehiculo` varchar(100) NOT NULL,
  `modelo` varchar(100) NOT NULL,
  `color` varchar(100) NOT NULL,
  `idcliente` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `vehiculosreg`
--

INSERT INTO `vehiculosreg` (`idmatricula`, `tipovehiculo`, `modelo`, `color`, `idcliente`) VALUES
('ads58w', 'Automovil', '2015', 'gris', '1151705'),
('hup99e', 'Motocicleta', 'cb110', 'gris', '1151652'),
('kjh85', 'Automovil', '2015', 'rojo', '1151705'),
('nhg99e', 'Automovil', '2017', 'gris', '1151705');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cambio`
--
ALTER TABLE `cambio`
  ADD PRIMARY KEY (`idcambio`),
  ADD KEY `idrepuesto` (`idrepuesto`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idcliente`);

--
-- Indices de la tabla `comprar`
--
ALTER TABLE `comprar`
  ADD PRIMARY KEY (`idcompra`),
  ADD KEY `idrepuestos` (`idrepuestos`),
  ADD KEY `idfactura` (`idfactura`);

--
-- Indices de la tabla `diagnostico`
--
ALTER TABLE `diagnostico`
  ADD PRIMARY KEY (`iddiagnostico`);

--
-- Indices de la tabla `distribuidor`
--
ALTER TABLE `distribuidor`
  ADD PRIMARY KEY (`iddistribuidor`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`idempleado`);

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD PRIMARY KEY (`idfactura`),
  ADD KEY `idmecanico` (`idmecanico`),
  ADD KEY `idmatricula` (`idmatricula`),
  ADD KEY `idcliente` (`idcliente`);

--
-- Indices de la tabla `mecanicoasignado`
--
ALTER TABLE `mecanicoasignado`
  ADD PRIMARY KEY (`idasignado`),
  ADD KEY `idmecanico` (`idmecanico`),
  ADD KEY `idmatricula` (`idmatricula`),
  ADD KEY `idcliente` (`idcliente`);

--
-- Indices de la tabla `mecanicos`
--
ALTER TABLE `mecanicos`
  ADD PRIMARY KEY (`idmecanico`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idpedido`),
  ADD KEY `idrepuesto` (`idrepuesto`);

--
-- Indices de la tabla `reparacion`
--
ALTER TABLE `reparacion`
  ADD PRIMARY KEY (`idreparacion`);

--
-- Indices de la tabla `reportedia`
--
ALTER TABLE `reportedia`
  ADD PRIMARY KEY (`idreportedia`),
  ADD KEY `idfactura` (`idfactura`),
  ADD KEY `idcompra` (`idcompra`);

--
-- Indices de la tabla `reportes`
--
ALTER TABLE `reportes`
  ADD PRIMARY KEY (`idreporte`),
  ADD KEY `idmecanico` (`idmecanico`),
  ADD KEY `idmatricula` (`idmatricula`),
  ADD KEY `idcliente` (`idcliente`);

--
-- Indices de la tabla `repuestos`
--
ALTER TABLE `repuestos`
  ADD PRIMARY KEY (`idrepuestos`);

--
-- Indices de la tabla `vehiculos`
--
ALTER TABLE `vehiculos`
  ADD PRIMARY KEY (`idmatricula`),
  ADD KEY `idcliente` (`idcliente`);

--
-- Indices de la tabla `vehiculosreg`
--
ALTER TABLE `vehiculosreg`
  ADD PRIMARY KEY (`idmatricula`),
  ADD KEY `idcliente` (`idcliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cambio`
--
ALTER TABLE `cambio`
  MODIFY `idcambio` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `comprar`
--
ALTER TABLE `comprar`
  MODIFY `idcompra` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `diagnostico`
--
ALTER TABLE `diagnostico`
  MODIFY `iddiagnostico` int(25) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `facturas`
--
ALTER TABLE `facturas`
  MODIFY `idfactura` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `mecanicoasignado`
--
ALTER TABLE `mecanicoasignado`
  MODIFY `idasignado` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idpedido` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `reparacion`
--
ALTER TABLE `reparacion`
  MODIFY `idreparacion` int(25) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reportedia`
--
ALTER TABLE `reportedia`
  MODIFY `idreportedia` int(25) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reportes`
--
ALTER TABLE `reportes`
  MODIFY `idreporte` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cambio`
--
ALTER TABLE `cambio`
  ADD CONSTRAINT `cambio_ibfk_1` FOREIGN KEY (`idrepuesto`) REFERENCES `repuestos` (`idrepuestos`);

--
-- Filtros para la tabla `comprar`
--
ALTER TABLE `comprar`
  ADD CONSTRAINT `comprar_ibfk_1` FOREIGN KEY (`idrepuestos`) REFERENCES `repuestos` (`idrepuestos`),
  ADD CONSTRAINT `comprar_ibfk_2` FOREIGN KEY (`idfactura`) REFERENCES `facturas` (`idfactura`);

--
-- Filtros para la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD CONSTRAINT `facturas_ibfk_1` FOREIGN KEY (`idmecanico`) REFERENCES `mecanicos` (`idmecanico`),
  ADD CONSTRAINT `facturas_ibfk_2` FOREIGN KEY (`idmatricula`) REFERENCES `vehiculosreg` (`idmatricula`),
  ADD CONSTRAINT `facturas_ibfk_3` FOREIGN KEY (`idcliente`) REFERENCES `clientes` (`idcliente`);

--
-- Filtros para la tabla `mecanicoasignado`
--
ALTER TABLE `mecanicoasignado`
  ADD CONSTRAINT `mecanicoasignado_ibfk_1` FOREIGN KEY (`idmecanico`) REFERENCES `mecanicos` (`idmecanico`),
  ADD CONSTRAINT `mecanicoasignado_ibfk_2` FOREIGN KEY (`idmatricula`) REFERENCES `vehiculosreg` (`idmatricula`),
  ADD CONSTRAINT `mecanicoasignado_ibfk_3` FOREIGN KEY (`idcliente`) REFERENCES `clientes` (`idcliente`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`idrepuesto`) REFERENCES `repuestos` (`idrepuestos`);

--
-- Filtros para la tabla `reportedia`
--
ALTER TABLE `reportedia`
  ADD CONSTRAINT `reportedia_ibfk_1` FOREIGN KEY (`idfactura`) REFERENCES `facturas` (`idfactura`),
  ADD CONSTRAINT `reportedia_ibfk_2` FOREIGN KEY (`idcompra`) REFERENCES `comprar` (`idcompra`);

--
-- Filtros para la tabla `reportes`
--
ALTER TABLE `reportes`
  ADD CONSTRAINT `reportes_ibfk_1` FOREIGN KEY (`idmecanico`) REFERENCES `mecanicos` (`idmecanico`),
  ADD CONSTRAINT `reportes_ibfk_2` FOREIGN KEY (`idmatricula`) REFERENCES `vehiculosreg` (`idmatricula`),
  ADD CONSTRAINT `reportes_ibfk_3` FOREIGN KEY (`idcliente`) REFERENCES `clientes` (`idcliente`);

--
-- Filtros para la tabla `vehiculos`
--
ALTER TABLE `vehiculos`
  ADD CONSTRAINT `vehiculos_ibfk_1` FOREIGN KEY (`idcliente`) REFERENCES `clientes` (`idcliente`);

--
-- Filtros para la tabla `vehiculosreg`
--
ALTER TABLE `vehiculosreg`
  ADD CONSTRAINT `vehiculosreg_ibfk_1` FOREIGN KEY (`idcliente`) REFERENCES `clientes` (`idcliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
