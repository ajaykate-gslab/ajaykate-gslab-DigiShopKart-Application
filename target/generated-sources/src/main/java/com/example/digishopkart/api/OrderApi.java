/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.35).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.example.digishopkart.api;

import com.example.digishopkart.model.Errors;
import com.example.digishopkart.model.Order;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-20T16:59:59.580281231+05:30[Asia/Kolkata]")
@Validated
public interface OrderApi {

    @Operation(summary = "create an order", description = "Api to create Order by using Customer, Product and Discount", tags={ "Order" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Order.class))),
        
        @ApiResponse(responseCode = "404", description = "The specified resource was not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))) })
    @RequestMapping(value = "/api/v1/orders",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Order> createOrder(@Parameter(in = ParameterIn.DEFAULT, description = "A JSON object Contenting Order information", required=true, schema=@Schema()) @Valid @RequestBody Order body);


    @Operation(summary = "detete an order", description = "Api to delete the Order by id", tags={ "Order" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Order.class))),
        
        @ApiResponse(responseCode = "404", description = "The specified resource was not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))) })
    @RequestMapping(value = "/api/v1/orders/{orderId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Order> deleteOrder(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("orderId") Integer orderId);


    @Operation(summary = "fetch all orders", description = "APi to get All the Order", tags={ "Order" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Order.class))),
        
        @ApiResponse(responseCode = "404", description = "The specified resource was not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))) })
    @RequestMapping(value = "/api/v1/orders",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Order> fetchAllOrders();


    @Operation(summary = "fetch an order", description = "Api to fetch Order by id", tags={ "Order" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Order.class))),
        
        @ApiResponse(responseCode = "404", description = "The specified resource was not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))) })
    @RequestMapping(value = "/api/v1/orders/{orderId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Order> fetchOrder(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("orderId") Integer orderId);


    @Operation(summary = "update an order", description = "Api to update Order record by id", tags={ "Order" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Order.class))),
        
        @ApiResponse(responseCode = "404", description = "The specified resource was not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))) })
    @RequestMapping(value = "/api/v1/orders/{orderId}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Order> updateOrder(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("orderId") Integer orderId, @Parameter(in = ParameterIn.DEFAULT, description = "A JSON object Contenting Order information", required=true, schema=@Schema()) @Valid @RequestBody Order body);


    @Operation(summary = "update Order Status", description = "API to update the status of order", tags={ "Order" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Order.class))),
        
        @ApiResponse(responseCode = "404", description = "The specified resource was not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))) })
    @RequestMapping(value = "/api/v1/orders/{orderId}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<Order> updateOrderStatus(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("orderId") Integer orderId, @Parameter(in = ParameterIn.DEFAULT, description = "A JSON object Contenting Order information", required=true, schema=@Schema()) @Valid @RequestBody Order body);

}

