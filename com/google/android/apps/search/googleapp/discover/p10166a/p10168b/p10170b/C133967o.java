package com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10170b;

import com.google.common.p4522b.C58485gu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.b.b.o */
/* compiled from: PG */
public final class C133967o {

    /* renamed from: a */
    public final C58485gu f364889a;

    /* renamed from: b */
    public final int f364890b;

    public C133967o(C58485gu guVar, int i) {
        C69664n.m101061g(guVar, "actionsOldestFirst");
        this.f364889a = guVar;
        this.f364890b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C133967o)) {
            return false;
        }
        C133967o oVar = (C133967o) obj;
        return C69664n.m101066l(this.f364889a, oVar.f364889a) && this.f364890b == oVar.f364890b;
    }

    public final int hashCode() {
        return (this.f364889a.hashCode() * 31) + this.f364890b;
    }

    public final String toString() {
        C58485gu guVar = this.f364889a;
        int i = this.f364890b;
        return "StoredActionsResult(actionsOldestFirst=" + guVar + ", remainingActionsCount=" + i + ")";
    }
}
