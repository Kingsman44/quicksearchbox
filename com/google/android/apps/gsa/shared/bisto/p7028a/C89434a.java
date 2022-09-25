package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.p10712d.C142324bc;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.a */
/* compiled from: PG */
final class C89434a extends C89480bs {

    /* renamed from: a */
    private final String f242432a;

    /* renamed from: b */
    private final String f242433b;

    /* renamed from: c */
    private final long f242434c;

    /* renamed from: d */
    private final C142324bc f242435d;

    public C89434a(String str, String str2, long j, C142324bc bcVar) {
        if (str != null) {
            this.f242432a = str;
            if (str2 != null) {
                this.f242433b = str2;
                this.f242434c = j;
                if (bcVar != null) {
                    this.f242435d = bcVar;
                    return;
                }
                throw new NullPointerException("Null info");
            }
            throw new NullPointerException("Null locale");
        }
        throw new NullPointerException("Null modelId");
    }

    /* renamed from: a */
    public final long mo83345a() {
        return this.f242434c;
    }

    /* renamed from: b */
    public final C142324bc mo83346b() {
        return this.f242435d;
    }

    /* renamed from: c */
    public final String mo83347c() {
        return this.f242433b;
    }

    /* renamed from: d */
    public final String mo83348d() {
        return this.f242432a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89480bs) {
            C89480bs bsVar = (C89480bs) obj;
            return this.f242432a.equals(bsVar.mo83348d()) && this.f242433b.equals(bsVar.mo83347c()) && this.f242434c == bsVar.mo83345a() && this.f242435d.equals(bsVar.mo83346b());
        }
    }

    public final int hashCode() {
        int hashCode = this.f242432a.hashCode();
        int hashCode2 = this.f242433b.hashCode();
        long j = this.f242434c;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f242435d.hashCode();
    }
}
