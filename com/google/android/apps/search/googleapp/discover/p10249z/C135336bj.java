package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10214s.C134572bj;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.bj */
/* compiled from: PG */
public final class C135336bj {

    /* renamed from: a */
    public static final C59071e f368727a = C59071e.m91331h();

    /* renamed from: b */
    public final C58485gu f368728b;

    /* renamed from: c */
    public final C58528ij f368729c;

    /* renamed from: d */
    public final C58495hd f368730d;

    /* renamed from: e */
    public final C58528ij f368731e;

    /* renamed from: f */
    public final C58485gu f368732f;

    public C135336bj(C58485gu guVar, C58528ij ijVar, C58495hd hdVar, C58528ij ijVar2, C58485gu guVar2) {
        this.f368728b = guVar;
        this.f368729c = ijVar;
        this.f368730d = hdVar;
        this.f368731e = ijVar2;
        this.f368732f = guVar2;
    }

    /* renamed from: a */
    public final C135347d mo112273a(String str) {
        C58485gu guVar = (C58485gu) this.f368730d.get(str);
        if (guVar == null || guVar.isEmpty()) {
            return null;
        }
        Object l = C58557jl.m90131l(guVar);
        C69664n.m101060f(l, "getLast(children)");
        C135347d dVar = (C135347d) l;
        if (dVar.f368764b == C134572bj.TOKEN) {
            return dVar;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135336bj)) {
            return false;
        }
        C135336bj bjVar = (C135336bj) obj;
        return C69664n.m101066l(this.f368728b, bjVar.f368728b) && C69664n.m101066l(this.f368729c, bjVar.f368729c) && C69664n.m101066l(this.f368730d, bjVar.f368730d) && C69664n.m101066l(this.f368731e, bjVar.f368731e) && C69664n.m101066l(this.f368732f, bjVar.f368732f);
    }

    public final int hashCode() {
        return (((((((this.f368728b.hashCode() * 31) + this.f368729c.hashCode()) * 31) + C58758qx.m90643a(this.f368730d.entrySet())) * 31) + this.f368731e.hashCode()) * 31) + this.f368732f.hashCode();
    }

    public final String toString() {
        C58485gu guVar = this.f368728b;
        C58528ij ijVar = this.f368729c;
        C58495hd hdVar = this.f368730d;
        C58528ij ijVar2 = this.f368731e;
        C58485gu guVar2 = this.f368732f;
        return "TreeData(roots=" + guVar + ", required=" + ijVar + ", tree=" + hdVar + ", featureExpirations=" + ijVar2 + ", conditionalContent=" + guVar2 + ")";
    }
}
