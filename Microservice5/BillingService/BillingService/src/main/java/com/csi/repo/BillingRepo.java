package com.csi.repo;

import com.csi.model.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepo extends JpaRepository<Billing,Long> {
}
