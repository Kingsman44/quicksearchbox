package com.google.common.p4522b;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.cz */
/* compiled from: PG */
final class C58382cz extends AbstractCollection {

    /* renamed from: a */
    final /* synthetic */ C58384da f155964a;

    public C58382cz(C58384da daVar) {
        this.f155964a = daVar;
    }

    public final void clear() {
        this.f155964a.clear();
    }

    public final Iterator iterator() {
        C58384da daVar = this.f155964a;
        Map k = daVar.mo55100k();
        if (k != null) {
            return k.values().iterator();
        }
        return new C58377cu(daVar);
    }

    public final int size() {
        return this.f155964a.size();
    }
}
