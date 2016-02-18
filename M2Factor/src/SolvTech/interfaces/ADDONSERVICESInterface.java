/*
 * M2Factor
 *
 * This file was automatically generated for 2Factor by APIMATIC BETA v2.0 on 02/18/2016
 */
package SolvTech.interfaces;

import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import SolvTech.models.*;

public interface ADDONSERVICESInterface {
    /**
     * Check Balance For Addon Services
     * @param    apiKey    Required parameter: 2Factor account API Key
     * @param    serviceName    Required parameter: Name of the addon service
	 * @return	Returns the CheckBalanceAddonServicesModel response from the API call*/
    @GET
    @Path("/V1/{api_key}/ADDON_SERVICES/BAL/{service_name}")
    @Produces(MediaType.APPLICATION_JSON)
    public CheckBalanceAddonServicesModel getCheckBalanceAddonServices(
            @DefaultValue("Get one from http://2Factor.in") @PathParam("api_key") String apiKey,
            @DefaultValue("TRANSACTIONAL_SMS") @PathParam("service_name") String serviceName);
    /**
     * Pull Delivery Report - Transactional SMS
     * @param    apiKey    Required parameter: API Obtained From 2Factor.in
     * @param    sessionId    Required parameter: Session Id Returned By Send SMS Step
	 * @return	Returns the LinkedHashMap<String, Object> response from the API call*/
    @GET
    @Path("/V1/{api_key}/ADDON_SERVICES/RPT/TSMS/{session_id}")
    @Produces(MediaType.WILDCARD)
    public LinkedHashMap<String, Object> getPullDeliveryReport(
            @DefaultValue("2Factor account API Key") @PathParam("api_key") String apiKey,
            @DefaultValue("Session Id Goes here") @PathParam("session_id") String sessionId);
    /**
     * Send Single / Bulk Transactional Messages / Schedule SMS
     * @param    from    Required parameter: 6 Character Alphabet Sender Id
     * @param    msg    Required parameter: SMS Body To Be Sent
     * @param    sendAt    Optional parameter: This Parameter Is Used For Scheduling SMS - Optional parameter
     * @param    to    Required parameter: Comma Separated list Of Phone Numbers
     * @param    apiKey    Required parameter: API Obtained From 2Factor.in
     * @param    fieldParameters    formParams
	 * @return	Returns the SendTransactionalSmsModel response from the API call*/
    @POST
    @Path("/V1/{api_key}/ADDON_SERVICES/SEND/TSMS")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public SendTransactionalSmsModel createSendTransactionalSMS(
            @DefaultValue("TFCTOR") @FormParam("From") String from,
            @DefaultValue("Hello World") @FormParam("Msg") String msg,
            @DefaultValue("2019-01-01 00:00:01") @FormParam("SendAt") String sendAt,
            @DefaultValue("9911991199,9911991198") @FormParam("To") String to,
            @DefaultValue("2Factor account APi Key") @PathParam("api_key") String apiKey,
            MultivaluedMap<String, String> formParams);
}