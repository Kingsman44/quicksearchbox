package p3186j$.util.function;

import p3186j$.util.Objects;

/* renamed from: j$.util.function.DoubleUnaryOperator */
public interface DoubleUnaryOperator {

    /* renamed from: j$.util.function.DoubleUnaryOperator$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static DoubleUnaryOperator $default$andThen(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2) {
            Objects.requireNonNull(doubleUnaryOperator2);
            return new C41097i(doubleUnaryOperator, doubleUnaryOperator2, 1);
        }

        public static DoubleUnaryOperator $default$compose(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2) {
            Objects.requireNonNull(doubleUnaryOperator2);
            return new C41097i(doubleUnaryOperator, doubleUnaryOperator2, 0);
        }
    }

    DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator);

    double applyAsDouble(double d);

    DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator);
}
