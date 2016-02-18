/*
 * M2Factor
 *
 * This file was automatically generated for 2Factor by APIMATIC BETA v2.0 on 02/18/2016
 */
package SolvTech.interfaces;

import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import SolvTech.models.*;

public interface VOICEOTPInterface {
    /**
     * This endpoint is used to check VOICE OTP balance
     * @param    apiKey    Required parameter: Check VOICE OTP Balance
	 * @return	Returns the CheckVoiceBalanceModel response from the API call*/
    @GET
    @Path("/API/V1/{api_key}/BAL/VOICE")
    @Produces(MediaType.APPLICATION_JSON)
    public CheckVoiceBalanceModel getCheckVoiceBalance(
            @DefaultValue("Get one from http://2Factor.in") @PathParam("api_key") String apiKey);
    /**
     * This endpoint is used to send Auto Generated VOICE OTP to India
     * @param    apiKey    Required parameter: API Obtained From 2Factor.in
     * @param    phoneNumber    Required parameter: 10 Digit Indian Phone Number
	 * @return	Returns the SendingVoiceOtpAutoGeneratedOtpModel response from the API call*/
    @GET
    @Path("/API/V1/{api_key}/VOICE/{phone_number}/AUTOGEN")
    @Produces(MediaType.APPLICATION_JSON)
    public SendingVoiceOtpAutoGeneratedOtpModel getSendingVOICEOTPAutoGeneratedOTP(
            @DefaultValue("Get one from http://2Factor.in") @PathParam("api_key") String apiKey,
            @DefaultValue("9911991199") @PathParam("phone_number") String phoneNumber);
    /**
     * This endpoint is used to send VOICE OTP to India
     * @param    apiKey    Required parameter: API Obtained From 2Factor.in
     * @param    otp    Required parameter: 4 Digit ( Numeric ) OTP code to be sent
     * @param    phoneNumber    Required parameter: 10 Digit Indian Phone Number
	 * @return	Returns the SendingVoiceOtpModel response from the API call*/
    @GET
    @Path("/API/V1/{api_key}/VOICE/{phone_number}/{otp}")
    @Produces(MediaType.APPLICATION_JSON)
    public SendingVoiceOtpModel getSendingVoiceOTPCustomOTP(
            @DefaultValue("Get one from http://2Factor.in") @PathParam("api_key") String apiKey,
            @DefaultValue("4499") @PathParam("otp") int otp,
            @DefaultValue("9911991199") @PathParam("phone_number") String phoneNumber);
    /**
     * This endpoint is useful in verifying user entered OTP with sent OTP
     * @param    apiKey    Required parameter: API Obtained From 2Factor.in
     * @param    otpInput    Required parameter: OTP Value input by end user
     * @param    sessionId    Required parameter: Verification session id returned in send OTP step
	 * @return	Returns the VerifyVoiceOtpInputModel response from the API call*/
    @GET
    @Path("/API/V1/{api_key}/VOICE/VERIFY/{session_id}/{otp_input}")
    @Produces(MediaType.APPLICATION_JSON)
    public VerifyVoiceOtpInputModel getVerifyVOICEOTPInput(
            @DefaultValue("Get one from http://2Factor.in") @PathParam("api_key") String apiKey,
            @DefaultValue("1234") @PathParam("otp_input") String otpInput,
            @DefaultValue("4a4b52d9-be3e-4f2c-b66e-f4141091b876") @PathParam("session_id") String sessionId);
}