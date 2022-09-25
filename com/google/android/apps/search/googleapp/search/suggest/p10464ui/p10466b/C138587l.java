package com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b;

import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138125g;
import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138068y;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.common.p4552o.apd;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.b.l */
/* compiled from: PG */
public final class C138587l implements C47388b {

    /* renamed from: a */
    public final String f376921a;

    /* renamed from: b */
    public final C138030av f376922b;

    /* renamed from: c */
    public final C138127i f376923c;

    public C138587l(String str, C138030av avVar, C138127i iVar) {
        C69664n.m101061g(str, "commitQuery");
        C69664n.m101061g(avVar, "suggestion");
        C69664n.m101061g(iVar, "queryCommitData");
        this.f376921a = str;
        this.f376922b = avVar;
        this.f376923c = iVar;
    }

    /* renamed from: a */
    public final C138587l mo114369a(apd apd) {
        C69664n.m101061g(apd, "searchboxStats");
        C138125g gVar = (C138125g) this.f376923c.toBuilder();
        gVar.mo114160b(C138068y.m224389e(apd));
        C62942bv build = gVar.build();
        C69664n.m101060f(build, "queryCommitData.toBuilde…       )\n        .build()");
        C138127i iVar = (C138127i) build;
        String str = this.f376921a;
        C138030av avVar = this.f376922b;
        C69664n.m101061g(str, "commitQuery");
        C69664n.m101061g(avVar, "suggestion");
        C69664n.m101061g(iVar, "queryCommitData");
        return new C138587l(str, avVar, iVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C138587l)) {
            return false;
        }
        C138587l lVar = (C138587l) obj;
        return C69664n.m101066l(this.f376921a, lVar.f376921a) && C69664n.m101066l(this.f376922b, lVar.f376922b) && C69664n.m101066l(this.f376923c, lVar.f376923c);
    }

    public final int hashCode() {
        return (((this.f376921a.hashCode() * 31) + this.f376922b.hashCode()) * 31) + this.f376923c.hashCode();
    }

    public final String toString() {
        String str = this.f376921a;
        C138030av avVar = this.f376922b;
        C138127i iVar = this.f376923c;
        return "SuggestionClickEvent(commitQuery=" + str + ", suggestion=" + avVar + ", queryCommitData=" + iVar + ")";
    }
}
