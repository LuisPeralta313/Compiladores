import java.util.HashMap;
import java.util.ArrayList;

public class SemanticAnalyzer {

    private HashMap<String, SymbolItem> symbolsTable;

    public SemanticAnalyzer(){
        symbolsTable = new HashMap<String, SymbolItem>();
    }

    public void ExecuteOperation(String operation, ArrayList<GrammarSymbol> lexemas, GrammarSymbol symbol) throws Exception{
        switch (operation) {

            case "sum_e_and_t_save_value":
                executeSum(operation, lexemas, ((Lexema)lexemas.get(4)).getSymbol());    
            break;

            case "mult_f_and_t_save_value":
                executeMult(operation, lexemas, ((Lexema)lexemas.get(4)).getSymbol());
            break;
        
            default:
                throw new Exception("Operación no reconocida: " + operation);
        }
    }

    // Método para realizar la suma
    private void executeSum(String operation, ArrayList<GrammarSymbol> lexemas, String variableType) throws Exception {
        // Obtener los dos operandos de los lexemas
        int operand1 = Integer.parseInt(((Lexema) lexemas.get(0)).getSymbol());
        int operand2 = Integer.parseInt(((Lexema) lexemas.get(2)).getSymbol());
    
        // Realizar la suma
        int result = operand1 + operand2;
    
        // Definir los otros parámetros del constructor de SymbolItem
        int function = SymbolItem.VARIABLE;  // Puedes ajustar este valor según sea necesario
        int type = SymbolItem.INT;           // Suponiendo que sea una operación con enteros
        int scope = SymbolItem.LOCAL;        // Dependiendo de si es local o global
        int memoryAddress = 0;               // Ajustar si tienes un sistema de direcciones de memoria
    
        // Guardar el resultado en la tabla de símbolos
        symbolsTable.put(variableType, new SymbolItem(variableType, function, type, scope, memoryAddress, result));
        System.out.println("Suma realizada: " + operand1 + " + " + operand2 + " = " + result);
    }
    
    private void executeMult(String operation, ArrayList<GrammarSymbol> lexemas, String variableType) throws Exception {
        // Obtener los dos operandos de los lexemas
        int operand1 = Integer.parseInt(((Lexema) lexemas.get(0)).getSymbol());
        int operand2 = Integer.parseInt(((Lexema) lexemas.get(2)).getSymbol());
    
        // Realizar la multiplicación
        int result = operand1 * operand2;
    
        // Definir los otros parámetros del constructor de SymbolItem
        int function = SymbolItem.VARIABLE;  // Puedes ajustar este valor según sea necesario
        int type = SymbolItem.INT;           // Suponiendo que sea una operación con enteros
        int scope = SymbolItem.LOCAL;        // Dependiendo de si es local o global
        int memoryAddress = 0;               // Ajustar si tienes un sistema de direcciones de memoria
    
        // Guardar el resultado en la tabla de símbolos
        symbolsTable.put(variableType, new SymbolItem(variableType, function, type, scope, memoryAddress, result));
        System.out.println("Multiplicación realizada: " + operand1 + " * " + operand2 + " = " + result);
    }
    
}
