package com.google.android.apps.search.googleapp.search.p10410f;

import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import java.util.ArrayList;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.f.e */
/* compiled from: PG */
public final class C137429e {

    /* renamed from: a */
    private final C137442r f373797a;

    public C137429e(C137443s sVar) {
        this.f373797a = sVar.mo113736a(50);
    }

    /* renamed from: a */
    public final void mo113719a(C37252a aVar) {
        C69664n.m101061g(aVar, "event");
        this.f373797a.mo113734a(aVar);
    }

    /* renamed from: b */
    public final void mo113720b(StringBuilder sb) {
        sb.append("recent AppFlow events:\n");
        C137442r<C137448x> rVar = this.f373797a;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(rVar, 10));
        for (C137448x xVar : rVar) {
            arrayList.add(new C137448x(xVar.f373846a, ((C37252a) xVar.f373847b).mo40782f()));
        }
        C137433i.m223293a(arrayList, C69540x.m100947e(new C137430f("event", C137423a.f373793a), new C137430f("start", C137426b.f373795a), new C137430f("end", C137427c.f373796a), new C137430f("tags", new C137428d()))).mo113724a(sb);
    }
}
