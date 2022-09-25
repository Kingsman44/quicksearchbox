package p3186j$.util.function;

import p3186j$.util.Objects;

/* renamed from: j$.util.function.LongConsumer */
public interface LongConsumer {

    /* renamed from: j$.util.function.LongConsumer$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static LongConsumer $default$andThen(LongConsumer longConsumer, LongConsumer longConsumer2) {
            Objects.requireNonNull(longConsumer2);
            return new C41106r(longConsumer, longConsumer2);
        }
    }

    void accept(long j);

    LongConsumer andThen(LongConsumer longConsumer);
}
