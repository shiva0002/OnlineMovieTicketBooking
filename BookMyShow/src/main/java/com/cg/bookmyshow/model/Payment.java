package com.cg.bookmyshow.model;

public class Payment {
    private String transactionId;
    private float amount;
    private String userId;
    private PaymentStatus paymentStatus;
   
    public enum PaymentStatus {
        PENDING,
        COMPLETED,
        FAILED
    }

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Override
	public String toString() {
		return "Payment [transactionId=" + transactionId + ", amount=" + amount + ", userId=" + userId
				+ ", paymentStatus=" + paymentStatus + "]";
	}
    
    
}