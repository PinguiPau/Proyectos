package ActividadAlgoritmos;

import javax.swing.JOptionPane;

public class Info {

    public static void main(String[] args) {
        String Nombre = JOptionPane.showInputDialog("Ingrese su nombre:"), Curso = JOptionPane.showInputDialog("Ingrese el curso en el que se encuentra:");
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

        JOptionPane.showMessageDialog(null, "DATOS DEL ESTUDIANTE:\nNombre: " + Nombre + "\nEdad: " + Edad + "\nCurso: " + Curso);
        System.out.println("DATOS DEL ESTUDIANTE:\nNombre: " + Nombre + "\nEdad: " + Edad + "\nCurso: " + Curso);
    }
}
