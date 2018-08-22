package br.com.rest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "METADADOS")
public class Metadata extends MetadataGeneral implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5669261534442105329L;

	@Id
	@Column(name = "INVOICE_ID")
	private String invoiceId;

	@Column(name = "CUSTOMER_ID")
	private Long customerId;

	@Column(name = "CHARGE_AMOUNT")
	private String chargeAmount;


	@Column(name = "NOTIFIED")
	private Integer notified;

	@Column(name = "SMALL_AMOUNT")
	private Integer smallAmount;

	@Transient
	private String linkInvoice;

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

	public String getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(String chargeAmount) {
		this.chargeAmount = chargeAmount;
	}


	public Integer getNotified() {
		return notified;
	}

	public void setNotified(Integer notified) {
		this.notified = notified;
	}


	public Integer getSmallAmount() {
		return smallAmount;
	}

	public void setSmallAmount(Integer smallAmount) {
		this.smallAmount = smallAmount;
	}


	public String getLinkInvoice() {
		return linkInvoice;
	}

	public void setLinkInvoice(String linkInvoice) {
		this.linkInvoice = linkInvoice;
	}

}


