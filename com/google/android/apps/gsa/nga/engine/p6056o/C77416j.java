package com.google.android.apps.gsa.nga.engine.p6056o;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.j */
/* compiled from: PG */
final class C77416j extends C77432z {

    /* renamed from: a */
    private final C60870cx f213450a;

    /* renamed from: b */
    private final C60870cx f213451b;

    public C77416j(C60870cx cxVar, C60870cx cxVar2) {
        this.f213450a = cxVar;
        this.f213451b = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo72558a() {
        return this.f213450a;
    }

    /* renamed from: b */
    public final C60870cx mo72559b() {
        return this.f213451b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77432z) {
            C77432z zVar = (C77432z) obj;
            return this.f213450a.equals(zVar.mo72558a()) && this.f213451b.equals(zVar.mo72559b());
        }
    }

    public final int hashCode() {
        return ((this.f213450a.hashCode() ^ 1000003) * 1000003) ^ this.f213451b.hashCode();
    }

    public final String toString() {
        String obj = this.f213450a.toString();
        String obj2 = this.f213451b.toString();
        return "AssistDataAndScreenshot{assistData=" + obj + ", screenshot=" + obj2 + "}";
    }
}
