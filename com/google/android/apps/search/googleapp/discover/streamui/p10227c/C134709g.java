package com.google.android.apps.search.googleapp.discover.streamui.p10227c;

import com.google.android.apps.search.googleapp.discover.p10181d.C134228q;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.c.g */
/* compiled from: PG */
public final class C134709g implements C47388b {

    /* renamed from: a */
    public final C134228q f366828a;

    public C134709g(C134228q qVar) {
        C69664n.m101061g(qVar, "reason");
        this.f366828a = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C134709g) && this.f366828a == ((C134709g) obj).f366828a;
    }

    public final int hashCode() {
        return this.f366828a.hashCode();
    }

    public final String toString() {
        C134228q qVar = this.f366828a;
        return "RefreshEvent(reason=" + qVar + ")";
    }
}
