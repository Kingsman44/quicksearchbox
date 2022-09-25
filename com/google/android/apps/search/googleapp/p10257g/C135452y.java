package com.google.android.apps.search.googleapp.p10257g;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.y */
/* compiled from: PG */
public final class C135452y extends C135412ac {

    /* renamed from: a */
    public final String f369017a;

    public C135452y(String str) {
        C69664n.m101061g(str, "targetUrl");
        this.f369017a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C135452y) && C69664n.m101066l(this.f369017a, ((C135452y) obj).f369017a);
    }

    public final int hashCode() {
        return this.f369017a.hashCode();
    }

    public final String toString() {
        String str = this.f369017a;
        return "ExternalUrl(targetUrl=" + str + ")";
    }
}
