package com.google.android.apps.search.googleapp.discover.streamui.p10229e;

import com.google.android.apps.search.googleapp.discover.p10181d.C134220i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.e.h */
/* compiled from: PG */
public final class C134728h extends C134731k {

    /* renamed from: a */
    private final C134220i f366883a;

    public C134728h(C134220i iVar) {
        C69664n.m101061g(iVar, "result");
        this.f366883a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C134728h) && this.f366883a == ((C134728h) obj).f366883a;
    }

    public final int hashCode() {
        return this.f366883a.hashCode();
    }

    public final String toString() {
        String name = this.f366883a.name();
        return "Finished(result=" + name + ")";
    }
}
