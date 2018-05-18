package org.hypergraphql;

import org.hypergraphql.config.system.HGQLConfig;

public class Demo {

    public static void main(String[] args) {

        HGQLConfig config1 = HGQLConfig.fromClasspathConfig("src/test/resources/DemoServices/config1.json");
        new Controller().start(config1); //dbpedia-hgql
        HGQLConfig config2 = HGQLConfig.fromClasspathConfig("src/test/resources/DemoServices/config2.json");
        new Controller().start(config2); //agrovoc-hgql
        HGQLConfig config3 = HGQLConfig.fromClasspathConfig("src/test/resources/DemoServices/config3.json");
        new Controller().start(config3); //fao-go-hgql
    }
}
