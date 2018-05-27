/***********************************************************************
 * Module:  Gradivo.java
 * Author:  JURE
 * Purpose: Defines the Class Gradivo
 ***********************************************************************/

package si.fri.emp.ris_naloga;

import java.util.*;

/** @pdOid bb30e5a3-3a23-47d1-a945-669f70c4bcfa */
public class Gradivo {
   /** @pdOid 284e4c41-4ec7-4b62-b585-1def1abbd0a4 */
   public int idGradivo;
   /** @pdOid 0bd13ff9-fde5-407f-a89d-f28eda7944e6 */
   public String tipGradiva;
   /** @pdOid fecd81fd-5eeb-4ca9-9b2d-733c7d964057 */
   public String naslov;
   /** @pdOid 3c78c078-5b30-4aca-bafd-b5bc83b79916 */
   public int kolicina;
   /** @pdOid 1968bf19-8579-44d8-993d-2ea58893b046 */
   public Boolean status;
   
   /** @pdRoleInfo migr=no name=Izposojevalec assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection izposojevalec;
   /** @pdRoleInfo migr=no name=ListSIzposjenimGradivom assc=association4 mult=0..1 side=A */
   public ListSIzposjenimGradivom listSIzposjenimGradivom;
   
   /** @pdOid 90d924d2-2712-48a8-bdaa-06a5a3cafe3e */
   public int vrniSeznamGradiva() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 9321c60e-8cfc-4148-8498-8d33e771c619 */
   public int preveriStatusGradiva() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 41c37e3c-632c-437c-a9a9-e6279329f5a2 */
   public int vrniStatusGradiva() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid a54fe63c-445e-477a-9fb7-313758258a43 */
   public int rezervirajGradivo() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 88960156-22d9-4999-a74a-7f0f68841530 */
   public int kreirajRezervacijoZaGradivo() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 9c4f0b4e-4927-47cc-a525-cef64b76ed96 */
   public int posodiGradivo() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 640b5744-f1cc-4a05-8094-1fa31296f242 */
   public int označiGradivoKotIzposojeno() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getIzposojevalec() {
      if (izposojevalec == null)
         izposojevalec = new java.util.HashSet();
      return izposojevalec;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorIzposojevalec() {
      if (izposojevalec == null)
         izposojevalec = new java.util.HashSet();
      return izposojevalec.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newIzposojevalec */
   public void setIzposojevalec(java.util.Collection newIzposojevalec) {
      removeAllIzposojevalec();
      for (java.util.Iterator iter = newIzposojevalec.iterator(); iter.hasNext();)
         addIzposojevalec((Izposojevalec)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newIzposojevalec */
   public void addIzposojevalec(Izposojevalec newIzposojevalec) {
      if (newIzposojevalec == null)
         return;
      if (this.izposojevalec == null)
         this.izposojevalec = new java.util.HashSet();
      if (!this.izposojevalec.contains(newIzposojevalec))
         this.izposojevalec.add(newIzposojevalec);
   }
   
   /** @pdGenerated default remove
     * @param oldIzposojevalec */
   public void removeIzposojevalec(Izposojevalec oldIzposojevalec) {
      if (oldIzposojevalec == null)
         return;
      if (this.izposojevalec != null)
         if (this.izposojevalec.contains(oldIzposojevalec))
            this.izposojevalec.remove(oldIzposojevalec);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllIzposojevalec() {
      if (izposojevalec != null)
         izposojevalec.clear();
   }
   /** @pdGenerated default parent getter */
   public ListSIzposjenimGradivom getListSIzposjenimGradivom() {
      return listSIzposjenimGradivom;
   }
   
   /** @pdGenerated default parent setter
     * @param newListSIzposjenimGradivom */
   public void setListSIzposjenimGradivom(ListSIzposjenimGradivom newListSIzposjenimGradivom) {
      if (this.listSIzposjenimGradivom == null || !this.listSIzposjenimGradivom.equals(newListSIzposjenimGradivom))
      {
         if (this.listSIzposjenimGradivom != null)
         {
            ListSIzposjenimGradivom oldListSIzposjenimGradivom = this.listSIzposjenimGradivom;
            this.listSIzposjenimGradivom = null;
            oldListSIzposjenimGradivom.removeGradivo(this);
         }
         if (newListSIzposjenimGradivom != null)
         {
            this.listSIzposjenimGradivom = newListSIzposjenimGradivom;
            this.listSIzposjenimGradivom.addGradivo(this);
         }
      }
   }

}