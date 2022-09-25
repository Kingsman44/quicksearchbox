package p3186j$.util.function;

import p3186j$.util.Objects;

/* renamed from: j$.util.function.IntUnaryOperator */
public interface IntUnaryOperator {

    /* renamed from: j$.util.function.IntUnaryOperator$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static IntUnaryOperator $default$andThen(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2) {
            Objects.requireNonNull(intUnaryOperator2);
            return new C41104p(intUnaryOperator, intUnaryOperator2, 1);
        }

        public static IntUnaryOperator $default$compose(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2) {
            Objects.requireNonNull(intUnaryOperator2);
            return new C41104p(intUnaryOperator, intUnaryOperator2, 0);
        }
    }

    IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator);

    int applyAsInt(int i);

    IntUnaryOperator compose(IntUnaryOperator intUnaryOperator);
}
