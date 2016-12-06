package com.sample.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.service.ProviderService;

@Component
@Produces(MediaType.APPLICATION_JSON)
@Path("/api")
public class RestResource {

  @Autowired
  private ProviderService service;

  @GET
  @Path("provider")
  public String getPrototype() {
    service.setValue("test-value-1");
    return service.getValue();
  }
}
