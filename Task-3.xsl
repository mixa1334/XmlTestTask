<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<root>
    <Procedures>
        <Procedure ID="35" IsDb="false" Name="sp_nested" Out="No" isPrivate="Yes" java_package=""/>
        <Procedure ID="44" IsDb="true" Name="sp_nested" Out="No" isPrivate="Yes" java_package=""/>
        <Procedure ID="34" IsDb="false" Name="sp_outer" Out="No" isPrivate="No" java_package=""/>
        <Procedure ID="38" IsDb="true" Name="sp_outer" Out="No" isPrivate="No" java_package="">
            			
            <Param ID="39" In="1" Name="FirstName" pos="1" target_type="String" type="VARCHAR2"/>
            			
            <Param ID="40" In="1" Name="LastName" pos="2" target_type="" type="VARCHAR2"/>
            			
            <Param ID="46" In="1" Name="p_UPDATE_DATE" pos="3" target_type="Integer" type="INT"/>
            			
            <Param DefConsType="number" Default="0" ID="41" In="1" Name="Department" pos="4" target_type="String" type="VARCHAR2"/>
            			
            <Param ID="42" In="1" Name="City" pos="5" target_type="" type="VARCHAR2"/>
            			
            <Param ID="43" In="1" Name="Street" pos="6" target_type="" type="VARCHAR2"/>
            		
        </Procedure>
    </Procedures>
    <Functions>
        <Function DML="NO" ID="20" IsDb="false" Name="fn_nest" Out="No" isPrivate="Yes" java_package="" target_type="Integer" type="INT"/>
        <Function DML="NO" ID="28" IsDb="false" Name="fn_nest" Out="No" isPrivate="Yes" java_package="" target_type="" type="INT"/>
        <Function DML="NO" ID="19" IsDb="false" Name="nested_multiply_5" Out="No" isPrivate="No" java_package="" target_type="Integer" type="INTEGER"/>
        <Function DML="NO" ID="23" IsDb="false" Name="nested_multiply_5" Out="No" isPrivate="No" java_package="" target_type="" type="INTEGER">
            			
            <Param ID="24" In="1" Name="G_CHECK_OK" Out="1" pos="1" target_type="" type="VARCHAR2"/>
            			
            <Param ID="25" In="1" Name="p_dob" pos="2" target_type="" type="DATE"/>
            			
            <Param ID="26" In="1" Name="p_surname" pos="3" target_type="" type="DATETIME"/>
            			
            <Param ID="27" In="1" Name="p_maiden_name" pos="4" target_type="" type="VARCHAR2"/>
            			
            <Param ID="45" In="1" Name="p_UPDATE_DATE" pos="5" target_type="Timestamp" type="DATETIME"/>
            		
        </Function>
    </Functions>
</root>
