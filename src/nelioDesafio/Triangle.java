package nelioDesafio;

public class Triangle {

    private int lado1;
    private int lado2;
    private int lado3;
    int lado;  //variável local não é necessário
    double area;
    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public int getLado3() {
        return lado3;
    }


    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }


    public boolean Equilatero(){
        if(getLado1() == getLado2() && getLado1() == getLado3()){
            System.out.println("É equilátero");
            lado = lado1;
            areaEquilatero(lado);
            System.out.println("A área do triangulo equilatero é essa aqui: " + area);
            return true;
        }else{
            System.out.println("Não é equilatero");
            return false;
        }

    }
    //Se o Triangulo for equilatero//
    public double areaEquilatero(int lado){
       area = (Math.pow(lado,2) * Math.sqrt(3)/4);
       return area;
    }

    public static void main(String[] args) {
        Triangle triangulo = new Triangle();
        triangulo.setLado1(5);
        triangulo.setLado2(5);
        triangulo.setLado3(5);
        triangulo.Equilatero();
    }

}
