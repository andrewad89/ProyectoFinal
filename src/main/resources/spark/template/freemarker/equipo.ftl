
<#include "base.ftl">


    <#macro content>
        <table class="table table-hover">
            <tr>
            <th>Nombre</th> <th>Apellido</th> <th>Fecha de nacimiento</th> 
            <th>Salario</th> <th>Posici&oacute;n</th> <th>Duraci&oacute;n contrato</th>
            </tr>
            <#list jugadores as jugador>
            <tr>
            <td>${jugador.firstname}</td> <td>${jugador.lastname}</td> 
            <td>${jugador.fecha_nac}</td> <td>${jugador.salario}</td>
            <td>${jugador.posicion}</td> 
            <td>${jugador.duracion}
                &nbsp&nbsp&nbsp&nbsp&nbsp<a href="delete/${jugador.id}" class="btn btn-danger btn-xs">
                   Borrar
                </a>
                &nbsp<a href="updateSearch/${jugador.id}" class="btn btn-warning btn-xs">
                 Actualizar
                </a>
            </td>
            </tr>
            </#list>
        </table>

        <nav>
            <ul class="pagination">
                <li>
                    <a href="#" aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <li><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li>
                    <a href="#" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
            </ul>
        </nav>
    </#macro>
<@display_page/>