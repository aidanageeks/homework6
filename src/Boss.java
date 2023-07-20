public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        String weaponInfo = (weapon != null) ? "Weapon: " + weapon.getWeaponName() + ", Type: " + weapon.getWeaponType() : "No Weapon";
        return "Name: " + getName() + ", Health: " + getHealth() + ", Damage: " + getDamage() + ", " + weaponInfo;
    }
}
