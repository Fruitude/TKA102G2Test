package com.fruitute.member;

import java.sql.Date;
import java.sql.Timestamp;

public class MemberVO implements java.io.Serializable{
	//private static final long serialVersionUID = 1L;
	
		private Integer memberId;
		private String memberName;
		private Date memberBirthday;
		private String memberAccount;
		private String memberEmail;
		private String memberPassword;
		private Timestamp createdAt;
		private Integer memberStatus;
		private Integer shoppingCredit;
		
		
		public Integer getMemberId() {
			return memberId;
		}
		public void setMemberId(Integer memberId) {
			this.memberId = memberId;
		}
		public String getMemberName() {
			return memberName;
		}
		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}
		public Date getMemberBirthday() {
			return memberBirthday;
		}
		public void setMemberBirthday(Date memberBirthday) {
			this.memberBirthday = memberBirthday;
		}
		public String getMemberAccount() {
			return memberAccount;
		}
		public void setMemberAccount(String memberAccount) {
			this.memberAccount = memberAccount;
		}
		public String getMemberEmail() {
			return memberEmail;
		}
		public void setMemberEmail(String memberEmail) {
			this.memberEmail = memberEmail;
		}
		public String getMemberPassword() {
			return memberPassword;
		}
		public void setMemberPassword(String memberPassword) {
			this.memberPassword = memberPassword;
		}
		public Timestamp getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Timestamp createdAt) {
			this.createdAt = createdAt;
		}
		public Integer getMemberStatus() {
			return memberStatus;
		}
		public void setMemberStatus(Integer memberStatus) {
			this.memberStatus = memberStatus;
		}
		public Integer getShoppingCredit() {
			return shoppingCredit;
		}
		public void setShoppingCredit(Integer shoppingCredit) {
			this.shoppingCredit = shoppingCredit;
		}
		
		
		
		
}
