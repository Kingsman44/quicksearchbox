package androidx.camera.core.p069a;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: androidx.camera.core.a.ag */
/* compiled from: PG */
public final class C1293ag {

    /* renamed from: a */
    public final Object f3730a = new Object();

    /* renamed from: b */
    public final Map f3731b = new LinkedHashMap();

    public C1293ag() {
        new HashSet();
    }

    /* renamed from: a */
    public final LinkedHashSet mo4149a() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f3730a) {
            linkedHashSet = new LinkedHashSet(this.f3731b.values());
        }
        return linkedHashSet;
    }
}
