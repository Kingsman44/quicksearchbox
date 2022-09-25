package com.google.apps.tiktok.dataservice;

/* renamed from: com.google.apps.tiktok.dataservice.z */
/* compiled from: PG */
final class C46886z extends C46789df {

    /* renamed from: a */
    public final C46689ag f122328a;

    /* renamed from: b */
    public final C46816ed f122329b;

    /* renamed from: c */
    public final long f122330c;

    /* renamed from: d */
    public final C46790dg f122331d;

    /* renamed from: e */
    public final int f122332e;

    public C46886z(C46689ag agVar, C46816ed edVar, long j, int i, C46790dg dgVar) {
        if (agVar != null) {
            this.f122328a = agVar;
            if (edVar != null) {
                this.f122329b = edVar;
                this.f122330c = j;
                this.f122332e = i;
                this.f122331d = dgVar;
                return;
            }
            throw new NullPointerException("Null tolerance");
        }
        throw new NullPointerException("Null dataSource");
    }

    /* renamed from: a */
    public final long mo50798a() {
        return this.f122330c;
    }

    /* renamed from: b */
    public final C46689ag mo50799b() {
        return this.f122328a;
    }

    /* renamed from: c */
    public final C46790dg mo50800c() {
        return this.f122331d;
    }

    /* renamed from: d */
    public final C46816ed mo50801d() {
        return this.f122329b;
    }

    /* renamed from: e */
    public final int mo50802e() {
        return this.f122332e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46789df) {
            C46789df dfVar = (C46789df) obj;
            return this.f122328a.equals(dfVar.mo50799b()) && this.f122329b.equals(dfVar.mo50801d()) && this.f122330c == dfVar.mo50798a() && this.f122332e == dfVar.mo50802e() && this.f122331d.equals(dfVar.mo50800c());
        }
    }

    public final int hashCode() {
        int hashCode = this.f122328a.hashCode();
        int hashCode2 = this.f122329b.hashCode();
        long j = this.f122330c;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f122332e) * 1000003) ^ this.f122331d.hashCode();
    }

    public final String toString() {
        String obj = this.f122328a.toString();
        String obj2 = this.f122329b.toString();
        long j = this.f122330c;
        int i = this.f122332e;
        String str = i != 1 ? i != 2 ? "SUBSCRIBE" : "FORCE_REFRESH" : "UNDEFINED";
        String obj3 = this.f122331d.toString();
        return "SubscribeCallState{dataSource=" + obj + ", tolerance=" + obj2 + ", index=" + j + ", subscribeCallType=" + str + ", subscribeSequenceState=" + obj3 + "}";
    }
}
