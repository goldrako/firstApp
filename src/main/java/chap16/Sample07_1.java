package chap16;

import java.util.function.Supplier;
import lombok.RequiredArgsConstructor;

public class Sample07_1 {
    public static void main(String[] args) {
        MessageCenter2 mc = new MessageCenter2("Hello~ Lambda!");

        // 람다식 대신 익명 클래스 사용
        MessageCenter2 main = getMsg(new Supplier<MessageCenter2>() {
            @Override
            public MessageCenter2 get() {
                return mc;
            }
        });

        System.out.println(main);
    }

    public static MessageCenter2 getMsg(Supplier<MessageCenter2> mc) {
        return mc.get();
    }
}

@RequiredArgsConstructor
class MessageCenter2 {
    private final String msg;

    @Override
    public String toString() {
        return msg;
    }
}
