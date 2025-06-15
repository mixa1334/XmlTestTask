<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<Objects>
    	
    <Object ID="10" Name="NESTED_FN_CALL_PROBLEM" Schema="" Type="Function" java_package="">
        		
        <Function DML="NO" ID="2" IsDb="false" Name="nested_fn_call_problem" Out="No" target_type="BigDecimal" type="NUMBER">
            			
            <Param ID="3" In="1" Name="p_LOGIN_ID" pos="1" target_type="String" type="VARCHAR2"/>
            			
            <Param ID="4" In="1" Name="p_UPDATE_DATE" pos="2" target_type="BigDecimal" type="NUMBER"/>
            		
        </Function>
        		
        <Function DML="NO" ID="5" IsDb="false" Name="InsertDtl" Out="No" target_type="BigDecimal" type="NUMBER">
            			
            <Param ID="6" In="1" Name="p_LOGIN_ID" pos="1" target_type="UNKNOWN" type="VARCHAR2"/>
            			
            <Param ID="47" In="1" Name="p_second_PARAM" pos="2" target_type="UNKNOWN" type="DATE"/>
            			
            <Param ID="48" Name="p_third_PARAM" Out="1" pos="3" target_type="UNKNOWN" type="DATE"/>
            			
            <Param ID="7" In="1" Name="p_UPDATE_DATE" pos="4" target_type="String" type="VARCHAR2"/>
            		
        </Function>
        	
    </Object>
    	
    <Object ID="36" Name="NESTED_MULTIPLY_5" Schema="USER_SCHEMA" Type="Procedure" java_package="">
        		
        <Procedure ID="9" IsDb="false" Name="nested_multiply_5" Out="No"/>
        		
        <Procedure ID="1" IsDb="false" Name="sp_n_1" Out="No"/>
        		
        <Function DML="NO" ID="11" IsDb="false" Name="fn_n_2" Out="No" target_type="UNKNOWN" type="VARCHAR2"/>
        	
    </Object>
    	
    <Object ID="12" Name="NESTED_FN_IN_NESTED_BLOCK" Schema="NEW_SCHEMA" Type="PackageSpecification" java_package="com.company.name">
        		
        <Variable ID="13" Name="excp_invalid_app_id" constant="1" target_type="BigDecimal" type="NUMBER"/>
        		
        <Variable ID="14" Name="SUCCESSFUL" constant="1" target_type="BigDecimal" type="NUMBER"/>
        		
        <Variable ID="15" Name="task_does_not_exist" target_type="BigDecimal" type="NUMBER"/>
        		
        <Variable ID="16" Name="sendto_custom_add" target_type="String" type="VARCHAR2(20)"/>
        		
        <Variable ID="17" Name="dlvrymethod_fedex" constant="1" target_type="String" type="VARCHAR2(20)"/>
        	
    </Object>
    	
    <Object ID="18" Name="NESTED_FN_IN_NESTED_BLOCK" Schema="SCHEMA_NESTEDPKG" Type="Package">
        		
        <Function DML="NO" ID="19" IsDb="false" Name="nested_multiply_5" Out="No" isPrivate="No" java_package="" target_type="Integer" type="INTEGER"/>
        		
        <Function DML="NO" ID="20" IsDb="false" Name="fn_nest" Out="No" isPrivate="Yes" java_package="" target_type="Integer" type="INT"/>
        	
    </Object>
    	
    <Object ID="21" Name="NESTED_FN_IN_PKG" Schema="" Type="PackageSpecification" java_package=""/>
    	
    <Object ID="22" Name="NESTED_FN_IN_PKG" Schema="" Type="Package">
        		
        <Function DML="NO" ID="23" IsDb="false" Name="nested_multiply_5" Out="No" isPrivate="No" java_package="" target_type="UNKNOWN" type="INTEGER">
            			
            <Param ID="24" In="1" Name="G_CHECK_OK" Out="1" pos="1" target_type="UNKNOWN" type="VARCHAR2"/>
            			
            <Param ID="25" In="1" Name="p_dob" pos="2" target_type="UNKNOWN" type="DATE"/>
            			
            <Param ID="26" In="1" Name="p_surname" pos="3" target_type="UNKNOWN" type="DATETIME"/>
            			
            <Param ID="27" In="1" Name="p_maiden_name" pos="4" target_type="UNKNOWN" type="VARCHAR2"/>
            			
            <Param ID="45" In="1" Name="p_UPDATE_DATE" pos="5" target_type="Timestamp" type="DATETIME"/>
            		
        </Function>
        		
        <Function DML="NO" ID="28" IsDb="false" Name="fn_nest" Out="No" isPrivate="Yes" java_package="" target_type="UNKNOWN" type="INT"/>
        	
    </Object>
    	
    <Object ID="29" Name="NESTED_FN_USING_COLLECTION" Schema="" Type="PackageSpecification" java_package="com.company.smth_name">
        		
        <Record ID="30" Name="t_Rec">
            			
            <Field ID="31" Name="distributor_id" target_type="BigDecimal" type="NUMBER"/>
            		
        </Record>
        		
        <Cursor ID="32" Name="t_cur" return="T_REC"/>
        	
    </Object>
    	
    <Object ID="33" Name="NESTED_FN_USING_COLLECTION" Schema="" Type="Package">
        		
        <Procedure ID="34" IsDb="false" Name="sp_outer" Out="No" isPrivate="No" java_package=""/>
        		
        <Procedure ID="35" IsDb="false" Name="sp_nested" Out="No" isPrivate="Yes" java_package=""/>
        	
    </Object>
    	
    <Object ID="8" Name="NESTED_FN_USING_RECORD" Schema="NEW_SCH" Type="PackageSpecification" java_package=""/>
    	
    <Object ID="37" Name="NESTED_FN_USING_RECORD" Schema="" Type="Package">
        		
        <Procedure ID="38" IsDb="true" Name="sp_outer" Out="No" isPrivate="No" java_package="">
            			
            <Param ID="39" In="1" Name="FirstName" pos="1" target_type="String" type="VARCHAR2"/>
            			
            <Param ID="40" In="1" Name="LastName" pos="2" target_type="UNKNOWN" type="VARCHAR2"/>
            			
            <Param ID="46" In="1" Name="p_UPDATE_DATE" pos="3" target_type="Integer" type="INT"/>
            			
            <Param DefConsType="number" Default="0" ID="41" In="1" Name="Department" pos="4" target_type="String" type="VARCHAR2"/>
            			
            <Param ID="42" In="1" Name="City" pos="5" target_type="UNKNOWN" type="VARCHAR2"/>
            			
            <Param ID="43" In="1" Name="Street" pos="6" target_type="UNKNOWN" type="VARCHAR2"/>
            		
        </Procedure>
        		
        <Procedure ID="44" IsDb="true" Name="sp_nested" Out="No" isPrivate="Yes" java_package=""/>
        	
    </Object>
    
</Objects>
