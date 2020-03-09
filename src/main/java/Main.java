import model.Assets;
import model.Electronics;
import model.Mouse;
import model.Tower;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Tower tower = new  Tower(UUID.randomUUID(),"dell","thanyani.tshikonwani@umuzi.org",
                "StuffMember","not available","mint");
        System.out.println(tower);
        Mouse mouse = new Mouse(UUID.randomUUID(),"HP","thanyani.tshikonwani@umuzi.org","StuffMember","not available","mint");
        System.out.println(mouse);

        Assets assets = new Tower(UUID.randomUUID(),"HP","thanyani.tshikonwani@umuzi.org","StuffMember","not available","mint");
        System.out.println(assets);
    }
}
