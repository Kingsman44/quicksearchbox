package p3186j$.util;

import java.io.Serializable;

/* renamed from: j$.util.j */
final class C41115j extends C41112g implements Serializable {

    /* renamed from: a */
    private final Object f107685a;

    /* renamed from: b */
    private final Object f107686b;

    C41115j(Object obj) {
        this.f107685a = Objects.requireNonNull(obj);
        this.f107686b = null;
    }

    C41115j(Object obj, Object obj2) {
        this.f107685a = Objects.requireNonNull(obj);
        this.f107686b = Objects.requireNonNull(obj2);
    }

    public final Object get(int i) {
        Object obj;
        if (i == 0) {
            return this.f107685a;
        }
        if (i == 1 && (obj = this.f107686b) != null) {
            return obj;
        }
        throw mo43628a(i);
    }

    public final int size() {
        return this.f107686b != null ? 2 : 1;
    }
}
