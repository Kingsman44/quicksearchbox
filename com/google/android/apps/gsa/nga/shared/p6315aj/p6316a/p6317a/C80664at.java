package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.at */
/* compiled from: PG */
final class C80664at extends C80710cl {

    /* renamed from: b */
    private final C80708cj f221447b;

    /* renamed from: c */
    private final C80707ci f221448c;

    /* renamed from: d */
    private final boolean f221449d;

    /* renamed from: e */
    private final C80709ck f221450e;

    public C80664at(C80708cj cjVar, C80707ci ciVar, boolean z, C80709ck ckVar) {
        this.f221447b = cjVar;
        this.f221448c = ciVar;
        this.f221449d = z;
        this.f221450e = ckVar;
    }

    /* renamed from: a */
    public final C80707ci mo74470a() {
        return this.f221448c;
    }

    /* renamed from: b */
    public final C80708cj mo74471b() {
        return this.f221447b;
    }

    /* renamed from: c */
    public final C80709ck mo74472c() {
        return this.f221450e;
    }

    /* renamed from: d */
    public final boolean mo74473d() {
        return this.f221449d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80710cl) {
            C80710cl clVar = (C80710cl) obj;
            return this.f221447b.equals(clVar.mo74471b()) && this.f221448c.equals(clVar.mo74470a()) && this.f221449d == clVar.mo74473d() && this.f221450e.equals(clVar.mo74472c());
        }
    }

    public final int hashCode() {
        return ((((((this.f221447b.hashCode() ^ 1000003) * 1000003) ^ this.f221448c.hashCode()) * 1000003) ^ (true != this.f221449d ? 1237 : 1231)) * 1000003) ^ this.f221450e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f221447b);
        String valueOf2 = String.valueOf(this.f221448c);
        boolean z = this.f221449d;
        String valueOf3 = String.valueOf(this.f221450e);
        return "EdgeLights{state=" + valueOf + ", goneLogoState=" + valueOf2 + ", listening=" + z + ", triggerType=" + valueOf3 + "}";
    }
}
