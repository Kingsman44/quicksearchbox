package com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b;

import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.protos.p4932ax.p4933a.C64269i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.b.m */
/* compiled from: PG */
public final class C138588m implements C47388b {

    /* renamed from: a */
    public final C138030av f376924a;

    /* renamed from: b */
    public final C64269i f376925b;

    public C138588m(C138030av avVar, C64269i iVar) {
        C69664n.m101061g(avVar, "suggestion");
        C69664n.m101061g(iVar, "enhancement");
        this.f376924a = avVar;
        this.f376925b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C138588m)) {
            return false;
        }
        C138588m mVar = (C138588m) obj;
        return C69664n.m101066l(this.f376924a, mVar.f376924a) && C69664n.m101066l(this.f376925b, mVar.f376925b);
    }

    public final int hashCode() {
        return (this.f376924a.hashCode() * 31) + this.f376925b.hashCode();
    }

    public final String toString() {
        C138030av avVar = this.f376924a;
        C64269i iVar = this.f376925b;
        return "SuggestionEnhancementClickEvent(suggestion=" + avVar + ", enhancement=" + iVar + ")";
    }
}
