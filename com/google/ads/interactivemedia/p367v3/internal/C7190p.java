package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.google.ads.interactivemedia.v3.internal.p */
/* compiled from: PG */
public final class C7190p {

    /* renamed from: a */
    private static final C7190p f23437a = new C7190p();

    /* renamed from: b */
    private final ArrayList f23438b = new ArrayList();

    /* renamed from: c */
    private final ArrayList f23439c = new ArrayList();

    private C7190p() {
    }

    /* renamed from: a */
    public static C7190p m21443a() {
        return f23437a;
    }

    /* renamed from: b */
    public final void mo16264b(C7001i iVar) {
        this.f23438b.add(iVar);
    }

    /* renamed from: c */
    public final void mo16265c(C7001i iVar) {
        boolean g = mo16269g();
        this.f23439c.add(iVar);
        if (!g) {
            C7379w.m22239a().mo16705c();
        }
    }

    /* renamed from: d */
    public final void mo16266d(C7001i iVar) {
        boolean g = mo16269g();
        this.f23438b.remove(iVar);
        this.f23439c.remove(iVar);
        if (g && !mo16269g()) {
            C7379w.m22239a().mo16706d();
        }
    }

    /* renamed from: e */
    public final Collection mo16267e() {
        return Collections.unmodifiableCollection(this.f23438b);
    }

    /* renamed from: f */
    public final Collection mo16268f() {
        return Collections.unmodifiableCollection(this.f23439c);
    }

    /* renamed from: g */
    public final boolean mo16269g() {
        return this.f23439c.size() > 0;
    }
}
