
<#include "base.ftl">


    <#macro content>
        <div id="content">
            <br>
            <table class="table table-hover">
                <tr>
                <th>Nombre</th> <th>Apellido</th> <th>Fecha de nacimiento</th> 
                <th>Salario</th> <th>Posici&oacute;n</th> <th>Duraci&oacute;n contrato</th>
                <th></th>
                </tr>
                <#list jugadores as jugador>
                <tr>
                <td>${jugador.firstname}</td> <td>${jugador.lastname}</td> 
                <td>${jugador.fecha_nac}</td> <td>${jugador.salario}</td>
                <td>${jugador.posicion}</td> 
                <td>${jugador.duracion}</td>
                <td>
                    <a href="/delete/${jugador.id}" class="btn btn-danger btn-xs">
                       Borrar
                    </a>
                    <a href="/updateSearch/${jugador.id}" class="btn btn-warning btn-xs">
                     Actualizar
                    </a>
                </td>
                </tr>
                </#list>
            </table>
        </div>
    </#macro>
<@display_page/>