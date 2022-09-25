package com.google.android.apps.search.googleapp.discover.p10175ab.p10176a;

import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.ab.a.i */
/* compiled from: PG */
public final class C134091i {

    /* renamed from: a */
    public final C60214n f365271a;

    /* renamed from: b */
    public final C60931s f365272b;

    public C134091i(C60214n nVar, C60931s sVar) {
        C69664n.m101061g(nVar, "clickTrackingCgi");
        this.f365271a = nVar;
        this.f365272b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134091i)) {
            return false;
        }
        C134091i iVar = (C134091i) obj;
        return C69664n.m101066l(this.f365271a, iVar.f365271a) && C69664n.m101066l(this.f365272b, iVar.f365272b);
    }

    public final int hashCode() {
        return (this.f365271a.hashCode() * 31) + this.f365272b.hashCode();
    }

    public final String toString() {
        C60214n nVar = this.f365271a;
        C60931s sVar = this.f365272b;
        return "VeAttention(clickTrackingCgi=" + nVar + ", eventMutator=" + sVar + ")";
    }
}
