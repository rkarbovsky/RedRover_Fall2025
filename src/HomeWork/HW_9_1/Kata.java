package HomeWork.HW_9_1;

public class Kata {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = "";
        if (firstAttacker.contains(fighter1.name)) {
            while (fighter1.health > 0 || fighter2.health > 0) {
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                System.out.println(fighter1.name + " атакует " + fighter2.name + " и наносит урон "
                        + fighter1.damagePerAttack + "; " + "У " + fighter2.name + " осталось " +
                        fighter2.health + " хитпоинтов");
                if (fighter2.health <= 0) {
                    winner = fighter1.name;
                    break;
                }
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                System.out.println(fighter2.name + " атакует " + fighter1.name + " и наносит урон "
                        + fighter2.damagePerAttack + "; " + "У " + fighter1.name + " осталось " +
                        fighter1.health + " хитпоинтов");
                if (fighter1.health <= 0) {
                    winner = fighter2.name;
                    break;
                }
            }
        } else if (firstAttacker.contains(fighter2.name)){
            while (fighter1.health > 0 || fighter2.health > 0) {
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                System.out.println(fighter2.name + " атакует " + fighter1.name + " и наносит урон "
                        + fighter2.damagePerAttack + "; " + "У " + fighter1.name + " осталось " +
                        fighter1.health + " хитпоинтов");
                if (fighter1.health <= 0) {
                    winner = fighter2.name;
                    break;
                }
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                System.out.println(fighter1.name + " атакует " + fighter2.name + " и наносит урон "
                        + fighter1.damagePerAttack + "; " + "У " + fighter2.name + " осталось " +
                        fighter2.health + " хитпоинтов");
                if (fighter2.health <= 0) {
                    winner = fighter1.name;
                    break;
                }
            }
        } else {
            return "Неверное имя первого нападающего!";
        }
        return "Победитель в схватке - " + winner;
    }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Иван", 100, (int) (Math.random() * 99) + 1);
        Fighter fighter2 = new Fighter("Тарас", 100, (int) (Math.random() * 99) + 1);
        System.out.println(declareWinner(fighter1, fighter2, "Тарас"));
    }
}
