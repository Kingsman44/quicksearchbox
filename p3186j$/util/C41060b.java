package p3186j$.util;

import java.io.Serializable;
import java.util.Comparator;
import p3186j$.util.function.Function;
import p3186j$.util.function.ToDoubleFunction;
import p3186j$.util.function.ToIntFunction;
import p3186j$.util.function.ToLongFunction;

/* renamed from: j$.util.b */
public final /* synthetic */ class C41060b implements Comparator, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f107564a;

    /* renamed from: b */
    public final /* synthetic */ Object f107565b;

    public /* synthetic */ C41060b(int i, Object obj) {
        this.f107564a = i;
        this.f107565b = obj;
    }

    public final int compare(Object obj, Object obj2) {
        int i = this.f107564a;
        Object obj3 = this.f107565b;
        switch (i) {
            case 0:
                ToDoubleFunction toDoubleFunction = (ToDoubleFunction) obj3;
                return Double.compare(toDoubleFunction.applyAsDouble(obj), toDoubleFunction.applyAsDouble(obj2));
            case 1:
                ToIntFunction toIntFunction = (ToIntFunction) obj3;
                int applyAsInt = toIntFunction.applyAsInt(obj);
                int applyAsInt2 = toIntFunction.applyAsInt(obj2);
                if (applyAsInt == applyAsInt2) {
                    return 0;
                }
                if (applyAsInt < applyAsInt2) {
                    return -1;
                }
                return 1;
            case 2:
                ToLongFunction toLongFunction = (ToLongFunction) obj3;
                return (toLongFunction.applyAsLong(obj) > toLongFunction.applyAsLong(obj2) ? 1 : (toLongFunction.applyAsLong(obj) == toLongFunction.applyAsLong(obj2) ? 0 : -1));
            default:
                Function function = (Function) obj3;
                return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
        }
    }
}
