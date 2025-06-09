<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:prefix0="http://schemas.fls.com/order"
    xmlns:wk="http://schemas.company.com/energy/workorder/v1"
    exclude-result-prefixes="prefix0">

    <xsl:output method="xml" indent="yes"/>

    <!-- Root template -->
    <xsl:template match="/prefix0:FLSOrderCompletion">
        <wk:WorkOrderReport xmlns:wk="http://schemas.company.com/energy/workorder/v1">

            <wk:Header>
                <wk:ReportID>
                    <xsl:value-of select="concat('WRPT-', substring(prefix0:ProjectNumber, string-length(prefix0:ProjectNumber) - 11))" />
                </wk:ReportID>
                <wk:SourceSystem>FLS</wk:SourceSystem>
                <wk:ReportTimestamp>
                    <xsl:value-of select="prefix0:Task/prefix0:CompletionTimestamp"/>
                </wk:ReportTimestamp>
            </wk:Header>

            <wk:WorkOrder>
                <wk:WorkOrderID>
                    <xsl:value-of select="prefix0:Task/prefix0:TaskID"/>
                </wk:WorkOrderID>
                <wk:ProjectReference>
                    <xsl:value-of select="prefix0:ProjectNumber"/>
                </wk:ProjectReference>
                <wk:Status>
                    <xsl:value-of select="prefix0:Task/prefix0:Status"/>
                </wk:Status>
                <wk:ActualEnd>
                    <xsl:value-of select="prefix0:Task/prefix0:CompletionTimestamp"/>
                </wk:ActualEnd>
                <wk:Type>FieldMaintenance</wk:Type>
                <wk:Description>
                    <xsl:value-of select="prefix0:Task/prefix0:Description"/>
                </wk:Description>
            </wk:WorkOrder>

            <wk:Location>
                <wk:Street>
                    <xsl:value-of select="prefix0:Task/prefix0:Location/Street"/>
                </wk:Street>
                <wk:City>
                    <xsl:value-of select="prefix0:Task/prefix0:Location/City"/>
                </wk:City>
                <wk:PostalCode>
                    <xsl:value-of select="prefix0:Task/prefix0:Location/prefix0:PostalCode"/>
                </wk:PostalCode>
                <wk:Coordinates>
                    <wk:Latitude>
                        <xsl:value-of select="prefix0:Task/prefix0:Location/prefix0:GPS/prefix0:Latitude"/>
                    </wk:Latitude>
                    <wk:Longitude>
                        <xsl:value-of select="prefix0:Task/prefix0:Location/prefix0:GPS/prefix0:Longitude"/>
                    </wk:Longitude>
                </wk:Coordinates>
            </wk:Location>

            <wk:Technician>
                <wk:TechnicianID>
                    <xsl:value-of select="prefix0:Technician/prefix0:TechnicianID"/>
                </wk:TechnicianID>
                <wk:FullName>
                    <xsl:value-of select="prefix0:Technician/prefix0:Name"/>
                </wk:FullName>
                <wk:Role>Field Technician</wk:Role>
            </wk:Technician>

            <wk:WorkLog>
                <wk:Duration>
                    <xsl:attribute name="unit">hours</xsl:attribute>
                    <xsl:value-of select="prefix0:TimeConsumption/prefix0:HoursWorked"/>
                </wk:Duration>
                <wk:WorkPerformed>
                    <xsl:value-of select="prefix0:TimeConsumption/prefix0:WorkType"/>
                </wk:WorkPerformed>
                <wk:Notes>
                    <xsl:value-of select="prefix0:Task/prefix0:Description"/>
                </wk:Notes>
            </wk:WorkLog>

            <wk:MaterialConsumption>
                <xsl:for-each select="prefix0:MaterialsUsed/prefix0:Material">
                    <wk:Material>
                        <wk:MaterialCode>
                            <xsl:value-of select="prefix0:MaterialID"/>
                        </wk:MaterialCode>
                        <wk:Name>
                            <xsl:value-of select="prefix0:Description"/>
                        </wk:Name>
                        <wk:Quantity>
                            <xsl:attribute name="unit">
                                <xsl:value-of select="prefix0:Unit"/>
                            </xsl:attribute>
                            <xsl:value-of select="prefix0:Quantity"/>
                        </wk:Quantity>
                    </wk:Material>
                </xsl:for-each>
            </wk:MaterialConsumption>

            <wk:Comments>
                <wk:Comment>
                    <wk:Type>TechnicianNote</wk:Type>
                    <wk:Text>
                        <xsl:value-of select="prefix0:Remarks"/>
                    </wk:Text>
                </wk:Comment>
            </wk:Comments>

        </wk:WorkOrderReport>
    </xsl:template>

</xsl:stylesheet>
