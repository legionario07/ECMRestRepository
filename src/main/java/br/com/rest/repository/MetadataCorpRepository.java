package br.com.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.rest.model.MetadataCorporate;

@RepositoryRestResource(path="metadados_corp")
public interface MetadataCorpRepository extends JpaRepository<MetadataCorporate, String>, PagingAndSortingRepository<MetadataCorporate, String>{

	/**
	 * Pesquisa pelo InvoiceId
	 * @param invoiceId
	 * @return
	 */
	MetadataCorporate findByInvoiceId(@Param(value = "invoiceId") String invoiceId);
	List<MetadataCorporate> findTop2ByOrderByInvoiceIdAsc();
	List<MetadataCorporate> findByCustomerId(@Param(value = "customerId") Long customerId);
	List<MetadataCorporate> findByCustomerCode(@Param(value = "customerCode") String customerId);
	List<MetadataCorporate> findByCpfCnpj(@Param(value = "cpfCnpj") String cpfCnpj);
	List<MetadataCorporate> findByCustomerName(@Param(value = "customerName") String customerName);
	List<MetadataCorporate> findByChargeAmount(@Param(value = "chargeAmount") String chargeAmount);
	List<MetadataCorporate> findByEmail(@Param(value = "email") String email);
	List<MetadataCorporate> findByIdnf(@Param(value = "idnf") String idnf);
	List<MetadataCorporate> findByPaymentResp(@Param(value = "paymentResp") Long paymentResp);
	List<MetadataCorporate> findByCustomerIdHigh(@Param(value = "customerIdHigh") Long customerIdHigh);
	List<MetadataCorporate> findByBarcode(@Param(value = "barcode") String barcode);
	
	
	
}
