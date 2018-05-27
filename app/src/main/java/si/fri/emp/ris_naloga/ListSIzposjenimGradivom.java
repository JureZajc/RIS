/***********************************************************************
 * Module:  ListSIzposjenimGradivom.java
 * Author:  Uporabnik
 * Purpose: Defines the Class ListSIzposjenimGradivom
 ***********************************************************************/

package si.fri.emp.ris_naloga;

import java.util.*;

/** @pdOid eed0803b-8b49-401a-834a-21d326d12b1f */
public class ListSIzposjenimGradivom {
   /** @pdOid dc07cd5e-a214-4855-9627-79d85f8c67ce */
   private int idRacun;
   /** @pdOid 207d826f-fcd5-46af-a0d1-43beb4ea7ebe */
   private int idGradivo;
   /** @pdOid 683bc7f2-44d8-4742-b00b-0f14b1b4a4ef */
   private Date rokVrnitve;
   /** @pdOid 2ec2ef5d-f74e-473f-af88-d27f6e880531 */
   private Date datumIzdaje;
   /** @pdOid e6bcde4e-be8f-43d7-87ff-e826189a1265 */
   private String izdajalec;
   /** @pdOid 5243424a-80fd-4c4c-861c-b1fc42ac1544 */
   private int idIzposojevalec;
   /** @pdOid b0706233-d123-4c91-8b5d-5aed5aff5b75 */
   private int idKnjiznicar;
   
   /** @pdRoleInfo migr=no name=Gradivo assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection gradivo;
   
   /** @pdOid 40cd7c15-c805-47d4-ae53-dc799cfa2f44 */
   public int vnesiPodatkeNaObvestilo() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getGradivo() {
      if (gradivo == null)
         gradivo = new java.util.HashSet();
      return gradivo;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorGradivo() {
      if (gradivo == null)
         gradivo = new java.util.HashSet();
      return gradivo.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newGradivo */
   public void setGradivo(java.util.Collection newGradivo) {
      removeAllGradivo();
      for (java.util.Iterator iter = newGradivo.iterator(); iter.hasNext();)
         addGradivo((Gradivo)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGradivo */
   public void addGradivo(Gradivo newGradivo) {
      if (newGradivo == null)
         return;
      if (this.gradivo == null)
         this.gradivo = new java.util.HashSet();
      if (!this.gradivo.contains(newGradivo))
      {
         this.gradivo.add(newGradivo);
         newGradivo.setListSIzposjenimGradivom(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldGradivo */
   public void removeGradivo(Gradivo oldGradivo) {
      if (oldGradivo == null)
         return;
      if (this.gradivo != null)
         if (this.gradivo.contains(oldGradivo))
         {
            this.gradivo.remove(oldGradivo);
            oldGradivo.setListSIzposjenimGradivom((ListSIzposjenimGradivom)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllGradivo() {
      if (gradivo != null)
      {
         Gradivo oldGradivo;
         for (java.util.Iterator iter = getIteratorGradivo(); iter.hasNext();)
         {
            oldGradivo = (Gradivo)iter.next();
            iter.remove();
            oldGradivo.setListSIzposjenimGradivom((ListSIzposjenimGradivom)null);
         }
      }
   }

}