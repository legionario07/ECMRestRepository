package br.com.rest.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class MetadataGeneral implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 659785409330301814L;

	@Column(name = "DUE_DATE")
	private Date dueDate;

	@Column(name = "CUST_CODE")
	private String customerCode;

	@Column(name = "INVOICE_TYPE")
	private String invoiceType;

	@Column(name = "BUSINESS_UNIT")
	private String businessUnitStr;

	@Column(name = "BARCODE")
	private String barcode;

	@Column(name = "CPF_CNPJ")
	private String cpfCnpj;

	@Column(name = "CUT_DATE")
	private Date cutDate;

	@Column(name = "PAYMENT_TYPE")
	private String paymentType;

	@Column(name = "CUSTOMER_NAME")
	private String customerName;

	@Column(name = "FILE_NAME")
	private String fileName;

	@Column(name = "LXF_FULL")
	private Long lxfFull;

	@Column(name = "LXF_RESUMIDA")
	private Long lxfResumida;

	@Column(name = "LXF_BRAILLE")
	private Long lxfBraille;

	@Column(name = "XML_ID")
	private Long xmlId;

	@Column(name = "LXF_DETALHADA")
	private Long lxfDetalhada;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "LXF_NF")
	private Long lxfNf;

	@Column(name = "IDNF")
	private String idnf;

	@Column(name = "PARENT_ID")
	private Long parentId;

	@Column(name = "TXT_ID")
	private Long txtId;

	@Column(name = "DACID")
	private String daCid;

	@Column(name = "ISSUE_DATE")
	private Date issueDate;

	@Column(name = "CS_ID")
	private String csId;

	@Column(name = "COST_CENTER")
	private String costCenter;
	
	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getBusinessUnitStr() {
		return businessUnitStr;
	}

	public void setBusinessUnitStr(String businessUnit) {
		this.businessUnitStr = businessUnit;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Date getCutDate() {
		return cutDate;
	}

	public void setCutDate(Date cutDate) {
		this.cutDate = cutDate;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Long getLxfFull() {
		return lxfFull;
	}

	public void setLxfFull(Long lxfFull) {
		this.lxfFull = lxfFull;
	}

	public Long getLxfResumida() {
		return lxfResumida;
	}

	public void setLxfResumida(Long lxfResumida) {
		this.lxfResumida = lxfResumida;
	}

	public Long getLxfBraille() {
		return lxfBraille;
	}

	public void setLxfBraille(Long lxfBraille) {
		this.lxfBraille = lxfBraille;
	}

	public Long getXmlId() {
		return xmlId;
	}

	public void setXmlId(Long xmlId) {
		this.xmlId = xmlId;
	}

	public Long getLxfDetalhada() {
		return lxfDetalhada;
	}

	public void setLxfDetalhada(Long lxfDetalhada) {
		this.lxfDetalhada = lxfDetalhada;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getLxfNf() {
		return lxfNf;
	}

	public void setLxfNf(Long lxfNf) {
		this.lxfNf = lxfNf;
	}

	public String getIdnf() {
		return idnf;
	}

	public void setIdnf(String idnf) {
		this.idnf = idnf;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getTxtId() {
		return txtId;
	}

	public void setTxtId(Long txtId) {
		this.txtId = txtId;
	}

	public String getDaCid() {
		return daCid;
	}

	public void setDaCid(String daCid) {
		this.daCid = daCid;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public String getCsId() {
		return csId.toLowerCase();
	}

	public void setCsId(String csId) {
		this.csId = csId;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	
}