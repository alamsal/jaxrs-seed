package org.rsac.bmserver.server;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.rsac.bmserver.api.Calculator;
import org.rsac.bmserver.api.MyHome;

public class ConfigRestEndPoints {

    public ResourceConfig GetRestEndPointsResourceConfig(){

        ResourceConfig config = new ResourceConfig();
        config.register(Calculator.class);
        config.register(MyHome.class);
        config.register(JacksonFeature.class);

        return config;
    }

}
