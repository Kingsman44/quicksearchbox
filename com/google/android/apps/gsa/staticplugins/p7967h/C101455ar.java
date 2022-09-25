package com.google.android.apps.gsa.staticplugins.p7967h;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8885y.C118837d;
import com.google.android.apps.gsa.shared.p7012bb.p7018f.C89402a;
import java.util.EnumMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.h.ar */
/* compiled from: PG */
public final class C101455ar {

    /* renamed from: a */
    private final C89402a f283066a;

    /* renamed from: b */
    private final EnumMap f283067b = new EnumMap(C118569b.class);

    public C101455ar(C89402a aVar) {
        this.f283066a = aVar;
    }

    /* renamed from: a */
    public final void mo92302a(C118569b bVar) {
        this.f283067b.put(bVar, Long.valueOf(this.f283066a.mo83324a(bVar).mo104019a()));
    }

    /* renamed from: b */
    public final void mo92303b(C118569b bVar) {
        Long l = (Long) this.f283067b.get(bVar);
        if (l != null) {
            C118837d.m197250d(this.f283066a.mo83324a(bVar), l.longValue());
        }
    }
}
