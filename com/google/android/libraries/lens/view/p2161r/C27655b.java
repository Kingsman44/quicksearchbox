package com.google.android.libraries.lens.view.p2161r;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.r.b */
/* compiled from: PG */
public final class C27655b implements C27654a {

    /* renamed from: a */
    private final List f75509a = new ArrayList();

    /* renamed from: a */
    public final void mo33143a(C27654a aVar) {
        synchronized (this.f75509a) {
            this.f75509a.add(new WeakReference(aVar));
        }
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        synchronized (this.f75509a) {
            Iterator it = this.f75509a.iterator();
            while (it.hasNext()) {
                C27654a aVar = (C27654a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    eVar.mo33146c(aVar);
                } else {
                    it.remove();
                }
            }
        }
    }
}
