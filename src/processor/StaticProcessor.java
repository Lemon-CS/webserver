package processor;

import connector.Request;
import connector.Response;

import java.io.IOException;

/**
 * @author 方鹏
 * @date 2022年01月19日 10:25 下午
 */
public class StaticProcessor {

    public void process(Request request, Response response) {
        try {
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
