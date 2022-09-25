package com.google.android.apps.search.googleapp.p10338l.p10339a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.l.a.q */
/* compiled from: PG */
public final class C136398q extends C136399r {

    /* renamed from: b */
    private final String f371340b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136398q(String str) {
        super(str);
        C69664n.m101061g(str, "psdKey");
        this.f371340b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C136398q) && C69664n.m101066l(this.f371340b, ((C136398q) obj).f371340b);
    }

    public final int hashCode() {
        return this.f371340b.hashCode();
    }

    public final String toString() {
        String str = this.f371340b;
        return "KeyValue(psdKey=" + str + ")";
    }
}
