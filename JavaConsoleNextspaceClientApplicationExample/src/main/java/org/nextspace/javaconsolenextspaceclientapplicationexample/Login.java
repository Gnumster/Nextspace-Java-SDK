package org.nextspace.javaconsolenextspaceclientapplicationexample;

import com.Nextspace.Client;
import com.Nextspace.Infrastructure.NextspaceHostingEnvironment;

/**
 * 1. Client Account
 * 2. User Login
 * 3. Password
 * ==================================================================================================
 * @author alex.l
 */
public class Login
{
    /**
     * ==================================================================================================
     * This is code example for Login to Nextspace Account using Login and Password.Following pre-requisites are required:
     * @param account_id ID of the Client Account on Nextspace platform.
     * @param user_login Login of the User.
     * @param user_password Password of the User.
     * @return Returns initialized Client object that can be used for further interaction with Nextspace API, in the context of the specified Client Account, on behalf of the logged in User.
     * ==================================================================================================
     * @throws java.lang.Exception
     */
    public static Client Login(String account_id, String user_login, String user_password) throws Exception
    {
        Client client = new Client(NextspaceHostingEnvironment.PROD, account_id, user_login, user_password);

        // --- Just to be sure we have got it right, we print out the base Nextsapce API ULR for the specified Client Account.
        String bruceAPIURL = client.getBruceAPIURL();
        System.out.println(">Bruce API URL : " + bruceAPIURL);
        
        return client;
    }
}
