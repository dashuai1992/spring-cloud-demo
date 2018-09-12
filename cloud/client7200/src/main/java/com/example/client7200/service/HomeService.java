package com.example.client7200.service;

import com.example.client7200.service.impl.HomeServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVER7100",fallback = HomeServiceImpl.class)
public interface HomeService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String home(@RequestParam(value = "name") String name);

}
