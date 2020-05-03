package lab2.challenge1;

import java.util.Objects;

public class Fighter extends Human
{
    public int damagePerAttack;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fighter fighter = (Fighter) o;
        return damagePerAttack == fighter.damagePerAttack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(damagePerAttack);
    }

    public Fighter(int damegePerAttack, int health, String humanName) {
        super(health, humanName);
        this.damagePerAttack =damegePerAttack;

    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }
}
