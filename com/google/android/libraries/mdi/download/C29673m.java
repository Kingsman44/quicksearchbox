package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.mdi.download.m */
/* compiled from: PG */
final class C29673m extends C28807cv {

    /* renamed from: a */
    private final boolean f80335a;

    /* renamed from: b */
    private final boolean f80336b;

    /* renamed from: c */
    private final C58833ax f80337c;

    /* renamed from: d */
    private final C58833ax f80338d;

    /* renamed from: e */
    private final C58833ax f80339e;

    /* renamed from: f */
    private final boolean f80340f;

    /* renamed from: g */
    private final boolean f80341g;

    public C29673m(boolean z, boolean z2, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, boolean z3, boolean z4) {
        this.f80335a = z;
        this.f80336b = z2;
        this.f80337c = axVar;
        this.f80338d = axVar2;
        this.f80339e = axVar3;
        this.f80340f = z3;
        this.f80341g = z4;
    }

    /* renamed from: a */
    public final C58833ax mo34463a() {
        return this.f80338d;
    }

    /* renamed from: b */
    public final C58833ax mo34464b() {
        return this.f80337c;
    }

    /* renamed from: c */
    public final C58833ax mo34465c() {
        return this.f80339e;
    }

    /* renamed from: d */
    public final boolean mo34466d() {
        return this.f80336b;
    }

    /* renamed from: e */
    public final boolean mo34467e() {
        return this.f80335a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28807cv) {
            C28807cv cvVar = (C28807cv) obj;
            return this.f80335a == cvVar.mo34467e() && this.f80336b == cvVar.mo34466d() && this.f80337c.equals(cvVar.mo34464b()) && this.f80338d.equals(cvVar.mo34463a()) && this.f80339e.equals(cvVar.mo34465c()) && this.f80340f == cvVar.mo34468f() && this.f80341g == cvVar.mo34469g();
        }
    }

    /* renamed from: f */
    public final boolean mo34468f() {
        return this.f80340f;
    }

    /* renamed from: g */
    public final boolean mo34469g() {
        return this.f80341g;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((((((((true != this.f80335a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f80336b ? 1237 : 1231)) * 1000003) ^ this.f80337c.hashCode()) * 1000003) ^ this.f80338d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.f80340f ? 1237 : 1231)) * 1000003;
        if (true == this.f80341g) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        boolean z = this.f80335a;
        boolean z2 = this.f80336b;
        String valueOf = String.valueOf(this.f80337c);
        String valueOf2 = String.valueOf(this.f80338d);
        boolean z3 = this.f80340f;
        boolean z4 = this.f80341g;
        return "GetFileGroupsByFilterRequest{includeAllGroups=" + z + ", groupWithNoAccountOnly=" + z2 + ", groupNameOptional=" + valueOf + ", accountOptional=" + valueOf2 + ", sourceOptional=Optional.absent(), preserveZipDirectories=" + z3 + ", verifyIsolatedStructure=" + z4 + "}";
    }
}
