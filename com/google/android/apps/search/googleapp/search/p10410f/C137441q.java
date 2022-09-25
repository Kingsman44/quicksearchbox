package com.google.android.apps.search.googleapp.search.p10410f;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.f.q */
/* compiled from: PG */
public final class C137441q {

    /* renamed from: a */
    public final C137436l f373826a;

    /* renamed from: b */
    public final List f373827b;

    public C137441q(C137436l lVar, List list) {
        C69664n.m101061g(lVar, "entryPoint");
        this.f373826a = lVar;
        this.f373827b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C137441q)) {
            return false;
        }
        C137441q qVar = (C137441q) obj;
        return this.f373826a == qVar.f373826a && C69664n.m101066l(this.f373827b, qVar.f373827b);
    }

    public final int hashCode() {
        int hashCode = this.f373826a.hashCode() * 31;
        List list = this.f373827b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        C137436l lVar = this.f373826a;
        List list = this.f373827b;
        return "FeedbackStarterOptions(entryPoint=" + lVar + ", productSpecificDataList=" + list + ")";
    }
}
