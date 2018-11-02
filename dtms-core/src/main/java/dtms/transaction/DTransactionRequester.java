package dtms.transaction;

public class DTransactionRequester extends Endpoint {
	
	public static DTransactionRequester build(Endpoint endPoint) {
		DTransactionRequester requester = new DTransactionRequester();
		requester.setAppName(endPoint.getAppName());
		requester.setClazz(endPoint.getClazz());
		requester.setMethod(endPoint.getMethod());
		requester.setModifiers(endPoint.getModifiers());
		requester.setParamTypes(endPoint.getParamTypes());
		requester.setReturnType(endPoint.getReturnType());
		requester.setParamValues(endPoint.getParamValues());
		return requester;
	}

}
