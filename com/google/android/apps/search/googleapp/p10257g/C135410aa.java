package com.google.android.apps.search.googleapp.p10257g;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.aa */
/* compiled from: PG */
public final class C135410aa extends C135412ac {

    /* renamed from: a */
    public final String f368923a;

    /* renamed from: b */
    public final String f368924b;

    public C135410aa(String str, String str2) {
        C69664n.m101061g(str, "targetUrl");
        C69664n.m101061g(str2, "searchUrl");
        this.f368923a = str;
        this.f368924b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135410aa)) {
            return false;
        }
        C135410aa aaVar = (C135410aa) obj;
        return C69664n.m101066l(this.f368923a, aaVar.f368923a) && C69664n.m101066l(this.f368924b, aaVar.f368924b);
    }

    public final int hashCode() {
        return (this.f368923a.hashCode() * 31) + this.f368924b.hashCode();
    }

    public final String toString() {
        String str = this.f368923a;
        String str2 = this.f368924b;
        return "Search(targetUrl=" + str + ", searchUrl=" + str2 + ")";
    }
}
