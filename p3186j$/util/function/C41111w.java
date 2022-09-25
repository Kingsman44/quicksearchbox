package p3186j$.util.function;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import p3186j$.util.function.Function;

/* renamed from: j$.util.function.w */
public final /* synthetic */ class C41111w implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ UnaryOperator f107684a;

    private /* synthetic */ C41111w(UnaryOperator unaryOperator) {
        this.f107684a = unaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ UnaryOperator m71732a(UnaryOperator unaryOperator) {
        if (unaryOperator == null) {
            return null;
        }
        return unaryOperator instanceof C41110v ? ((C41110v) unaryOperator).f107683a : new C41111w(unaryOperator);
    }

    public final /* synthetic */ Function andThen(Function function) {
        return C41099k.m71727a(this.f107684a.andThen(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ Object apply(Object obj) {
        return this.f107684a.apply(obj);
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return C41099k.m71727a(this.f107684a.compose(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C41111w) {
            obj = ((C41111w) obj).f107684a;
        }
        return this.f107684a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f107684a.hashCode();
    }
}
