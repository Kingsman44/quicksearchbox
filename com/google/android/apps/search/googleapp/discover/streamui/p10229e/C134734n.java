package com.google.android.apps.search.googleapp.discover.streamui.p10229e;

import com.google.android.apps.search.googleapp.discover.p10181d.C134221j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.e.n */
/* compiled from: PG */
public final class C134734n extends C134736p {

    /* renamed from: a */
    public final C134221j f366888a;

    public C134734n(C134221j jVar) {
        C69664n.m101061g(jVar, "result");
        this.f366888a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C134734n) && this.f366888a == ((C134734n) obj).f366888a;
    }

    public final int hashCode() {
        return this.f366888a.hashCode();
    }

    public final String toString() {
        String name = this.f366888a.name();
        return "PreRendered(result=" + name + ")";
    }
}
