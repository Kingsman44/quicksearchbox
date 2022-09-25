package androidx.core.p098j;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.j.t */
/* compiled from: PG */
public final class C2105t {

    /* renamed from: a */
    public final CopyOnWriteArrayList f6016a = new CopyOnWriteArrayList();

    public C2105t() {
        new HashMap();
    }

    /* renamed from: a */
    public final boolean mo5273a() {
        Iterator it = this.f6016a.iterator();
        while (it.hasNext()) {
            if (((C2108w) it.next()).mo5277c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo5274b() {
        Iterator it = this.f6016a.iterator();
        while (it.hasNext()) {
            ((C2108w) it.next()).mo5278d();
        }
    }
}
