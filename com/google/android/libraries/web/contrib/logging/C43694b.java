package com.google.android.libraries.web.contrib.logging;

import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.libraries.web.contrib.logging.b */
/* compiled from: PG */
public final class C43694b extends C43698f {

    /* renamed from: a */
    private final C43367l f113999a;

    public C43694b(C43367l lVar) {
        this.f113999a = lVar;
    }

    /* renamed from: a */
    public final C43708k mo46714a() {
        return C43708k.CANCELLING_REQUEST;
    }

    /* renamed from: b */
    public final C43367l mo46718b() {
        return this.f113999a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C43709l) {
            C43709l lVar = (C43709l) obj;
            if (C43708k.CANCELLING_REQUEST != lVar.mo46714a() || !this.f113999a.equals(lVar.mo46718b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f113999a.hashCode();
    }

    public final String toString() {
        String obj = this.f113999a.toString();
        return "CancellationReason{cancellingRequest=" + obj + "}";
    }
}
