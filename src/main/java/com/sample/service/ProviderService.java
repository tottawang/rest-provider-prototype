package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.domain.PrototypeSample;

@Component
public class ProviderService {

  @Autowired
  javax.inject.Provider<PrototypeSample> sample;

  public void setValue(String value) {
    PrototypeSample protoTypeSample = sample.get();
    protoTypeSample.setData(value);
    System.out.println("setValue:" + protoTypeSample);
  }

  public String getValue() {
    PrototypeSample protoTypeSample = sample.get();
    System.out.println("getValue:" + protoTypeSample);
    return protoTypeSample.getData();
  }

}
