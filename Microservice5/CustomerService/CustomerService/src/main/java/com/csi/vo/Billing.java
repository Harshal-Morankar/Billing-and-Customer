package com.csi.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Billing {

    private long billingId;

    private long billingInvoiceNumber;

    private double billingPrice;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date billingDate;
}
