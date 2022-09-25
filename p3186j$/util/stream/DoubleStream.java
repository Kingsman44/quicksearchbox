package p3186j$.util.stream;

import p3186j$.util.DesugarArrays;
import p3186j$.util.OptionalDouble;
import p3186j$.util.function.DoubleConsumer;
import p3186j$.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.stream.DoubleStream */
public interface DoubleStream extends BaseStream<Double, DoubleStream> {

    /* renamed from: j$.util.stream.DoubleStream$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: of */
        public static DoubleStream m71796of(double... dArr) {
            return DesugarArrays.stream(dArr);
        }
    }

    OptionalDouble average();

    void forEachOrdered(DoubleConsumer doubleConsumer);

    DoubleStream map(DoubleUnaryOperator doubleUnaryOperator);

    OptionalDouble max();

    OptionalDouble min();

    double sum();

    double[] toArray();
}
