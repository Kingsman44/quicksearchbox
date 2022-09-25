package p3186j$.util;

import java.io.Serializable;
import java.util.List;

/* renamed from: j$.util.l */
final class C41117l extends C41112g implements Serializable {

    /* renamed from: b */
    static List f107691b = new C41117l(new Object[0]);

    /* renamed from: a */
    private final Object[] f107692a;

    static {
        if (f107691b == null) {
        }
    }

    C41117l(Object... objArr) {
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            objArr2[i] = Objects.requireNonNull(objArr[i]);
        }
        this.f107692a = objArr2;
    }

    public final Object get(int i) {
        return this.f107692a[i];
    }

    public final boolean isEmpty() {
        return this.f107692a.length == 0;
    }

    public final int size() {
        return this.f107692a.length;
    }
}
