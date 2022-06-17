package com.csi.vo;

import com.csi.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestTemplateVo {
    private Customer customer;

    private Billing billing;
}
