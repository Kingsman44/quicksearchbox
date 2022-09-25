package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.mdi.download.k */
/* compiled from: PG */
final class C29665k extends C28805ct {

    /* renamed from: a */
    private final String f80319a;

    /* renamed from: b */
    private final C58833ax f80320b;

    /* renamed from: c */
    private final C58833ax f80321c;

    /* renamed from: d */
    private final boolean f80322d;

    /* renamed from: e */
    private final boolean f80323e;

    public C29665k(String str, C58833ax axVar, C58833ax axVar2, boolean z, boolean z2) {
        this.f80319a = str;
        this.f80320b = axVar;
        this.f80321c = axVar2;
        this.f80322d = z;
        this.f80323e = z2;
    }

    /* renamed from: a */
    public final C58833ax mo34452a() {
        return this.f80320b;
    }

    /* renamed from: b */
    public final C58833ax mo34453b() {
        return this.f80321c;
    }

    /* renamed from: c */
    public final String mo34454c() {
        return this.f80319a;
    }

    /* renamed from: d */
    public final boolean mo34455d() {
        return this.f80322d;
    }

    /* renamed from: e */
    public final boolean mo34456e() {
        return this.f80323e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28805ct) {
            C28805ct ctVar = (C28805ct) obj;
            return this.f80319a.equals(ctVar.mo34454c()) && this.f80320b.equals(ctVar.mo34452a()) && this.f80321c.equals(ctVar.mo34453b()) && this.f80322d == ctVar.mo34455d() && this.f80323e == ctVar.mo34456e();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.f80319a.hashCode() ^ 1000003) * 1000003) ^ this.f80320b.hashCode()) * 1000003) ^ this.f80321c.hashCode()) * 1000003) ^ (true != this.f80322d ? 1237 : 1231)) * 1000003;
        if (true == this.f80323e) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f80319a;
        String valueOf = String.valueOf(this.f80320b);
        String valueOf2 = String.valueOf(this.f80321c);
        boolean z = this.f80322d;
        boolean z2 = this.f80323e;
        return "GetFileGroupRequest{groupName=" + str + ", accountOptional=" + valueOf + ", variantIdOptional=" + valueOf2 + ", preserveZipDirectories=" + z + ", verifyIsolatedStructure=" + z2 + "}";
    }
}
