package com.google.android.libraries.web.lifecycle.p3427c;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.lifecycle.c.d */
/* compiled from: PG */
public final class C43886d implements C43888f {

    /* renamed from: a */
    public final Object f114338a;

    public C43886d(Object obj) {
        C69664n.m101061g(obj, "value");
        this.f114338a = obj;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo46880a() {
        return C43883a.m77457a(this);
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo46881b() {
        return C43883a.m77458b(this);
    }

    /* renamed from: c */
    public final /* synthetic */ boolean mo46882c() {
        return C43883a.m77459c(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C43886d) && C69664n.m101066l(this.f114338a, ((C43886d) obj).f114338a);
    }

    public final int hashCode() {
        return this.f114338a.hashCode();
    }

    public final String toString() {
        Object obj = this.f114338a;
        return "WithValue(value=" + obj + ")";
    }
}
