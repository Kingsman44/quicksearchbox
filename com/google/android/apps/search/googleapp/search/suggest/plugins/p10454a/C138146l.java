package com.google.android.apps.search.googleapp.search.suggest.plugins.p10454a;

import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.a.l */
/* compiled from: PG */
public final class C138146l implements C47388b {

    /* renamed from: a */
    public final C138030av f375861a;

    public C138146l(C138030av avVar) {
        C69664n.m101061g(avVar, "suggestion");
        this.f375861a = avVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C138146l) && C69664n.m101066l(this.f375861a, ((C138146l) obj).f375861a);
    }

    public final int hashCode() {
        return this.f375861a.hashCode();
    }

    public final String toString() {
        C138030av avVar = this.f375861a;
        return "PersonalResultsSettingsClickEvent(suggestion=" + avVar + ")";
    }
}
