package com.google.common.p4535g;

import java.io.Serializable;

/* renamed from: com.google.common.g.ac */
/* compiled from: PG */
public final class C59110ac implements Serializable, C59173cl {

    /* renamed from: a */
    public final C59136bb f157094a;

    /* renamed from: b */
    public final C59136bb f157095b;

    public C59110ac(C59136bb bbVar, C59136bb bbVar2) {
        this.f157094a = bbVar;
        this.f157095b = bbVar2;
    }

    /* renamed from: a */
    public final int mo56419a() {
        throw null;
    }

    /* renamed from: b */
    public final int mo56420b() {
        return 1;
    }

    /* renamed from: c */
    public final void mo56421c(int i, C59172ck ckVar) {
        C59136bb bbVar = this.f157094a;
        C59136bb bbVar2 = this.f157095b;
        ckVar.f157226a = bbVar;
        ckVar.f157227b = bbVar2;
    }

    /* renamed from: d */
    public final boolean mo56422d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo56423e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C59110ac)) {
            C59110ac acVar = (C59110ac) obj;
            if (!this.f157094a.mo56506q(acVar.f157094a) || !this.f157095b.mo56506q(acVar.f157095b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f157094a.hashCode() - this.f157095b.hashCode();
    }

    public final String toString() {
        return "Edge: (" + this.f157094a.mo56505p() + " -> " + this.f157095b.mo56505p() + ")";
    }
}
