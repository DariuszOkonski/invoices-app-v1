package com.example.invoicesappv1.invoice;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Invoice {
    private Long id;
    private LocalDate createdAt;
    private Long supplierId;
    private BigDecimal amount;

    public Invoice() {
    }

    public Invoice(Long id,
                   LocalDate createdAt,
                   Long supplierId,
                   BigDecimal amount) {
        this.id = id;
        this.createdAt = createdAt;
        this.supplierId = supplierId;
        this.amount = amount;
    }

    public Invoice(LocalDate createdAt,
                   Long supplierId,
                   BigDecimal amount) {
        this.createdAt = createdAt;
        this.supplierId = supplierId;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", supplierId=" + supplierId +
                ", amount=" + amount +
                '}';
    }
}
