/**
  * @filename SubClazz.java
  * @description 子类
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.bean2;

import com.hua.bean.InternalClazz;

 /**
 * @type SubClazz
 * @description 子类
 * @author qianye.zheng
 */
public class SubClazz extends InternalClazz
{
	
	/**
	 * 
	 * @description 
	 * @author qianye.zheng
	 */
	public void doSomething()
	{
		// 权限往下扩大
		super._protected = "子类_protected";
		super._public = "子类_public";
	}

}
