import connector.Connector;

/**
 * @author 方鹏
 * @date 2022年01月19日 10:25 下午
 */
public class Bootstrap {

    public static void main(String[] args) {
        Connector connector = new Connector();
        connector.start();
    }

}
