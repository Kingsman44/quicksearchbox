package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.hotword.service.HotwordInformation;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39499d;

/* renamed from: com.google.android.libraries.search.n.c.a.y */
/* compiled from: PG */
final class C39643y extends C39425bb {

    /* renamed from: a */
    private final HotwordInformation f104363a;

    /* renamed from: b */
    private final C39499d f104364b;

    public C39643y(HotwordInformation hotwordInformation, C39499d dVar) {
        this.f104363a = hotwordInformation;
        this.f104364b = dVar;
    }

    /* renamed from: a */
    public final HotwordInformation mo41840a() {
        return this.f104363a;
    }

    /* renamed from: b */
    public final C39499d mo41841b() {
        return this.f104364b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39425bb) {
            C39425bb bbVar = (C39425bb) obj;
            return this.f104363a.equals(bbVar.mo41840a()) && this.f104364b.equals(bbVar.mo41841b());
        }
    }

    public final int hashCode() {
        return ((this.f104363a.hashCode() ^ 1000003) * 1000003) ^ this.f104364b.hashCode();
    }

    public final String toString() {
        String obj = this.f104363a.toString();
        String obj2 = this.f104364b.toString();
        return "InternalHotwordConfig{hotwordInformation=" + obj + ", hotwordConfigResponse=" + obj2 + "}";
    }
}
