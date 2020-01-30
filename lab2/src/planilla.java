
import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class planilla {

   public static void main(String []args){

       Scanner leer =new  Scanner(System.in);
       empleado  trabajador[]=new empleado[10];

       String nom, puesto;
       int sueldo,noemp;
       double igss = 0,isr = 0,intecap = 0,total, totdescuentos , totdevengado,bonificacion,  sueldoextra, cantidad , anticipo, matriz[][];
       matriz = new double [10][10];

       for(int i = 0;i <trabajador.length;i++) {

           for(int j=0;j<3;j++) {


           }
           }
           System.out.println(" ingrese el numero del empleado");
           noemp = leer.nextInt();

           leer.nextLine();

           System.out.println(" ingrese el nombre del empleado");
           nom = leer.nextLine();

           System.out.println(" ingrese el puesto del empledo");
           puesto = leer.nextLine();

           System.out.println(" ingrese el sueldo ordinario del empleado");
           sueldo = leer.nextInt();

           System.out.println(" ingrese el sueldo extraordinario del empleado");
           sueldoextra = leer.nextFloat();

           System.out.println(" ingrese las bonificaciones  del empleado");
           bonificacion = leer.nextFloat();

           System.out.println(" anticipo de empleado");
           cantidad = leer.nextDouble();






           if (sueldo >= 5000) {

               igss = sueldo * 0.0483;
               isr = sueldo * 0.30;
               intecap= sueldo * 0.01;
           } else {
               System.out.println("no se puede calcular impuesto IGSS y ISR   " + nom);
           }

           anticipo = cantidad;

           totdescuentos= igss+isr+intecap+ anticipo;
           totdevengado=sueldo+sueldoextra;
           total = totdevengado-totdescuentos;



           System.out.print( "\u001B[35m numero del empleado    "    );
           System.out.print("    ");
           System.out.print("nombre del empleado    "         );
           System.out.print("    ");
           System.out.print("puesto del empleado    ");
           System.out.print("    ");
           System.out.print("sueldo del empleado    "    );
           System.out.print("    ");
           System.out.print(" sueldo extra es de     "   );
           System.out.print("    ");
           System.out.print(" la bonificacion es    "    );
           System.out.print("    ");
           System.out.print("total devengado     "   );
           System.out.print("    ");
           System.out.print("impuesto IGSS es de     "   );
           System.out.print("    ");
           System.out.print("impuesto ISR es de     "   );
           System.out.print("    ");
           System.out.print("tu anticipo es de     " );
           System.out.print("    ");
           System.out.print("impuesto Intecap es de     "   );
           System.out.print("    ");
           System.out.print("total descuentos es de      "    );
           System.out.print("    ");
           System.out.println("el total liquido es de     " );
           System.out.print("         " +noemp);
           System.out.print("                    "+ nom);
           System.out.print("             " +puesto);
           System.out.print("                   " +sueldo);
           System.out.print("                      " +sueldoextra);
           System.out.print("                     " +bonificacion);
           System.out.print("                 " +totdevengado);
           System.out.print("                    " +igss);
           System.out.print("                      " +isr);
           System.out.print("                      " +anticipo);
           System.out.print("                       " +intecap);
           System.out.print("                          " +totdescuentos);
           System.out.println("                         " +total);
           System.out.println("---------------------------------------------------------------------------------------------- ");



           leer.nextLine();



       }

   }
    class empleado{

        private String nom, puesto;
        private int sueldo,noemp;
        private double igss ,isr,intecap,total, totdescuentos , totdevengado,bonificacion,  sueldoextra, cantidad , anticipo;

        public empleado(){
            nom="";
            puesto="";
            sueldo=0;
            noemp=0;
            igss=0.0;
            isr=0.0;
            intecap=0.0;
            total=0.0;
            totdescuentos=0.0;
            totdevengado=0.0;
            bonificacion=0.0;
            sueldoextra=0.0;
            cantidad=0.0;
            anticipo=0.0;
        }



        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPuesto() {
            return puesto;
        }

        public void setPuesto(String puesto) {
            this.puesto = puesto;
        }

        public int getSueldo() {
            return sueldo;
        }

        public void setSueldo(int sueldo) {
            this.sueldo = sueldo;
        }

        public int getNoemp() {
            return noemp;
        }

        public void setNoemp(int noemp) {
            this.noemp = noemp;
        }

        public double getIgss() {
            return igss;
        }

        public void setIgss(double igss) {
            this.igss = igss;
        }

        public double getIsr() {
            return isr;
        }

        public void setIsr(double isr) {
            this.isr = isr;
        }

        public double getIntecap() {
            return intecap;
        }

        public void setIntecap(double intecap) {
            this.intecap = intecap;
        }

        public double getTotal() {
            return total;
        }

        public void setTotal(double total) {
            this.total = total;
        }

        public double getTotdescuentos() {
            return totdescuentos;
        }

        public void setTotdescuentos(double totdescuentos) {
            this.totdescuentos = totdescuentos;
        }

        public double getTotdevengado() {
            return totdevengado;
        }

        public void setTotdevengado(double totdevengado) {
            this.totdevengado = totdevengado;
        }

        public double getBonificacion() {
            return bonificacion;
        }

        public void setBonificacion(double bonificacion) {
            this.bonificacion = bonificacion;
        }

        public double getSueldoextra() {
            return sueldoextra;
        }

        public void setSueldoextra(double sueldoextra) {
            this.sueldoextra = sueldoextra;
        }

        public double getCantidad() {
            return cantidad;
        }

        public void setCantidad(double cantidad) {
            this.cantidad = cantidad;
        }

        public double getAnticipo() {
            return anticipo;
        }

        public void setAnticipo(double anticipo) {
            this.anticipo = anticipo;
        }


    }}

