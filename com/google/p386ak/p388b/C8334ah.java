package com.google.p386ak.p388b;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: com.google.ak.b.ah */
/* compiled from: PG */
public final class C8334ah extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ C8337ak f29147a;

    public C8334ah(C8337ak akVar) {
        this.f29147a = akVar;
    }

    public final void clear() {
        this.f29147a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f29147a.containsKey(obj);
    }

    public final Iterator iterator() {
        return new C8333ag(this);
    }

    public final boolean remove(Object obj) {
        return this.f29147a.mo17076d(obj) != null;
    }

    public final int size() {
        return this.f29147a.f29163c;
    }
}
