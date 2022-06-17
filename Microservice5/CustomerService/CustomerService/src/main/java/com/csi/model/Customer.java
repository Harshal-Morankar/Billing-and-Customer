package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    private long customerId;

    private String customerName;

    private String customerAddress;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date customerDOB;

    private String customerEmailId;

    private long billingId;

}
