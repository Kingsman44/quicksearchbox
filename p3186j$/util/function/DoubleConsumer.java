package p3186j$.util.function;

import p3186j$.util.Objects;

/* renamed from: j$.util.function.DoubleConsumer */
public interface DoubleConsumer {

    /* renamed from: j$.util.function.DoubleConsumer$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static DoubleConsumer $default$andThen(DoubleConsumer doubleConsumer, DoubleConsumer doubleConsumer2) {
            Objects.requireNonNull(doubleConsumer2);
            return new C41095g(doubleConsumer, doubleConsumer2);
        }
    }

    void accept(double d);

    DoubleConsumer andThen(DoubleConsumer doubleConsumer);
}
