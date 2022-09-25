package com.google.android.apps.search.googleapp.search.srp.p10436f;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.f.a */
/* compiled from: PG */
public final class C137837a implements C47388b {

    /* renamed from: a */
    public final String f375016a;

    /* renamed from: b */
    public final String f375017b;

    public C137837a(String str, String str2) {
        C69664n.m101061g(str, "query");
        C69664n.m101061g(str2, "corpusType");
        this.f375016a = str;
        this.f375017b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C137837a)) {
            return false;
        }
        C137837a aVar = (C137837a) obj;
        return C69664n.m101066l(this.f375016a, aVar.f375016a) && C69664n.m101066l(this.f375017b, aVar.f375017b);
    }

    public final int hashCode() {
        return (this.f375016a.hashCode() * 31) + this.f375017b.hashCode();
    }

    public final String toString() {
        String str = this.f375016a;
        String str2 = this.f375017b;
        return "SrpSearchBoxClickEvent(query=" + str + ", corpusType=" + str2 + ")";
    }
}
