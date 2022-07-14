package space.becas;

import java.io.Serializable;

public class Solicitud implements Serializable {

	private static final long serialVersionUID = 204613367237548192L;

	private String nombreSolicitante;

	private String temaEstudiarBeca;

	private String lugarEstudio;

	public String getNombreSolicitante() {
		return nombreSolicitante;
	}

	public void setNombreSolicitante(String nombreSolicitante) {
		this.nombreSolicitante = nombreSolicitante;
	}

	public String getTemaEstudiarBeca() {
		return temaEstudiarBeca;
	}

	public void setTemaEstudiarBeca(String temaEstudiarBeca) {
		this.temaEstudiarBeca = temaEstudiarBeca;
	}

	public String getLugarEstudio() {
		return lugarEstudio;
	}

	public void setLugarEstudio(String lugarEstudio) {
		this.lugarEstudio = lugarEstudio;
	}

	@Override
	public String toString() {
		return "Solicitud [nombreSolicitante=" + nombreSolicitante + ", temaEstudiarBeca=" + temaEstudiarBeca
				+ ", lugarEstudio=" + lugarEstudio + "]";
	}
	
	

}
