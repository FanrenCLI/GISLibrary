package com.fanren.lib.util;

import java.util.HashMap;
import java.util.Map;



public class data_transform {
		//状态码
	//  private int code;
	  //提示信息
	
	  //用户要返回给浏览器的数据
	  private Map<String, Object> extend = new HashMap<String, Object>();
	
	  public data_transform add(String key, Object value) {
	      this.getExtend().put(key, value);
	      return this;
	  }
	
	  public Map<String, Object> getExtend() {
	      return extend;
	  }
	
	  public void setExtend(Map<String, Object> extend) {
	      this.extend = extend;
	  }
}
