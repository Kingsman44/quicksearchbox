package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.mdi.download.o */
/* compiled from: PG */
final class C29675o extends C28809cx {

    /* renamed from: a */
    private final String f80350a;

    /* renamed from: b */
    private final long f80351b;

    /* renamed from: c */
    private final String f80352c;

    /* renamed from: d */
    private final C58833ax f80353d;

    /* renamed from: e */
    private final C58485gu f80354e;

    /* renamed from: f */
    private final C58495hd f80355f;

    /* renamed from: g */
    private final C58833ax f80356g;

    public C29675o(String str, long j, String str2, C58833ax axVar, C58485gu guVar, C58495hd hdVar, C58833ax axVar2) {
        this.f80350a = str;
        this.f80351b = j;
        this.f80352c = str2;
        this.f80353d = axVar;
        this.f80354e = guVar;
        this.f80355f = hdVar;
        this.f80356g = axVar2;
    }

    /* renamed from: a */
    public final long mo34476a() {
        return this.f80351b;
    }

    /* renamed from: b */
    public final C58833ax mo34477b() {
        return this.f80356g;
    }

    /* renamed from: c */
    public final C58833ax mo34478c() {
        return this.f80353d;
    }

    /* renamed from: d */
    public final C58485gu mo34479d() {
        return this.f80354e;
    }

    /* renamed from: e */
    public final C58495hd mo34480e() {
        return this.f80355f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28809cx) {
            C28809cx cxVar = (C28809cx) obj;
            return this.f80350a.equals(cxVar.mo34481f()) && this.f80351b == cxVar.mo34476a() && this.f80352c.equals(cxVar.mo34482g()) && this.f80353d.equals(cxVar.mo34478c()) && C58597ky.m90218i(this.f80354e, cxVar.mo34479d()) && this.f80355f.equals(cxVar.mo34480e()) && this.f80356g.equals(cxVar.mo34477b());
        }
    }

    /* renamed from: f */
    public final String mo34481f() {
        return this.f80350a;
    }

    /* renamed from: g */
    public final String mo34482g() {
        return this.f80352c;
    }

    public final int hashCode() {
        int hashCode = this.f80350a.hashCode();
        long j = this.f80351b;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f80352c.hashCode()) * 1000003) ^ this.f80353d.hashCode()) * 1000003) ^ this.f80354e.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f80355f.entrySet())) * 1000003) ^ this.f80356g.hashCode();
    }

    public final String toString() {
        String str = this.f80350a;
        long j = this.f80351b;
        String str2 = this.f80352c;
        String valueOf = String.valueOf(this.f80353d);
        String obj = this.f80354e.toString();
        String obj2 = this.f80355f.toString();
        String valueOf2 = String.valueOf(this.f80356g);
        return "ImportFilesRequest{groupName=" + str + ", buildId=" + j + ", variantId=" + str2 + ", customPropertyOptional=" + valueOf + ", updatedDataFileList=" + obj + ", inlineFileMap=" + obj2 + ", accountOptional=" + valueOf2 + "}";
    }
}
