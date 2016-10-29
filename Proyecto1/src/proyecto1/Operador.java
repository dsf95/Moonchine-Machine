/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.ArrayList;

public class Operador {
	private int cantMaquinasRep;
	private String nombre;
	private int cedula;
	static ArrayList<Solicitud> listaSolicitudes = new ArrayList<Solicitud>();
	private String problemaMaqui;
	private String solucionProblem;
	
	public Operador(){
		
	}
	
	public int getCantMaquinasRep(){
		
		return cantMaquinasRep;
	}
	
	public String getNombre(){
		
		return nombre;
	}
	
	public int getCedula(){
		
		return cedula;
	}

        public static ArrayList<Solicitud> getListaSolicitudes() {
            return listaSolicitudes;
        }

        public static void setListaSolicitudes(ArrayList<Solicitud> listaSolicitudes) {
            Operador.listaSolicitudes = listaSolicitudes;
        }
	
	
	
	public String getProblemaMaqui(){
		
		return problemaMaqui;
	}
	
	public String getSolucionProblem(){
		
		return solucionProblem;
	}
	
	private void setCantMaquinasRep(int cantMaquinasRep){
		
		this.cantMaquinasRep = cantMaquinasRep;
	}
	
	public void setNombre(String nombre){
		
		this.nombre = nombre;
	}
	
	public void setNombre(int cedula){
	
		this.cedula = cedula;
	}
	
	
	
	public void setProblemaMaqui(String problemaMaqui){
		
		this.problemaMaqui = problemaMaqui;
	}
	
	public void setSolucionProblem(String solucionProblem){
		
		this.solucionProblem = solucionProblem;
	}

}
