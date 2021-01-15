import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shengde.e3mall.dao.TbItemDao;
import com.shengde.e3mall.entity.TbItem;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class PageHelperTest {

    @Autowired
    TbItemDao tbItemDao;

    @Test
    public void testPageHelper() {
        //初始化spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-Dao.xml");
        //从容器中获得mapper代理对象
        TbItemDao itemDao = applicationContext.getBean(TbItemDao.class);
        //设置分页信息使用PageHelper的startPage方法（当前页码，每页查询条数）
        PageHelper.startPage(1,10);
        //执行查询
        List<TbItem> tbItems = itemDao.queryAll(new TbItem());
        //取分页信息，PageInfo。1.总记录数 2.总页数 3.当前页码
        PageInfo<TbItem> pageInfo = new PageInfo<>(tbItems);
        System.out.println(pageInfo.getPages());
        System.out.println(pageInfo.getTotal());
        System.out.println(tbItems.size());
    }
}
