package org.hypergraphql;

import org.hypergraphql.config.system.HGQLConfig;

public class Demo2 {

    public static void main(String[] args) {

        HGQLConfig config5 = HGQLConfig.fromClasspathConfig("src/test/resources/DemoServices/config5.json");
        new Controller().start(config5); //dbpedia
        HGQLConfig config2 = HGQLConfig.fromClasspathConfig("src/test/resources/DemoServices/config2.json");
        new Controller().start(config2); //agrovoc-hgql
        HGQLConfig config3 = HGQLConfig.fromClasspathConfig("src/test/resources/DemoServices/config3.json");
        new Controller().start(config3); //fao-go-hgql
    }
}