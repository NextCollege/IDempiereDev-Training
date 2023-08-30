package un.kong.jim.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MROKWarMachine extends X_ROK_War_Machine{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6546242247713767695L;

	public MROKWarMachine(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MROKWarMachine(Properties ctx, int ROK_War_Machine_ID, String trxName) {
		super(ctx, ROK_War_Machine_ID, trxName);
		// TODO Auto-generated constructor stub
	}

}
