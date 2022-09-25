package com.google.android.libraries.search.rendering.xuikit.p3097a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c */
/* compiled from: PG */
public final class C40018c extends C40084x {

    /* renamed from: a */
    private final C60870cx f105172a;

    /* renamed from: b */
    private final String f105173b;

    public C40018c(C60870cx cxVar, String str) {
        this.f105172a = cxVar;
        this.f105173b = str;
    }

    /* renamed from: a */
    public final C60870cx mo42118a() {
        return this.f105172a;
    }

    /* renamed from: b */
    public final String mo42119b() {
        return this.f105173b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C40084x) {
            C40084x xVar = (C40084x) obj;
            return this.f105172a.equals(xVar.mo42118a()) && this.f105173b.equals(xVar.mo42119b());
        }
    }

    public final int hashCode() {
        return ((this.f105172a.hashCode() ^ 1000003) * 1000003) ^ this.f105173b.hashCode();
    }

    public final String toString() {
        String obj = this.f105172a.toString();
        String str = this.f105173b;
        return "ResourceContents{typefaceFuture=" + obj + ", fontName=" + str + "}";
    }
}
