package com.simon.loan.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_loans")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nums;
	private String seqId;
	private String loanOrgName;
	private String remark;
	private String province;
	private String city;
	private String loanBankName;
	private String loanBeginDate;
	private String loanEndDate;
	private String oriLoanSum;
	private String banlance2012First;
	private String grantLoanSum;
	private String backLoanSum;
	private String banlance2012End;
	private String unBackLoanSum;
	private String industry;
	private String auditDocuments;
	private String enterpriseStatus;
	private String dtail;
	private String type;
	private String recommendedVerification;
	private String sumPrincipal2014End;
	private String sumCapital2014End;
	private String sumInterest2014End;
	private String loanValue;
	private String loanBackRate;
	private String principalValue;
	private String principalBackRate;
	private String interestValue;
	private String interestBackRate;
	private String principalManageCost;
	private String interestManageCost;
	private String totManageCost;
	private String totPresentValue;
	private String principalPresentValue;
	private String principalDiscountAmt;
	private String principalPresentValueRate;
	private String estimateBackPrincipal;
	private String estimate5BackPrincipalCost;
	private String backPrincipal2015;
	private String backPrincipal2016;
	private String backPrincipal2017;
	private String backPrincipal2018;
	private String backPrincipal2019;
	private String interestPresentValue;
	private String interestDiscountCost;
	private String estimateBackInterest;
	private String estimate5BackDiscountRate;
	private String backInterest2015;
	private String backInterest2016;
	private String backInterest2017;
	private String backInterest2018;
	private String backInterest2019;
	private String principalAndInteresUncludeFee;
	private String unhealthyLoanBack;
	private String notBackloan;
	private String unhealthyLoanRate;
	private String principalUncludeFee;
	private String unhealthyLoanBackAmt;
	private String loanPrincipalCostRate;
	private String loanRiskWeight;
	private String loanEnterpriseCredit;
	private String loanType;
	private String loanAssetsCoefficient;
	private String interesBackUncludeFee;
	private String unhealthyLoanInteresBackAmt;
	private String interesBackAverageRate;
	private String interesConstRate;
	private String loanEnterpriseCredit_;
	private String loanAssetsCoefficient_;
	private String loanTransactBankName;
	private String loanTransacter;
	private String loanTransacterMobile;
	private String loanCurrentOrgName;
	private String loanUserMobile;
	//司资产总额/负债总额
	private String companyLiabilitiesAmt;
	private String payOrgName;
	private String controller;
	private String isSignContracted;
	private String isAccountStatement;
	private String isBankVerify;
	private String unCoordinationDtl;
	private String isBusinessInfo;
	private String businessDtl;
	private String isAdmitLoan;
	private String repaymentDesire;
	private String isFinanceData;
	private String enclosure;
	private String reportNo;
	private String distributionLoanTargetBankName;
	private String thisYearPayAmt;
	private String thisYearBackAmt;
	private String thisYearCancelAmt;
	private String projectName;
	private String principal;
	private String interest;
	private String total;
	private String remarks;
	private String companyAddr;
	private String companyContacter1;
	private String companyContacter1Job;
	private String companyContacter1Mob;
	private String companyContacter2;
	private String companyContacter2Job;
	private String companyContacter2Mob;
	private String assetsTotal;
	private String liabilitiesTotal;
	private String businessScope;
	private String complainNumber;
	private String productionScale;
	private String companyStatus;
	private String relevantLinks;
	private String registeredCapital;
	private String rate;
	private String principalLossRate;
	private String interestLossRate;
	private String totalLossRate;
	private String netPrincipal;
	private String netInterest;
	private String netTotal;
	private String loanNature;
	
	public String getNums() {
		return nums;
	}

	public void setNums(String nums) {
		this.nums = nums;
	}

	public String getSeqId() {
		return seqId;
	}

	public void setSeqId(String seqId) {
		this.seqId = seqId;
	}

	public String getLoanOrgName() {
		return loanOrgName;
	}

	public void setLoanOrgName(String loanOrgName) {
		this.loanOrgName = loanOrgName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLoanBankName() {
		return loanBankName;
	}

	public void setLoanBankName(String loanBankName) {
		this.loanBankName = loanBankName;
	}

	public String getLoanBeginDate() {
		return loanBeginDate;
	}

	public void setLoanBeginDate(String loanBeginDate) {
		this.loanBeginDate = loanBeginDate;
	}

	public String getLoanEndDate() {
		return loanEndDate;
	}

	public void setLoanEndDate(String loanEndDate) {
		this.loanEndDate = loanEndDate;
	}

	public String getOriLoanSum() {
		return oriLoanSum;
	}

	public void setOriLoanSum(String oriLoanSum) {
		this.oriLoanSum = oriLoanSum;
	}

	public String getBanlance2012First() {
		return banlance2012First;
	}

	public void setBanlance2012First(String banlance2012First) {
		this.banlance2012First = banlance2012First;
	}

	public String getGrantLoanSum() {
		return grantLoanSum;
	}

	public void setGrantLoanSum(String grantLoanSum) {
		this.grantLoanSum = grantLoanSum;
	}

	public String getBackLoanSum() {
		return backLoanSum;
	}

	public void setBackLoanSum(String backLoanSum) {
		this.backLoanSum = backLoanSum;
	}

	public String getBanlance2012End() {
		return banlance2012End;
	}

	public void setBanlance2012End(String banlance2012End) {
		this.banlance2012End = banlance2012End;
	}

	public String getUnBackLoanSum() {
		return unBackLoanSum;
	}

	public void setUnBackLoanSum(String unBackLoanSum) {
		this.unBackLoanSum = unBackLoanSum;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getAuditDocuments() {
		return auditDocuments;
	}

	public void setAuditDocuments(String auditDocuments) {
		this.auditDocuments = auditDocuments;
	}

	public String getEnterpriseStatus() {
		return enterpriseStatus;
	}

	public void setEnterpriseStatus(String enterpriseStatus) {
		this.enterpriseStatus = enterpriseStatus;
	}

	public String getDtail() {
		return dtail;
	}

	public void setDtail(String dtail) {
		this.dtail = dtail;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRecommendedVerification() {
		return recommendedVerification;
	}

	public void setRecommendedVerification(String recommendedVerification) {
		this.recommendedVerification = recommendedVerification;
	}

	public String getSumPrincipal2014End() {
		return sumPrincipal2014End;
	}

	public void setSumPrincipal2014End(String sumPrincipal2014End) {
		this.sumPrincipal2014End = sumPrincipal2014End;
	}

	public String getSumCapital2014End() {
		return sumCapital2014End;
	}

	public void setSumCapital2014End(String sumCapital2014End) {
		this.sumCapital2014End = sumCapital2014End;
	}

	public String getSumInterest2014End() {
		return sumInterest2014End;
	}

	public void setSumInterest2014End(String sumInterest2014End) {
		this.sumInterest2014End = sumInterest2014End;
	}

	public String getLoanValue() {
		return loanValue;
	}

	public void setLoanValue(String loanValue) {
		this.loanValue = loanValue;
	}

	public String getLoanBackRate() {
		return loanBackRate;
	}

	public void setLoanBackRate(String loanBackRate) {
		this.loanBackRate = loanBackRate;
	}

	public String getPrincipalValue() {
		return principalValue;
	}

	public void setPrincipalValue(String principalValue) {
		this.principalValue = principalValue;
	}

	public String getPrincipalBackRate() {
		return principalBackRate;
	}

	public void setPrincipalBackRate(String principalBackRate) {
		this.principalBackRate = principalBackRate;
	}

	public String getInterestValue() {
		return interestValue;
	}

	public void setInterestValue(String interestValue) {
		this.interestValue = interestValue;
	}

	public String getInterestBackRate() {
		return interestBackRate;
	}

	public void setInterestBackRate(String interestBackRate) {
		this.interestBackRate = interestBackRate;
	}

	public String getPrincipalManageCost() {
		return principalManageCost;
	}

	public void setPrincipalManageCost(String principalManageCost) {
		this.principalManageCost = principalManageCost;
	}

	public String getInterestManageCost() {
		return interestManageCost;
	}

	public void setInterestManageCost(String interestManageCost) {
		this.interestManageCost = interestManageCost;
	}

	public String getTotManageCost() {
		return totManageCost;
	}

	public void setTotManageCost(String totManageCost) {
		this.totManageCost = totManageCost;
	}

	public String getTotPresentValue() {
		return totPresentValue;
	}

	public void setTotPresentValue(String totPresentValue) {
		this.totPresentValue = totPresentValue;
	}

	public String getPrincipalPresentValue() {
		return principalPresentValue;
	}

	public void setPrincipalPresentValue(String principalPresentValue) {
		this.principalPresentValue = principalPresentValue;
	}

	public String getPrincipalDiscountAmt() {
		return principalDiscountAmt;
	}

	public void setPrincipalDiscountAmt(String principalDiscountAmt) {
		this.principalDiscountAmt = principalDiscountAmt;
	}

	public String getPrincipalPresentValueRate() {
		return principalPresentValueRate;
	}

	public void setPrincipalPresentValueRate(String principalPresentValueRate) {
		this.principalPresentValueRate = principalPresentValueRate;
	}

	public String getEstimateBackPrincipal() {
		return estimateBackPrincipal;
	}

	public void setEstimateBackPrincipal(String estimateBackPrincipal) {
		this.estimateBackPrincipal = estimateBackPrincipal;
	}

	public String getEstimate5BackPrincipalCost() {
		return estimate5BackPrincipalCost;
	}

	public void setEstimate5BackPrincipalCost(String estimate5BackPrincipalCost) {
		this.estimate5BackPrincipalCost = estimate5BackPrincipalCost;
	}

	public String getBackPrincipal2015() {
		return backPrincipal2015;
	}

	public void setBackPrincipal2015(String backPrincipal2015) {
		this.backPrincipal2015 = backPrincipal2015;
	}

	public String getBackPrincipal2016() {
		return backPrincipal2016;
	}

	public void setBackPrincipal2016(String backPrincipal2016) {
		this.backPrincipal2016 = backPrincipal2016;
	}

	public String getBackPrincipal2017() {
		return backPrincipal2017;
	}

	public void setBackPrincipal2017(String backPrincipal2017) {
		this.backPrincipal2017 = backPrincipal2017;
	}

	public String getBackPrincipal2018() {
		return backPrincipal2018;
	}

	public void setBackPrincipal2018(String backPrincipal2018) {
		this.backPrincipal2018 = backPrincipal2018;
	}

	public String getBackPrincipal2019() {
		return backPrincipal2019;
	}

	public void setBackPrincipal2019(String backPrincipal2019) {
		this.backPrincipal2019 = backPrincipal2019;
	}

	public String getInterestPresentValue() {
		return interestPresentValue;
	}

	public void setInterestPresentValue(String interestPresentValue) {
		this.interestPresentValue = interestPresentValue;
	}

	public String getInterestDiscountCost() {
		return interestDiscountCost;
	}

	public void setInterestDiscountCost(String interestDiscountCost) {
		this.interestDiscountCost = interestDiscountCost;
	}

	public String getEstimateBackInterest() {
		return estimateBackInterest;
	}

	public void setEstimateBackInterest(String estimateBackInterest) {
		this.estimateBackInterest = estimateBackInterest;
	}

	public String getEstimate5BackDiscountRate() {
		return estimate5BackDiscountRate;
	}

	public void setEstimate5BackDiscountRate(String estimate5BackDiscountRate) {
		this.estimate5BackDiscountRate = estimate5BackDiscountRate;
	}

	public String getBackInterest2015() {
		return backInterest2015;
	}

	public void setBackInterest2015(String backInterest2015) {
		this.backInterest2015 = backInterest2015;
	}

	public String getBackInterest2016() {
		return backInterest2016;
	}

	public void setBackInterest2016(String backInterest2016) {
		this.backInterest2016 = backInterest2016;
	}

	public String getBackInterest2017() {
		return backInterest2017;
	}

	public void setBackInterest2017(String backInterest2017) {
		this.backInterest2017 = backInterest2017;
	}

	public String getBackInterest2018() {
		return backInterest2018;
	}

	public void setBackInterest2018(String backInterest2018) {
		this.backInterest2018 = backInterest2018;
	}

	public String getBackInterest2019() {
		return backInterest2019;
	}

	public void setBackInterest2019(String backInterest2019) {
		this.backInterest2019 = backInterest2019;
	}

	public String getPrincipalAndInteresUncludeFee() {
		return principalAndInteresUncludeFee;
	}

	public void setPrincipalAndInteresUncludeFee(String principalAndInteresUncludeFee) {
		this.principalAndInteresUncludeFee = principalAndInteresUncludeFee;
	}

	public String getUnhealthyLoanBack() {
		return unhealthyLoanBack;
	}

	public void setUnhealthyLoanBack(String unhealthyLoanBack) {
		this.unhealthyLoanBack = unhealthyLoanBack;
	}

	public String getNotBackloan() {
		return notBackloan;
	}

	public void setNotBackloan(String notBackloan) {
		this.notBackloan = notBackloan;
	}

	public String getUnhealthyLoanRate() {
		return unhealthyLoanRate;
	}

	public void setUnhealthyLoanRate(String unhealthyLoanRate) {
		this.unhealthyLoanRate = unhealthyLoanRate;
	}

	public String getPrincipalUncludeFee() {
		return principalUncludeFee;
	}

	public void setPrincipalUncludeFee(String principalUncludeFee) {
		this.principalUncludeFee = principalUncludeFee;
	}

	public String getUnhealthyLoanBackAmt() {
		return unhealthyLoanBackAmt;
	}

	public void setUnhealthyLoanBackAmt(String unhealthyLoanBackAmt) {
		this.unhealthyLoanBackAmt = unhealthyLoanBackAmt;
	}

	public String getLoanPrincipalCostRate() {
		return loanPrincipalCostRate;
	}

	public void setLoanPrincipalCostRate(String loanPrincipalCostRate) {
		this.loanPrincipalCostRate = loanPrincipalCostRate;
	}

	public String getLoanRiskWeight() {
		return loanRiskWeight;
	}

	public void setLoanRiskWeight(String loanRiskWeight) {
		this.loanRiskWeight = loanRiskWeight;
	}

	public String getLoanEnterpriseCredit() {
		return loanEnterpriseCredit;
	}

	public void setLoanEnterpriseCredit(String loanEnterpriseCredit) {
		this.loanEnterpriseCredit = loanEnterpriseCredit;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getLoanAssetsCoefficient() {
		return loanAssetsCoefficient;
	}

	public void setLoanAssetsCoefficient(String loanAssetsCoefficient) {
		this.loanAssetsCoefficient = loanAssetsCoefficient;
	}

	public String getInteresBackUncludeFee() {
		return interesBackUncludeFee;
	}

	public void setInteresBackUncludeFee(String interesBackUncludeFee) {
		this.interesBackUncludeFee = interesBackUncludeFee;
	}

	public String getUnhealthyLoanInteresBackAmt() {
		return unhealthyLoanInteresBackAmt;
	}

	public void setUnhealthyLoanInteresBackAmt(String unhealthyLoanInteresBackAmt) {
		this.unhealthyLoanInteresBackAmt = unhealthyLoanInteresBackAmt;
	}

	public String getInteresBackAverageRate() {
		return interesBackAverageRate;
	}

	public void setInteresBackAverageRate(String interesBackAverageRate) {
		this.interesBackAverageRate = interesBackAverageRate;
	}

	public String getInteresConstRate() {
		return interesConstRate;
	}

	public void setInteresConstRate(String interesConstRate) {
		this.interesConstRate = interesConstRate;
	}

	public String getLoanEnterpriseCredit_() {
		return loanEnterpriseCredit_;
	}

	public void setLoanEnterpriseCredit_(String loanEnterpriseCredit_) {
		this.loanEnterpriseCredit_ = loanEnterpriseCredit_;
	}

	public String getLoanAssetsCoefficient_() {
		return loanAssetsCoefficient_;
	}

	public void setLoanAssetsCoefficient_(String loanAssetsCoefficient_) {
		this.loanAssetsCoefficient_ = loanAssetsCoefficient_;
	}

	public String getLoanTransactBankName() {
		return loanTransactBankName;
	}

	public void setLoanTransactBankName(String loanTransactBankName) {
		this.loanTransactBankName = loanTransactBankName;
	}

	public String getLoanTransacter() {
		return loanTransacter;
	}

	public void setLoanTransacter(String loanTransacter) {
		this.loanTransacter = loanTransacter;
	}

	public String getLoanTransacterMobile() {
		return loanTransacterMobile;
	}

	public void setLoanTransacterMobile(String loanTransacterMobile) {
		this.loanTransacterMobile = loanTransacterMobile;
	}

	public String getLoanCurrentOrgName() {
		return loanCurrentOrgName;
	}

	public void setLoanCurrentOrgName(String loanCurrentOrgName) {
		this.loanCurrentOrgName = loanCurrentOrgName;
	}

	public String getLoanUserMobile() {
		return loanUserMobile;
	}

	public void setLoanUserMobile(String loanUserMobile) {
		this.loanUserMobile = loanUserMobile;
	}

	public String getCompanyLiabilitiesAmt() {
		return companyLiabilitiesAmt;
	}

	public void setCompanyLiabilitiesAmt(String companyLiabilitiesAmt) {
		this.companyLiabilitiesAmt = companyLiabilitiesAmt;
	}

	public String getPayOrgName() {
		return payOrgName;
	}

	public void setPayOrgName(String payOrgName) {
		this.payOrgName = payOrgName;
	}

	public String getController() {
		return controller;
	}

	public void setController(String controller) {
		this.controller = controller;
	}

	public String getIsSignContracted() {
		return isSignContracted;
	}

	public void setIsSignContracted(String isSignContracted) {
		this.isSignContracted = isSignContracted;
	}

	public String getIsAccountStatement() {
		return isAccountStatement;
	}

	public void setIsAccountStatement(String isAccountStatement) {
		this.isAccountStatement = isAccountStatement;
	}

	public String getIsBankVerify() {
		return isBankVerify;
	}

	public void setIsBankVerify(String isBankVerify) {
		this.isBankVerify = isBankVerify;
	}

	public String getUnCoordinationDtl() {
		return unCoordinationDtl;
	}

	public void setUnCoordinationDtl(String unCoordinationDtl) {
		this.unCoordinationDtl = unCoordinationDtl;
	}

	public String getIsBusinessInfo() {
		return isBusinessInfo;
	}

	public void setIsBusinessInfo(String isBusinessInfo) {
		this.isBusinessInfo = isBusinessInfo;
	}

	public String getBusinessDtl() {
		return businessDtl;
	}

	public void setBusinessDtl(String businessDtl) {
		this.businessDtl = businessDtl;
	}

	public String getIsAdmitLoan() {
		return isAdmitLoan;
	}

	public void setIsAdmitLoan(String isAdmitLoan) {
		this.isAdmitLoan = isAdmitLoan;
	}

	public String getRepaymentDesire() {
		return repaymentDesire;
	}

	public void setRepaymentDesire(String repaymentDesire) {
		this.repaymentDesire = repaymentDesire;
	}

	public String getIsFinanceData() {
		return isFinanceData;
	}

	public void setIsFinanceData(String isFinanceData) {
		this.isFinanceData = isFinanceData;
	}

	public String getEnclosure() {
		return enclosure;
	}

	public void setEnclosure(String enclosure) {
		this.enclosure = enclosure;
	}

	public String getReportNo() {
		return reportNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public String getDistributionLoanTargetBankName() {
		return distributionLoanTargetBankName;
	}

	public void setDistributionLoanTargetBankName(String distributionLoanTargetBankName) {
		this.distributionLoanTargetBankName = distributionLoanTargetBankName;
	}

	public String getThisYearPayAmt() {
		return thisYearPayAmt;
	}

	public void setThisYearPayAmt(String thisYearPayAmt) {
		this.thisYearPayAmt = thisYearPayAmt;
	}

	public String getThisYearBackAmt() {
		return thisYearBackAmt;
	}

	public void setThisYearBackAmt(String thisYearBackAmt) {
		this.thisYearBackAmt = thisYearBackAmt;
	}

	public String getThisYearCancelAmt() {
		return thisYearCancelAmt;
	}

	public void setThisYearCancelAmt(String thisYearCancelAmt) {
		this.thisYearCancelAmt = thisYearCancelAmt;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCompanyAddr() {
		return companyAddr;
	}

	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}

	public String getCompanyContacter1() {
		return companyContacter1;
	}

	public void setCompanyContacter1(String companyContacter1) {
		this.companyContacter1 = companyContacter1;
	}

	public String getCompanyContacter1Job() {
		return companyContacter1Job;
	}

	public void setCompanyContacter1Job(String companyContacter1Job) {
		this.companyContacter1Job = companyContacter1Job;
	}

	public String getCompanyContacter1Mob() {
		return companyContacter1Mob;
	}

	public void setCompanyContacter1Mob(String companyContacter1Mob) {
		this.companyContacter1Mob = companyContacter1Mob;
	}

	public String getCompanyContacter2() {
		return companyContacter2;
	}

	public void setCompanyContacter2(String companyContacter2) {
		this.companyContacter2 = companyContacter2;
	}

	public String getCompanyContacter2Job() {
		return companyContacter2Job;
	}

	public void setCompanyContacter2Job(String companyContacter2Job) {
		this.companyContacter2Job = companyContacter2Job;
	}

	public String getCompanyContacter2Mob() {
		return companyContacter2Mob;
	}

	public void setCompanyContacter2Mob(String companyContacter2Mob) {
		this.companyContacter2Mob = companyContacter2Mob;
	}

	public String getAssetsTotal() {
		return assetsTotal;
	}

	public void setAssetsTotal(String assetsTotal) {
		this.assetsTotal = assetsTotal;
	}

	public String getLiabilitiesTotal() {
		return liabilitiesTotal;
	}

	public void setLiabilitiesTotal(String liabilitiesTotal) {
		this.liabilitiesTotal = liabilitiesTotal;
	}

	public String getBusinessScope() {
		return businessScope;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

	public String getComplainNumber() {
		return complainNumber;
	}

	public void setComplainNumber(String complainNumber) {
		this.complainNumber = complainNumber;
	}

	public String getProductionScale() {
		return productionScale;
	}

	public void setProductionScale(String productionScale) {
		this.productionScale = productionScale;
	}

	public String getCompanyStatus() {
		return companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	public String getRelevantLinks() {
		return relevantLinks;
	}

	public void setRelevantLinks(String relevantLinks) {
		this.relevantLinks = relevantLinks;
	}

	public String getRegisteredCapital() {
		return registeredCapital;
	}

	public void setRegisteredCapital(String registeredCapital) {
		this.registeredCapital = registeredCapital;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getPrincipalLossRate() {
		return principalLossRate;
	}

	public void setPrincipalLossRate(String principalLossRate) {
		this.principalLossRate = principalLossRate;
	}

	public String getInterestLossRate() {
		return interestLossRate;
	}

	public void setInterestLossRate(String interestLossRate) {
		this.interestLossRate = interestLossRate;
	}

	public String getTotalLossRate() {
		return totalLossRate;
	}

	public void setTotalLossRate(String totalLossRate) {
		this.totalLossRate = totalLossRate;
	}

	public String getNetPrincipal() {
		return netPrincipal;
	}

	public void setNetPrincipal(String netPrincipal) {
		this.netPrincipal = netPrincipal;
	}

	public String getNetInterest() {
		return netInterest;
	}

	public void setNetInterest(String netInterest) {
		this.netInterest = netInterest;
	}

	public String getNetTotal() {
		return netTotal;
	}

	public void setNetTotal(String netTotal) {
		this.netTotal = netTotal;
	}

	public String getLoanNature() {
		return loanNature;
	}

	public void setLoanNature(String loanNature) {
		this.loanNature = loanNature;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
}
