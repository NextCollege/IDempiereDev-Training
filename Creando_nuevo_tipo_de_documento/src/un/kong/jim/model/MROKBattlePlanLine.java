package un.kong.jim.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MROKBattlePlanLine extends X_ROK_Battle_Plan_Line{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2222647998869679613L;

	public MROKBattlePlanLine(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MROKBattlePlanLine(Properties ctx, int ROK_Battle_Plan_Line_ID, String trxName) {
		super(ctx, ROK_Battle_Plan_Line_ID, trxName);
		// TODO Auto-generated constructor stub
	}

}
