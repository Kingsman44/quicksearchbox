package com.google.android.p3545q.p3547b;

import android.graphics.Typeface;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.q.b.g */
/* compiled from: PG */
public final class C45214g {

    /* renamed from: a */
    public final C45212e f117987a;

    /* renamed from: b */
    public final Typeface f117988b;

    public C45214g(C45212e eVar, Typeface typeface) {
        C69664n.m101061g(eVar, "origin");
        this.f117987a = eVar;
        this.f117988b = typeface;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45214g)) {
            return false;
        }
        C45214g gVar = (C45214g) obj;
        return this.f117987a == gVar.f117987a && C69664n.m101066l(this.f117988b, gVar.f117988b);
    }

    public final int hashCode() {
        return (this.f117987a.hashCode() * 31) + this.f117988b.hashCode();
    }

    public final String toString() {
        C45212e eVar = this.f117987a;
        Typeface typeface = this.f117988b;
        return "TypefaceResponse(origin=" + eVar + ", typeface=" + typeface + ")";
    }
}
