package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.p9393a.C124544b;
import com.google.android.p10712d.C142324bc;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.b.b */
/* compiled from: PG */
public final class C124546b extends C124552h {

    /* renamed from: a */
    private final C124548d f343625a;

    /* renamed from: b */
    private final C142324bc f343626b;

    public C124546b(C124548d dVar, C142324bc bcVar) {
        this.f343625a = dVar;
        if (bcVar != null) {
            this.f343626b = bcVar;
            return;
        }
        throw new NullPointerException("Null deviceCustomizeInfo");
    }

    /* renamed from: a */
    public final C124548d mo106529a() {
        return this.f343625a;
    }

    /* renamed from: b */
    public final C142324bc mo106530b() {
        return this.f343626b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C124552h) {
            C124552h hVar = (C124552h) obj;
            return this.f343625a.equals(hVar.mo106529a()) && this.f343626b.equals(hVar.mo106530b());
        }
    }

    public final int hashCode() {
        return ((((C124544b) this.f343625a).f343624a.hashCode() ^ 1000003) * 1000003) ^ this.f343626b.hashCode();
    }

    public final String toString() {
        String obj = this.f343625a.toString();
        String obj2 = this.f343626b.toString();
        return "BistoDeviceInfoPackage{deviceInfo=" + obj + ", deviceCustomizeInfo=" + obj2 + "}";
    }
}
