<#include "base.ftl">
<#macro content>
<div id="content">
<fieldset>
<legend> Agrega un jugador</legend>
<form name="jugador" action="create" method="post">
    Nombre: <input type="text" name="firstname" /> <br/>
    Apellido: <input type="text" name="lastname" /> <br/>
    Fecha de nacimiento: <input type="text" name="fecha_nac" /> <br/>
    Salario: <input type="text" name="salario" /> <br/>
    Posicion: <input type="text" name="posicion" /> <br/>
    Duracion contrato: <input type="text" name="duracion" /> <br/>
<input type="submit" value=" Save " />
</form>
</fieldset>
</div>
</#macro>
<@display_page/>