package pro.kosenkov.bitoperation;

// int — это 32 бита , представим это как 32 флага
public class Flag {

    private int flag;

    public Flag(int flag) {
        this.flag = flag;
    }

    // Установить флаг
    public int setFlag(int flagPos) {
        return flag | (1 << flagPos);
    }

    // Сбросить флаг
    public int resetFlag(int flagPos) {
        return flag & ~(1 << flagPos);
    }

    // Проверить флаг
    public boolean checkFlag(int flagPos) {
        return ((flag & (1 << flagPos)) == (1 << flagPos));
    }
}
