package com.app.openfeign.service;

import com.core.model.DataModel;

/**
 * @author spring.yuan
 * @version 1.0
 */
public interface FeignService {

    DataModel queryUser(DataModel requestModel);
}
