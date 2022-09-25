package com.google.ads.interactivemedia.p367v3.internal;

import java.util.AbstractMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ase */
/* compiled from: PG */
final class ase extends arn {

    /* renamed from: a */
    final /* synthetic */ asf f21478a;

    public ase(asf asf) {
        this.f21478a = asf;
    }

    /* renamed from: f */
    public final boolean mo15278f() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        aqd.m19281i(i, this.f21478a.f21482d);
        Object[] o = this.f21478a.f21480b;
        int i2 = i + i;
        int unused = this.f21478a.f21481c;
        Object obj = o[i2];
        Object[] o2 = this.f21478a.f21480b;
        int unused2 = this.f21478a.f21481c;
        return new AbstractMap.SimpleImmutableEntry(obj, o2[i2 + 1]);
    }

    public final int size() {
        return this.f21478a.f21482d;
    }
}
