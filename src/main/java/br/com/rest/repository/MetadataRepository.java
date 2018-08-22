package br.com.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.rest.model.Metadata;

@RepositoryRestResource(path="metadados")
public interface MetadataRepository extends JpaRepository<Metadata, String>, PagingAndSortingRepository<Metadata, String>{

	
	Metadata findByInvoiceId(@Param(value = "invoiceId") String invoiceId);
	List<Metadata> findTop2ByOrderByInvoiceIdAsc();
	List<Metadata> findByCustomerId(@Param(value = "customerId") Long customerId);
	List<Metadata> findByCustomerCode(@Param(value = "customerCode") String customerId);
	List<Metadata> findByCpfCnpj(@Param(value = "cpfCnpj") String cpfCnpj);
	List<Metadata> findByCustomerName(@Param(value = "customerName") String customerName);
	List<Metadata> findByChargeAmount(@Param(value = "chargeAmount") String chargeAmount);
	List<Metadata> findByEmail(@Param(value = "email") String email);
	List<Metadata> findByIdnf(@Param(value = "idnf") String idnf);
	
	
	
}
