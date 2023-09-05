package org.nextspace.javaconsolenextspaceclientapplicationexample;

import com.Nextspace.Client;
import com.Nextspace.Data.EntityType;
import com.Nextspace.Infrastructure.NextspaceHostingEnvironment;
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
            Client client = new Client(NextspaceHostingEnvironment.UAT, "alex", null, null);
            
            String bruceAPIURL = client.getBruceAPIURL();
        
            System.out.println(">Bruce API URL : " + bruceAPIURL);
            
            List<EntityType> list = client.GetEntityTypes();
            
            System.out.println(">Entity Types: ");
            
            for (EntityType et : list)
            {
                System.out.println("- ID=" + et.ID + ", Name=" + et.Name);
            }
            
        }
        catch (Exception up)
        {
            System.err.print("Failed to connect to Nextspace Client Account! ERROR:"+up.getMessage());
        }
        
    }
}
