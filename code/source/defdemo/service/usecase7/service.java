package defdemo.service.usecase7;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class service

{
	// ---( internal utility methods )---

	final static service _instance = new service();

	static service _newInstance() { return new service(); }

	static service _cast(Object o) { return (service)o; }

	// ---( server methods )---




	public static final void mapFLStoCDMjava (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(mapFLStoCDMjava)>> ---
		// @sigtype java 3.5
		// [i] recref:0:required flsorder defdemo.doc.usecase7.doc:flsOrderCompletion
		// [o] recref:0:required cdmworkorder defdemo.doc.usecase7.doc:cdmWorkOrder
		// pipeline
		
		
		IDataCursor pipelineCursor = pipeline.getCursor();
		IData	prefix0_WorkOrderReport = null;
		IData	cdmworkorder = null;
		IDataCursor cdmworkorderCursor = null;
		IDataCursor prefix0_WorkOrderReportCursor = null;
		
			// flsorder
			IData	flsorder = IDataUtil.getIData( pipelineCursor, "flsorder" );
			if ( flsorder != null)
			{
				IDataCursor flsorderCursor = flsorder.getCursor();
					String __version = IDataUtil.getString( flsorderCursor, "@version" );
					String __encoding = IDataUtil.getString( flsorderCursor, "@encoding" );
		
					// cdmworkorder
					cdmworkorder = IDataFactory.create();
					cdmworkorderCursor = cdmworkorder.getCursor();
					IDataUtil.put( cdmworkorderCursor, "@version", __version );
					IDataUtil.put( cdmworkorderCursor, "@encoding", __encoding );
					
					
					// i.prefix0:FLSOrderCompletion
					IData	prefix0_FLSOrderCompletion = IDataUtil.getIData( flsorderCursor, "prefix0:FLSOrderCompletion" );
					if ( prefix0_FLSOrderCompletion != null)
					{
						IDataCursor prefix0_FLSOrderCompletionCursor = prefix0_FLSOrderCompletion.getCursor();
							String	prefix0_ProjectNumber = IDataUtil.getString( prefix0_FLSOrderCompletionCursor, "prefix0:ProjectNumber" );
		
							// i.prefix0:Task
							IData	prefix0_Task = IDataUtil.getIData( prefix0_FLSOrderCompletionCursor, "prefix0:Task" );
							if ( prefix0_Task != null)
							{
								IDataCursor prefix0_TaskCursor = prefix0_Task.getCursor();
									String	prefix0_TaskID = IDataUtil.getString( prefix0_TaskCursor, "prefix0:TaskID" );
									String	prefix0_Description = IDataUtil.getString( prefix0_TaskCursor, "prefix0:Description" );
									String	prefix0_Status = IDataUtil.getString( prefix0_TaskCursor, "prefix0:Status" );
									String	prefix0_CompletionTimestamp = IDataUtil.getString( prefix0_TaskCursor, "prefix0:CompletionTimestamp" );
		
									// cdmworkorder.prefix0:WorkOrderReport
									prefix0_WorkOrderReport = IDataFactory.create();
									prefix0_WorkOrderReportCursor = prefix0_WorkOrderReport.getCursor();
									
									// cdmworkorder.prefix0:WorkOrderReport.prefix0:Header
									IData	prefix0_Header = IDataFactory.create();
									IDataCursor prefix0_HeaderCursor = prefix0_Header.getCursor();
									IDataUtil.put( prefix0_HeaderCursor, "prefix0:ReportID", prefix0_ProjectNumber );
									IDataUtil.put( prefix0_HeaderCursor, "prefix0:SourceSystem", "FLS" );
									IDataUtil.put( prefix0_HeaderCursor, "prefix0:ReportTimestamp", prefix0_CompletionTimestamp );
									prefix0_HeaderCursor.destroy();
									IDataUtil.put( prefix0_WorkOrderReportCursor, "prefix0:Header", prefix0_Header );
									
									// i.prefix0:Location
									IData	prefix0_Location = IDataUtil.getIData( prefix0_TaskCursor, "prefix0:Location" );
									if ( prefix0_Location != null)
									{
										IDataCursor prefix0_LocationCursor = prefix0_Location.getCursor();
											String	prefix0_Street = IDataUtil.getString( prefix0_LocationCursor, "prefix0:Street" );
											String	prefix0_City = IDataUtil.getString( prefix0_LocationCursor, "prefix0:City" );
											String	prefix0_PostalCode = IDataUtil.getString( prefix0_LocationCursor, "prefix0:PostalCode" );
		
											// i.prefix0:GPS
											IData	prefix0_GPS = IDataUtil.getIData( prefix0_LocationCursor, "prefix0:GPS" );
											if ( prefix0_GPS != null)
											{
												IDataCursor prefix0_GPSCursor = prefix0_GPS.getCursor();
													String	prefix0_Latitude = IDataUtil.getString( prefix0_GPSCursor, "prefix0:Latitude" );
													String	prefix0_Longitude = IDataUtil.getString( prefix0_GPSCursor, "prefix0:Longitude" );
												prefix0_GPSCursor.destroy();
											}
										prefix0_LocationCursor.destroy();
									}
								prefix0_TaskCursor.destroy();
							}
		
							// i.prefix0:Technician
							IData	prefix0_Technician = IDataUtil.getIData( prefix0_FLSOrderCompletionCursor, "prefix0:Technician" );
							if ( prefix0_Technician != null)
							{
								IDataCursor prefix0_TechnicianCursor = prefix0_Technician.getCursor();
									String	prefix0_TechnicianID = IDataUtil.getString( prefix0_TechnicianCursor, "prefix0:TechnicianID" );
									String	prefix0_Name = IDataUtil.getString( prefix0_TechnicianCursor, "prefix0:Name" );
								prefix0_TechnicianCursor.destroy();
							}
		
							// i.prefix0:TimeConsumption
							IData	prefix0_TimeConsumption = IDataUtil.getIData( prefix0_FLSOrderCompletionCursor, "prefix0:TimeConsumption" );
							if ( prefix0_TimeConsumption != null)
							{
								IDataCursor prefix0_TimeConsumptionCursor = prefix0_TimeConsumption.getCursor();
									String	prefix0_HoursWorked = IDataUtil.getString( prefix0_TimeConsumptionCursor, "prefix0:HoursWorked" );
									String	prefix0_WorkType = IDataUtil.getString( prefix0_TimeConsumptionCursor, "prefix0:WorkType" );
								prefix0_TimeConsumptionCursor.destroy();
							}
		
							// i.prefix0:MaterialsUsed
							IData	prefix0_MaterialsUsed = IDataUtil.getIData( prefix0_FLSOrderCompletionCursor, "prefix0:MaterialsUsed" );
							if ( prefix0_MaterialsUsed != null)
							{
								IDataCursor prefix0_MaterialsUsedCursor = prefix0_MaterialsUsed.getCursor();
		
									// i.prefix0:Material
									IData[]	prefix0_Material = IDataUtil.getIDataArray( prefix0_MaterialsUsedCursor, "prefix0:Material" );
									if ( prefix0_Material != null)
									{
										for ( int i = 0; i < prefix0_Material.length; i++ )
										{
											IDataCursor prefix0_MaterialCursor = prefix0_Material[i].getCursor();
												String	prefix0_MaterialID = IDataUtil.getString( prefix0_MaterialCursor, "prefix0:MaterialID" );
												String	prefix0_Description_1 = IDataUtil.getString( prefix0_MaterialCursor, "prefix0:Description" );
												String	prefix0_Quantity = IDataUtil.getString( prefix0_MaterialCursor, "prefix0:Quantity" );
												String	prefix0_Unit = IDataUtil.getString( prefix0_MaterialCursor, "prefix0:Unit" );
											prefix0_MaterialCursor.destroy();
										}
									}
								prefix0_MaterialsUsedCursor.destroy();
							}
							String	prefix0_Remarks = IDataUtil.getString( prefix0_FLSOrderCompletionCursor, "prefix0:Remarks" );
						prefix0_FLSOrderCompletionCursor.destroy();
					}
				flsorderCursor.destroy();
			}
			String	useXSLT = IDataUtil.getString( pipelineCursor, "useXSLT" );
		pipelineCursor.destroy();
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		
		/**
		// cdmworkorder
		IData	cdmworkorder = IDataFactory.create();
		IDataCursor cdmworkorderCursor = cdmworkorder.getCursor();
		IDataUtil.put( cdmworkorderCursor, "@version", __version );
		IDataUtil.put( cdmworkorderCursor, "@encoding", "@encoding" );
		
		// cdmworkorder.prefix0:WorkOrderReport
		IData	prefix0_WorkOrderReport = IDataFactory.create();
		IDataCursor prefix0_WorkOrderReportCursor = prefix0_WorkOrderReport.getCursor();
		
		// cdmworkorder.prefix0:WorkOrderReport.prefix0:Header
		IData	prefix0_Header = IDataFactory.create();
		IDataCursor prefix0_HeaderCursor = prefix0_Header.getCursor();
		IDataUtil.put( prefix0_HeaderCursor, "prefix0:ReportID", "prefix0:ReportID" );
		IDataUtil.put( prefix0_HeaderCursor, "prefix0:SourceSystem", "prefix0:SourceSystem" );
		IDataUtil.put( prefix0_HeaderCursor, "prefix0:ReportTimestamp", "prefix0:ReportTimestamp" );
		prefix0_HeaderCursor.destroy();
		IDataUtil.put( prefix0_WorkOrderReportCursor, "prefix0:Header", prefix0_Header );
		**/
		
		// cdmworkorder.prefix0:WorkOrderReport.prefix0:WorkOrder
		IData	prefix0_WorkOrder = IDataFactory.create();
		IDataCursor prefix0_WorkOrderCursor = prefix0_WorkOrder.getCursor();
		IDataUtil.put( prefix0_WorkOrderCursor, "prefix0:WorkOrderID", "prefix0:WorkOrderID" );
		IDataUtil.put( prefix0_WorkOrderCursor, "prefix0:ProjectReference", "prefix0:ProjectReference" );
		IDataUtil.put( prefix0_WorkOrderCursor, "prefix0:Status", "prefix0:Status" );
		IDataUtil.put( prefix0_WorkOrderCursor, "prefix0:ScheduledStart", "prefix0:ScheduledStart" );
		IDataUtil.put( prefix0_WorkOrderCursor, "prefix0:ActualEnd", "prefix0:ActualEnd" );
		IDataUtil.put( prefix0_WorkOrderCursor, "prefix0:Type", "prefix0:Type" );
		IDataUtil.put( prefix0_WorkOrderCursor, "prefix0:Description", "prefix0:Description" );
		prefix0_WorkOrderCursor.destroy();
		IDataUtil.put( prefix0_WorkOrderReportCursor, "prefix0:WorkOrder", prefix0_WorkOrder );
		
		// cdmworkorder.prefix0:WorkOrderReport.prefix0:Location
		IData	prefix0_Location_1 = IDataFactory.create();
		IDataCursor prefix0_Location_1Cursor = prefix0_Location_1.getCursor();
		IDataUtil.put( prefix0_Location_1Cursor, "prefix0:Street", "prefix0:Street" );
		IDataUtil.put( prefix0_Location_1Cursor, "prefix0:City", "prefix0:City" );
		IDataUtil.put( prefix0_Location_1Cursor, "prefix0:PostalCode", "prefix0:PostalCode" );
		IDataUtil.put( prefix0_Location_1Cursor, "prefix0:Country", "prefix0:Country" );
		
		// cdmworkorder.prefix0:WorkOrderReport.prefix0:Location.prefix0:Coordinates
		IData	prefix0_Coordinates = IDataFactory.create();
		IDataCursor prefix0_CoordinatesCursor = prefix0_Coordinates.getCursor();
		IDataUtil.put( prefix0_CoordinatesCursor, "prefix0:Latitude", "prefix0:Latitude" );
		IDataUtil.put( prefix0_CoordinatesCursor, "prefix0:Longitude", "prefix0:Longitude" );
		prefix0_CoordinatesCursor.destroy();
		IDataUtil.put( prefix0_Location_1Cursor, "prefix0:Coordinates", prefix0_Coordinates );
		prefix0_Location_1Cursor.destroy();
		IDataUtil.put( prefix0_WorkOrderReportCursor, "prefix0:Location", prefix0_Location_1 );
		
		// cdmworkorder.prefix0:WorkOrderReport.prefix0:Technician
		IData	prefix0_Technician_1 = IDataFactory.create();
		IDataCursor prefix0_Technician_1Cursor = prefix0_Technician_1.getCursor();
		IDataUtil.put( prefix0_Technician_1Cursor, "prefix0:TechnicianID", "prefix0:TechnicianID" );
		IDataUtil.put( prefix0_Technician_1Cursor, "prefix0:FullName", "prefix0:FullName" );
		IDataUtil.put( prefix0_Technician_1Cursor, "prefix0:Role", "prefix0:Role" );
		prefix0_Technician_1Cursor.destroy();
		IDataUtil.put( prefix0_WorkOrderReportCursor, "prefix0:Technician", prefix0_Technician_1 );
		
		// cdmworkorder.prefix0:WorkOrderReport.prefix0:WorkLog
		IData	prefix0_WorkLog = IDataFactory.create();
		IDataCursor prefix0_WorkLogCursor = prefix0_WorkLog.getCursor();
		
		// cdmworkorder.prefix0:WorkOrderReport.prefix0:WorkLog.prefix0:Duration
		IData	prefix0_Duration = IDataFactory.create();
		IDataCursor prefix0_DurationCursor = prefix0_Duration.getCursor();
		IDataUtil.put( prefix0_DurationCursor, "@unit", "@unit" );
		IDataUtil.put( prefix0_DurationCursor, "*body", "*body" );
		prefix0_DurationCursor.destroy();
		IDataUtil.put( prefix0_WorkLogCursor, "prefix0:Duration", prefix0_Duration );
		IDataUtil.put( prefix0_WorkLogCursor, "prefix0:WorkPerformed", "prefix0:WorkPerformed" );
		IDataUtil.put( prefix0_WorkLogCursor, "prefix0:Notes", "prefix0:Notes" );
		prefix0_WorkLogCursor.destroy();
		IDataUtil.put( prefix0_WorkOrderReportCursor, "prefix0:WorkLog", prefix0_WorkLog );
		
		// cdmworkorder.prefix0:WorkOrderReport.prefix0:MaterialConsumption
		IData	prefix0_MaterialConsumption = IDataFactory.create();
		IDataCursor prefix0_MaterialConsumptionCursor = prefix0_MaterialConsumption.getCursor();
		
		// cdmworkorder.prefix0:WorkOrderReport.prefix0:MaterialConsumption.prefix0:Material
		IData[]	prefix0_Material_1 = new IData[1];
		prefix0_Material_1[0] = IDataFactory.create();
		IDataCursor prefix0_Material_1Cursor = prefix0_Material_1[0].getCursor();
		IDataUtil.put( prefix0_Material_1Cursor, "prefix0:MaterialCode", "prefix0:MaterialCode" );
		IDataUtil.put( prefix0_Material_1Cursor, "prefix0:Name", "prefix0:Name" );
		
		// cdmworkorder.prefix0:WorkOrderReport.prefix0:MaterialConsumption.prefix0:Material.prefix0:Quantity
		IData	prefix0_Quantity_1 = IDataFactory.create();
		IDataCursor prefix0_Quantity_1Cursor = prefix0_Quantity_1.getCursor();
		IDataUtil.put( prefix0_Quantity_1Cursor, "@unit", "@unit" );
		IDataUtil.put( prefix0_Quantity_1Cursor, "*body", "*body" );
		prefix0_Quantity_1Cursor.destroy();
		IDataUtil.put( prefix0_Material_1Cursor, "prefix0:Quantity", prefix0_Quantity_1 );
		prefix0_Material_1Cursor.destroy();
		IDataUtil.put( prefix0_MaterialConsumptionCursor, "prefix0:Material", prefix0_Material_1 );
		prefix0_MaterialConsumptionCursor.destroy();
		IDataUtil.put( prefix0_WorkOrderReportCursor, "prefix0:MaterialConsumption", prefix0_MaterialConsumption );
		
		// cdmworkorder.prefix0:WorkOrderReport.prefix0:Comments
		IData	prefix0_Comments = IDataFactory.create();
		IDataCursor prefix0_CommentsCursor = prefix0_Comments.getCursor();
		
		// cdmworkorder.prefix0:WorkOrderReport.prefix0:Comments.prefix0:Comment
		IData	prefix0_Comment = IDataFactory.create();
		IDataCursor prefix0_CommentCursor = prefix0_Comment.getCursor();
		IDataUtil.put( prefix0_CommentCursor, "prefix0:Type", "prefix0:Type" );
		IDataUtil.put( prefix0_CommentCursor, "prefix0:Text", "prefix0:Text" );
		prefix0_CommentCursor.destroy();
		IDataUtil.put( prefix0_CommentsCursor, "prefix0:Comment", prefix0_Comment );
		prefix0_CommentsCursor.destroy();
		IDataUtil.put( prefix0_WorkOrderReportCursor, "prefix0:Comments", prefix0_Comments );
		prefix0_WorkOrderReportCursor.destroy();
		IDataUtil.put( cdmworkorderCursor, "prefix0:WorkOrderReport", prefix0_WorkOrderReport );
		cdmworkorderCursor.destroy();
		IDataUtil.put( pipelineCursor_1, "cdmworkorder", cdmworkorder );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

