package com.google.android.apps.search.googleapp.p10257g;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.ab */
/* compiled from: PG */
public final class C135411ab extends C135412ac {

    /* renamed from: a */
    public final String f368925a;

    public C135411ab(String str) {
        C69664n.m101061g(str, "targetUrl");
        this.f368925a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C135411ab) && C69664n.m101066l(this.f368925a, ((C135411ab) obj).f368925a);
    }

    public final int hashCode() {
        return this.f368925a.hashCode();
    }

    public final String toString() {
        String str = this.f368925a;
        return "Video(targetUrl=" + str + ")";
    }
}
