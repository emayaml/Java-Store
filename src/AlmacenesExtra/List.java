package AlmacenesExtra;

import javax.swing.JOptionPane;
public class List {

    private Node first;

    public List() {
        first = null;
    }

    public Node getFirst() {
        return first;
    }

//CREACION DE METODO VACIO    
    public boolean isEmpty() {
        return first == null;
    }

//AÑADIR METODOS
    public void addFirst(Object data) {
        if (first == null) {

            first = new Node(data);
        } else {
            Node nodo = new Node(data);
            nodo.setLink(first);
            first = nodo;

        }
    }

    public void Add(Object data, int pos) {
        if (pos == 1) {
            addFirst(data);
        } else {
            if (pos == Size() + 1) {
                addLast(data);
            } else {
                Node aux = first;
                int cont = 1;
                while (cont != pos) {
                    aux = aux.getLink();
                    cont++;
                }
                Node p = Previous(aux.getData());
                Node n = new Node(data, aux);
                p.setLink(n);
            }
        }
    }

    public void addLast(Object data) {
        if (isEmpty()) {

            first = new Node(data);
        } else {
            Node n = new Node(data);
            Node last = Last();
            last.setLink(n);
        }
    }

//METODOS ULTIMO PRIMERO
    public Node Previous(Object data) {
        Node aux = first, pre = null;
        while (aux != null && aux.getData().equals(data)) {
            pre = aux;
            aux = aux.getLink();
        }
        if (aux == null) {
            return null;
        } else {
            return pre;
        }
    }

    public Node Last() {
        Node aux = first, pre = null;
        while (aux != null) {
            pre = aux;
            aux = aux.getLink();
        }
        return pre;
    }

//METODOS BASICOS
    public int Size() {
        Node aux = first;
        int cont = 0;
        while (aux != null) {
            cont++;
            aux = aux.getLink();
        }
        return cont;
    }

    public String toString() {
        String text = " ";
        Node aux = first;
        Factory fc;
        while (aux != null) {
            fc = (Factory) aux.getData();
            text = text + fc.toString() + " /n";
            aux = aux.getLink();

        }
        return text;
    }

    //REMOVER METODOS
    public boolean removeFirst() {
        if (!isEmpty()) {
            Node aux = first;
            first = first.getLink();
            aux = null;
            return true;
        }
        return false;
    }

    public boolean Remove(int pos) {
        if (!isEmpty()) {
            if (pos == 1) {
                removeFirst();
            } else {
                if (pos == Size()) {
                    RemoveLast();
                } else {
                    Node aux = first;
                    int cont = 1;
                    while (cont < pos) {
                        aux = aux.getLink();
                        cont++;
                    }
                    Node pre = Previous(aux.getData());
                    pre.setLink(aux.getLink());
                    aux = null;
                }
            }
            return true;
        }
        return false;
    }

    public boolean RemoveLast() {
        if (!isEmpty()) {
            Node last = Last();
            Node pre = Previous(last.getData());
            if (pre != null) {
                pre.setLink(null);
            } else {
                first = null;
            }
            last = null;
            return true;
        }
        return false;
    }

    //CREACION DE NUMERALES 
    public int totalC(String product, String material) {
        int valor = 0;
        if (product == "Jarra") {
            if (material == "Plastico") {
                valor = 39607;
            }
            if (material == "Melamina") {
                valor = 12188;
            }
            if (material == "Cerámica") {
                valor = 21246;
            }
        }
        if (product == "Bandeja") {
            if (material == "Plastico") {
                valor = 17983;
            }
            if (material == "Melamina") {
                valor = 28181;
            }
            if (material == "Cerámica") {
                valor = 27427;
            }
        }
        if (product == "Cubierto") {
            if (material == "Plastico") {
                valor = 29094;
            }
            if (material == "Melamina") {
                valor = 33685;
            }
            if (material == "Cerámica") {
                valor = 25192;
            }
        }
        if (product == "Escurridor") {
            if (material == "Plastico") {
                valor = 12466;
            }
            if (material == "Melamina") {
                valor = 17972;
            }
            if (material == "Cerámica") {
                valor = 40619;
            }
        }
        if (product == "Frasco") {
            if (material == "Plastico") {
                valor = 20584;
            }
            if (material == "Melamina") {
                valor = 10490;
            }
            if (material == "Cerámica") {
                valor = 41977;
            }
        }
        if (product == "Plato") {
            if (material == "Plastico") {
                valor = 28737;
            }
            if (material == "Melamina") {
                valor = 40809;
            }
            if (material == "Cerámica") {
                valor = 30139;
            }
        }
        if (product == "Recipiente") {
            if (material == "Plastico") {
                valor = 18679;
            }
            if (material == "Melamina") {
                valor = 33371;
            }
            if (material == "Cerámica") {
                valor = 34468;
            }
        }
        if (product == "Termo") {
            if (material == "Plastico") {
                valor = 37797;
            }
            if (material == "Melamina") {
                valor = 12145;
            }
            if (material == "Cerámica") {
                valor = 22279;
            }
        }
        if (product == "Vaso") {
            if (material == "Plastico") {
                valor = 10908;
            }
            if (material == "Melamina") {
                valor = 18072;
            }
            if (material == "Cerámica") {
                valor = 29187;
            }
        }
        if (product == "Taza") {
            if (material == "Plastico") {
                valor = 39257;
            }
            if (material == "Melamina") {
                valor = 11265;
            }
            if (material == "Cerámica") {
                valor = 22363;
            }
        }
        return valor;
    }

    public void AddP(Object data) {
        if (isEmpty()) {
            first = new Node(data);
        } else {
            Node aux = first;
            while (aux != null);
            aux = aux.getLink();

            if (aux == null) {
                addLast(data);
            } else {
                Node pre = Previous(aux.getData());
                if (pre == null) {
                    addFirst(data);
                } else {
                    Node n = new Node(data, aux);
                    pre.setLink(n);
                }
            }
        }
    }

    //2Listar la información de un producto determinado.
    public String Showtt(String productsear) {
        String text = " ";
        Node aux = first;
        Factory fc;
        ProductsFactorys pf;
        while (aux != null) {
            fc = (Factory) aux.getData();
            pf = (ProductsFactorys) fc.getProducts();
            if (pf.getName().equalsIgnoreCase(productsear)) {
                text = text + pf.toString() + " /n";
            }
            aux = aux.getLink();
        }
        return text;
    }

    public String showNP(String products) {
        if (isEmpty()) {
            first = new Node(products);
        } else {
            Factory st;
            ProductsFactorys ps;
            Node aux = first;
            String cad = "";
            int i = 0;
            while (aux != null) {
                if (aux.getData().equals(products)) {
                    st = (Factory) aux.getData();
                    ps = (ProductsFactorys) st.getProducts();
                    cad += i + "" + ps.toString() + "/n";
                }
                i++;
                aux = aux.getLink();
            }
            return cad;
        }
        return "Don't";
    }

    //3Determinar la cantidad de productos fabricados en una fábrica determinada.
    public int CantidadProductosFabrica(int codeFactory) {
        Node n = first;
        int cont = 0;
        while (n != null) {
            if (((Factory) n.getData()).getCodeFactory() == codeFactory) {
                cont += ((Factory) n.getData()).getAmount();
            }
            n = n.getLink();
        }
        return cont;
    }

    //4Buscar la disponibilidad de un producto X dado un material y fabrica.
    public boolean buscar(String material) {
        Node aux = first;
        boolean encontrado = false;
        while (aux != null && encontrado != true) {

            Factory f = (Factory) aux.getData();
            ProductsFactorys pf = (ProductsFactorys) f.getProducts();
            if (material.equals(pf.getTypeMaterial())) {
                encontrado = true;
            } else {
                aux = aux.getLink();
            }
        }
        return encontrado;
    }

    //5Determinar el valor total de los productos fabricados.
    public void valueT() {
        Node aux = first;
        int total = 0;
        while (aux != null) {
            Factory f = (Factory) aux.getData();
            total += (((ProductsFactorys) ((Factory) aux.getData()).getProducts()).getTotalValue());
            aux = aux.getLink();
        }
        JOptionPane.showMessageDialog(null, "The total value is: " + total );

    }

    //6Eliminar los productos de un material determinado.
    public int DeleteTTT(String typeMaterial) {
        String text = " ";
        Node aux = first;
        Factory fc;
        ProductsFactorys pf;
        int rmm = 0;
        while (aux != null) {
            fc = (Factory) aux.getData();
            pf = (ProductsFactorys) fc.getProducts();
            if ((((ProductsFactorys) ((Factory) aux.getData()).getProducts()).getTypeMaterial()).equals(typeMaterial)) {
             rmm = RemoveM(typeMaterial);
            }
            aux = aux.getLink();
        }
        return rmm;
    }
      
    public int RemoveM(String typeMaterial) {
        ProductsFactorys ps = null;
        Factory ff = null;
        int sw = 0;
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "No products");
        } else {
            Node aux = first, ant;
            if ((((ProductsFactorys) ((Factory) aux.getData()).getProducts()).getTypeMaterial()).equals(typeMaterial)) {
                removeFirst();
                sw = 1;
            JOptionPane.showMessageDialog(null, "Remove first");
            } else {
                ant = aux;
                while (aux != null) {
                    if (aux.getLink() == null && (((ProductsFactorys) ((Factory) aux.getData()).getProducts()).getTypeMaterial()).equals(typeMaterial)) {
                        RemoveLast();
                        sw = 1;
            JOptionPane.showMessageDialog(null, "Delete last");
                        aux = null;
                    } else {
                        if ((((ProductsFactorys) ((Factory) aux.getData()).getProducts()).getTypeMaterial()).equals(typeMaterial)) {
                            ant.setLink(aux.getLink());
                            aux.setLink(null);
                            aux = ant;
                            sw = 1;
            JOptionPane.showMessageDialog(null, "Delete center");
                        }
                        ant = aux;
                        aux = aux.getLink();
                    }
                }
            }
        }
        return sw;
    }
 
    //7Calcular el porcentaje productos por fabrica.
    public void percentageTT(String Fabrice) {
        Node aux = first;
        int acm = 0, acmp = 0, divid = 0, tpp = 0;
        double prct = 0;
        boolean encontrado = false;
        while (aux != null && encontrado != true) {
            Factory f = (Factory) aux.getData();
            ProductsFactorys pf = (ProductsFactorys) f.getProducts();
            if (pf.getName().equalsIgnoreCase("Bandeja")) {
                tpp += cont(Fabrice, pf.getName());
                acm += pf.getCant();
            }
            if (pf.getName().equalsIgnoreCase("Jarra")) {
                tpp += cont(Fabrice, pf.getName());
                acm += pf.getCant();
            }
            if (pf.getName().equalsIgnoreCase("Termo")) {
                tpp += cont(Fabrice, pf.getName());
                acm += pf.getCant();
            }
            if (pf.getName().equalsIgnoreCase("Vaso")) {
                tpp += cont(Fabrice, pf.getName());
                acm += pf.getCant();
            }
            if (pf.getName().equalsIgnoreCase("Plato")) {
                tpp += cont(Fabrice, pf.getName());
                acm += pf.getCant();
            }
            if (pf.getName().equalsIgnoreCase("Cubierto")) {
                tpp += cont(Fabrice, pf.getName());
                acm += pf.getCant();
            }
            if (pf.getName().equalsIgnoreCase("Recipiente")) {
                tpp += cont(Fabrice, pf.getName());
                acm += pf.getCant();
            }
            if (pf.getName().equalsIgnoreCase("Escurridor")) {
                tpp += cont(Fabrice, pf.getName());
                acm += pf.getCant();
            }
            if (pf.getName().equalsIgnoreCase("Taza")) {
                tpp += cont(Fabrice, pf.getName());
                acm += pf.getCant();
            }
            if (pf.getName().equalsIgnoreCase("Frasco")) {
                tpp += cont(Fabrice, pf.getName());
                acm += pf.getCant();
            }
            prct = (tpp * 100) / acm;
            aux = aux.getLink();
        }
        JOptionPane.showMessageDialog(null, "The percentage is" + prct);
    }

    public int cont(String nameF, String namePTA) {
        Node aux = first;
        int cont = 0;
        while (aux != null) {
            Factory f = (Factory) aux.getData();
            ProductsFactorys pf = (ProductsFactorys) f.getProducts();
            if (nameF.equals(f.getNameFactory())) {
                if (pf.getName().equalsIgnoreCase(namePTA)) {
                    cont++;
                }
            }
            aux = aux.getLink();
        }
        return cont;
    }

    //8 Calcular el promedio de unidades producidas en cada fabrica.
    public int FactoryPromU(int factoryCode) {
        int tt = 0, cont = 0;
        Node aux = first;
        while (aux != null) {
            if (((Factory) aux.getData()).getCodeFactory() == (factoryCode)) {
                tt += ((Factory) aux.getData()).getAmount();
                cont++;
                aux = aux.getLink();
            }
            aux = aux.getLink();
        }
        return (int) tt / cont;
    }

    //9 Determinar el prmariaoducto que tiene menor disponibilidad.
    public int leesAvailableP() {
        Node aux = first;
        int men = ((Factory) aux.getData()).getAmount();
        String namep = ((ProductsFactorys) aux.getData()).getName();
        if (first == null) {
            JOptionPane.showMessageDialog(null, "No products ");
        } else {
            while (aux != null) {
                if (((Factory) aux.getData()).getAmount() < men) {
                    men = ((Factory) aux.getData()).getAmount();
                    namep = ((ProductsFactorys) aux.getData()).getName();
                    aux = aux.getLink();
                }
            }
        }
        return men;
    }

    //10
    public void FactoryMG() {
        Node aux = first;
        int may = 0;
        String name = null;
        if (first == null) {
            JOptionPane.showMessageDialog(null, "No factorys ");
        } else {
            may = ((ProductsFactorys) ((Factory) aux.getData()).getProducts()).getTotalValue();
            while (aux != null) {
                if (((ProductsFactorys) ((Factory) aux.getData()).getProducts()).getTotalValue() < may) {
                    may = ((ProductsFactorys) ((Factory) aux.getData()).getProducts()).getTotalValue();
                    name = (((Factory) aux.getData()).getNameFactory());
                }
                aux = aux.getLink();
            }
        }
        JOptionPane.showMessageDialog(null, "The factory is: " + name + " with the amount of " + may);
    }

}