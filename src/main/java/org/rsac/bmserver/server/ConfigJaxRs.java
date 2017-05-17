package org.rsac.bmserver.server;

import org.glassfish.jersey.server.ResourceConfig;

public class ConfigJaxRs extends ResourceConfig {

	public ConfigJaxRs() {
		packages("org.rsac.bmserver");
	}
}
