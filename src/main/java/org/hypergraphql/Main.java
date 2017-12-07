package org.hypergraphql;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hypergraphql.datamodel.HGQLSchemaWiring;
import org.hypergraphql.config.system.HGQLConfig;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class);
    
    public static void main(String[] args) {

        PropertyConfigurator.configure("log4j.properties");
        HGQLConfig config = new HGQLConfig("properties.json");

        HGQLSchemaWiring.build(config);

        System.out.println("GraphQL server started at: http://localhost:" + config.getGraphqlConfig().port() + config.getGraphqlConfig().path());
        System.out.println("GraphiQL UI available at: http://localhost:" + config.getGraphqlConfig().port() + config.getGraphqlConfig().graphiql());

        logger.info("Server started at http://localhost:" + config.getGraphqlConfig().port() + config.getGraphqlConfig().path());

        HGQLSchemaWiring.getInstance().getTypes().keySet().forEach(key -> System.out.println(key));
        System.out.println(HGQLSchemaWiring.getInstance().getTypes().get("Person").getField("name").getService().getId());


        Controller.start(config);

    }
}
