package com.google.android.apps.search.googleapp.p10338l.p10339a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.l.a.p */
/* compiled from: PG */
public final class C136397p extends C136399r {

    /* renamed from: b */
    private final String f371339b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136397p(String str) {
        super(str);
        C69664n.m101061g(str, "psbdKey");
        this.f371339b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C136397p) && C69664n.m101066l(this.f371339b, ((C136397p) obj).f371339b);
    }

    public final int hashCode() {
        return this.f371339b.hashCode();
    }

    public final String toString() {
        String str = this.f371339b;
        return "Complex(psbdKey=" + str + ")";
    }
}
