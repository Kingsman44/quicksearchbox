package com.google.android.apps.search.googleapp.search.p10410f;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.f.t */
/* compiled from: PG */
public final class C137444t {

    /* renamed from: a */
    public final String f373831a;

    /* renamed from: b */
    public final String f373832b;

    /* renamed from: c */
    public final boolean f373833c;

    public C137444t(String str, String str2, boolean z) {
        C69664n.m101061g(str, "key");
        C69664n.m101061g(str2, "value");
        this.f373831a = str;
        this.f373832b = str2;
        this.f373833c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C137444t)) {
            return false;
        }
        C137444t tVar = (C137444t) obj;
        return C69664n.m101066l(this.f373831a, tVar.f373831a) && C69664n.m101066l(this.f373832b, tVar.f373832b) && this.f373833c == tVar.f373833c;
    }

    public final int hashCode() {
        return (((this.f373831a.hashCode() * 31) + this.f373832b.hashCode()) * 31) + (this.f373833c ? 1 : 0);
    }

    public final String toString() {
        String str = this.f373831a;
        String str2 = this.f373832b;
        boolean z = this.f373833c;
        return "ProductSpecificData(key=" + str + ", value=" + str2 + ", containsPii=" + z + ")";
    }
}
