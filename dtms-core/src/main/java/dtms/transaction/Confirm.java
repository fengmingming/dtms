package dtms.transaction;

/**
 * 提交对象
 * */
public class Confirm extends Endpoint {
	
	public static Confirm build(Endpoint endPoint) {
		Confirm confirm = new Confirm();
		confirm.setAppName(endPoint.getAppName());
		confirm.setClazz(endPoint.getClazz());
		confirm.setMethod(endPoint.getMethod());
		confirm.setModifiers(endPoint.getModifiers());
		confirm.setParamTypes(endPoint.getParamTypes());
		confirm.setReturnType(endPoint.getReturnType());
		confirm.setParamValues(endPoint.getParamValues());
		return confirm;
	}
	
}
