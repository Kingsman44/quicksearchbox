package com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b;

import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.b.k */
/* compiled from: PG */
public final class C138586k implements C47388b {

    /* renamed from: a */
    public final String f376919a;

    /* renamed from: b */
    public final C138127i f376920b;

    public C138586k(String str, C138127i iVar) {
        C69664n.m101061g(str, "query");
        C69664n.m101061g(iVar, "queryCommitData");
        this.f376919a = str;
        this.f376920b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C138586k)) {
            return false;
        }
        C138586k kVar = (C138586k) obj;
        return C69664n.m101066l(this.f376919a, kVar.f376919a) && C69664n.m101066l(this.f376920b, kVar.f376920b);
    }

    public final int hashCode() {
        return (this.f376919a.hashCode() * 31) + this.f376920b.hashCode();
    }

    public final String toString() {
        String str = this.f376919a;
        C138127i iVar = this.f376920b;
        return "SearchKeyPressEvent(query=" + str + ", queryCommitData=" + iVar + ")";
    }
}
