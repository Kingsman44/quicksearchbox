package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8144h;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.Collections;
import java.util.Set;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.h.a */
/* compiled from: PG */
public final class C105367a {

    /* renamed from: a */
    public C58833ax f293973a = C58836b.f156633a;

    /* renamed from: b */
    private final Set f293974b = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: a */
    public final void mo94763a(C105368b bVar) {
        this.f293974b.add(bVar);
        bVar.mo94709a(this.f293973a);
    }

    /* renamed from: b */
    public final void mo94764b(boolean z) {
        if (!this.f293973a.mo56113h() || ((Boolean) this.f293973a.mo56107c()).booleanValue() != z) {
            mo94766d(C58833ax.m90834k(Boolean.valueOf(z)));
        }
    }

    /* renamed from: c */
    public final void mo94765c(C105368b bVar) {
        this.f293974b.remove(bVar);
    }

    /* renamed from: d */
    public final void mo94766d(C58833ax axVar) {
        this.f293973a = axVar;
        for (C105368b a : this.f293974b) {
            a.mo94709a(this.f293973a);
        }
    }
}
