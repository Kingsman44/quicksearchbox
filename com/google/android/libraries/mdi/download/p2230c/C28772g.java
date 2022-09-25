package com.google.android.libraries.mdi.download.p2230c;

import android.net.Uri;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.mdi.download.c.g */
/* compiled from: PG */
final class C28772g extends C28781p {

    /* renamed from: a */
    private final Uri f78221a;

    /* renamed from: b */
    private final String f78222b;

    /* renamed from: c */
    private final C28779n f78223c;

    /* renamed from: d */
    private final int f78224d;

    /* renamed from: e */
    private final C58485gu f78225e;

    /* renamed from: f */
    private final C58833ax f78226f;

    public C28772g(Uri uri, String str, C28779n nVar, int i, C58485gu guVar, C58833ax axVar) {
        this.f78221a = uri;
        this.f78222b = str;
        this.f78223c = nVar;
        this.f78224d = i;
        this.f78225e = guVar;
        this.f78226f = axVar;
    }

    /* renamed from: a */
    public final int mo34396a() {
        return this.f78224d;
    }

    /* renamed from: b */
    public final Uri mo34397b() {
        return this.f78221a;
    }

    /* renamed from: c */
    public final C28779n mo34398c() {
        return this.f78223c;
    }

    /* renamed from: d */
    public final C58833ax mo34399d() {
        return this.f78226f;
    }

    /* renamed from: e */
    public final C58485gu mo34400e() {
        return this.f78225e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28781p) {
            C28781p pVar = (C28781p) obj;
            return this.f78221a.equals(pVar.mo34397b()) && this.f78222b.equals(pVar.mo34402f()) && this.f78223c.equals(pVar.mo34398c()) && this.f78224d == pVar.mo34396a() && C58597ky.m90218i(this.f78225e, pVar.mo34400e()) && this.f78226f.equals(pVar.mo34399d());
        }
    }

    /* renamed from: f */
    public final String mo34402f() {
        return this.f78222b;
    }

    public final int hashCode() {
        return ((((((((((this.f78221a.hashCode() ^ 1000003) * 1000003) ^ this.f78222b.hashCode()) * 1000003) ^ this.f78223c.hashCode()) * 1000003) ^ this.f78224d) * 1000003) ^ this.f78225e.hashCode()) * 1000003) ^ this.f78226f.hashCode();
    }

    public final String toString() {
        String obj = this.f78221a.toString();
        String str = this.f78222b;
        String obj2 = this.f78223c.toString();
        int i = this.f78224d;
        String obj3 = this.f78225e.toString();
        String valueOf = String.valueOf(this.f78226f);
        return "DownloadRequest{fileUri=" + obj + ", urlToDownload=" + str + ", downloadConstraints=" + obj2 + ", trafficTag=" + i + ", extraHttpHeaders=" + obj3 + ", inlineDownloadParamsOptional=" + valueOf + "}";
    }
}
