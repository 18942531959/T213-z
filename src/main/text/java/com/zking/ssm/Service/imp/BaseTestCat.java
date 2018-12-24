package com.zking.ssm.Service.imp;

import com.zking.ssm.model.Book;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class BaseTestCat {
        protected Book book=null;

        public void sub(){
            book=new Book();
        }
}
