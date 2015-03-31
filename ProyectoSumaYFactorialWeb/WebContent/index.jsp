<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8"> 
	<!-- Estilos -->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/estilos.css">
	<!-- JS -->
	<script type="text/javascript" src="js/jquery-2.1.3.min.js"></script>
	<script type="text/javascript" src="js/codigo.js"></script>
	<!--<link href='http://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>-->
	<title>Suma de números y factorial</title>
</head>
<body>
	<!-- Titulo -->
	<header class="text-center well">
	<h1>Suma de números y factorial</h1>
	
		${mensaje} 
	
	</header>
	<!-- Contenido -->
<div id="contenido" class="container">
	<section id="sumarnumeros" class="text-center col-md-3 col-md-offset-3">
	<!-- Formulario para la suma de numeros -->
	<form class="" action="ClaseSuma" method="get">	
		<h3>Suma de números</h3>
		<p>Ingrese los números que desea sumar</p>
		<!-- Entradas de tipo texto -->
		<input type="text" class="entrada" name="dato1" required></imput>
	    <input type="text" class="entrada" name="dato2" required></imput>
		<!-- boton -->
		<div class="col-xs-12">
			<button id="botonsumar" type="submit" value="Comprobar" class="btn btn-info boton">Sumar</button>
		</div>
	</form>	
	<!-- fin del formulario -->
	<div id="respuesta" class="col-xs-12">	
	</div>
	</section>

	<section id="factorialnumero" class="text-center col-md-3">
	<!-- Formulario para el factorial -->
	<form class="" action="ClaseFactorial" method="get">	
		<h3>Factorial de un número</h3>
		<p>Ingrese el numero para calcular factorial</p>
		<!-- Entradas de tipo texto -->
		<input type="text" class="entrada" name="dato3" required></imput>
		<!-- boton -->
		<div class="col-xs-12">
			<button id="botonsumar" type="submit" value="Comprobar" class="btn btn-info boton">Sumar</button>
		</div>
	</form>	
	<!-- fin del formulario -->
	</section>
</div>	
</body>
</html>