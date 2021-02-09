package Test.Reader;

import org.apache.log4j.Logger;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import Test.Bean.Proveedor;
import Test.Respository.ProveedorRepo;

@StepScope
public class Reader implements ItemReader<Proveedor>{
	
	public final static Logger LOG = Logger.getLogger(Reader.class);
	
	@Autowired
	private ProveedorRepo repo;
	
	private Proveedor proveedor;
	
	@Value("#jobParameters[id]")
	Integer id;
	
	@Override
	public Proveedor read() {
		
		proveedor = repo.findById(id);
		
		if(proveedor != null) {
			LOG.info(proveedor.toString());
			return proveedor;
		} else {
			LOG.info("El cliente no tiene proveedores");
			return null;
		}
	}

}
