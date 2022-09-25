package androidx.media3.exoplayer.p151k;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.media3.exoplayer.k.d */
/* compiled from: PG */
public final class C3238d {

    /* renamed from: a */
    public final CopyOnWriteArrayList f9739a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void mo7232a(C3239e eVar) {
        Iterator it = this.f9739a.iterator();
        while (it.hasNext()) {
            C3237c cVar = (C3237c) it.next();
            if (cVar.f9737b == eVar) {
                cVar.f9738c = true;
                this.f9739a.remove(cVar);
            }
        }
    }
}
