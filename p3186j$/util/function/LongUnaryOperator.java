package p3186j$.util.function;

import p3186j$.util.Objects;

/* renamed from: j$.util.function.LongUnaryOperator */
public interface LongUnaryOperator {

    /* renamed from: j$.util.function.LongUnaryOperator$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static LongUnaryOperator $default$andThen(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2) {
            Objects.requireNonNull(longUnaryOperator2);
            return new C41107s(longUnaryOperator, longUnaryOperator2, 0);
        }

        public static LongUnaryOperator $default$compose(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2) {
            Objects.requireNonNull(longUnaryOperator2);
            return new C41107s(longUnaryOperator, longUnaryOperator2, 1);
        }
    }

    LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator);

    long applyAsLong(long j);

    LongUnaryOperator compose(LongUnaryOperator longUnaryOperator);
}
