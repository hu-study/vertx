package com.kingh.stu;

import com.kingh.stu.anno.RequestMapping;
import com.kingh.stu.router.MainRouter;
import com.kingh.stu.utils.ClassScanner;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.CookieHandler;
import io.vertx.ext.web.handler.SessionHandler;
import io.vertx.ext.web.handler.StaticHandler;
import io.vertx.ext.web.sstore.LocalSessionStore;

/**
 * @author <a href="https://blog.csdn.net/king_kgh>Kingh</a>
 * @version 1.0
 * @date 2019/3/4 19:29
 */
public class StuManagerStarter extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        // 加载类
        ClassScanner.getInstance();

        // 创建服务器
        HttpServer server = vertx.createHttpServer();

        Router router = Router.router(vertx);
        router.route().handler(CookieHandler.create());
        router.route().handler(SessionHandler.create(LocalSessionStore.create(vertx)));
        router.route().handler(StaticHandler.create());
        router.route().handler(MainRouter.create(vertx));

        server.requestHandler(router::accept);
        server.listen(80, e -> System.out.println("服务启动成功！"));
    }

    public static void main(String[] args) {
        Vertx.vertx().deployVerticle(new StuManagerStarter());
    }
}
