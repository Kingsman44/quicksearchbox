package com.google.common.p4522b;

import java.util.Map;

/* renamed from: com.google.common.b.hi */
/* compiled from: PG */
final class C58500hi extends C58800sl {

    /* renamed from: a */
    final C58800sl f156135a;

    /* renamed from: b */
    final /* synthetic */ C58503hl f156136b;

    public C58500hi(C58503hl hlVar) {
        this.f156136b = hlVar;
        this.f156135a = hlVar.f156139a.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f156135a.hasNext();
    }

    public final Object next() {
        return ((Map.Entry) this.f156135a.next()).getValue();
    }
}
