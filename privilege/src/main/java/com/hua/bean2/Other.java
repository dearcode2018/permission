/**
  * @filename Other.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.bean2;

import com.hua.bean.InternalClazz;

 /**
 * @type Other
 * @description 其他
 * @author qianye.zheng
 */
public class Other
{
	/**
	 * 
	 * @description 
	 * @author qianye.zheng
	 */
	public void doSomething()
	{
		InternalClazz privilegeObject = new InternalClazz();
		// 
		privilegeObject._public = "其他_public";
	}

}
