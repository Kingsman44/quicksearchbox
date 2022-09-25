package p3186j$.util.function;

import java.util.function.BinaryOperator;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.C41083t;

/* renamed from: j$.util.function.BiFunction */
public interface BiFunction<T, U, R> {

    /* renamed from: j$.util.function.BiFunction$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T, U, R> {
        public static BiFunction $default$andThen(BiFunction biFunction, Function function) {
            Objects.requireNonNull(function);
            return new C41083t(biFunction, function);
        }
    }

    /* renamed from: j$.util.function.BiFunction$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements BiFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.BiFunction f107641a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiFunction biFunction) {
            this.f107641a = biFunction;
        }

        public static /* synthetic */ BiFunction convert(java.util.function.BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            return biFunction instanceof BinaryOperator ? C41093e.m71725a((BinaryOperator) biFunction) : new VivifiedWrapper(biFunction);
        }

        public final /* synthetic */ BiFunction andThen(Function function) {
            return convert(this.f107641a.andThen(C41099k.m71727a(function)));
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return this.f107641a.apply(obj, obj2);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f107641a;
            }
            return this.f107641a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f107641a.hashCode();
        }
    }

    <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> function);

    R apply(T t, U u);
}
