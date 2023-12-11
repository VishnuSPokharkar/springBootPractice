package com.crudOperation.dbcrudoperation.Service.Impl;

import com.crudOperation.dbcrudoperation.Model.CloudVendor;
import com.crudOperation.dbcrudoperation.Repository.CloudVendorRepository;
import com.crudOperation.dbcrudoperation.Service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorImpl implements CloudVendorService {
    @Autowired
    private CloudVendorRepository cloudVendorRepository;

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }


//    @Override
//    public String createCloudVendor(CloudVendor cloudVendor) {
//        cloudVendorRepository.save(cloudVendor);
//        return "Successfully created vendor";
//    }
//
//    @Override
//    public String updateCloudVendorDetails(CloudVendor cloudVendor) {
//        cloudVendorRepository.save(cloudVendor);
//        return "Successfully Updated vendor";
//    }
//
//    @Override
//    public String deleteCloudVendorDetails(String vendorId) {
//        cloudVendorRepository.deleteById(vendorId);
//        return "cloud vendor deleted successfully";
//    }
//
//    @Override
//    public CloudVendor getCloudVendorDetails(String vendorId) {
//        return cloudVendorRepository.findById(vendorId).get();
//    }
//
//    @Override
//    public List<CloudVendor> getAllCloudVendor() {
//        return cloudVendorRepository.findAll();
//    }
}
