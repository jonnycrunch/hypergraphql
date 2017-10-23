package uk.semanticintegration.graphql.sparql;

import graphql.GraphQL;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Main {

  public static void main(String[] args) {

    BasicConfigurator.configure();
    Logger.getRootLogger().setLevel(Level.OFF);

    Config config = new Config("properties.json");

    GraphqlWiring wiring = new GraphqlWiring(config);

    GraphQL graphQL = GraphQL.newGraphQL(wiring.schema()).build();

    Controller.start(config, graphQL);

  }
}