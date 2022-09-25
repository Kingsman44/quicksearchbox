package p3186j$.util;

import java.util.Comparator;
import p3186j$.util.Comparator;

/* renamed from: j$.util.d */
enum C41086d implements Comparator, Comparator {
    ;

    private C41086d() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    public final Comparator reversed() {
        return Comparator.CC.reverseOrder();
    }
}
