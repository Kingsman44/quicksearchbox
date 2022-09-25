package com.google.android.apps.search.googleapp.p10257g;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.ad */
/* compiled from: PG */
public final class C135413ad {

    /* renamed from: a */
    public final String f368926a;

    /* renamed from: b */
    public final String f368927b;

    /* renamed from: c */
    public final int f368928c;

    public C135413ad(String str, String str2, int i) {
        C69664n.m101061g(str, "subject");
        C69664n.m101061g(str2, "text");
        this.f368926a = str;
        this.f368927b = str2;
        this.f368928c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135413ad)) {
            return false;
        }
        C135413ad adVar = (C135413ad) obj;
        return C69664n.m101066l(this.f368926a, adVar.f368926a) && C69664n.m101066l(this.f368927b, adVar.f368927b) && this.f368928c == adVar.f368928c;
    }

    public final int hashCode() {
        return (((this.f368926a.hashCode() * 31) + this.f368927b.hashCode()) * 31) + this.f368928c;
    }

    public final String toString() {
        String str = this.f368926a;
        String str2 = this.f368927b;
        int i = this.f368928c;
        return "ShareButtonState(subject=" + str + ", text=" + str2 + ", overlayColor=" + i + ")";
    }
}
