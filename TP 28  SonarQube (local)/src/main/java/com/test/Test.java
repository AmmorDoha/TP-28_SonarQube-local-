package com.test;

public class Test {
    private String password = "123456"; // ERREUR : mot de passe en clair
    
    public void complexMethod(int x) {
        if (x > 10) {
            System.out.println("Grand");
        } else if (x > 5) {
            System.out.println("Moyen");
        } else if (x > 0) {
            System.out.println("Petit");
        } else {
            System.out.println("Négatif");
        }
    }
    
    public void duplicateMethod() {
        System.out.println("Hello");
        System.out.println("World");
    }
    
    public void duplicateMethod2() {
        System.out.println("Hello");
        System.out.println("World");
    }
}
