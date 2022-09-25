package com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b;

import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.b.p */
/* compiled from: PG */
public final class C138591p implements C47388b {

    /* renamed from: a */
    public final String f376927a;

    /* renamed from: b */
    public final C138127i f376928b;

    public C138591p(String str, C138127i iVar) {
        C69664n.m101061g(str, "query");
        C69664n.m101061g(iVar, "queryCommitData");
        this.f376927a = str;
        this.f376928b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C138591p)) {
            return false;
        }
        C138591p pVar = (C138591p) obj;
        return C69664n.m101066l(this.f376927a, pVar.f376927a) && C69664n.m101066l(this.f376928b, pVar.f376928b);
    }

    public final int hashCode() {
        return (this.f376927a.hashCode() * 31) + this.f376928b.hashCode();
    }

    public final String toString() {
        String str = this.f376927a;
        C138127i iVar = this.f376928b;
        return "SuggestionTouchEvent(query=" + str + ", queryCommitData=" + iVar + ")";
    }
}
