package p3186j$.util.function;

import java.util.function.UnaryOperator;
import p3186j$.util.function.Function;

/* renamed from: j$.util.function.v */
public final /* synthetic */ class C41110v implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ UnaryOperator f107683a;

    private /* synthetic */ C41110v(UnaryOperator unaryOperator) {
        this.f107683a = unaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ UnaryOperator m71731a(UnaryOperator unaryOperator) {
        if (unaryOperator == null) {
            return null;
        }
        return unaryOperator instanceof C41111w ? ((C41111w) unaryOperator).f107684a : new C41110v(unaryOperator);
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.VivifiedWrapper.convert(this.f107683a.andThen(C41099k.m71727a(function)));
    }

    public final /* synthetic */ Object apply(Object obj) {
        return this.f107683a.apply(obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.VivifiedWrapper.convert(this.f107683a.compose(C41099k.m71727a(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C41110v) {
            obj = ((C41110v) obj).f107683a;
        }
        return this.f107683a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f107683a.hashCode();
    }
}
