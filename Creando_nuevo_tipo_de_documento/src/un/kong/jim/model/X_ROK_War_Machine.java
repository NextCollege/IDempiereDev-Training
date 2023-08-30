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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for ROK_War_Machine
 *  @author iDempiere (generated) 
 *  @version Release 2.0 - $Id$ */
public class X_ROK_War_Machine extends PO implements I_ROK_War_Machine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20140827L;

    /** Standard Constructor */
    public X_ROK_War_Machine (Properties ctx, int ROK_War_Machine_ID, String trxName)
    {
      super (ctx, ROK_War_Machine_ID, trxName);
      /** if (ROK_War_Machine_ID == 0)
        {
			setisrepairing (false);
			setName (null);
			setPrice (Env.ZERO);
			setROK_War_Machine_ID (0);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_ROK_War_Machine (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_ROK_War_Machine[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set isrepairing.
		@param isrepairing isrepairing	  */
	public void setisrepairing (boolean isrepairing)
	{
		set_Value (COLUMNNAME_isrepairing, Boolean.valueOf(isrepairing));
	}

	/** Get isrepairing.
		@return isrepairing	  */
	public boolean isrepairing () 
	{
		Object oo = get_Value(COLUMNNAME_isrepairing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Price.
		@param Price 
		Price
	  */
	public void setPrice (BigDecimal Price)
	{
		set_Value (COLUMNNAME_Price, Price);
	}

	/** Get Price.
		@return Price
	  */
	public BigDecimal getPrice () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Price);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ROK_War_Machine.
		@param ROK_War_Machine_ID ROK_War_Machine	  */
	public void setROK_War_Machine_ID (int ROK_War_Machine_ID)
	{
		if (ROK_War_Machine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_ROK_War_Machine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_ROK_War_Machine_ID, Integer.valueOf(ROK_War_Machine_ID));
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

	/** Set ROK_War_Machine_UU.
		@param ROK_War_Machine_UU ROK_War_Machine_UU	  */
	public void setROK_War_Machine_UU (String ROK_War_Machine_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ROK_War_Machine_UU, ROK_War_Machine_UU);
	}

	/** Get ROK_War_Machine_UU.
		@return ROK_War_Machine_UU	  */
	public String getROK_War_Machine_UU () 
	{
		return (String)get_Value(COLUMNNAME_ROK_War_Machine_UU);
	}

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}