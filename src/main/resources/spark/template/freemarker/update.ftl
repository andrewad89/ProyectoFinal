<#include "base.ftl">
<#macro content>
<form class="form-horizontal" name="jugador" action="update/${jugador.id}" method="post">
<div class="form-group">
<label for="inputEmail3" class="col-sm-2 control-label">Nombre</label>
<div class="col-sm-10">
<input class="form-control" type="text" name="firstname" value="${jugador.firstname}">
</div>
</div>
<div class="form-group">
<label for="inputPassword3" class="col-sm-2 control-label">Apellido</label>
<div class="col-sm-10">
<input class="form-control" type="text" name="lastname" value="${jugador.lastname}">
</div>
</div>
<div class="form-group">
<label for="inputPassword3" class="col-sm-2 control-label">Fecha de nacimiento: </label>
<div class="col-sm-10">
<input class="form-control" type="text" name="fecha_nac" value="${jugador.fecha_nac}">
</div>
</div>
<div class="form-group">
<label for="inputPassword3" class="col-sm-2 control-label">Salario</label>
<div class="col-sm-10">
<input class="form-control" type="text" name="salario" value="${jugador.salario}">
</div>
<div class="form-group">
<label for="inputPassword3" class="col-sm-2 control-label">Posición</label>
<div class="col-sm-10">
<input class="form-control" type="text" name="posicion" value="${jugador.posicion}">
</div>
<div class="form-group">
<label for="inputPassword3" class="col-sm-2 control-label">Duración contrato</label>
<div class="col-sm-10">
<input class="form-control" type="text" name="duracion" value="${jugador.duracion}">
</div>
<div class="form-group">
</div>
<div class="form-group">
<div class="col-sm-offset-2 col-sm-10">
<input type="submit" value=" Save " />
</div>
</div>
</form>
</#macro>
<@display_page/>