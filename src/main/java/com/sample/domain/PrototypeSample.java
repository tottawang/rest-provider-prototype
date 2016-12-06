package com.sample.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeSample {

  private String data;

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }


}

