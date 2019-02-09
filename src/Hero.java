public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    void keng(){
        System.out.println("坑队友");
    }

    float getArmor() {
        return armor;
    }

    void addSpeed(int speed) {
        moveSpeed = moveSpeed+speed;
    }

    public static void main(String[] args) {
        Hero garen=new Hero();
        garen.name="盖伦";
        garen.moveSpeed=350;
        garen.addSpeed(100);
        garen.armor=20;
        garen.getArmor();

    }
}
