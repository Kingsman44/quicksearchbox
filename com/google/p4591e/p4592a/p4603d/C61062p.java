package com.google.p4591e.p4592a.p4603d;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: com.google.e.a.d.p */
/* compiled from: PG */
final class C61062p extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ C61064r f165335a;

    /* renamed from: b */
    private final C61057k f165336b;

    public C61062p(C61064r rVar) {
        this.f165335a = rVar;
        this.f165336b = new C61057k(new C61058l(rVar, rVar.f165340c.f165294b));
    }

    public final void clear() {
        this.f165335a.f165339b.clear();
        this.f165336b.clear();
    }

    public final Iterator iterator() {
        return new C61061o(this.f165335a, this.f165336b);
    }

    public final int size() {
        return this.f165335a.f165339b.size() + this.f165336b.size();
    }
}
