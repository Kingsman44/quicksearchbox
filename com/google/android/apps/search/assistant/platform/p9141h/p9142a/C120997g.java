package com.google.android.apps.search.assistant.platform.p9141h.p9142a;

import com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c.C120984c;
import com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c.C120988g;
import com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c.C120989h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.concurrent.ConcurrentMap;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.h.a.g */
/* compiled from: PG */
public final class C120997g extends C120984c implements C120996f {

    /* renamed from: b */
    private static final C59071e f336361b = C59071e.m91331h();

    /* renamed from: a */
    public final ConcurrentHashMap f336362a = new ConcurrentHashMap();

    /* renamed from: c */
    private final C71422aw f336363c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120997g(C69585o oVar, C71422aw awVar) {
        super(oVar);
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f336363c = awVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo105022a(C120971a aVar, C120988g gVar) {
        C69664n.m101061g(gVar, "field");
        ((CopyOnWriteArraySet) ConcurrentMap.EL.computeIfAbsent(this.f336362a, gVar, C120994d.f336358a)).add(aVar);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo105023b(C71422aw awVar, C120988g gVar) {
        C120979b.m200276a(this, awVar, gVar);
    }

    /* renamed from: c */
    public final Object mo105017c(C120989h hVar) {
        C59052c cVar = (C59052c) f336361b.mo56224b();
        C120988g a = C120988g.m200287a(hVar.f336354a);
        if (a == null) {
            a = C120988g.UNRECOGNIZED;
        }
        String name = a.name();
        cVar.mo56379ah(new C59094n(35662));
        cVar.mo56389s("OnChange called on field %s", name);
        C71422aw awVar = this.f336363c;
        C120988g a2 = C120988g.m200287a(hVar.f336354a);
        if (a2 == null) {
            a2 = C120988g.UNRECOGNIZED;
        }
        C69664n.m101060f(a2, "request.field");
        return C120979b.m200276a(this, awVar, a2);
    }
}
