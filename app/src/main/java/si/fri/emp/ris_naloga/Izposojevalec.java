/***********************************************************************
 * Module:  Izposojevalec.java
 * Author:  JURE
 * Purpose: Defines the Class Izposojevalec
 ***********************************************************************/

package si.fri.emp.ris_naloga;

import java.util.*;

/** @pdOid 0cf6a147-a0dc-49cc-96ca-6700402654a0 */
public class Izposojevalec {
   /** @pdOid c665374e-9c82-45cf-a6e0-7887f6e05fa0 */
   private int idIzposojevalca;
   /** @pdOid c22f0d5b-a124-4cc7-841b-b19490c07309 */
   private String ime;
   /** @pdOid 45fc1614-1ee9-4874-9bff-005e20b74845 */
   private String priimek;
   /** @pdOid 2371b4e6-e8a9-4fd3-adcf-f8749d3160b3 */
   private String naslov;
   
   /** @pdRoleInfo migr=no name=Gradivo assc=association3 mult=0..* side=A */
   public Gradivo[] gradivo;
   
   /** @pdOid 2ba6e617-4276-48e1-bb31-d16a8ba2aa2a */
   public int vrniPodatkeOIzposojevalcu() {
      // TODO: implement
      return 0;
   }

}