package un.kong.jim.document;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.compiere.acct.Doc;
import org.compiere.acct.Fact;
import org.compiere.model.MAcctSchema;

import un.kong.jim.model.MROKBattlePlan;

public class Doc_ROKBattlePlan extends Doc{

	public Doc_ROKBattlePlan (MAcctSchema as, ResultSet rs, String trxName)
	{
		super (as, MROKBattlePlan.class, rs, null, trxName);
		log.warning("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

	@Override
	protected String loadDocumentDetails() {
		log.warning("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return null;
	}

	@Override
	public BigDecimal getBalance() {
		log.warning("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return BigDecimal.ZERO;
	}

	@Override
	public ArrayList<Fact> createFacts(MAcctSchema as) {
		log.warning("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		ArrayList<Fact> facts = new ArrayList<Fact>();
		return facts;
	}

}
