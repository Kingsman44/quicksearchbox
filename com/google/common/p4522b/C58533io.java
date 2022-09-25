package com.google.common.p4522b;

import java.util.AbstractMap;

/* renamed from: com.google.common.b.io */
/* compiled from: PG */
final class C58533io extends C58485gu {

    /* renamed from: a */
    final /* synthetic */ C58534ip f156182a;

    public C58533io(C58534ip ipVar) {
        this.f156182a = ipVar;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return new AbstractMap.SimpleImmutableEntry(this.f156182a.f156183a.f156189a.f156507e.get(i), this.f156182a.f156183a.f156190b.get(i));
    }

    public final int size() {
        return this.f156182a.f156183a.f156190b.size();
    }
}
