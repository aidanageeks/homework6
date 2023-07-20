public class Skeleton extends Boss {
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public String printInfo() {
        String weaponInfo = (getWeapon() != null) ? "Weapon: " + getWeapon().getWeaponName() + ", Type: " + getWeapon().getWeaponType() : "No Weapon";
        return "Name: " + getName() + ", Health: " + getHealth() + ", Damage: " + getDamage() + ", Arrows: " + arrows + ", " + weaponInfo;
    }
}
