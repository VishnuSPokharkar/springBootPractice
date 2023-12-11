package com.crudOperation.dbcrudoperation.Repository;

import com.crudOperation.dbcrudoperation.Model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
}
