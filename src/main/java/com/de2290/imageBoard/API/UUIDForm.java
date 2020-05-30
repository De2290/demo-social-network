package com.de2290.imageBoard.API;

import java.util.UUID;

public class UUIDForm {
   private UUID uuid;
   
   

   public UUID getUuid() {
       return this.uuid;
   }

   public void setUuid(UUID uuid) {
       this.uuid = uuid;
   }

   public UUIDForm() {

   }


   public UUIDForm(UUID uuid) {
       this.uuid = uuid;
   }
}