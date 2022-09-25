package com.google.android.apps.search.googleapp.discover.p10249z.p10252c;

import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.c.h */
/* compiled from: PG */
public final class C135345h {

    /* renamed from: a */
    public final String f368761a;

    /* renamed from: b */
    public final C57696b f368762b;

    public C135345h(String str, C57696b bVar) {
        C69664n.m101061g(str, "contentId");
        C69664n.m101061g(bVar, "clientLoggingProperties");
        this.f368761a = str;
        this.f368762b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135345h)) {
            return false;
        }
        C135345h hVar = (C135345h) obj;
        return C69664n.m101066l(this.f368761a, hVar.f368761a) && C69664n.m101066l(this.f368762b, hVar.f368762b);
    }

    public final int hashCode() {
        return (this.f368761a.hashCode() * 31) + this.f368762b.hashCode();
    }

    public final String toString() {
        String str = this.f368761a;
        C57696b bVar = this.f368762b;
        return "ContentToShow(contentId=" + str + ", clientLoggingProperties=" + bVar + ")";
    }
}
