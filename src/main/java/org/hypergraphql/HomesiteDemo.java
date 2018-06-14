package org.hypergraphql;

public class HomesiteDemo {

    public static void main(final String[] args) throws Exception {

        final String[] demoArguments = {
                "--classpath",
                "--config",
                "demo_services/config4.json"
        };

        Application.main(demoArguments);
    }
}
