package defdemo.service.usecase4;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class notification

{
	// ---( internal utility methods )---

	final static notification _instance = new notification();

	static notification _newInstance() { return new notification(); }

	static notification _cast(Object o) { return (notification)o; }

	// ---( server methods )---




	public static final void strHouseNoTokenizer (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(strHouseNoTokenizer)>> ---
		// @sigtype java 3.5
		// [i] field:0:required SAP_Street
		// [o] field:0:required Street
		// [o] field:0:required HouseNo
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	SAP_Street = IDataUtil.getString( pipelineCursor, "SAP_Street" );
		
		String[] adr = SAP_Street.split( "(\\s)+");
		
		String str= "";
		String houseNo = "";
		
		for( int i = 0; i<adr.length; i++){
			if( (i>0) && ((i+1) < adr.length)){
				str += " ";
			}
			if( ((i+1) < adr.length)){
				str += adr[i];
				}
			else{
				houseNo = adr[i];
			}
		}
		
		IDataUtil.put( pipelineCursor, "Street", str);
		IDataUtil.put( pipelineCursor, "HouseNo",houseNo);
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

