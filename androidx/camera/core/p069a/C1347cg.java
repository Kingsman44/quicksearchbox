package androidx.camera.core.p069a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.core.a.cg */
/* compiled from: PG */
public final class C1347cg {

    /* renamed from: a */
    private final List f3830a;

    public C1347cg(List list) {
        this.f3830a = new ArrayList(list);
    }

    /* renamed from: a */
    public final C1346cf mo4225a(Class cls) {
        for (C1346cf cfVar : this.f3830a) {
            if (cfVar.getClass() == cls) {
                return cfVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo4226b(Class cls) {
        for (C1346cf cfVar : this.f3830a) {
            if (cls.isAssignableFrom(cfVar.getClass())) {
                return true;
            }
        }
        return false;
    }
}
