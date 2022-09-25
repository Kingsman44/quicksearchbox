package com.google.common.p4535g;

import com.google.common.base.C58832aw;
import com.google.common.p4575r.C60763t;

/* renamed from: com.google.common.g.bg */
/* compiled from: PG */
public final class C59141bg implements Comparable, C59125ar {

    /* renamed from: a */
    public final C59136bb f157172a;

    /* renamed from: b */
    private final long f157173b;

    /* renamed from: c */
    private final Object f157174c = null;

    public C59141bg(C59226t tVar, C59136bb bbVar) {
        this.f157173b = tVar.f157334b;
        this.f157172a = bbVar;
    }

    /* renamed from: a */
    public final long mo56438a() {
        return this.f157173b;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C60763t.m92764a(this.f157173b, ((C59141bg) obj).f157173b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59141bg) {
            C59141bg bgVar = (C59141bg) obj;
            if (this.f157172a.mo56506q(bgVar.f157172a)) {
                Object obj2 = bgVar.f157174c;
                if (C58832aw.m90831a((Object) null, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f157172a.hashCode() * 31;
    }

    public final String toString() {
        return new C59127at(this.f157172a) + ": null";
    }
}
