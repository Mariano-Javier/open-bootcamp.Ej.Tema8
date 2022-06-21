public class Main {
    public static void main(String[] args) {

        Persona nuevaPersona = new Persona();
        nuevaPersona.setEdad(25);
        nuevaPersona.setNombre("Juan");
        nuevaPersona.setTelefono(12345678);

        System.out.println("Hola mi nombre es "+nuevaPersona.getNombre()+", tengo "+ nuevaPersona.getEdad()+" años, mi teléfono es "+ nuevaPersona.getTelefono()+".");
    }

}
    class Persona {
        private int edad;
        private String nombre;
        private int telefono;

        //set y get de edad.
        public void setEdad(int edad){
            this.edad = edad;
        }
        public int getEdad(){
            return this.edad;
        }

        //set y get de nombre.
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public String getNombre(){
            return this.nombre;
        }

        //set y get de teléfono.
        public void setTelefono(int telefono){
            this.telefono = telefono;
        }
        public int getTelefono(){
            return this.telefono;
        }
}

