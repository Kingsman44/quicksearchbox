package kotlinx.coroutines.p5579e;

import java.util.ArrayList;
import kotlinx.coroutines.C71600ba;

/* renamed from: kotlinx.coroutines.e.t */
/* compiled from: PG */
public final class C71738t {
    /* renamed from: a */
    public static final Object m104899a(Object obj, Object obj2) {
        boolean z = C71600ba.f191036a;
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
