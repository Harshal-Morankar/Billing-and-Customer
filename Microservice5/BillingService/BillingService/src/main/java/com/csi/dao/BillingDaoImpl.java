package com.csi.dao;

import com.csi.model.Billing;
import com.csi.repo.BillingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BillingDaoImpl {
    @Autowired
    BillingRepo billingRepoImpl;
    public Billing saveData(Billing billing){
        return billingRepoImpl.save(billing);

    }
    public Optional<Billing> getDataById(long billingId){
        return billingRepoImpl.findById(billingId);
    }
}
