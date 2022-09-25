package com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b;

import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.b.e */
/* compiled from: PG */
public final class C138580e implements C47388b {

    /* renamed from: a */
    public final C138030av f376910a;

    public C138580e(C138030av avVar) {
        C69664n.m101061g(avVar, "suggestion");
        this.f376910a = avVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C138580e) && C69664n.m101066l(this.f376910a, ((C138580e) obj).f376910a);
    }

    public final int hashCode() {
        return this.f376910a.hashCode();
    }

    public final String toString() {
        C138030av avVar = this.f376910a;
        return "LensPromoClickEvent(suggestion=" + avVar + ")";
    }
}
