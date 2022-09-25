package com.google.common.p4522b;

import java.util.Map;

/* renamed from: com.google.common.b.gx */
/* compiled from: PG */
final class C58488gx extends C58800sl {

    /* renamed from: a */
    final /* synthetic */ C58800sl f156117a;

    public C58488gx(C58800sl slVar) {
        this.f156117a = slVar;
    }

    public final boolean hasNext() {
        return this.f156117a.hasNext();
    }

    public final Object next() {
        return ((Map.Entry) this.f156117a.next()).getKey();
    }
}
