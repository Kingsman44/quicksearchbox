package p3186j$.util.stream;

import java.util.AbstractMap;
import java.util.Set;

/* renamed from: j$.util.stream.o */
final class C41280o extends AbstractMap {

    /* renamed from: a */
    final Object f107987a;

    /* renamed from: b */
    final Object f107988b;

    C41280o(Object obj, Object obj2) {
        this.f107987a = obj;
        this.f107988b = obj2;
    }

    public final Set entrySet() {
        return new C41276n(this);
    }
}
