package com.google.android.apps.search.googleapp.discover.streamui.p10229e;

import com.google.android.apps.search.googleapp.discover.p10181d.C134221j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.e.l */
/* compiled from: PG */
public final class C134732l extends C134736p {

    /* renamed from: a */
    private final C134221j f366886a;

    public C134732l(C134221j jVar) {
        C69664n.m101061g(jVar, "result");
        this.f366886a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C134732l) && this.f366886a == ((C134732l) obj).f366886a;
    }

    public final int hashCode() {
        return this.f366886a.hashCode();
    }

    public final String toString() {
        String name = this.f366886a.name();
        return "Finished(result=" + name + ")";
    }
}
