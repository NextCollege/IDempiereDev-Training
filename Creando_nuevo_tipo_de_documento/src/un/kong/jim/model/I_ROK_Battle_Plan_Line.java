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
package un.kong.jim.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for ROK_Battle_Plan_Line
 *  @author iDempiere (generated) 
 *  @version Release 2.0
 */
@SuppressWarnings("all")
public interface I_ROK_Battle_Plan_Line 
{

    /** TableName=ROK_Battle_Plan_Line */
    public static final String Table_Name = "ROK_Battle_Plan_Line";

    /** AD_Table_ID=1000004 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name ROK_Battle_Plan_ID */
    public static final String COLUMNNAME_ROK_Battle_Plan_ID = "ROK_Battle_Plan_ID";

	/** Set ROK_Battle_Plan	  */
	public void setROK_Battle_Plan_ID (int ROK_Battle_Plan_ID);

	/** Get ROK_Battle_Plan	  */
	public int getROK_Battle_Plan_ID();

	public I_ROK_Battle_Plan getROK_Battle_Plan() throws RuntimeException;

    /** Column name ROK_Battle_Plan_Line_ID */
    public static final String COLUMNNAME_ROK_Battle_Plan_Line_ID = "ROK_Battle_Plan_Line_ID";

	/** Set ROK_Battle_Plan_Line	  */
	public void setROK_Battle_Plan_Line_ID (int ROK_Battle_Plan_Line_ID);

	/** Get ROK_Battle_Plan_Line	  */
	public int getROK_Battle_Plan_Line_ID();

    /** Column name ROK_Battle_Plan_Line_UU */
    public static final String COLUMNNAME_ROK_Battle_Plan_Line_UU = "ROK_Battle_Plan_Line_UU";

	/** Set ROK_Battle_Plan_Line_UU	  */
	public void setROK_Battle_Plan_Line_UU (String ROK_Battle_Plan_Line_UU);

	/** Get ROK_Battle_Plan_Line_UU	  */
	public String getROK_Battle_Plan_Line_UU();

    /** Column name ROK_War_Machine_ID */
    public static final String COLUMNNAME_ROK_War_Machine_ID = "ROK_War_Machine_ID";

	/** Set ROK_War_Machine	  */
	public void setROK_War_Machine_ID (int ROK_War_Machine_ID);

	/** Get ROK_War_Machine	  */
	public int getROK_War_Machine_ID();

	public I_ROK_War_Machine getROK_War_Machine() throws RuntimeException;

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
