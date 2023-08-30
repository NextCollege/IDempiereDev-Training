package un.kong.jim.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MROKBattalion extends X_ROK_Battalion {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8524875753308865256L;

	public MROKBattalion(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MROKBattalion(Properties ctx, int ROK_Battalion_ID, String trxName) {
		super(ctx, ROK_Battalion_ID, trxName);
		// TODO Auto-generated constructor stub
	}

}
