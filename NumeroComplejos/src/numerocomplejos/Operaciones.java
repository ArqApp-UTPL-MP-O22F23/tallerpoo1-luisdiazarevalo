/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerocomplejos;

/**
 *
 * @author SALA I
 */
public class Operaciones implements OperacionesInterfce {
Complejo resul=new Complejo();
Complejo num1=new Complejo();
Complejo num2=new Complejo();

    Operaciones(Complejo num11, Complejo num21){
    this.num1=num11;
    this.num2=num21;
    }

  
    @Override
    public void Sumar() {
       resul.setReal(num1.getReal()+num2.getReal());
       resul.setImagnaria(num1.getImagnaria()+num2.getImagnaria());
    }

    @Override
    public void Restar() {
           resul.setReal(num1.getReal()-num2.getReal());
           resul.setImagnaria(num1.getImagnaria()-num2.getImagnaria());
    }

    @Override
    public void Imprimir() {
        System.out.print("el valor es "+resul.getReal()+"+"+resul.getImagnaria()+"i3");
    }
    
}
