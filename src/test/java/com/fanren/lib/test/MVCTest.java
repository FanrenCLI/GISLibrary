package com.fanren.lib.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.fanren.lib.pojo.Book;
import com.github.pagehelper.PageInfo;





/**MVC接口测试类
 * @author FanrenCLI
 * @Time 2018年9月6日-下午3:51:07
 * @version 0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"classpath:ApplicationContext.xml","classpath:springmvc.xml"})
public class MVCTest {
	@Autowired
	private WebApplicationContext context;
	
	private MockMvc mockMvc;
	
	@Before
	public void initMockMvc() {
		mockMvc=MockMvcBuilders.webAppContextSetup(context).build();
	}
	@Test
    public void testPage() throws Exception {
		//模拟请求，拿到返回值
        MvcResult result = mockMvc.perform(
                                MockMvcRequestBuilders.get("/history")
                                .param("pn", "5")).andReturn();
        MockHttpServletRequest request = result.getRequest();
        System.out.println(request.getAttribute("info")); 
    }
}
