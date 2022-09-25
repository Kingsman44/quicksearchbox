package com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j;

import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.j.c */
/* compiled from: PG */
final class C40443c extends C40450j {

    /* renamed from: a */
    private final Optional f106158a;

    /* renamed from: b */
    private final C63088z f106159b;

    /* renamed from: c */
    private final boolean f106160c;

    /* renamed from: d */
    private final int f106161d;

    /* renamed from: e */
    private final Optional f106162e;

    /* renamed from: f */
    private final Optional f106163f;

    public C40443c(Optional optional, C63088z zVar, boolean z, int i, Optional optional2, Optional optional3) {
        this.f106158a = optional;
        this.f106159b = zVar;
        this.f106160c = z;
        this.f106161d = i;
        this.f106162e = optional2;
        this.f106163f = optional3;
    }

    /* renamed from: a */
    public final int mo42442a() {
        return this.f106161d;
    }

    /* renamed from: b */
    public final C63088z mo42443b() {
        return this.f106159b;
    }

    /* renamed from: c */
    public final Optional mo42444c() {
        return this.f106158a;
    }

    /* renamed from: d */
    public final Optional mo42445d() {
        return this.f106162e;
    }

    /* renamed from: e */
    public final Optional mo42446e() {
        return this.f106163f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C40450j) {
            C40450j jVar = (C40450j) obj;
            return this.f106158a.equals(jVar.mo42444c()) && this.f106159b.equals(jVar.mo42443b()) && this.f106160c == jVar.mo42448f() && this.f106161d == jVar.mo42442a() && this.f106162e.equals(jVar.mo42445d()) && this.f106163f.equals(jVar.mo42446e());
        }
    }

    /* renamed from: f */
    public final boolean mo42448f() {
        return this.f106160c;
    }

    public final int hashCode() {
        return ((((((((((this.f106158a.hashCode() ^ 1000003) * 1000003) ^ this.f106159b.hashCode()) * 1000003) ^ (true != this.f106160c ? 1237 : 1231)) * 1000003) ^ this.f106161d) * 1000003) ^ this.f106162e.hashCode()) * 1000003) ^ this.f106163f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f106158a);
        String obj = this.f106159b.toString();
        boolean z = this.f106160c;
        int i = this.f106161d;
        String valueOf2 = String.valueOf(this.f106162e);
        String valueOf3 = String.valueOf(this.f106163f);
        return "Response{encoding=" + valueOf + ", rawData=" + obj + ", success=" + z + ", status=" + i + ", headers=" + valueOf2 + ", redirectLocation=" + valueOf3 + "}";
    }
}
