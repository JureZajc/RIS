/***********************************************************************
 * Module:  ZMIzposojaGradiva.java
 * Author:  Uporabnik
 * Purpose: Defines the Class ZMIzposojaGradiva
 ***********************************************************************/

package si.fri.emp.ris_naloga;

import java.util.*;

/** @pdOid 6367896b-d116-4398-b41a-d0be21a293b4 */
public class ZMIzposojaGradiva {
   /** @pdRoleInfo migr=no name=KIzposoja assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection kIzposoja;
   
   /** @pdOid 4652f211-1285-4484-934e-3e2307ada913 */
   public int pričniPostopekPosoje() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 69f7f36b-5ff6-4ddd-8143-a81fb1cf6047 */
   public int prikažiSeznamGradiva() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 08b345a2-d843-4d15-8ed8-adac382e634b */
   public int izberiGradivo() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 4a7c6e02-f4d9-4d67-9c70-a3beeee1338c */
   public int prikažiStatusGradiva() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 50987904-8ed6-4a6c-869b-f67054d26bd5 */
   public int validirajIzposojevalca() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid f2eaf3d4-9b1c-46f5-905a-8f4cc6c486e8 */
   public int zahtevajValidacijoIzposojevalca() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid c4bc7641-08f9-4a51-b76a-7f10da0593fa */
   public int zaključiPostopekPosoje() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid be7833d8-a0e4-487b-9920-f3bef8bdc576 */
   public int izdajObvestilo() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 7e7a13aa-99b3-4305-b33f-f49eef0ec421 */
   public int vrniSporočiloONapaki() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getKIzposoja() {
      if (kIzposoja == null)
         kIzposoja = new java.util.HashSet();
      return kIzposoja;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorKIzposoja() {
      if (kIzposoja == null)
         kIzposoja = new java.util.HashSet();
      return kIzposoja.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newKIzposoja */
   public void setKIzposoja(java.util.Collection newKIzposoja) {
      removeAllKIzposoja();
      for (java.util.Iterator iter = newKIzposoja.iterator(); iter.hasNext();)
         addKIzposoja((KIzposoja)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newKIzposoja */
   public void addKIzposoja(KIzposoja newKIzposoja) {
      if (newKIzposoja == null)
         return;
      if (this.kIzposoja == null)
         this.kIzposoja = new java.util.HashSet();
      if (!this.kIzposoja.contains(newKIzposoja))
         this.kIzposoja.add(newKIzposoja);
   }
   
   /** @pdGenerated default remove
     * @param oldKIzposoja */
   public void removeKIzposoja(KIzposoja oldKIzposoja) {
      if (oldKIzposoja == null)
         return;
      if (this.kIzposoja != null)
         if (this.kIzposoja.contains(oldKIzposoja))
            this.kIzposoja.remove(oldKIzposoja);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllKIzposoja() {
      if (kIzposoja != null)
         kIzposoja.clear();
   }

}