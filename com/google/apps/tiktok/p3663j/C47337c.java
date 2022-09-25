package com.google.apps.tiktok.p3663j;

import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.j.c */
/* compiled from: PG */
final class C47337c extends C47355m {

    /* renamed from: a */
    private final C47351i f123038a;

    /* renamed from: b */
    private final C47347e f123039b;

    /* renamed from: c */
    private final C69464a f123040c;

    public C47337c(C47351i iVar, C47347e eVar, C69464a aVar) {
        if (iVar != null) {
            this.f123038a = iVar;
            if (eVar != null) {
                this.f123039b = eVar;
                if (aVar != null) {
                    this.f123040c = aVar;
                    return;
                }
                throw new NullPointerException("Null syncletProvider");
            }
            throw new NullPointerException("Null syncConfig");
        }
        throw new NullPointerException("Null syncKey");
    }

    /* renamed from: a */
    public final C47347e mo51211a() {
        return this.f123039b;
    }

    /* renamed from: b */
    public final C47351i mo51212b() {
        return this.f123038a;
    }

    /* renamed from: c */
    public final C69464a mo51213c() {
        return this.f123040c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C47355m) {
            C47355m mVar = (C47355m) obj;
            return this.f123038a.equals(mVar.mo51212b()) && this.f123039b.equals(mVar.mo51211a()) && this.f123040c.equals(mVar.mo51213c());
        }
    }

    public final int hashCode() {
        return ((((this.f123038a.hashCode() ^ 1000003) * 1000003) ^ this.f123039b.hashCode()) * 1000003) ^ this.f123040c.hashCode();
    }

    public final String toString() {
        String obj = this.f123038a.toString();
        String obj2 = this.f123039b.toString();
        String obj3 = this.f123040c.toString();
        return "SyncletBinding{syncKey=" + obj + ", syncConfig=" + obj2 + ", syncletProvider=" + obj3 + "}";
    }
}
