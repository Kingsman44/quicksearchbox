package androidx.camera.core.p073b;

import androidx.camera.core.p069a.C1292af;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: androidx.camera.core.b.g */
/* compiled from: PG */
public final class C1444g {

    /* renamed from: a */
    private final List f4000a = new ArrayList();

    public C1444g(LinkedHashSet linkedHashSet) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            this.f4000a.add(((C1292af) it.next()).mo3816A().f3271a);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1444g) {
            return this.f4000a.equals(((C1444g) obj).f4000a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4000a.hashCode() * 53;
    }
}
