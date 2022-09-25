package com.google.android.libraries.assistant.auto.tng.p1101o.p1110c.p1111a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15488n;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15474b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.c.a.c */
/* compiled from: PG */
public final class C15501c implements C15488n {

    /* renamed from: a */
    private final Set f46458a;

    /* renamed from: b */
    private final Executor f46459b;

    public C15501c(Set set, Executor executor) {
        C69664n.m101061g(set, "subLoggers");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f46458a = set;
        this.f46459b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo19974a(C37254c cVar) {
        C69664n.m101061g(cVar, "eventBuilder");
        Set<C15488n> set = this.f46458a;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(set, 10));
        for (C15488n a : set) {
            arrayList.add(a.mo19974a(cVar));
        }
        return C47638k.m84752c(arrayList).mo51521b(C15499a.f46456a, this.f46459b);
    }

    /* renamed from: b */
    public final C60870cx mo19975b(C37252a aVar, C15474b bVar) {
        C69664n.m101061g(aVar, "eventBuilder");
        C69664n.m101061g(bVar, "autoAppFlowEventMetadata");
        Set<C15488n> set = this.f46458a;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(set, 10));
        for (C15488n b : set) {
            arrayList.add(b.mo19975b(aVar, bVar));
        }
        return C47638k.m84752c(arrayList).mo51521b(C15500b.f46457a, this.f46459b);
    }
}
