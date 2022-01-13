import com.ibm.eserver.zos.racf.IRRPassTicket;
import com.ibm.eserver.zos.racf.IRRPassTicketEvaluationException;
public class App {
	public static void main(String args[]) {
		IRRPassTicket pt;
		String userId = args[0];
		String applicationName = args[1];
		try {
			pt = new IRRPassTicket();
			pt.evaluate(userId, applicationName,args[2]);
			System.out.println("PassTicket is valid.");
		} catch (IRRPassTicketEvaluationException e) {
			System.out.println("Evaluation failed. " + e);
		}
		//System.out.println("Evaluation failed. ");
	}
}
