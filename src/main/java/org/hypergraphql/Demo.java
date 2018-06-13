package org.hypergraphql;

public class Demo {

    public static void main(final String[] args) throws Exception {

        final String[] demoArguments = {
            //"--classpath",
            "--config",
            "src/test/resources/demo_services/config1.json",
            "src/test/resources/demo_services/config2.json",
            "src/test/resources/demo_services/config3.json",
            "src/test/resources/demo_services/config4.json"
        };

        Application.main(demoArguments);
    }
}
