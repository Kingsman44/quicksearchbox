package com.google.apps.tiktok.p3663j;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.j.a */
/* compiled from: PG */
final class C47278a extends C47347e {

    /* renamed from: a */
    private final long f122927a;

    /* renamed from: b */
    private final long f122928b;

    /* renamed from: c */
    private final Map f122929c;

    public C47278a(long j, long j2, Map map) {
        this.f122927a = j;
        this.f122928b = j2;
        this.f122929c = map;
    }

    /* renamed from: a */
    public final long mo51156a() {
        return this.f122927a;
    }

    /* renamed from: b */
    public final long mo51157b() {
        return this.f122928b;
    }

    /* renamed from: c */
    public final Map mo51158c() {
        return this.f122929c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C47347e) {
            C47347e eVar = (C47347e) obj;
            return this.f122927a == eVar.mo51156a() && this.f122928b == eVar.mo51157b() && C58662ni.m90356o(this.f122929c, eVar.mo51158c());
        }
    }

    public final int hashCode() {
        long j = this.f122927a;
        long j2 = this.f122928b;
        return C58758qx.m90643a(((C58495hd) this.f122929c).entrySet()) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.f122927a;
        long j2 = this.f122928b;
        String i = C58662ni.m90350i(this.f122929c);
        return "SyncConfig{minSyncInterval=" + j + ", timeout=" + j2 + ", constraints=" + i + "}";
    }
}
