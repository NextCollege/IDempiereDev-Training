package un.kong.jim.model;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;
import org.jfree.util.Log;

public class ModelFactory implements IModelFactory {

	@Override
	public Class<?> getClass(String tableName) {

		Log.warn("Searching PO for table: " + tableName);
		
		if (tableName.equalsIgnoreCase(MROKBattlePlan.Table_Name))
			return MROKBattlePlan.class;
		
		if (tableName.equalsIgnoreCase(MROKBattlePlanLine.Table_Name))
			return MROKBattlePlan.class;
		
		if (tableName.equalsIgnoreCase(MROKBattalion.Table_Name))
			return MROKBattlePlan.class;
		
		if (tableName.equalsIgnoreCase(MROKWarMachine.Table_Name))
			return MROKBattlePlan.class;

		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {

		Log.warn("Searching PO for table: " + tableName);
		
		if (tableName.equalsIgnoreCase(MROKBattlePlan.Table_Name))
			return new MROKBattlePlan(Env.getCtx(), Record_ID, trxName);

		if (tableName.equalsIgnoreCase(MROKBattlePlanLine.Table_Name))
			return new MROKBattlePlanLine(Env.getCtx(), Record_ID, trxName);
		
		if (tableName.equalsIgnoreCase(MROKBattalion.Table_Name))
			return new MROKBattalion(Env.getCtx(), Record_ID, trxName);
		
		if (tableName.equalsIgnoreCase(MROKWarMachine.Table_Name))
			return new MROKWarMachine(Env.getCtx(), Record_ID, trxName);
		
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		
		Log.warn("Searching PO for table: " + tableName);

		if (tableName.equalsIgnoreCase(MROKBattlePlan.Table_Name))
			return new MROKBattlePlan(Env.getCtx(), rs, trxName);

		if (tableName.equalsIgnoreCase(MROKBattlePlanLine.Table_Name))
			return new MROKBattlePlanLine(Env.getCtx(), rs, trxName);
		
		if (tableName.equalsIgnoreCase(MROKBattalion.Table_Name))
			return new MROKBattalion(Env.getCtx(), rs, trxName);
		
		if (tableName.equalsIgnoreCase(MROKWarMachine.Table_Name))
			return new MROKWarMachine(Env.getCtx(), rs, trxName);
		return null;
	}

}
