package com.eql.schema.types

import com.beyondeye.graphkool.listOfObjs
import graphql.Scalars
import graphql.Scalars.GraphQLFloat
import graphql.Scalars.GraphQLString
import graphql.schema.GraphQLInputObjectField
import graphql.schema.GraphQLInputObjectType

val productInputType: GraphQLInputObjectType =
        GraphQLInputObjectType.newInputObject()
                .name("productInput")
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("id")
                        .type(GraphQLString)
                        .description("id of the product"))
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("name")
                        .type(GraphQLString)
                        .description("name of the product"))
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("price")
                        .type(GraphQLFloat)
                        .description("cost of the product"))
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("tags")
                        .type(listOfObjs(GraphQLString))
                        .description("tags of the product"))
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("stockQuantity")
                        .type(Scalars.GraphQLInt)
                        .description("The stock quantity of the product"))
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("description")
                        .type(GraphQLString)
                        .description("The description of the product"))
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("attributes")
                        .type(listOfObjs(GraphQLString))
                        .description("The attributes of the product"))
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("saleFrom")
                        .type(dateTimeType)
                        .description("The saleFrom of the product"))
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("saleTo")
                        .type(dateTimeType)
                        .description("The saleTo of the product"))
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("discontinued")
                        .type(Scalars.GraphQLBoolean)
                        .description("is product discontinued"))
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("category")
                        .type(GraphQLString)
                        .description("The product category"))
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("dimensions")
                        .type(dimensionsInputType)
                        .description("The dimensions of the product"))
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("imageUrl")
                        .type(GraphQLString)
                        .description("The image URL of the product"))
                .field(GraphQLInputObjectField.newInputObjectField()
                        .name("gender")
                        .type(GraphQLString)
                        .description("Gender of the product user group"))
                .build()
