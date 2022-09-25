package p3186j$.util.function;

import java.util.Comparator;
import p3186j$.util.function.BiFunction;

/* renamed from: j$.util.function.d */
public final /* synthetic */ class C41092d implements BinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ int f107651a;

    /* renamed from: b */
    public final /* synthetic */ Comparator f107652b;

    public /* synthetic */ C41092d(Comparator comparator, int i) {
        this.f107651a = i;
        this.f107652b = comparator;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f107651a) {
            case 0:
                return BiFunction.CC.$default$andThen(this, function);
            default:
                return BiFunction.CC.$default$andThen(this, function);
        }
    }

    public final Object apply(Object obj, Object obj2) {
        int i = this.f107651a;
        Comparator comparator = this.f107652b;
        switch (i) {
            case 0:
                if (comparator.compare(obj, obj2) >= 0) {
                    return obj;
                }
                return obj2;
            default:
                if (comparator.compare(obj, obj2) <= 0) {
                    return obj;
                }
                return obj2;
        }
    }
}
