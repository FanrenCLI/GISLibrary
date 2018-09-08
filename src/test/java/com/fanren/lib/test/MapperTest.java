package com.fanren.lib.test;




import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fanren.lib.DAO.BookMapper;
import com.fanren.lib.pojo.Book;




/**Mapper接口测试类
 * @author FanrenCLI
 * @Time 2018年9月6日-下午12:36:36
 * @version 0.0.1
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:ApplicationContext.xml"})
public class MapperTest {
	
	@Autowired
	BookMapper bookmapper;
	
	@Test
	public void test() {
		List<Book> booklist=bookmapper.selectByExample(null);
		System.out.println(booklist.size());
	}
	
	 @Resource
	    private SqlSession sqlSession;
	    /**
	     * 测试DepartmentMapper
	     */
	    @Test
	    public void testCRUD() {
	        /*//1.插入几个部门
	        departmentMapper.insertSelective(new Department(null, "开发部"));
	        departmentMapper.insertSelective(new Department(null, "测试部"));*/

	        //2.生成员工数据
	        //employeeMapper.insertSelective(new Employee(null, "Jack", "M", "Jack@gmail.com", 1));

	        //3.批量插入多个员工 使用可以执行批量操作的sqlsession
	        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
	        for (int i = 0; i < 100; i++) {
	            String uid = UUID.randomUUID().toString().substring(0, 5) + i;
	            mapper.insertSelective(new Book(null,uid,uid+"code","可借",null,null));
	        }
	    }
	
}
