package com.knowledgeshare.base.baserx;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by liyan on 2017/3/3.
 */


public class RxBus {
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.SOURCE)
    public  @interface Test{
        Integer id() ;

    }




}

