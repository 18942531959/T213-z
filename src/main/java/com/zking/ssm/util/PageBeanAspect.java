package com.zking.ssm.util;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class PageBeanAspect {
    @Around("execution(* *..*Service.*Pager(..))")
    public Object inver(ProceedingJoinPoint args) throws Throwable {
        Object[] params = args.getArgs();
        PageBean pageBean=null;
        for (Object param : params) {
            if(param instanceof PageBean){
                pageBean=(PageBean)param;
                break;
            }
        }
        //分页参数设置
        if(null!=pageBean&&pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        //执行分页方法
        Object proceed = args.proceed(params);
        if(null!=pageBean&&pageBean.isPagination()){
            List lst=(List)proceed;
            PageInfo pageInfo=new PageInfo(lst);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return  proceed;
    }
}
