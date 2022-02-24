package Conta;

public class Data {
    int day;
    int month;
    int year;

    String formatada() {
        return this.day + "/" + this.month + "/" + this.year;
    }
}
