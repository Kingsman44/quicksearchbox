package com.google.android.libraries.search.assistant.p2570h.p2578b.p2584f;

import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33459m;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33461o;
import com.google.android.libraries.search.assistant.p2570h.p2578b.p2579a.C33463b;
import com.google.android.libraries.search.assistant.p2570h.p2578b.p2581c.C33468a;
import com.google.android.libraries.search.assistant.p2570h.p2578b.p2581c.C33469b;
import com.google.android.libraries.search.assistant.p2570h.p2578b.p2582d.C33470a;
import com.google.common.p4522b.C58425eo;
import java.util.ArrayList;
import java.util.Set;
import p3186j$.util.function.Consumer;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.h.b.f.b */
/* compiled from: PG */
final class C33474b implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C33475c f89585a;

    public C33474b(C33475c cVar) {
        this.f89585a = cVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C33461o oVar = (C33461o) obj;
        C69664n.m101061g(oVar, "utteranceResult");
        C33469b bVar = this.f89585a.f89586a;
        int a = oVar.mo38842a();
        String a2 = C33459m.m62032a(a);
        if (a != 0) {
            bVar.mo38876c("Utterance Result:", a2);
            C33475c cVar = this.f89585a;
            C33463b bVar2 = cVar.f89588c.f89569a;
            C58425eo eoVar = bVar2.f89566b;
            C33469b bVar3 = cVar.f89586a;
            Set<C33470a> set = cVar.f89587b;
            ArrayList arrayList = new ArrayList(C69540x.m100804k(set, 10));
            for (C33470a aVar : set) {
                arrayList.add(aVar.f89578a.mo38875b("Prefetch State:"));
            }
            bVar3.mo38874a(new C33468a("Prefetch States:", C69540x.m100840V(arrayList)));
            eoVar.add(cVar.f89586a.mo38875b("Utterance State:"));
            bVar2.f89565a.mo38874a(new C33468a("Last 10 Utterance States:", C69540x.m100840V(bVar2.f89566b)));
            return;
        }
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
