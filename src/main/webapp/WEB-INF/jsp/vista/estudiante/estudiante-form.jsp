<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>FORM. Estudiante</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	</head>
	<body>
	<%@ include file="/WEB-INF/jsp/includes/navHeader.jsp" %>
	<div class="container">
			<h1>REGISTRO DE ESTUDIANTE</h1>
				<c:if test="${not empty validador}">
					<div style="background: red; color: yellow; padding: 15px; margin-bottom: 10px;">
						${validador.errores}
					</div>
				</c:if>
			<form method="POST" action="/JAVA-PEOPLE/EstudianteController">
			<input type="hidden" name="id" value="${estudiante.id}" />
			<div class="mb-3">
	  			<label for="nombre" class="form-label">Nombre :</label>
	  			<input type="text" class="form-control" value="${estudiante.nombre}" id="nombre" name="nombre" />
			</div>
			<div class="mb-3">
	  			<label for="rut" class="form-label">Rut :</label>
	  			<input type="text" class="form-control" value="${estudiante.rut}" id="rut" name="rut" />
			</div>
			<div class="mb-3">
	  			<label for="digitoV" class="form-label">Dígito Verificador :</label>
	  			<input type="text" class="form-control" value="${estudiante.digitoV}" id="digitoV" name="digitoV" />
			</div>
			<div class="mb-3">
	  			<label for="genero" class="form-label">Genero :</label>
	  			<input type="text" class="form-control" value="${estudiante.genero}" id="genero" name="genero" />
			</div>
			<div class="mb-3">
	  			<label for="telefono" class="form-label">Telefono :</label>
	  			<input type="text" class="form-control" value="${estudiante.nombre}" id="telefono" name="telefono" />
			</div>
			<!-- <div class="mb-3">
	  			<label for="carrera_id" class="form-label">Carrera:</label>
	  			<select name="carrera_id" id="carrera_id">
	  				<c:forEach var="carrera" items="${carreras}">
	  				<c:choose>
					<c:when test="${carrera.id == alumno.carrera.id}">
						<option selected="selected" value="${carrera.id}">${carrera.nombre}</option>
					</c:when>
					<c:otherwise>
						<option value="${carrera.id}">${carrera.nombre}</option>
					</c:otherwise>
					</c:choose>
					
					</c:forEach>
	  			</select>
			</div>-->
			<button class="btn btn-primary" type="submit">Mostrar</button>
		</form>
		</div>	
		<%@ include file="/WEB-INF/jsp/includes/footerPiePagina.jsp" %>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>	
	</body>
</html>
		
