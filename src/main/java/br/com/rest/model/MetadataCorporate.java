package br.com.rest.model;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@IdClass(MetadataCorporatePK.class)
@Table(name = "METADADOS_CORP")
public class MetadataCorporate extends MetadataGeneral implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5669261534442105329L;

	@Id
	private String invoiceId;

	@Id
	private Long customerId;
	
	@Id
	private String invoiceIdDt4;
	
	@Column(name = "BILLCYCLE")
	private Long billCycle;

	@Column(name = "CUSTOMER_ID_HIGH")
	private Long customerIdHigh;

	@Column(name = "LARGE_ACCOUNT_LEVEL")
	private Long largeAccountLevel;

	@Column(name = "PAYMENT_RESP")
	private Long paymentResp;

	@Column(name = "CHARGE_AMOUNT")
	private BigDecimal chargeAmount;

	@Column(name = "FEBRABAN_BB_ID")
	private Long febrabanBBId;

	@Column(name = "FEBRABAN_V2_ID")
	private Long febrabanV2Id;

	@Column(name = "FEBRABAN_V3_ID")
	private Long febrabanV3Id;
	
	@Column(name = "MDB_ID")
	private Long mdbId;
	
	
	@Column(name = "ACCESS_NR")
	private int accessNr;
	
	@Column(name = "PDF_FULL")
	private Long pdfFull;
	
	@Column(name = "PDF_RESUMIDA")
	private Long pdfResumida;
	
	@Column(name = "PDF_DETALHADA")
	private Long pdfDetalhada;
	
	@Column(name = "PDF_NF")
	private Long pdfNf;
	
	
	public Long getPdfFull() {
		return pdfFull;
	}

	public void setPdfFull(Long pdfFull) {
		this.pdfFull = pdfFull;
	}

	public Long getPdfResumida() {
		return pdfResumida;
	}

	public void setPdfResumida(Long pdfResumida) {
		this.pdfResumida = pdfResumida;
	}

	public Long getPdfDetalhada() {
		return pdfDetalhada;
	}

	public void setPdfDetalhada(Long pdfDetalhada) {
		this.pdfDetalhada = pdfDetalhada;
	}

	public Long getPdfNf() {
		return pdfNf;
	}

	public void setPdfNf(Long pdfNf) {
		this.pdfNf = pdfNf;
	}

	public int getAccessNr() {
		return accessNr;
	}

	public void setAccessNr(int accessNr) {
		this.accessNr = accessNr;
	}

	@Transient
	private String linkInvoice;
	
	public Long getBillCycle() {
		return billCycle;
	}

	public void setBillCycle(Long billCycle) {
		this.billCycle = billCycle;
	}

	public Long getCustomerIdHigh() {
		return customerIdHigh;
	}

	public void setCustomerIdHigh(Long customerIdHigh) {
		this.customerIdHigh = customerIdHigh;
	}

	public Long getLargeAccountLevel() {
		return largeAccountLevel;
	}

	public void setLargeAccountLevel(Long largeAccountLevel) {
		this.largeAccountLevel = largeAccountLevel;
	}

	public Long getPaymentResp() {
		return paymentResp;
	}

	public void setPaymentResp(Long paymentResp) {
		this.paymentResp = paymentResp;
	}

	public BigDecimal getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(BigDecimal chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public Long getFebrabanBBId() {
		return febrabanBBId;
	}

	public void setFebrabanBBId(Long febrabanBBId) {
		this.febrabanBBId = febrabanBBId;
	}

	public Long getFebrabanV2Id() {
		return febrabanV2Id;
	}

	public void setFebrabanV2Id(Long febrabanV2Id) {
		this.febrabanV2Id = febrabanV2Id;
	}

	public Long getFebrabanV3Id() {
		return febrabanV3Id;
	}

	public void setFebrabanV3Id(Long febrabanV3Id) {
		this.febrabanV3Id = febrabanV3Id;
	}

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

	public void setInvoiceIdDt4(String invoiceIdDT4) {
		this.invoiceIdDt4 = invoiceIdDT4;
	}
	
	public Long getMdbId() {
		return mdbId;
	}

	public void setMdbId(Long mdbBBId) {
		this.mdbId = mdbBBId;
	}
	
	public String getLinkInvoice() {
		return linkInvoice;
	}

	public void setLinkInvoice(String linkInvoice) {
		this.linkInvoice = linkInvoice;
	}

}