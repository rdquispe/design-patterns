public class Main {
    public static void main(String[] args) {
        System.out.println("Si ve el mismo valor, singleton se reutilizó (¡sí!)" + "\n" +
            "Si ve valores diferentes, entonces se crearon 2 singletons (¡¡booo !!)" + "\n\n" +
            "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
