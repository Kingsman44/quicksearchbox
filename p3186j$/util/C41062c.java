package p3186j$.util;

import java.io.Serializable;
import java.util.Comparator;
import p3186j$.util.function.Function;

/* renamed from: j$.util.c */
public final /* synthetic */ class C41062c implements Comparator, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f107566a;

    /* renamed from: b */
    public final /* synthetic */ Comparator f107567b;

    /* renamed from: c */
    public final /* synthetic */ Object f107568c;

    public /* synthetic */ C41062c(Comparator comparator, Object obj, int i) {
        this.f107566a = i;
        this.f107567b = comparator;
        this.f107568c = obj;
    }

    public final int compare(Object obj, Object obj2) {
        int i = this.f107566a;
        Comparator comparator = this.f107567b;
        Object obj3 = this.f107568c;
        switch (i) {
            case 0:
                Comparator comparator2 = (Comparator) obj3;
                int compare = comparator.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return comparator2.compare(obj, obj2);
            default:
                Function function = (Function) obj3;
                return comparator.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
