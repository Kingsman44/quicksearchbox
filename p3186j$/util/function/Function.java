package p3186j$.util.function;

import java.util.function.UnaryOperator;
import p3186j$.time.C40966e;
import p3186j$.util.Objects;

/* renamed from: j$.util.function.Function */
public interface Function<T, R> {

    /* renamed from: j$.util.function.Function$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T, R> {
        public static Function $default$andThen(Function function, Function function2) {
            Objects.requireNonNull(function2);
            return new C41098j(function, function2, 0);
        }

        public static Function $default$compose(Function function, Function function2) {
            Objects.requireNonNull(function2);
            return new C41098j(function, function2, 1);
        }

        public static <T> Function<T, T> identity() {
            return new C40966e(3);
        }
    }

    /* renamed from: j$.util.function.Function$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements Function {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.Function f107644a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Function function) {
            this.f107644a = function;
        }

        public static /* synthetic */ Function convert(java.util.function.Function function) {
            if (function == null) {
                return null;
            }
            return function instanceof C41099k ? ((C41099k) function).f107665a : function instanceof UnaryOperator ? C41110v.m71731a((UnaryOperator) function) : new VivifiedWrapper(function);
        }

        public final /* synthetic */ Function andThen(Function function) {
            return convert(this.f107644a.andThen(C41099k.m71727a(function)));
        }

        public final /* synthetic */ Object apply(Object obj) {
            return this.f107644a.apply(obj);
        }

        public final /* synthetic */ Function compose(Function function) {
            return convert(this.f107644a.compose(C41099k.m71727a(function)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f107644a;
            }
            return this.f107644a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f107644a.hashCode();
        }
    }

    <V> Function<T, V> andThen(Function<? super R, ? extends V> function);

    R apply(T t);

    <V> Function<V, R> compose(Function<? super V, ? extends T> function);
}
