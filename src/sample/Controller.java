package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Controller {
    public TextField textfield_input;
    public TextField textField_result;

    public void btn_click(ActionEvent actionEvent) {
        var input = textfield_input.getText();

        var rezultat = IzracunajNesto(input);
        textField_result.setText(rezultat);
    }

    private String IzracunajNesto(String input) {
        var n = Integer.parseInt(input);
        var rezultat = "";
        for(int i=0; i<n; i++)
        {
            if(i%sumaCifara(n) ==0 ){
                rezultat += i;

                if(i+1 == n){
                    rezultat += " ";
                }
                else {
                    rezultat += ", ";
                }
            }
        }
        return  rezultat;
    }

    int sumaCifara(int n){
        int suma = 0;
        while( n != 0) {
            int a = n%10;
            suma += a;
            n = n/10;
        }return suma;
    }
}
