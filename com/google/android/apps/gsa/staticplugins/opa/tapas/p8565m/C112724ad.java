package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.ad */
/* compiled from: PG */
final class C112724ad extends C112892gj {

    /* renamed from: a */
    public final C112889gg f312477a;

    /* renamed from: b */
    public final String f312478b;

    /* renamed from: c */
    public final int f312479c;

    /* renamed from: d */
    public final String f312480d;

    /* renamed from: e */
    public final int f312481e;

    /* renamed from: f */
    public final int f312482f;

    public C112724ad(C112889gg ggVar, String str, int i, String str2, int i2, int i3) {
        if (ggVar != null) {
            this.f312477a = ggVar;
            if (str != null) {
                this.f312478b = str;
                this.f312479c = i;
                if (str2 != null) {
                    this.f312480d = str2;
                    this.f312481e = i2;
                    this.f312482f = i3;
                    return;
                }
                throw new NullPointerException("Null intentName");
            }
            throw new NullPointerException("Null sliceUri");
        }
        throw new NullPointerException("Null sliceItemViewHolder");
    }

    /* renamed from: a */
    public final int mo99692a() {
        return this.f312482f;
    }

    /* renamed from: b */
    public final int mo99693b() {
        return this.f312479c;
    }

    /* renamed from: c */
    public final int mo99694c() {
        return this.f312481e;
    }

    /* renamed from: d */
    public final C112889gg mo99695d() {
        return this.f312477a;
    }

    /* renamed from: e */
    public final String mo99696e() {
        return this.f312480d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C112892gj) {
            C112892gj gjVar = (C112892gj) obj;
            return this.f312477a.equals(gjVar.mo99695d()) && this.f312478b.equals(gjVar.mo99698f()) && this.f312479c == gjVar.mo99693b() && this.f312480d.equals(gjVar.mo99696e()) && this.f312481e == gjVar.mo99694c() && this.f312482f == gjVar.mo99692a();
        }
    }

    /* renamed from: f */
    public final String mo99698f() {
        return this.f312478b;
    }

    public final int hashCode() {
        return ((((((((((this.f312477a.hashCode() ^ 1000003) * 1000003) ^ this.f312478b.hashCode()) * 1000003) ^ this.f312479c) * 1000003) ^ this.f312480d.hashCode()) * 1000003) ^ this.f312481e) * 1000003) ^ this.f312482f;
    }

    public final String toString() {
        String obj = this.f312477a.toString();
        String str = this.f312478b;
        int i = this.f312479c;
        String str2 = this.f312480d;
        int i2 = this.f312481e;
        int i3 = this.f312482f;
        return "SliceRendererParams{sliceItemViewHolder=" + obj + ", sliceUri=" + str + ", sliceViewMode=" + i + ", intentName=" + str2 + ", veId=" + i2 + ", assistantFeatureVeId=" + i3 + "}";
    }
}
