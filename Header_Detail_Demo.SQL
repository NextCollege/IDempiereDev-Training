CREATE TABLE ROK_battle_plan
(
--Default columns
  rok_battle_plan_ID numeric(10,0) NOT NULL,
  rok_battle_plan_uu character varying(36) DEFAULT NULL::character varying,
  ad_client_ID numeric(10,0) NOT NULL,
  ad_org_ID numeric(10,0) NOT NULL,
  isactive character(1) NOT NULL DEFAULT 'Y'::bpchar,
  created timestamp without time zone NOT NULL DEFAULT now(),
  createdby numeric(10,0) NOT NULL,
  updated timestamp without time zone NOT NULL DEFAULT now(),
  updatedby numeric(10,0) NOT NULL,

--Document columns
  documentno character varying(30) NOT NULL,
  docstatus character(2) NOT NULL,
  docaction character(2) NOT NULL,
  processing character(1),
  processed character(1) NOT NULL DEFAULT 'N'::bpchar,
  c_doctype_id numeric(10,0) NOT NULL,
  c_doctypetarget_id numeric(10,0) NOT NULL,
  isapproved character(1) NOT NULL DEFAULT 'Y'::bpchar,

--Document columns to enable accounting
  dateacct timestamp without time zone NOT NULL,
  processedon numeric,
  posted character(1) NOT NULL DEFAULT 'N'::bpchar,
  c_currency_id numeric(10,0) NOT NULL,

--User columns
  value character varying(40) NOT NULL,
  name character varying(255) NOT NULL,
  description character varying(255),
  ad_user_id numeric(10,0), --in charge
  rok_battalion_ID numeric(10,0),
  attack_location character varying(255) NOT NULL,
  attack_time timestamp without time zone NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE ROK_battle_plan
  OWNER TO adempiere;
  
  CREATE TABLE rok_battle_plan_line
(
--Default Columns
  rok_battle_plan_line_ID numeric(10,0) NOT NULL,
  rok_battle_plan_line_uu character varying(36) DEFAULT NULL::character varying,
  ad_client_id numeric(10,0) NOT NULL,
  ad_org_id numeric(10,0) NOT NULL,
  isactive character(1) NOT NULL DEFAULT 'Y'::bpchar,
  created timestamp without time zone NOT NULL DEFAULT now(),
  createdby numeric(10,0) NOT NULL,
  updated timestamp without time zone NOT NULL DEFAULT now(),
  updatedby numeric(10,0) NOT NULL,
  rok_battle_plan_id numeric(10,0) NOT NULL,

--User Columns
  rok_war_machine_ID numeric(10,0) NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE rok_battle_plan_line
  OWNER TO adempiere;