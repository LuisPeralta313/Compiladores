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
        
            default:
                break;
        }
    }

    private void executeSum(String operation, ArrayList<GrammarSymbol> lexemas, String variableType) throws Exception{

        //Codigo para realizar la suma
    }
    
}