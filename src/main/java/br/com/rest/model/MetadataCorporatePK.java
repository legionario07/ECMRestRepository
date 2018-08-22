package br.com.rest.model;


import java.io.Serializable;

import javax.persistence.Column;

public class MetadataCorporatePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "INVOICE_ID")
	private String invoiceId;
	
	@Column(name = "CUSTOMER_ID")
	private Long customerId;

	@Column(name = "INVOICE_ID_DT4")
	private String invoiceIdDt4;

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getInvoiceIdDt4() {
		return invoiceIdDt4;
	}

	public void setInvoiceIdDt4(String invoiceIdDt4) {
		this.invoiceIdDt4 = invoiceIdDt4;
	}


}
