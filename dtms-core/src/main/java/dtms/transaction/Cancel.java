package dtms.transaction;

/**
 * 回滚对象
 * */
public class Cancel extends Endpoint {

	public static Cancel build(Endpoint endPoint) {
		Cancel cancel = new Cancel();
		cancel.setAppName(endPoint.getAppName());
		cancel.setClazz(endPoint.getClazz());
		cancel.setMethod(endPoint.getMethod());
		cancel.setModifiers(endPoint.getModifiers());
		cancel.setParamTypes(endPoint.getParamTypes());
		cancel.setReturnType(endPoint.getReturnType());
		cancel.setParamValues(endPoint.getParamValues());
		return cancel;
	}
}
