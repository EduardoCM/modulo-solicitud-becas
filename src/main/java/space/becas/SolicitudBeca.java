package space.becas;

import javax.jws.WebService;

@WebService
public interface SolicitudBeca {

	public Solicitud solicitarBeca(Solicitud solicitud);
}
