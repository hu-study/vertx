package com.kingh.vertx.core.anno;

import java.lang.annotation.*;

/**
 * 在对外发布的服务中方法中标注此注解，方法可以被自动发现
 *
 * 在自动生成流程中，可以供开发者方便使用
 *
 * @author <a href="https://blog.csdn.net/king_kgh>Kingh</a>
 * @version 1.0
 * @date 2019/3/11 9:49
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {

    String name();

    String description() default "";

}