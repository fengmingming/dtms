package dtms.transaction;

import java.lang.reflect.Method;

/**
 * 
 * */
public class Endpoint {

	private String appName;
	
	private String clazz;
	
	private String method;
	
	private String[] paramTypes;
	
	private String[] paramValues;
	
	private String returnType;
	
	private int modifiers;

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String[] getParamTypes() {
		return paramTypes;
	}

	public void setParamTypes(String[] paramTypes) {
		this.paramTypes = paramTypes;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public int getModifiers() {
		return modifiers;
	}

	public void setModifiers(int modifiers) {
		this.modifiers = modifiers;
	}
	
	public String[] getParamValues() {
		return paramValues;
	}

	public void setParamValues(String[] paramValues) {
		this.paramValues = paramValues;
	}
	
	public static Endpoint build(String appName,Method method,String ... paramValues) {
		Endpoint endpoint = new Endpoint();
		endpoint.setAppName(appName);
		endpoint.setClazz(method.getDeclaringClass().getTypeName());
		endpoint.setMethod(method.getName());
		Class<?>[] paramClassTypes = method.getParameterTypes();
		String[] paramTypes = new String[paramClassTypes.length];
		for(int i=0,j=paramTypes.length;i<j;i++) {
			paramTypes[i] = paramClassTypes[i].getTypeName();
		}
		endpoint.setParamTypes(paramTypes);
		endpoint.setParamValues(paramValues);
		endpoint.setModifiers(method.getModifiers());
		endpoint.setReturnType(method.getReturnType().getTypeName());
		return endpoint;
	}
	
}
