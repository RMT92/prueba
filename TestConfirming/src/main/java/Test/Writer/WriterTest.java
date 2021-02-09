package Test.Writer;

import java.io.FileWriter;
import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import Test.Bean.Proveedor;

@Component
public class WriterTest implements ItemWriter<Proveedor>{

	@Value("${output.file}")
	String file;
	
	@Override
	public void write(List<? extends Proveedor> items) throws Exception {
		FileWriter fw = new FileWriter(file);
		
		for(Proveedor item:items) {
			fw.write(item.toString());
		}
		
		fw.close();
		
	}

}
