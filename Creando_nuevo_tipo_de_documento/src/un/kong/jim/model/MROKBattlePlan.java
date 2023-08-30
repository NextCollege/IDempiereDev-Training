package un.kong.jim.model;

import java.io.File;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.process.DocAction;
import org.compiere.process.DocOptions;
import org.compiere.process.DocumentEngine;

public class MROKBattlePlan extends X_ROK_Battle_Plan implements DocAction, DocOptions {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8400473837447665921L;

	public MROKBattlePlan(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		log.warning("----------------------------------------------------------------------------------");
	}

	public MROKBattlePlan(Properties ctx, int ROK_Battle_Plan_ID, String trxName) {
		super(ctx, ROK_Battle_Plan_ID, trxName);
		log.warning("----------------------------------------------------------------------------------");
	}

	@Override
	public int customizeValidActions(String docStatus, Object processing, String orderType, String isSOTrx, int AD_Table_ID,
			String[] docAction, String[] options, int index) {

		if (options == null)
			throw new IllegalArgumentException("Option array parameter is null");
		if (docAction == null)
			throw new IllegalArgumentException("Doc action array parameter is null");

		// If a document is drafted or invalid, the users are able to complete, prepare or void
		if (docStatus.equals(DocumentEngine.STATUS_Drafted) || docStatus.equals(DocumentEngine.STATUS_Invalid)) {
			options[index++] = DocumentEngine.ACTION_Complete;
			options[index++] = DocumentEngine.ACTION_Prepare;
			options[index++] = DocumentEngine.ACTION_Void;

			// If the document is already completed, we also want to be able to reactivate or void it instead of only closing it
		} else if (docStatus.equals(DocumentEngine.STATUS_Completed)) {
			options[index++] = DocumentEngine.ACTION_Void;
			options[index++] = DocumentEngine.ACTION_ReActivate;
		}

		return index;
	}

	@Override
	public boolean processIt(String action) throws Exception {
		log.warning("Processing Action=" + action + " - DocStatus=" + getDocStatus() + " - DocAction=" + getDocAction());
		DocumentEngine engine = new DocumentEngine(this, getDocStatus());
		return engine.processIt(action, getDocAction());
	}

	@Override
	public boolean unlockIt() {
		log.warning("----------------------------------------------------------------------------------");
		return true;
	}

	@Override
	public boolean invalidateIt() {
		log.warning("----------------------------------------------------------------------------------");
		return true;
	}

	@Override
	public String prepareIt() {
		log.warning("----------------------------------------------------------------------------------");
		setC_DocType_ID(getC_DocTypeTarget_ID());
		return DocAction.STATUS_InProgress;
	}

	@Override
	public boolean approveIt() {
		log.warning("----------------------------------------------------------------------------------");
		return true;
	}

	@Override
	public boolean rejectIt() {
		log.warning("----------------------------------------------------------------------------------");
		return true;
	}

	@Override
	public String completeIt() {
		log.warning("----------------------------------------------------------------------------------");
		setProcessed(true);
		return DocAction.STATUS_Completed;
	}

	@Override
	public boolean voidIt() {
		log.warning("----------------------------------------------------------------------------------");
		return true;
	}

	@Override
	public boolean closeIt() {
		log.warning("----------------------------------------------------------------------------------");
		return true;
	}

	@Override
	public boolean reverseCorrectIt() {
		log.warning("----------------------------------------------------------------------------------");
		return true;
	}

	@Override
	public boolean reverseAccrualIt() {
		log.warning("----------------------------------------------------------------------------------");
		return true;
	}

	@Override
	public boolean reActivateIt() {
		log.warning("----------------------------------------------------------------------------------");
		return true;
	}

	@Override
	public String getSummary() {
		log.warning("----------------------------------------------------------------------------------");
		return null;
	}

	@Override
	public String getDocumentInfo() {
		log.warning("----------------------------------------------------------------------------------");
		return null;
	}

	@Override
	public File createPDF() {
		log.warning("----------------------------------------------------------------------------------");
		return null;
	}

	@Override
	public String getProcessMsg() {
		log.warning("----------------------------------------------------------------------------------");
		return null;
	}

	@Override
	public int getDoc_User_ID() {
		log.warning("----------------------------------------------------------------------------------");
		return 0;
	}

	@Override
	public BigDecimal getApprovalAmt() {
		log.warning("----------------------------------------------------------------------------------");
		return BigDecimal.ZERO;
	}

}
