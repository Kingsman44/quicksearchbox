package com.google.android.apps.search.googleapp.search.voicesearch.p10472d;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.d.c */
/* compiled from: PG */
public final class C138792c implements C47388b {

    /* renamed from: a */
    public final String f377545a;

    public C138792c(String str) {
        C69664n.m101061g(str, "query");
        this.f377545a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C138792c) && C69664n.m101066l(this.f377545a, ((C138792c) obj).f377545a);
    }

    public final int hashCode() {
        return this.f377545a.hashCode();
    }

    public final String toString() {
        String str = this.f377545a;
        return "SbtSearchBoxClickEvent(query=" + str + ")";
    }
}
