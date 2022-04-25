
package AlmacenesExtra;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class MainEXTRA {

    public static void main(String[] args) {
        List product = new List();
        int code = 100, code2 = 100;
        String FactoryN, type, materialTp;
        String menu[] = {"1.Add product", "See information product",
            "see quantity of products of a factory", "Search the availability of a product X by material and manufacturer",
            "total value of products manufactured", " Remove the products from material X",
            "percentage of products per factory", "mean number of units produced at factory X",
            "product with less availability", "highest spending factory", "Exit"};
        String namep, opt;
        String mtype[] = {"Bandeja", "Cubierto", " Escurridor", "Frasco", "Jarra", "Plato", "Recipiente", "Taza", "Termo", "Vaso"};
        String typeM[] = {"Plastico", "Melamina", "Cerámica"};

          do {
            opt = (String) JOptionPane.showInputDialog(null, "Selected option",  "Main menu", 1, null, menu, menu[0]);
            switch (opt) {
                case "1.Add product":
                    FactoryN = JOptionPane.showInputDialog("Enter name of factory");
                    String ProductM = (String) JOptionPane.showInputDialog(null, "Selected option", "Type menu",
                            1, null, mtype, mtype[0]);
                    String MaterialT = (String) JOptionPane.showInputDialog(null, "Selected option", "Type menu",
                            1, null, typeM, typeM[0]);
                    int valueU = product.totalC(ProductM, MaterialT);
                    int cantidadP = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity of products"));
                    int totalValue = cantidadP * valueU;
                    JOptionPane.showMessageDialog(null, "The total value is: " + totalValue);
                    ProductsFactorys productC = new ProductsFactorys(code, ProductM, MaterialT, totalValue, cantidadP);
                    code++;
                    Factory fc = new Factory(code2, FactoryN, cantidadP, productC);
                    code2++;
                    product.addLast(fc);
                    JOptionPane.showMessageDialog(null, "Created product");
                    break;

                case "See information product":
                    JOptionPane.showMessageDialog(null, product.toString());
                    String searchP = JOptionPane.showInputDialog("What is the product to look for?");
                    JOptionPane.showMessageDialog(null, product.Showtt(searchP));
                    break;

                case "see quantity of products of a factory":
                    int cf = Integer.parseInt(JOptionPane.showInputDialog("Factory code"));
                    JOptionPane.showMessageDialog(null, product.CantidadProductosFabrica(cf));
                    break;

                case "Search the availability of a product X by material and manufacturer":
                    String productP = JOptionPane.showInputDialog("Enter the product");
                    JOptionPane.showMessageDialog(null, " is: " + product.buscar(productP));
                    break;

                case "total value of products manufactured":
                    product.valueT();
                    break;

                case " Remove the products from material X":

                   materialTp = JOptionPane.showInputDialog("Enter name");
                   int  ps = product.DeleteTTT(materialTp);
                    if (ps != 0) {
                        JOptionPane.showMessageDialog(null, "Remove type");
                    } else {
                        JOptionPane.showMessageDialog(null, "type is empty");
                    }
                    break;

                case "percentage of products per factory":
                    String nameF=JOptionPane.showInputDialog("Name of the fabrica");
                   product.percentageTT(nameF);
                    break;

                case "mean number of units produced at factory X":
                    int cdf=Integer.parseInt(JOptionPane.showInputDialog("Factory code"));
                  JOptionPane.showInputDialog("El promedio es :"+product.FactoryPromU(cdf));
                    break;

                case "product with less availability":
                    JOptionPane.showMessageDialog(null, "No products");
                    JOptionPane.showMessageDialog(null, "The product " + product.leesAvailableP());
                    break;

                case "highest spending factory":
                    product.FactoryMG();
                    break;

            }
        } while (!opt.equals("Exit"));

    }
}

/*
BASE
"Add First", "Add Last", "Add", "Size", "Print", "Last", "Previous",
            "Remove first", "Remove last", "Remove", "Exit"

NUMERALES 
1.	Almacenar la información de los productos fabricados en una lista simple, 
teniendo en cuenta que se debe ingresarse en orden alfabético según el nombre del producto. 
2.	Listar la información de un producto determinado.
3.	Determinar la cantidad de productos fabricados en una fábrica determinada.
4.	Buscar la disponibilidad de un producto X dado un material y fabrica.
5.	Determinar el valor total de los productos fabricados.
6.	Eliminar los productos de un material determinado.
7.	Calcular el porcentaje productos por fabrica.
8.	Calcular el promedio de unidades producidas en cada fabrica.
9.	Determinar el producto que tiene menor disponibilidad.
10.	Determinar la fabrica que tiene mayor gasto.

 */