package com.hefuxiang.common.utils;

import java.util.Collection;
import java.util.Map;

/**
 * 
 * @ClassName: AssertUtil 
 * @Description: 断言类
 * @author:HeFuXiang
 * @date: 2019年7月13日 上午7:59:15
 */
public class AssertUtil {
	/**
	 * 
	 * @Title: isTrue 
	 * @Description: 断言为真（就是表达结果或参数必须为真，
	 * 否则抛出自己的自定义异常）
	 * @return: void
	 */
    public static void isTrue(boolean exp,String message){
    	if(!exp)
    		throw new CmsRuntimeException(message);
    }
    /**
	 * 
	 * @Title: isTrue 
	 * @Description: 断言为假
	 * 
	 * @return: void
	 */
    public static void isfalse(boolean exp,String message){
    	if(exp)
    		throw new CmsRuntimeException(message);
    }
    /**
     * 
     * @Title: isNotnull 
     * @Description: 断言对象不为空；
     * @param obj
     * @param message
     * @return: void
     */
    public static void isNotnull(Object obj,String message) {
    	if(obj==null)
    		throw new CmsRuntimeException(message);
    }
    /**
     * 
     * @Title: isNotnull 
     * @Description: 断言对象为空；
     * @param obj
     * @param message
     * @return: void
     */
    public static void isNull(Object obj,String message) {
    	if(obj!=null)
    		throw new CmsRuntimeException(message);
    }
    /**
     * 
     * @Title: isEmpty 
     * @Description: 断言 List 或 Set 集合不为空，没有元素也算空
     * @return: void
     */
    public static void isEmpty(Collection c,String message){
    	if(c==null||c.size()==0)
    		throw new CmsRuntimeException(message);
    }
     /**
      * 
      * @Title: mapisEmpyt 
      * @Description: 断言 Map 集合不为空，没有元素也算空
      * @param map
      * @return: void
      */
    public static void mapisEmpyt(Map<?,?> map,String message){
    	if(map==null ||map.isEmpty())
    	throw new CmsRuntimeException(message);
    }
    /**
     * 
     * @Title: hasNext 
     * @Description:  断言字符串必须有值，去掉空格后，长度必须大于 0；
     * @return: void
     */
    public static void hasNext(String str,String message) {
    	if(str==null||str.trim().length()==0)
        throw new CmsRuntimeException(message);
    }
      /**
       * 
       * @Title: isPositive 
       * @Description: 断言值必须是正数(值大于 0)
       * @param exp
       * @param message
       * @return: void
       */
      public static void isPositive(boolean exp,String message) {
    	  if(!exp)
    		  throw new CmsRuntimeException(message);	  
     }
}
