package org.nextspace.javaconsolenextspaceclientapplicationexample;

import com.Nextspace.Client;
import com.Nextspace.Data.EntityType;
import java.util.List;

/**
 * This Console application is provided as an example of interaction with Nextspace platform via APIs.
 * It conducts a series of requests, illustrating the use of the Nextspace Java Client library.
 * @author alex.l
 */
public class JavaConsoleNextspaceClientApplicationExample
{
    public static void main(String[] args)
    {
        System.out.println(">> JavaConsoleNextspaceClientApplicationExample ver.1.0.1 has started.");
        
        try
        {
            /*
             * =============================================================================
             *
             * Interaction with Nextspace API (aka "Bruce API") on the client side
             * begins with creating a new instance of the Client() object,
             * supplyhing it with the key parameters:
             * 
             *  - Environment in which the operation takes place: PROD, UAT, STG or DEV.
             *  - Client Account identified by its Subdomain.
             *  - User Login 
             *  - User Password (not saved anywhere in the code)
             *
             *  For this SDK trials and test runs we have set up Client Accout with ID = "sdk",
             *  and a User with login "sdkuser" and password "password".
             *
             *  User Login and Password are optional. If no login and password is supplied,
             *  Client() is initialized to act on behalf of Anonymous user, which will
             *  have limited Access Permission. Some of the calls made using this option
             *  will fail with "Access Denied" exception.
             *
             * =============================================================================
             */
            
            Client client = Login.Login("sdk", "sdkuser", "password");
            
            /*
             * =============================================================================
             *
             * Following is how you can get the list of all Entity Types registered on
             * Client Account for which Client() is initialized.
             *
             * =============================================================================
             */
            
            List<EntityType> list = client.GetEntityTypes();
            
            EntityType SelectedEntityType = null;
            
            System.out.println(">Entity Types (first 20): ");
            
            int count = 0;
            
            for (EntityType et : list)
            {
                System.out.println("- ID=" + et.ID + ", Name=" + et.Name);
                
                if (SelectedEntityType==null) SelectedEntityType = et; // Selecting one Entity Type for the next action.
                
                if (count++ >= 20) break;
            }
            
            /*
             * =============================================================================
             *
             * Following is how you can get details of one Entity Type.
             *
             * =============================================================================
             */
            
            EntityType t = EntityType.GetByID(client, SelectedEntityType.ID);
            
            System.out.println(">Entity Type Details: " + t.ID + " received." );
            
            
        }
        catch (Exception up)
        {
            System.err.print("Failed to connect to Nextspace Client Account! ERROR:"+up.getMessage());
        }
        
    }
}
