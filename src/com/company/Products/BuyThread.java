package com.company.Products;

import static java.lang.Thread.currentThread;

public class BuyThread extends Thread {
   public BuyThread(String buyName) {
      super(buyName);
   }

   public void run() {
      System.out.printf("%s оплачен... \n", BuyThread.currentThread().getName());

        System.out.printf("%s отгружен... \n", BuyThread.currentThread().getName());

   }
}
