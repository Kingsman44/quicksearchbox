package com.google.android.apps.search.podcasts.p10601r.p10608f;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.r.f.c */
/* compiled from: PG */
public final class C140982c {

    /* renamed from: a */
    public final int f382763a;

    /* renamed from: b */
    public final String f382764b;

    public C140982c(int i, String str) {
        this.f382763a = i;
        this.f382764b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140982c)) {
            return false;
        }
        C140982c cVar = (C140982c) obj;
        return this.f382763a == cVar.f382763a && C69664n.m101066l(this.f382764b, cVar.f382764b);
    }

    public final int hashCode() {
        int i = this.f382763a * 31;
        String str = this.f382764b;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.f382763a;
        String str = this.f382764b;
        return "ShowItemVe(showItemVeId=" + i + ", collectionId=" + str + ")";
    }
}
