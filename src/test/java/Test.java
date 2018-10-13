


public class Test {
    public  static void a1()
    {
		long lStart = System.currentTimeMillis();
/*    	StackTraceElement stackTraceElement=Thread.currentThread() .getStackTrace()[1];
    	// 获得当前类名
    	String clazz = stackTraceElement.getClassName();
    	// 获得当前方法名
    	String method = stackTraceElement.getMethodName();
    
*/    	
		String msg="";
		//String msg=ExceptionUtil.getExceptionLog("aaa=bbb","1234");
		
    	long lUse=System.currentTimeMillis()-lStart;
    	//System.out.println("class name: " + clazz + " Method Name " + method+" lUse="+lUse);
    	System.out.println(msg+" lUse="+lUse);
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	    String orderSyncJson=FileUtil.readString("f:\\getAllOrderDetails.txt");
	    OrderSyncResponseVo orderSyncResponseVo = JSON.parseObject(orderSyncJson,
				new TypeReference<com.beidu.pug.vo.qunar.ordersync.OrderSyncResponseVo>() {
				});
	    //String result=EntityToString.getString(orderSyncResponseVo.getData().get(0));
	    //String result=EntityToString.getString(orderSyncResponseVo.getData().get(0).getPassengers().get(0));
	    String result=EntityToString.getString(orderSyncResponseVo.getData().get(0).getFlight_segments().get(0));
	    System.out.println(result);
	    OrderSyncUtil.getTicketOrderList(null,null,null,"","",orderSyncJson,"test");
*/	
	
		a1();
	}

}
