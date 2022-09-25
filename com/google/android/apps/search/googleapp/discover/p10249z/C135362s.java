package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10214s.C134587e;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.s */
/* compiled from: PG */
final class C135362s {

    /* renamed from: a */
    public final List f368802a;

    /* renamed from: b */
    public final C134587e f368803b;

    public C135362s(List list, C134587e eVar) {
        C69664n.m101061g(list, "dataOperations");
        this.f368802a = list;
        this.f368803b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135362s)) {
            return false;
        }
        C135362s sVar = (C135362s) obj;
        return C69664n.m101066l(this.f368802a, sVar.f368802a) && C69664n.m101066l(this.f368803b, sVar.f368803b);
    }

    public final int hashCode() {
        int hashCode = this.f368802a.hashCode() * 31;
        C134587e eVar = this.f368803b;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        List list = this.f368802a;
        C134587e eVar = this.f368803b;
        return "DataOperationsAndRefreshSchedule(dataOperations=" + list + ", backgroundRefreshSchedule=" + eVar + ")";
    }
}
