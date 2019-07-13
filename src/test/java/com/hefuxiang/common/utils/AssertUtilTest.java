package com.hefuxiang.common.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class AssertUtilTest {
    /**
     * 
     * @Title: testIsTrue 
     * @Description: 测试为真
     * @return: void
     */
	@Test
	public void testIsTrue() {
		 int a=2,b=3;
		 //AssertUtil.isTrue(a==b, "不相等");
		   AssertUtil.isTrue(a!=b, "相等");
	}
     /**
      * 
      * @Title: testIsfalse 
      * @Description: 测试为假
      * @return: void
      */
	@Test
	public void testIsfalse() {
		  int a=2,b=3;
		 AssertUtil.isfalse(a==b, "不相等");
		 //AssertUtil.isfalse(a!=b, "相等");
	}
	/**
	 * 
	 * @Title: testIsNotnull 
	 * @Description: 断言对象不为空；
	 * @return: void
	 */ 
	@Test
	public void testIsNotnull() {
		//AssertUtil.isNotnull(null, "为空");
		AssertUtil.isNotnull(3, "不为空");
	}
    /**
     * 
     * @Title: testIsNull 
     * @Description: 断言对象必须空
     * @return: void
     */
	@Test
	public void testIsNull() {
		//AssertUtil.isNull(null, "为空");
		  AssertUtil.isNull(4, "不为空");
				
	}
  /**
   * 
   * @Title: testIsEmpty 
   * @Description: 断言 List 或 Set 集合不为空，没有元素也算空
   * @return: void
   */
	@Test
	public void testIsEmpty() {
	  //AssertUtil.isEmpty(null, "为空");
		List list = new ArrayList();
	  // AssertUtil.isEmpty(list, "为空");
		list.add(1);
	   AssertUtil.isEmpty(list, "不为空");
	}
	/**
	 * 
	 * @Title: testMapisEmpyt 
	 * @Description: 断言 Map 集合不为空，没有元素也算空；
	 * @return: void
	 */
	@Test
	public void testMapisEmpyt() {
		   //AssertUtil.mapisEmpyt(null, "为空");
			HashMap map = new HashMap();
	      // AssertUtil.mapisEmpyt(map, "为空");
	          map.put("1", 1);
			AssertUtil.mapisEmpyt(map, "不为空");
	}
    /**
     * 
     * @Title: testHasNext 
     * @Description: 断言字符串必须有值，去掉空格后，长度必须大于 0
     * @return: void
     */
	@Test
	public void testHasNext() {
		//String str="";
		//AssertUtil.hasNext(str, "为空");
		String str="我";
		AssertUtil.hasNext(str, "不为空");
	}
    /**
     * 
     * @Title: testIsPositive 
     * @Description: 断言值必须是正数(值大于 0)
     * @return: void
     */
	@Test
	  public   void testIsPositive() {
		//AssertUtil.isPositive(1>0, "为正数");
		 AssertUtil.isPositive(-1>0, "不为数");
	}  
	     
	 @Test
	  public  void testbigDecimal(){
		BigDecimal b=new BigDecimal("24.45");
	    BigDecimal b1=new BigDecimal("100");
	    System.out.println(b.multiply(b1));//乘
	    System.out.println(b.divide(b1));//除
	    System.out.println(b.add(b1));//加
	    System.out.println(b.subtract(b1));//减
	}     
}
