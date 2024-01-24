public class App {
    public class OopTut {

        public class Man{
    
            private String name;
            private int age;  
            private char gender;  
    
            public Man()
            {
                name = "";
                age = 0;
                gender = 'm';
            }
    
            public Man(String name, int age, char gender)
            {
                this.name = name;
                this.age = age;
                this.gender = gender;
            }
    
    
        }
    
        public void main(String[] args) {
    
            Man newman = new Man();
    
            System.out.println(newman.name);
    
    
        }
    
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
