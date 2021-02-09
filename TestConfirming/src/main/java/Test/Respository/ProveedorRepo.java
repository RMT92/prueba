package Test.Respository;

import org.springframework.stereotype.Repository;

import Test.Bean.Proveedor;

@Repository
public interface ProveedorRepo extends JpaRepository<Proveedor, Integer>{

	Proveedor findById(Integer id);
}
