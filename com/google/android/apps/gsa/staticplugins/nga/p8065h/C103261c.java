package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.gms.appdatasearch.QuerySpecification;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.c */
/* compiled from: PG */
final class C103261c extends C103211ad {

    /* renamed from: a */
    private final String f288035a;

    /* renamed from: b */
    private final String f288036b;

    /* renamed from: c */
    private final QuerySpecification f288037c;

    /* renamed from: d */
    private final String f288038d;

    public C103261c(String str, String str2, QuerySpecification querySpecification, String str3) {
        this.f288035a = str;
        this.f288036b = str2;
        this.f288037c = querySpecification;
        this.f288038d = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final QuerySpecification mo93711a() {
        return this.f288037c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo93712b() {
        return this.f288036b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo93713c() {
        return this.f288035a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo93714d() {
        return this.f288038d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C103211ad) {
            C103211ad adVar = (C103211ad) obj;
            return this.f288035a.equals(adVar.mo93713c()) && this.f288036b.equals(adVar.mo93712b()) && this.f288037c.equals(adVar.mo93711a()) && this.f288038d.equals(adVar.mo93714d());
        }
    }

    public final int hashCode() {
        return ((((((this.f288035a.hashCode() ^ 1000003) * 1000003) ^ this.f288036b.hashCode()) * 1000003) ^ this.f288037c.hashCode()) * 1000003) ^ this.f288038d.hashCode();
    }

    public final String toString() {
        String str = this.f288035a;
        String str2 = this.f288036b;
        String valueOf = String.valueOf(this.f288037c);
        String str3 = this.f288038d;
        return "IcingCallerQuery{packageName=" + str + ", corpus=" + str2 + ", querySpec=" + valueOf + ", query=" + str3 + "}";
    }
}
