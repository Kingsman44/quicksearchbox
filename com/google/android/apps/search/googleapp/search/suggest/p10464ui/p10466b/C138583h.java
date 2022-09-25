package com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.b.h */
/* compiled from: PG */
public final class C138583h implements C47388b {

    /* renamed from: a */
    public final String f376914a;

    public C138583h(String str) {
        this.f376914a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C138583h) && C69664n.m101066l(this.f376914a, ((C138583h) obj).f376914a);
    }

    public final int hashCode() {
        return this.f376914a.hashCode();
    }

    public final String toString() {
        String str = this.f376914a;
        return "QueryBuildEvent(query=" + str + ")";
    }
}
