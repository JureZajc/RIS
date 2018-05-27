/***********************************************************************
 * Module:  KIzposoja.java
 * Author:  Uporabnik
 * Purpose: Defines the Class KIzposoja
 ***********************************************************************/

package si.fri.emp.ris_naloga;

import java.util.*;

/** @pdOid 236854e7-f399-4e71-a44a-5cc304f6649c */
public class KIzposoja {
   /** @pdRoleInfo migr=no name=Gradivo assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection gradivo;
   
   /** @pdOid 5f1a12b2-ff51-42bb-bd50-fe474944e50b */
   public int vrniSeznamGradiva() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 2b396f97-0cc8-476d-832d-07f1ce06b9a9 */
   public int rezervirajIzbranoGradivo() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid aaf5d3a3-59b6-486b-9580-cc2e7c38439f */
   public int vrniPodatkeOIzposojevalcu() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 32b59532-f1d4-43d1-997a-f43120aaf89d */
   public int zaključiPosojo() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 476b2580-e30f-44d2-8880-f663c3638798 */
   public int niProstegaGradiva() {
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
         this.gradivo.add(newGradivo);
   }
   
   /** @pdGenerated default remove
     * @param oldGradivo */
   public void removeGradivo(Gradivo oldGradivo) {
      if (oldGradivo == null)
         return;
      if (this.gradivo != null)
         if (this.gradivo.contains(oldGradivo))
            this.gradivo.remove(oldGradivo);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllGradivo() {
      if (gradivo != null) gradivo.clear();
   }

}