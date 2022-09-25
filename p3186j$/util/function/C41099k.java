package p3186j$.util.function;

import java.util.function.Function;
import p3186j$.util.function.Function;

/* renamed from: j$.util.function.k */
public final /* synthetic */ class C41099k implements Function {

    /* renamed from: a */
    public final /* synthetic */ Function f107665a;

    private /* synthetic */ C41099k(Function function) {
        this.f107665a = function;
    }

    /* renamed from: a */
    public static /* synthetic */ Function m71727a(Function function) {
        if (function == null) {
            return null;
        }
        return function instanceof Function.VivifiedWrapper ? ((Function.VivifiedWrapper) function).f107644a : function instanceof UnaryOperator ? C41111w.m71732a((UnaryOperator) function) : new C41099k(function);
    }

    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return m71727a(this.f107665a.andThen(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ Object apply(Object obj) {
        return this.f107665a.apply(obj);
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return m71727a(this.f107665a.compose(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C41099k) {
            obj = ((C41099k) obj).f107665a;
        }
        return this.f107665a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f107665a.hashCode();
    }
}
