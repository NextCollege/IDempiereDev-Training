/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package un.kong.jim.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for ROK_Battle_Plan_Line
 *  @author iDempiere (generated) 
 *  @version Release 2.0 - $Id$ */
public class X_ROK_Battle_Plan_Line extends PO implements I_ROK_Battle_Plan_Line, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20140827L;

    /** Standard Constructor */
    public X_ROK_Battle_Plan_Line (Properties ctx, int ROK_Battle_Plan_Line_ID, String trxName)
    {
      super (ctx, ROK_Battle_Plan_Line_ID, trxName);
      /** if (ROK_Battle_Plan_Line_ID == 0)
        {
			setROK_Battle_Plan_ID (0);
// @ROK_Battle_Plan_ID@
			setROK_Battle_Plan_Line_ID (0);
			setROK_War_Machine_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ROK_Battle_Plan_Line (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_ROK_Battle_Plan_Line[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_ROK_Battle_Plan getROK_Battle_Plan() throws RuntimeException
    {
		return (I_ROK_Battle_Plan)MTable.get(getCtx(), I_ROK_Battle_Plan.Table_Name)
			.getPO(getROK_Battle_Plan_ID(), get_TrxName());	}

	/** Set ROK_Battle_Plan.
		@param ROK_Battle_Plan_ID ROK_Battle_Plan	  */
	public void setROK_Battle_Plan_ID (int ROK_Battle_Plan_ID)
	{
		if (ROK_Battle_Plan_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_ROK_Battle_Plan_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_ROK_Battle_Plan_ID, Integer.valueOf(ROK_Battle_Plan_ID));
	}

	/** Get ROK_Battle_Plan.
		@return ROK_Battle_Plan	  */
	public int getROK_Battle_Plan_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ROK_Battle_Plan_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ROK_Battle_Plan_Line.
		@param ROK_Battle_Plan_Line_ID ROK_Battle_Plan_Line	  */
	public void setROK_Battle_Plan_Line_ID (int ROK_Battle_Plan_Line_ID)
	{
		if (ROK_Battle_Plan_Line_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_ROK_Battle_Plan_Line_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_ROK_Battle_Plan_Line_ID, Integer.valueOf(ROK_Battle_Plan_Line_ID));
	}

	/** Get ROK_Battle_Plan_Line.
		@return ROK_Battle_Plan_Line	  */
	public int getROK_Battle_Plan_Line_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ROK_Battle_Plan_Line_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ROK_Battle_Plan_Line_UU.
		@param ROK_Battle_Plan_Line_UU ROK_Battle_Plan_Line_UU	  */
	public void setROK_Battle_Plan_Line_UU (String ROK_Battle_Plan_Line_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ROK_Battle_Plan_Line_UU, ROK_Battle_Plan_Line_UU);
	}

	/** Get ROK_Battle_Plan_Line_UU.
		@return ROK_Battle_Plan_Line_UU	  */
	public String getROK_Battle_Plan_Line_UU () 
	{
		return (String)get_Value(COLUMNNAME_ROK_Battle_Plan_Line_UU);
	}

	public I_ROK_War_Machine getROK_War_Machine() throws RuntimeException
    {
		return (I_ROK_War_Machine)MTable.get(getCtx(), I_ROK_War_Machine.Table_Name)
			.getPO(getROK_War_Machine_ID(), get_TrxName());	}

	/** Set ROK_War_Machine.
		@param ROK_War_Machine_ID ROK_War_Machine	  */
	public void setROK_War_Machine_ID (int ROK_War_Machine_ID)
	{
		if (ROK_War_Machine_ID < 1) 
			set_Value (COLUMNNAME_ROK_War_Machine_ID, null);
		else 
			set_Value (COLUMNNAME_ROK_War_Machine_ID, Integer.valueOf(ROK_War_Machine_ID));
	}

	/** Get ROK_War_Machine.
		@return ROK_War_Machine	  */
	public int getROK_War_Machine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ROK_War_Machine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}