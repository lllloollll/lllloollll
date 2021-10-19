package com.example.pjava.design_patterns.a01_simple_factory_pattern.meterial.i;

/**
 * @ProjectName: Practise
 * @Package: com.example.pjava.design_patterns.a01_simple_factory
 * @ClassName: Phone
 * @Description: 简单工厂模式 手机
 * @Author: 毛毛虫
 * @CreateDate: 2021/10/19 4:55 下午
 * @UpdateUser: 更新者
 * @UpdateDate: 2021/10/19 4:55 下午
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface Phone {
    String TAG=Phone.class.getSimpleName();
    void createPhone();
}
