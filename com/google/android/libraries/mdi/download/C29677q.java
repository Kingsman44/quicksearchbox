package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.mdi.download.q */
/* compiled from: PG */
final class C29677q extends C29650hu {

    /* renamed from: a */
    private final String f80360a;

    /* renamed from: b */
    private final C58833ax f80361b;

    /* renamed from: c */
    private final C58833ax f80362c;

    public C29677q(String str, C58833ax axVar, C58833ax axVar2) {
        this.f80360a = str;
        this.f80361b = axVar;
        this.f80362c = axVar2;
    }

    /* renamed from: a */
    public final C58833ax mo34786a() {
        return this.f80361b;
    }

    /* renamed from: b */
    public final C58833ax mo34787b() {
        return this.f80362c;
    }

    /* renamed from: c */
    public final String mo34788c() {
        return this.f80360a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29650hu) {
            C29650hu huVar = (C29650hu) obj;
            return this.f80360a.equals(huVar.mo34788c()) && this.f80361b.equals(huVar.mo34786a()) && this.f80362c.equals(huVar.mo34787b());
        }
    }

    public final int hashCode() {
        return ((((this.f80360a.hashCode() ^ 1000003) * 1000003) ^ this.f80361b.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String str = this.f80360a;
        String valueOf = String.valueOf(this.f80361b);
        return "ReadDataFileGroupRequest{groupName=" + str + ", accountOptional=" + valueOf + ", variantIdOptional=Optional.absent()}";
    }
}
