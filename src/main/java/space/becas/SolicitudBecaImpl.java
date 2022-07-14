package space.becas;

import javax.jws.WebService;

@WebService(endpointInterface = "space.becas.SolicitudBeca")
public class SolicitudBecaImpl implements SolicitudBeca {

	@Override
	public Solicitud solicitarBeca(Solicitud solicitud) {
		
		System.out.println("Solicitud de beca " + solicitud);
		
		return solicitud;
	}
	
	

}
