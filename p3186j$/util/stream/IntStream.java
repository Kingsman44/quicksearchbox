package p3186j$.util.stream;

import p3186j$.util.C41039G;
import p3186j$.util.C41059a0;
import p3186j$.util.Objects;
import p3186j$.util.OptionalInt;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.IntConsumer;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.IntPredicate;
import p3186j$.util.function.IntToDoubleFunction;
import p3186j$.util.function.IntUnaryOperator;
import p3186j$.util.function.ObjIntConsumer;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.IntStream */
public interface IntStream extends BaseStream<Integer, IntStream> {

    /* renamed from: j$.util.stream.IntStream$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static IntStream iterate(int i, IntUnaryOperator intUnaryOperator) {
            Objects.requireNonNull(intUnaryOperator);
            C41204U u = new C41204U(intUnaryOperator, i);
            return new C41189Q(u, C41259i2.m72151e(u));
        }

        public static IntStream range(int i, int i2) {
            if (i >= i2) {
                C41039G c = C41059a0.m71662c();
                return new C41189Q(c, C41259i2.m72151e(c));
            }
            C41192Q2 q2 = new C41192Q2(i, i2, false);
            return new C41189Q(q2, C41259i2.m72151e(q2));
        }

        public static IntStream rangeClosed(int i, int i2) {
            if (i > i2) {
                C41039G c = C41059a0.m71662c();
                return new C41189Q(c, C41259i2.m72151e(c));
            }
            C41192Q2 q2 = new C41192Q2(i, i2, true);
            return new C41189Q(q2, C41259i2.m72151e(q2));
        }
    }

    boolean anyMatch(IntPredicate intPredicate);

    Stream<Integer> boxed();

    <R> R collect(Supplier<R> supplier, ObjIntConsumer<R> objIntConsumer, BiConsumer<R, R> biConsumer);

    IntStream filter(IntPredicate intPredicate);

    OptionalInt findFirst();

    void forEach(IntConsumer intConsumer);

    void forEachOrdered(IntConsumer intConsumer);

    IntStream limit(long j);

    DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction);

    <U> Stream<U> mapToObj(IntFunction<? extends U> intFunction);

    OptionalInt max();

    OptionalInt min();

    int sum();

    int[] toArray();
}
