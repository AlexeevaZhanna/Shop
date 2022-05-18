package com.company.Products;

public abstract class Product {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Product(String name) {

        this.name = name;
    }


    public Product() {
    }

    public int take(int p) {
        return p;

    }

    public void setDescription(String name) {
        this.name = name;
        System.out.println("Описание");
    }

    public abstract void pack();

    private int counter = 0;

    public synchronized void get() {
        while (counter < 1) {
            System.out.println("Ожидается пополнение склада: " + name);
            try {Thread.sleep(30);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            counter--;
            System.out.println("Продукт продан: " + name);
            System.out.println("Товар " + name + " на складе: " + counter);
            notifyAll();
        }

        public synchronized void put () {
            while (counter >= 6) {                                  // на складе может быть не более 6 единиц товара
                try {Thread.sleep(5);
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            counter++;
            System.out.println("Товар добавлен: " + name);
            System.out.println("Товар " + name + " на складе: " + counter);
            notifyAll();
        }
    }



