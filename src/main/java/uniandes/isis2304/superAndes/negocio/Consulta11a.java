/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * UniversidClientead	de	los	Andes	(Bogotá	- Colombia)
 * Departamento	de	Ingeniería	de	Sistemas	y	Computación
 * Licenciado	bajo	el	esquema	Academic Free License versión 2.1
 * 		
 * Curso: isis2304 - Sistemas Transaccionales
 * Proyecto: Parranderos Uniandes
 * @version 1.0
 * @author Germán Bravo
 * Julio de 2018
 * 
 * Revisado por: Claudia Jiménez, Christian Ariza
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.isis2304.superAndes.negocio;

import java.sql.Timestamp;
import java.util.List;

/**
 * Clase para modelar el concepto BAR del negocio de los Parranderos
 *
 */
public class Consulta11a 
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/



	private int idCliente;

	private int puntosDeCompra;


	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/

	public Consulta11a() 
	{
		this.idCliente = 0;
		this.puntosDeCompra = 0;
	}




	public Consulta11a(int idCliente, int puntosDeCompra) {
		this.idCliente = idCliente;
		this.puntosDeCompra = puntosDeCompra;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getPuntosDeCompra() {
		return puntosDeCompra;
	}

	public void setPuntosDeCompra(int puntosDeCompra) {
		this.puntosDeCompra = puntosDeCompra;
	}

	




	@Override
	public String toString() 
	{
		String resp = "Consulta11 [idCliente=" + idCliente +
				", puntosDeCompra=" + puntosDeCompra +
				"]";

		return resp;

	}



}
