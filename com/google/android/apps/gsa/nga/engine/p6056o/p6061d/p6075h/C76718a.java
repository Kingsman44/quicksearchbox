package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6075h;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122463r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.h.a */
/* compiled from: PG */
final class C76718a extends C76737t {

    /* renamed from: a */
    public final C122463r f212045a;

    /* renamed from: b */
    private final Optional f212046b;

    public C76718a(C122463r rVar, Optional optional) {
        if (rVar != null) {
            this.f212045a = rVar;
            if (optional != null) {
                this.f212046b = optional;
                return;
            }
            throw new NullPointerException("Null userName");
        }
        throw new NullPointerException("Null configurationParams");
    }

    /* renamed from: a */
    public final C122463r mo72305a() {
        return this.f212045a;
    }

    /* renamed from: b */
    public final Optional mo72306b() {
        return this.f212046b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C76737t) {
            C76737t tVar = (C76737t) obj;
            return this.f212045a.equals(tVar.mo72305a()) && this.f212046b.equals(tVar.mo72306b());
        }
    }

    public final int hashCode() {
        return ((this.f212045a.hashCode() ^ 1000003) * 1000003) ^ this.f212046b.hashCode();
    }

    public final String toString() {
        String obj = this.f212045a.toString();
        String obj2 = this.f212046b.toString();
        return "ConfigureCacheKey{configurationParams=" + obj + ", userName=" + obj2 + "}";
    }
}
