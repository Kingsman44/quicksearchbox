package com.google.android.apps.gsa.shared.p6976ag.p6980d.p6981a;

/* renamed from: com.google.android.apps.gsa.shared.ag.d.a.a */
/* compiled from: PG */
final class C89120a extends C89123d {

    /* renamed from: a */
    private final C89125f f241586a;

    /* renamed from: b */
    private final String f241587b;

    public C89120a(C89125f fVar, String str) {
        if (fVar != null) {
            this.f241586a = fVar;
            if (str != null) {
                this.f241587b = str;
                return;
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null type");
    }

    /* renamed from: a */
    public final C89125f mo83106a() {
        return this.f241586a;
    }

    /* renamed from: b */
    public final String mo83107b() {
        return this.f241587b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89123d) {
            C89123d dVar = (C89123d) obj;
            return this.f241586a.equals(dVar.mo83106a()) && this.f241587b.equals(dVar.mo83107b());
        }
    }

    public final int hashCode() {
        return ((this.f241586a.hashCode() ^ 1000003) * 1000003) ^ this.f241587b.hashCode();
    }

    public final String toString() {
        String obj = this.f241586a.toString();
        String str = this.f241587b;
        return "FinishSetupBarContent{type=" + obj + ", text=" + str + "}";
    }
}
