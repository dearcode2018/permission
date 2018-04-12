/**
  * @filename InternalPackage.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.bean;

 /**
 * @type InternalPackage
 * @description 包内
 * @author qianye.zheng
 */
public class InternalPackage extends InternalClazz
{

	/**
	 * 
	 * @description 
	 * @author qianye.zheng
	 */
	public void doSomething()
	{
		// 权限往下扩大
		super._friendly = "包内_friendly";
		super._protected = "包内_protected";
		super._public = "包内_public";
	}
	
}
