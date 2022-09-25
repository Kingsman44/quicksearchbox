package com.google.common.p4522b;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.cx */
/* compiled from: PG */
final class C58380cx extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ C58384da f155960a;

    public C58380cx(C58384da daVar) {
        this.f155960a = daVar;
    }

    public final void clear() {
        this.f155960a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f155960a.containsKey(obj);
    }

    public final Iterator iterator() {
        C58384da daVar = this.f155960a;
        Map k = daVar.mo55100k();
        if (k != null) {
            return k.keySet().iterator();
        }
        return new C58375cs(daVar);
    }

    public final boolean remove(Object obj) {
        Map k = this.f155960a.mo55100k();
        if (k != null) {
            return k.keySet().remove(obj);
        }
        return this.f155960a.mo55094g(obj) != C58384da.f155965a;
    }

    public final int size() {
        return this.f155960a.size();
    }
}
