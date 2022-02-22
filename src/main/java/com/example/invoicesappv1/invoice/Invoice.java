package com.example.invoicesappv1.invoice;

import com.example.invoicesappv1.supplier.Supplier;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Invoice {
    private Long id;
    private LocalDate createdAt;
    private Supplier supplier;
    private BigDecimal amount;

    public Invoice() {
    }

    public Invoice(Long id, LocalDate createdAt, Supplier supplier, BigDecimal amount) {
        this.id = id;
        this.createdAt = createdAt;
        this.supplier = supplier;
        this.amount = amount;
    }

    public Invoice(LocalDate createdAt, Supplier supplier, BigDecimal amount) {
        this.createdAt = createdAt;
        this.supplier = supplier;
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

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
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
                ", supplier=" + supplier +
                ", amount=" + amount +
                '}';
    }
}
