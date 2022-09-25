package com.google.android.apps.search.googleapp.discover.p10204p.p10210d;

import com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134500f;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57286cn;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.d.a */
/* compiled from: PG */
public final class C134521a {

    /* renamed from: a */
    public final C134500f f366339a;

    /* renamed from: b */
    public final C57286cn f366340b;

    public C134521a(C134500f fVar, C57286cn cnVar) {
        C69664n.m101061g(fVar, "content");
        C69664n.m101061g(cnVar, "metadata");
        this.f366339a = fVar;
        this.f366340b = cnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134521a)) {
            return false;
        }
        C134521a aVar = (C134521a) obj;
        return C69664n.m101066l(this.f366339a, aVar.f366339a) && C69664n.m101066l(this.f366340b, aVar.f366340b);
    }

    public final int hashCode() {
        return (this.f366339a.hashCode() * 31) + this.f366340b.hashCode();
    }

    public final String toString() {
        C134500f fVar = this.f366339a;
        C57286cn cnVar = this.f366340b;
        return "OnDeviceContentAndMetadata(content=" + fVar + ", metadata=" + cnVar + ")";
    }
}
