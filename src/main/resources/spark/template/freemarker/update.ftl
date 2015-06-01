<#include "base.ftl">
	<#macro content>
		<div id="content">
			<br>
			<form class="form-horizontal" name="añadeJugador" action="update/${jugador.id}" method="post">
			  <div class="form-group">
			    <label for="firstname" class="col-sm-2 control-label">Nombre</label>
			    <div class="col-xs-4">
			    <input type="nombre" class="form-control" name="firstname" value="${jugador.firstname}" placeholder="Introduce el nombre">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="lastname" class="col-sm-2 control-label">Apellido</label>
			    <div class="col-xs-4">
			    	<input type="apellido" class="form-control" name="lastname" value="${jugador.lastname}" placeholder="Introduce el apellido">
			    </div>
			  </div>
				  <div class="form-group">
				  	<label for="fecha_nac" class="col-sm-2 control-label">Fecha de nacimento</label>
				  	<div class="col-xs-4">
				      <input type="text" class="form-control" name="fecha_nac" value="${jugador.fecha_nac}" placeholder="Introduce la fecha de nacimiento">
				    </div>
				  </div>
			  <div class="form-group">
			    <label for="salario" class="col-sm-2 control-label">Salario</label>
			    <div class="col-xs-4">
			    	<input type="salario" class="form-control" name="salario" value="${jugador.salario}" placeholder="Introduce el salario">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="posicion" class="col-sm-2 control-label">Posici&oacute;n</label>
			    <div class="col-xs-4">
			    	<input type="posicion" class="form-control" name="posicion" value="${jugador.posicion}" placeholder="Introduce la posici&oacute;n">
			    </div>
			  </div>
			   <div class="form-group">
			    <label for="duracion" class="col-sm-2 control-label">Duraci&oacute;n</label>
			    <div class="col-xs-4">
			    	<input type="duracion" class="form-control" name="duracion" value="${jugador.duracion}" placeholder="Introduce la duraci&oacute;n del contrato">
			    </div>
			  </div>
			  <div class="botones">
			  <button type="submit" class="btn btn-primary">Modificar</button>
			  </div>
			</form>
		</div>
	</#macro>
<@display_page/>