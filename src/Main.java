
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setName("Evil Boss");
        boss.setHealth(1000);
        boss.setDamage(50);

        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponType(WeaponType.AXE);
        bossWeapon.setWeaponName("Doom Axe");
        boss.setWeapon(bossWeapon);

        System.out.println("Boss Information:");
        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setName("Skeleton Archer");
        skeleton1.setHealth(200);
        skeleton1.setDamage(30);
        skeleton1.setArrows(50);

        Weapon skeletonWeapon1 = new Weapon();
        skeletonWeapon1.setWeaponType(WeaponType.BOW);
        skeletonWeapon1.setWeaponName("Bone Bow");
        skeleton1.setWeapon(skeletonWeapon1);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setName("Skeleton Warrior");
        skeleton2.setHealth(300);
        skeleton2.setDamage(40);
        skeleton2.setArrows(0);

        System.out.println("\nSkeleton 1 Information:");
        System.out.println(skeleton1.printInfo());

        System.out.println("\nSkeleton 2 Information:");
        System.out.println(skeleton2.printInfo());
    }
}
