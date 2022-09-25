package com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.f */
/* compiled from: PG */
final class C111243f extends C111252o {

    /* renamed from: a */
    public final String f309561a;

    /* renamed from: b */
    public final String f309562b;

    /* renamed from: c */
    public final boolean f309563c;

    public C111243f(String str, String str2, boolean z) {
        this.f309561a = str;
        this.f309562b = str2;
        this.f309563c = z;
    }

    /* renamed from: a */
    public final C111251n mo99070a() {
        return new C111242e(this);
    }

    /* renamed from: b */
    public final String mo99071b() {
        return this.f309562b;
    }

    /* renamed from: c */
    public final String mo99072c() {
        return this.f309561a;
    }

    /* renamed from: d */
    public final boolean mo99073d() {
        return this.f309563c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C111252o) {
            C111252o oVar = (C111252o) obj;
            return this.f309561a.equals(oVar.mo99072c()) && this.f309562b.equals(oVar.mo99071b()) && this.f309563c == oVar.mo99073d();
        }
    }

    public final int hashCode() {
        return ((((this.f309561a.hashCode() ^ 1000003) * 1000003) ^ this.f309562b.hashCode()) * 1000003) ^ (true != this.f309563c ? 1237 : 1231);
    }
}
