package de.igweb.igdatastores;

public class ConditionalChecker {

    public static boolean isTrue(Object objectA, Object objectB, String conditionIdentifier) {
        switch (conditionIdentifier) {
            case "=" -> {
                return objectA.equals(objectB);
            }
            case "=?^" -> {
                return objectA.toString().equalsIgnoreCase(objectB.toString());
            }
            case "!=" -> {
                return !objectA.equals(objectB);
            }
            case ">" -> {
                return (int) objectA > (int) objectB;
            }
            case "<" -> {
                return (int) objectA < (int) objectB;
            }
            case "contains" -> {
                return objectA.toString().contains(objectB.toString());
            }
            case "containsIgnoreCase" -> {
                return objectA.toString().toLowerCase().contains(objectB.toString().toLowerCase());
            }
            case "startsWith" -> {
                return objectA.toString().startsWith(objectB.toString());
            }
            case "startsWithIgnoreCase" -> {
                return objectA.toString().toLowerCase().startsWith(objectB.toString().toLowerCase());
            }
            case "endsWith" -> {
                return objectA.toString().endsWith(objectB.toString());
            }
            case "endsWithIgnoreCase" -> {
                return objectA.toString().toLowerCase().endsWith(objectB.toString().toLowerCase());
            }
            case "?null" -> {
                return objectA == null;
            }
            case "?!null" -> {
                return objectA != null;
            }
            case "?true" -> {
                return (boolean) objectA;
            }
            case "?false" -> {
                return !(boolean) objectA;
            }
            default -> {
                return false;
            }
        }
    }

}