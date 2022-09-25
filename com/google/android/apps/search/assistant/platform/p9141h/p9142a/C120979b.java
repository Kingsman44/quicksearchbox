package com.google.android.apps.search.assistant.platform.p9141h.p9142a;

import com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c.C120988g;
import com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c.C120992k;
import com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c.C120993l;
import com.google.protobuf.C62942bv;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.h.a.b */
/* compiled from: PG */
public final /* synthetic */ class C120979b {
    /* renamed from: a */
    public static C120993l m200276a(C120996f fVar, C71422aw awVar, C120988g gVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(gVar, "field");
        C69664n.m101061g(gVar, "field");
        CopyOnWriteArraySet<C120971a> copyOnWriteArraySet = (CopyOnWriteArraySet) ((C120997g) fVar).f336362a.get(gVar);
        if (copyOnWriteArraySet != null) {
            for (C120971a eVar : copyOnWriteArraySet) {
                C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C120995e(eVar, (C69577g) null), 3);
            }
        }
        C120992k kVar = (C120992k) C120993l.f336356a.createBuilder();
        C69664n.m101060f(kVar, "newBuilder()");
        C69664n.m101061g(kVar, "builder");
        C62942bv build = kVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C120993l) build;
    }
}
