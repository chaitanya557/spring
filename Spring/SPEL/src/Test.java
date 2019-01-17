import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressionParser parser = new SpelExpressionParser();
		
		Expression exp = parser.parseExpression("'Hello'.bytes");
		byte[] bytes = (byte[]) exp.getValue();  
		for(int i=0;i<bytes.length;i++){  
		    System.out.print(bytes[i]+" ");  
		}  
	}

}
