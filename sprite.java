public class sprite {
    double center_x;
    double center_y;
    String name;
    public void run(){
        System.out.println("the sprite is running");
    }
    public sprite(double a,double b, String spriteName){
        center_x = a;
        center_y = b;
        name = spriteName; //purpose of your constructor is to initialize your attributes.
    }

    public void jump()
    {
        System.out.println("the sprite is jumping");
    }
    public sprite()
    {
        center_x = 0;
        center_y = 0;
        name = "default";
    }
    public sprite(double a,double b){
    }
    {
        center_x = a;
        center_y = b;
    }
    {

    }
}
